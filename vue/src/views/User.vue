<template>
  <div>
    <div style="margin: 10px 0">
      <el-input style="width: 200px"  placeholder="请输入文件名" suffix-icon="el-icon-search" v-model="filename"></el-input>
      <el-input style="width: 200px"  placeholder="请输入课程编号" suffix-icon="el-icon-message" class="ml-5" v-model="courseno"></el-input>
      <el-input style="width: 200px"  placeholder="请输入课程名称" suffix-icon="el-icon-position" class="ml-5" v-model="coursename"></el-input>
      <el-button class="ml-5" type="primary" @click="load" plain>搜索</el-button>
      <el-button type="warning" @click="reset" plain>重置</el-button>
    </div>

    <div style="margin: 10px 0">
      <el-button type="primary" @click="handleAdd" plain>新增 <i class="el-icon-circle-plus-outline"></i></el-button>
      <el-popconfirm
              class="ml-5"
              confirm-button-text='确定'
              cancel-button-text='再想想'
              icon="el-icon-info"
              icon-color="red"
              title="您确定批量删除这些数据吗？"
              @confirm="delBatch"
      >
        <el-button type="danger" slot="reference" plain>批量删除 <i class="el-icon-remove-outline"></i></el-button>
      </el-popconfirm>
      <el-button type="primary" class="ml-5" plain>导入 <i class="el-icon-bottom"></i></el-button>
      <el-button type="primary" plain>导出 <i class="el-icon-top"></i></el-button>
    </div>

    <el-table :data="tableData" border stripe :header-cell-class-name="'headerBg'"  @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column prop="filename" label="文件名"></el-table-column>
      <el-table-column prop="termtime" label="学期时间"></el-table-column>
      <el-table-column prop="courseno" label="课程编号"></el-table-column>
      <el-table-column prop="coursename" label="课程名称"></el-table-column>
      <el-table-column prop="method" label="考核方式"></el-table-column>
      <el-table-column prop="stumajor" label="学生专业"></el-table-column>


      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button type="success" @click="handleEdit(scope.row)" plain>编辑 <i class="el-icon-edit"></i></el-button>
          <el-popconfirm
                  class="ml-5"
                  confirm-button-text='确定'
                  cancel-button-text='再想想'
                  icon="el-icon-info"
                  icon-color="red"
                  title="您确定删除吗？"
                  @confirm="del(scope.row.id)"
          >
            <el-button type="danger" slot="reference" plain>删除 <i class="el-icon-remove-outline"></i></el-button>
          </el-popconfirm>
        </template>
      </el-table-column>
    </el-table>

    <div style="padding: 10px 0">
      <el-pagination
              @size-change="handleSizeChange"
              @current-change="handleCurrentChange"
              :current-page="pageNum"
              :page-sizes="[2, 5, 10, 20]"
              :page-size="pageSize"
              layout="total, sizes, prev, pager, next, jumper"
              :total="total">
      </el-pagination>
    </div>



  </div>
</template>

<script>
  export default {
    name: "User",
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
        dialogFormVisible: false,
        multipleSelection: []
      }
    },
    created() {
      this.load()
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
          if(res){
            this.$message.success("保存成功")
            this.dialogFormVisible = false
            this.load()
          } else {
            this.$message.error("保存失败")
          }
        })
      },
      handleAdd() {
        this.$router.push('/user_1')
      },
      handleEdit(row) {
        let rows=JSON.stringify(row)
        this.$router.push('/user_1?row='+rows)
      },
      del(id) {
        this.request.delete("/user/" + id).then(res => {
          if(res){
            this.$message.success("删除成功")
            this.load()
          } else {
            this.$message.error("删除失败")
          }
        })
      },
      handleSelectionChange(val) {
        console.log(val)
        this.multipleSelection = val
      },
      delBatch() {
        let ids = this.multipleSelection.map(v => v.id)  // [{},{},{}] => [1,2,3]
        this.request.post("/user/del/batch", ids).then(res => {
          if(res){
            this.$message.success("批量删除成功")
            this.load()
          } else {
            this.$message.error("批量删除失败")
          }
        })
      },
      reset() {
        this.filename = ""
        this.termtime = ""
        this.courseno = ""
        this.coursename = ""
        this.method = ""
        this.stumajor = ""
        this.load()

      },
      handleSizeChange(pageSize) {
        console.log(pageSize)
        this.pageSize = pageSize
        this.load()
      },
      handleCurrentChange(pageNum) {
        console.log(pageNum)
        this.pageNum = pageNum
        this.load()
      }
    }
  }
</script>

<style>
  .headerBg {
    background: #eee !important;
  }

</style>