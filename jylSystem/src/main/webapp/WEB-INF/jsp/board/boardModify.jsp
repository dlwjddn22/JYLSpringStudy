<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript">
	function goList()
	{
		location.href = "/board/boardList";
	}
</script>
</head>
<body>
<form class="form-horizontal" action="/board/boardUpdate" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Id</label>
    <div class="col-sm-10">
      <input type="text" name="usr_id" value="${boardBean.usr_id}" class="form-control" placeholder="User Id">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Name</label>
    <div class="col-sm-10">
      <input type="text" name="usr_nm" value="${boardBean.usr_nm}" class="form-control" placeholder="Name">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" name="pwd" value="${boardBean.pwd}" class="form-control"  placeholder="Password">
    </div>
  </div>
  
  <p class="text-right">
	<input type="submit" class="btn btn-primary" value="회원수정">
	<input type="button" class="btn btn-primary" value="목록" onclick="javascript:goList()">
  </p>
</body>
</html>