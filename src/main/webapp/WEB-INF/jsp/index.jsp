<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<title>完整demo</title>
<script type="text/javascript" src="blog/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" >
	$(document).ready(function(){
		//alert("name");
		$("#test").html("<span>测试</span>");
		$.ajax({
			url:"user/list",
			type:"POST",
			async:false,
			success:function(data){
				var html = "";
				for(var i = 0; i < data.length; i++){
					//alert("name"+i);
					var ls = data[i];
					html += "<p><a href='/blog/get?id="+ ls.id+"'>"+ ls.id+"</a></p>";
					
				}
				$("#test").html(html);
			}
		})
	})
</script>
</head>

<body>
	<div>
		<h1>完整demo</h1>
		
	</div>

	<a href="/blog/create">create a new blog</a>

	<div id="test"></div>


	
</body>

</html>