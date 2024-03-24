<%--
  Created by IntelliJ IDEA.
  User: yiwan
  Date: 2024/3/21
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<style>
    *{
        margin: 0;
        padding: 0;
    }
    html,body{
        height: 100vh;
        width: 100vw;
    }
    .login_card{
        position: absolute;
        height: 320px;
        width: 320px;
        background: rgb(230,230,230,0.8);
        border: none;
        border-radius: 10px;
        box-shadow: #666666 1px 1px 10px;

        padding: 20px;

        top: 50%;
        left: 50%;
        transform:  translateX(-50%) translateY(-50%);

        z-index: 1;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    @keyframes cloud_move {
        from{
            position: absolute;
            top: -20%;
            left: 75%;
            z-index: 1;
        }
        to{
            position: absolute;
            top: -20%;
            left: 75%;
            transform:  translateX(7%) translateY(-2%);
            z-index: 1;
        }
    }
    .move_cloud{
        animation: cloud_move 2s linear infinite alternate-reverse;
    }
    .login_btn{
        margin-top: 10px;
        margin-left: 50%;
        transform: translateX(-50%);
        height: 25px;
        width: 80px;
        background: #409EFF;
        border: none;
        border-radius: 5px;
    }
</style>
<body >
<div style="position: relative;height: 100%;width: 100%;">
    <img src="pic/cloud.jpg" style="height: 100vh;width: 100vw;position: absolute;top: 0;left: 0;" alt="error">


    <div class="login_card">
        <img src="pic/move.png" class="move_cloud" alt="error">
        <form id="login_form" >
            <h3 style="text-align: center">登录</h3> <br>
            <div style="margin:15px">
                <label>账号 <input class="username" type="text" name="username"></label>
            </div>
            <div style="margin:15px">
                <label>密码 <input class="password" type="password" name="password"></label>
            </div>
            <br>
            <button onclick="login()" class="login_btn" >登录</button>
        </form>

    </div>

</div>

</body>
</html>
<script>
    const login_form = document.querySelector("#login_form");
    login_form.addEventListener("submit",function (e) {
        e.preventDefault();
    })
    function login(){
        const username = document.querySelector(".username").value;
        const password = document.querySelector(".password").value;

        // console.log(username)
        // console.log(password)
        const xml = new XMLHttpRequest();
        xml.open("post","login",true);

        xml.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
        xml.send("username="+username+"&password="+password);
        xml.onreadystatechange = function () {
            if(xml.readyState===4&&xml.status===200){
                const result = JSON.parse(xml.response);
                console.log(result.msg)
                if(result.msg==="success"){
                    window.location.href="index.jsp";
                }else {
                    alert("账号或密码错误请确认后重试")
                }
            }
        }

    }

</script>