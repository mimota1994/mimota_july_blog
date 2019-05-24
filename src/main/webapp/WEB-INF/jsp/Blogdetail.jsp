<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<title>完整demo</title>
<script type="text/javascript" src="blog/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" >
	$(document).ready(function(){
		//$("#test").html("<span>测试</span>");
		$.ajax({
			url:"blog/get?id=1",
			type:"POST",
			async:false,
			success:function(data){
				$("#test").html(data);
			}
		})
	})
</script>
</head>

<body>
	<div id="test"></div>
</body>

</html>