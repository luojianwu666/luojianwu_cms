<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<nav class="nav justify-content-end" style="background-color: #563d7c;">
	<a class="nav-link disabled" href="#">CMS内容管理系统</a> 
	<a class="nav-link" href="http://127.0.0.1/" target="_blank">访问官网</a>
	 <a class="nav-link" href="#">管理员</a> <a class="nav-link" href="#">退出</a> 
	 </nav>

	<div class="container-fluid">
		<div class="row" style="margin-top: 15px;">
			<div class="col-3">
				<!-- 左侧导航 -->
				<div class="nav flex-column nav-pills">
					<a class="nav-link active" href="javascript:;" url="/admin/welcome">后台首页</a>
					<a class="nav-link" href="javascript:;" url="/admin/user">用户管理</a>
					<a class="nav-link" href="javascript:;" url="/admin/article">文章管理</a>
					<a class="nav-link" href="javascript:;" url="/admin/settings">系统设置</a>
				</div>
			</div>
			<div class="col-9">
				<div class="tab-content" id="v-pills-tabContent"></div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	
	//获取导航菜单数组
	var navArray = $(".row .nav .nav-link");
	//console.log(navArray[0]);
	//保存当前菜单的url
	var curMenuUrl = $(navArray[0]).attr("url");
	console.log("page init address:"+curMenuUrl);
	//给导航菜单添加click事件
	$(".row .nav .nav-link").click(function(){
		var url = $(this).attr("url");
		selectedMenu(url);
	});
	//选中当前菜单，根据url，通过ajax加载页面主页面
	function selectedMenu(url,params){
		console.log("checked menu url:"+url,"params:"+params);
		navArray.each(function(index,value){
			//取消选中的状态
			$(value).removeClass("active");
			//判断当前url和参数url是否一致
			if($(value).attr("url") == url){
				curMenuUrl = url;
				//菜单状态变为选中
				$(value).addClass("active");
				//加载url返回html，赋值给class=tab-content的div
				$.get(url,params,function(res){
					//console.log(res);
					$(".tab-content").html(res);
				},"html")
			}
		})
	}
	//初始化当前页面
	selectedMenu(curMenuUrl);
	//刷新当前菜单的方法
	//主页查询、删除、新增、修改时，需要刷新列表页，调用该方法。
	function reload(params){
		console.log("reload:"+curMenuUrl);
		//selectedMenu(curMenuUrl,params);
		$.get(curMenuUrl,params,function(res){
			//console.log(res);
			$(".tab-content").html(res);
		},"html")
	}
	
	
	
	</script>
	
	
	
</body>
</html>