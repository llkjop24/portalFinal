<%--
  Created by IntelliJ IDEA.
  User: jiwonheo
  Date: 2018. 6. 14.
  Time: PM 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
    <!-- BootStrap CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <title>게시글 목록</title>
</head>
<body>
<h3>우리들 게시판</h3>
<button class="btn btn-primary" style="float : right;margin-right: 20px;margin-bottom: 10px;" onclick="location.href='/board/post'">작성</button>
<table class="table">
    <tr>
        <th>No</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성날짜</th>
        <th>조회수</th>
    </tr>
    <c:forEach var="board" items="${list}">
        <tr>
            <td>${board.bno}</td>
            <td><a href="/board/${board.bno}">${board.subject}</a></td>
            <td>${board.writer}</td>
            <td><fmt:formatDate value="${board.reg_date}" pattern="MM/ dd" /></td>
            <td>${board.hit}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
