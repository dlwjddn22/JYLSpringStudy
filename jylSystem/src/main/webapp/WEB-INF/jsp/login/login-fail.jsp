<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<script type="text/javascript" src="/js/jquery-1.11.3.js" ></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script><!-- 부트스트랩js -->
	<link rel="stylesheet" href="/css/default.css">
	<link rel="stylesheet" href="/css/bootstrap.min.css"><!-- 부트스트랩css -->
	<link rel="stylesheet" href="/css/bootstrap-theme.min.css"><!-- 부트스트랩css theme -->
	  
	<title> jylSpringStudy</title>
	<script type="text/javascript"> 
		$(function(){alert("아이디와 패스워드가 일치 하지 않습니다.")});
		function doLogin() {
			if($("input[name=j_username]").val() == "")
			{
  				alert("아이디를 입력해주세요.");
				return;
			}
			if($("input[name=j_password]").val() == "")
			{
				alert("패스워드를 입력해주세요.");
				return;
			}
			
			frm.submit();
		}
		
	</script>	
</head>
<body style="margin:10px">
	<form name="frm" class="form-horizontal" action="login" method="post" style="width:500px;">
	  <div class="form-group" >
	    <label for="inputEmail3" class="col-sm-2 control-label">Id</label>
	    <div class="col-sm-10">
	      <input type="text" name="j_username" class="form-control" id="inputEmail3" placeholder="User Id" >
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
	    <div class="col-sm-10">
	      <input type="password" name="j_password" class="form-control" id="inputPassword3" placeholder="Password">
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	      <div class="checkbox">
	        <label>
	          <input type="checkbox"> Remember me
	        </label>
	      </div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	      <button type="button" class="btn btn-default" onclick="doLogin()">Sign in</button>
	    </div>
	  </div>
	</form>
	<div style="color:red">아이디와 패스워드가 일치 하지 않습니다.</div>
</body>
</html>




