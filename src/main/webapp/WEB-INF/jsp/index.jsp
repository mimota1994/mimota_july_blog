<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
<title>index</title>
<script type="text/javascript" src="blog/js/jquery-1.7.1.min.js"></script>
</head>

<body>
	<div>
		<h1>index</h1>
		
	</div>

	<a href="/blog/create">create a new blog</a>

	<div id="bloglist">
		<c:forEach items="${blogList}" var="blog">
			<p><a href="/blog/get?id=${blog.id}">blog ${blog.id}</a></p>
		</c:forEach>
	</div>


	
</body>

</html>