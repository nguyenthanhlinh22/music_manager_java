<%@ page import="java.util.List" %>
<%@ page import="com.example.music_manager.entity.Music" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 05/08/2024
  Time: 7:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>;
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<% List<Music> musics = (List<Music>) request.getAttribute("musics"); %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Book Music</h2>

<table>
    <tr>
        <td>#</td>
        <td>Name</td>
        <td>Description</td>
        <td>List</td>
        <td>Category</td>
        <td>Publication</td>
        <td>Composer</td>
        <td>Singer</td>
    </tr>
    <c:set var="index" value="1"/>
    <c:forEach var="music" items="${Music}">
        <tr>
            <td>${index}</td>
            <td><c:out value="${music.Musicname}"/></td>
            <td><c:out value="${music.description}"/></td>
            <td><c:out value="${music.Musiclist_id}"/></td>
            <td><c:out value="${music.category_id}"/></td>
            <td><c:out value="${music.publication_date}"/></td>
            <td><c:out value="${music.composer_id}"/></td>
            <td><c:out value="${music.singer_id}"/></td>
            <td><a class="btn-delete" onclick="return confirm('Are you want delete?')" href="/musics/delete?id=<c:out value="${music.id}"/>">Delete</a></td>
            <td><a class="btn-update" href="/musics/update?id=<c:out value="${music.id}"/>">Update</a></td>
        </tr>
        <c:set var="index" value="${index + 1}"/>
    </c:forEach>
</table>
<h3>Total books: <c:out value="${Music.size()}"/></h3>
</body>

</html>
