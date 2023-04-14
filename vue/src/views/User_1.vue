<template>
  <div>

    <div style="margin: 20px;"></div>
    <el-form :label-position="labelPosition" label-width="80px" :model="form">
      <el-form-item label="文件名">
        <el-input v-model="form.filename" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="学期时间">
        <el-input v-model="form.termtime" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="例如：2021-2022学年第2学期"></el-input>
      </el-form-item>
      <el-form-item label="课程编号">
        <el-input v-model="form.courseno" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="课程名称">
        <el-input v-model="form.coursename" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="考核方式">
        <el-input v-model="form.method" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="学生专业">
        <el-input v-model="form.method" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="班级">
        <el-input v-model="form.classno" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="主讲教师">
        <el-input v-model="form.lecturer" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="辅导教师">
        <el-input v-model="form.counselor" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="总课时">
        <el-input v-model="form.totalhours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="已授课时">
        <el-input v-model="form.overhours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="本学期授课学时">
        <el-input v-model="form.thishours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="教学周数">
        <el-input v-model="form.weeks" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="课堂教学学时">
        <el-input v-model="form.classroomhours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="习题课学时">
        <el-input v-model="form.exercisehours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="实验课学时">
        <el-input v-model="form.experimentalhours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="上机学时">
        <el-input v-model="form.computerhours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="机动学时">
        <el-input v-model="form.mobilehours" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="其他">
        <el-input v-model="form.other" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="日期">
        <el-input v-model="form.date" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="执行教学大纲情况">
        <el-input v-model="form.one" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="授课情况">
        <el-input v-model="form.two" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="教材使用情况">
        <el-input v-model="form.three" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="学生成绩评定办法">
        <el-input v-model="form.four" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="学生成绩分布情况">
        <el-input v-model="form.five" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="课程目标达成情况评价">
        <el-input v-model="form.six" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="课程的持续改进">
        <el-input v-model="form.seven" autocomplete="off"
                  type="textarea"
                  :autosize="{ minRows: 2, maxRows: 4}"
                  placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="主讲教师（签字）">
        <el-upload
                class="upload-demo"
                action="https://jsonplaceholder.typicode.com/posts/"
                :on-preview="handlePreview"
                :on-remove="handleRemove"
                :before-remove="beforeRemove"
                multiple
                :limit="3"
                :on-exceed="handleExceed"
                :file-list="fileList">
          <el-button size="small" type="primary">点击上传</el-button>
          <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
        </el-upload>
      </el-form-item>

      <el-form-item label="系（教研室）主任（签字）">
        <el-upload
                class="upload-demo"
                action="https://jsonplaceholder.typicode.com/posts/"
                :on-preview="handlePreview"
                :on-remove="handleRemove"
                :before-remove="beforeRemove"
                multiple
                :limit="3"
                :on-exceed="handleExceed"
                :file-list="fileList">
          <el-button size="small" type="primary">点击上传</el-button>
          <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
        </el-upload>
      </el-form-item>
    </el-form>

    <el-upload
      action="http://localhost:8081/file/upload"
      :on-success="handle_success"
      >
      <el-button size="small" type="primary">点击上传</el-button>
      <div slot="tip" class="el-upload__tip">
        只上传jpg/png文件，且不超过500kb
      </div>
    </el-upload>



    <el-divider></el-divider>

    <div slot="footer" class="dialog-footer">
        <el-button @click="out">取 消</el-button>
        <el-button type="primary" @click="save">确 定</el-button>
      </div>
  </div>
</template>

<script>
  export default {
    name: "User_1",
    data() {
      return {
        tableData: [],
        total: 0,
        pageNum: 1,
        pageSize: 5,
        filename: "",
        termtime: "",
        courseno: "",
        coursename: "",
        method: "",
        stumajor: "",
        form: {},
        multipleSelection: [],
        labelPosition: 'top',

      }
    },
    created() {
      this.load()
      this.form = JSON.parse(this.$route.query.row)
    },
    methods: {
      load() {
        this.request.get("/user/page", {
          params: {
            pageNum: this.pageNum,
            pageSize: this.pageSize,
            filename: this.filename,
            termtime: this.termtime,
            courseno: this.courseno,
            coursename: this.coursename,
            method: this.method,
            stumajor: this.stumajor
          }
        }).then(res => {
          console.log(res)
          this.tableData = res.records
          this.total = res.total
        })
      },
      save() {
        this.request.post("/user", this.form).then(res => {
          if (res) {
            this.$message.success("保存成功")
            this.out()
            this.load()
          } else {
            this.$message.error("保存失败")
          }
        })
      },
      out() {
        this.$router.push('/user')
      }
    }
  }
</script>

<style>
  .headerBg {
    background: #eee !important;
  }

</style>