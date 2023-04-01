<template>
  <el-menu :default-openeds="['1', '3']" style="min-height: 100%;overflow-x: hidden"
           background-color="rgb(48,65,86)"
           text-color="#fff"
           active-text-color="#ffd04b"
           :collapse-transition="false"
           :collapse="isCollapse"
           router=""
  >
    <div style="height: 60px;line-height: 60px;text-align: center">
      <img src="../assets/logo.png" alt="" style="width: 20px; position: relative; top: 5px; margin-right: 5px">
      <b style="color: white" v-show="logoTextShow">教学管理系统</b>
    </div>

    <el-menu-item index="/">
      <template slot="title">
        <i class="el-icon-house"></i>
        <span slot="title">主页</span>
      </template>
    </el-menu-item>
    <el-submenu index="2">
      <template slot="title">
        <i class="el-icon-menu"></i>
        <span slot="title">系统管理</span>
      </template>
      <el-menu-item index="/user">
        <i class="el-icon-s-custom"></i>
        <span slot="title">用户管理</span>
      </el-menu-item>
    </el-submenu>

    <el-submenu index="6">
      <template slot="title"><i class="el-icon-star-off"></i>
        <span slot="title">课程信息</span>
      </template>
      <el-submenu index="6-1">
        <template slot="title">选项4</template>
        <el-menu-item index="6-1-1">选项4-1</el-menu-item>
      </el-submenu>
    </el-submenu>

    <el-submenu index="4">
      <template slot="title"><i class="el-icon-star-off"></i>
        <span slot="title">教学计划</span>
      </template>
      <el-submenu index="2-4">
        <template slot="title">选项4</template>
        <el-menu-item index="2-4-1">选项4-1</el-menu-item>
      </el-submenu>
    </el-submenu>

    <el-submenu index="5">
      <template slot="title"><i class="el-icon-star-off"></i>
        <span slot="title">课程总结</span>
      </template>
      <el-submenu index="2-4">
        <template slot="title">选项4</template>
        <el-menu-item index="2-4-1">选项4-1</el-menu-item>
      </el-submenu>
    </el-submenu>

  </el-menu>
</template>

<script>
    export default {
        name: "Aside",
        props: {
            isCollapse: Boolean,
            logoTextShow: Boolean
        }
    }
</script>

<style scoped>

</style>