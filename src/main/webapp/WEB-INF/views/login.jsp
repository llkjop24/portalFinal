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
    <link href="../css/login.css" rel="stylesheet" type="text/css">
    <title>Title</title>
</head>
<body>
<form>
    <div id="wrap">
        <h1 class="member">member login</h1>
        <div class="form">
            <div class="form2">
                <div class="form3">
                    <label for="user">아이디</label><input type="text" id="user">
                    <div class="clear"></div>
                    <label for="user">비밀번호</label><input type="password" id="user">
                </div>
                \<input type="submit" value="로그인하기">
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
