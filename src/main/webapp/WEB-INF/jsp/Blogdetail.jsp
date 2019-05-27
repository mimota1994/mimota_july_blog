<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<title>blog ${blog.id}</title>

</head>

<body>
	<div class="top">
		<a href="/index">index</a>
	</div>

	${blog.content}
	
	<div class="top">
		<a href="/blog/delete?id=${blog.id}">delete this blog forever</a>
	</div>
	
</body>

</html>