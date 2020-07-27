<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('button').click(function(){
			var param='id=admin&msg='+$('input').val();
			if($(this).text()=='get'){
				// $.get('ex08');
				$.ajax('ex08?'+param,{'method':'get','dataType':'plain/text','sucess':function(data){}})
			}else if($(this).text()=='post'){
				// $.post('ex08');
				$.ajax({'url':'ex08','type':'post'})
			}else if($(this).text()=='put'){
				$.ajax('ex08',{'type':'put','data':param});
			}else if($(this).text()=='delete'){
				$.ajax({'url':'ex08','method':'delete','data':param})
			}
	});
});
</script>
</head>
<body>
	<h1>method별 호출</h1>
	<input type="text"/>
	<button>get</button>
	<button>post</button>
	<button>put</button>
	<button>delete</button>
</body>
</html>