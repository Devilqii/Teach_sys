<template>
  <div style="line-height: 60px; display: flex">
    <div style="flex: 1">
      <span :class="collapseBtnClass" style="cursor: pointer; font-size: 18px" @click="collapse"></span>

      <el-breadcrumb separator="/" style="display: inline-block; margin-left: 10px">
        <el-breadcrumb-item :to="'/'">首页</el-breadcrumb-item>
        <el-breadcrumb-item>{{ $route.name }}</el-breadcrumb-item>
      </el-breadcrumb>

    </div>
    <el-dropdown style="width: 70px; cursor: pointer">
      <span>王滋琪</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
      <el-dropdown-menu slot="dropdown">
        <el-dropdown-item>个人信息</el-dropdown-item>
        <el-dropdown-item>退出</el-dropdown-item>
        <!--<el-dropdown-item>删除</el-dropdown-item>-->
      </el-dropdown-menu>
    </el-dropdown>
  </div>
</template>

<script>
  export default {
    name: "Header",
    props: {
      collapseBtnClass: String,
      collapse: Boolean,
    },
    computed: {
      currentPathName () {
        return this.$store.state.currentPathName;　　//需要监听的数据
      }
    },
    watch: {
      currentPathName (newVal, oldVal) {
        console.log(newVal)
      }
    }
  }
</script>

<style scoped>

</style>