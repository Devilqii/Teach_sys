package com.devilqi.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


@CrossOrigin
@RestController
@RequestMapping("/file")

public class FileUploadController {
  @PostMapping("/upload")
  public ResponseResult uploadFile(@RequestParam(value = "file ",required = false)MultipartFile file) {
    //判断文件是否为空
    if(file.isEmpty()){
      return ResponseResult.fail();
    }
    //获取传过来的文件名字
    String OriginalFilename = file.getOriginalFilename();
    //为了防止重名覆盖，获取系统时间戳+原始文件后缀名
    String fileName = System.currentTimeMillis()+"."+OriginalFilename.substring(OriginalFilename.lastIndexOf(".")+1);
    //设置保存地址（这里是转义字符
    //1.后台保存位置
    String path = "D:\\七七\\毕设\\小白\\springboot\\src\\photo\\";
    File dest = new File(path+fileName);
    //判断文件是否存在
    if(!dest.getParentFile().exists()){
      //不存在就创建一个
      dest.getParentFile().mkdirs();
    }
    try {
      //后台上传
      file.transferTo(dest);
      return new ResponseResult(200,"文件上传成功", fileName);
    } catch (Exception e) {
      e.printStackTrace();
      return ResponseResult.fail();
    }
  }
  @RequestMapping(value = "/Manage/upBusinessImage",method = RequestMethod.POST)
  public CommonResultVo uploadBusinessImage(@RequestParam(value = "file", required = false) MultipartFile file) {
    return fileService.uploadImage(file,"D:\\七七\\毕设\\小白\\springboot\\src\\photo\\");
  }

}
