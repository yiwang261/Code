<script setup lang="ts">
  import {ref} from "vue";
  import {instance} from "@/Api";
  let username = ref("");
  let password = ref("");

  const login = () => {
    instance.post("http://127.0.0.1:4523/m2/3847480-0-default/153721343")
    .then(
        res=>{
          console.log(res.data.data)
          localStorage.setItem("token",res.data.data.token)
        }
    )
    .catch(
        err=>{
          console.log(err)
        }
    )
  }


</script>

<template>
  <img alt="error" src="../assets/bg.jpg" style="width: 100%;height: 100%;overflow: hidden; position: fixed">

  <el-card class="login_card">
    <el-form class="login_form">
      <h1 style="position:relative; margin-left: 50%;transform: translateX(-50%)">账号登录</h1>

      <el-form-item label="账号:" style="margin-top: 30px; margin-left: 20px">
        <el-input v-model="username" placeholder="请输入用户名" style="width: 250px"></el-input>
      </el-form-item>

      <el-form-item label="密码:" style="margin-top: 30px; margin-left: 20px">
        <el-input type="password" v-model="password" placeholder="请输入密码" style="width: 250px"></el-input>
      </el-form-item>

      <el-button @click="login()" style="margin-left: 50%;transform: translateX(-50%); width: 100px;margin-top: 40px">登录</el-button>
    </el-form>
  </el-card>

</template>

<style scoped>
.login_card{
  position: absolute;
  width: 400px;
  height:400px;
  top: 50%;
  left: 50%;
  transform: translate(-50%,-50%);
  background-color: rgba(255,255,255,0.8);
}
.login_form{
  position: absolute;
  width: 100%;
  height: 100%;
}
</style>