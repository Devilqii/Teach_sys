<template>
  <div>
      <el-form label-width="80px" size="small">
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
                    placeholder="请输入内容"></el-input>
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
      </el-form>
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
      },
    }
  }
</script>

<style>
  .headerBg {
    background: #eee !important;
  }

</style>