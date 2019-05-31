<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
	<title>blog ${blog.id}</title>
	<link rel="stylesheet" type="text/css" href="../blog/css/style.css">
	<script type="text/javascript" charset="utf-8" src="ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="lang/zh-cn/zh-cn.js"></script>
<link rel="stylesheet" type="text/css" href="../blog/css/style.css">
<style type="text/css">
div {
	width: 100%;
}
</style>
</head>

<body>
	<div class="top">
		<a href="/index">index</a>
	</div>

	<div id = content>
		${blog.content}
	</div>
	
	<div class="top">
		<a href="/blog/delete?id=${blog.id}">delete this blog forever</a>
	</div>
	
	<a href = "/blog/edit?id=${blog.id}">修改</a>

		
	

</body>



</html>