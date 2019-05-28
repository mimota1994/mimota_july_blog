<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>完整demo</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
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


	<form action = "/blog/upload" method="post">
		<input type="text" name = "title" style = "height:2.5em;width:400px;padding-top:2px" maxlength="100" placeholder="输入文章标题">
		<textarea id="container" name="content" type="text/plain">
		</textarea>
		<button id = "btn"  onclick = "postData()">提交</button>
	</form>

	<script type="text/javascript">
		var editor = UE.getEditor('container');
		editor.setHeight(600);
		function postData(){
			return editor.getContent();
		}
	</script>

</body>
</html>