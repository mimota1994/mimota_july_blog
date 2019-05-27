<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
<title>blog</title>
<script type="text/javascript" src="blog/js/jquery-1.7.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="../blog/css/style.css">

</head>

<body>
	<div>
		<h1>this is our index</h1>
	</div>
	

	<a href="/blog/create">create a new blog</a>
	
	<section>
		<c:forEach items="${blogList}" var="blog">
		
			<div class="wp butler_list_box list">
				<div class='left'>
					<div class="butler_list layout">
						<div class="head">
							<ul class="fl tab_header">
								<p>${blog.title}</p>
							</ul>
						</div>
					
		                <dl class="des">
		                	<p>${blog.title}</p>
		                	
		                    <a class="buy buyservice" href="/blog/get?id=${blog.id}"><br/>查看<br/>详情</a>
		                </dl>
					</div>
				</div>
		    </div>
	    </c:forEach>
	</section>
	


	
</body>

</html>