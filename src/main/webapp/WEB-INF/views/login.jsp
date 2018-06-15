<%--
  Created by IntelliJ IDEA.
  User: jiwonheo
  Date: 2018. 6. 15.
  Time: AM 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <link href="/css/login.css" rel="stylesheet" type="text/css">

</head>
<body>
<form>
    <div id="wrap">
        <h1 class="member">member login</h1>
        <div class="form">
            <div class="form2">
                <div class="form3">
                    <form action="/login/loginCheck">
                        <label style="    margin-bottom: 20px;">아이디</label><input type="text" name="id" placeholder="Username">
                        <div class="clear"></div>
                        <label>비밀번호</label><input type="password" name="password" placeholder="Password">
                        <input type="submit" value="로그인하기">
                    </form>

                </div>
                <div class="clear"></div>
                <div class="form4">
                    <div class="clear"></div>
                    <label><input type="button" value="회원가입"></label>
                    <label><input type="button" value="아이디/비밀번호 찾기"></label>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>
