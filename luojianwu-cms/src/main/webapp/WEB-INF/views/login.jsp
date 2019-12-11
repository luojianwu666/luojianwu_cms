<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath() %>/bootstrap-4.4.1-dist/css/bootstrap.min.css"   rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"src="<%=request.getContextPath() %>/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
<script type="text/javascript"src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
</head>

<body style="background-image: url('https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4263744593,3422719797&fm=26&gp=0.jpg');background-size: 100%">
<div style="align: center">
<form action="" >
<div  style="margin-left: 600px;margin-top: 200px;" class="form-check" class="form-group">
    <div class="col-md-4 mb-3">
      <label for="validationDefault01">用户名</label>
      <input type="text" class="form-control" id="validationDefault01" placeholder="请输入用户名" required>
    </div><br>
    <div class="col-md-4 mb-3">
      <label for="validationDefault02">密码</label>
      <input type="text" class="form-control" id="validationDefault02" placeholder="请输入密码" required>
    </div>
    
    <div class="form-group" style="margin-left: 15px;">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
      <label class="form-check-label" for="invalidCheck2">
        Agree to terms and conditions
      </label>
    </div>
  </div>
  <button class="btn btn-primary" type="submit" style="margin-left: 15px;">提交</button>
 </div>
 


</form>


 </div>

</body>
</html>