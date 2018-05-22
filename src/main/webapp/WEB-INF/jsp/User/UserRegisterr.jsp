<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>用户注册</title>
		<!-- Bootstrap -->
		<link href="<%=request.getContextPath()%>/statics/css/bootstrap.min.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/statics/css/bootstrap-datepicker3.standalone.min.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/statics/css/index.css" rel="stylesheet">
			<!-- jQuery (necessary for Bootstraps JavaScript plugins) -->
		<script src="<%=request.getContextPath()%>/statics/js/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="<%=request.getContextPath()%>/statics/js/bootstrap.min.js"></script>  
		<!-- Dynamic page helper script -->
		<script>var contextPath="<%=request.getContextPath()%>";</script>
		<script src="<%=request.getContextPath()%>/statics/js/jquery.cookie.min.js"></script>
	</head>
	<body>
		<header>
			<div>
			<!--     <a>注册</a> |  -->
    			欢迎光临要健康！
    		</div>
    	</header>
    	<div class="main">
		    <%@include file="../_COMPONENTS_/Header.jsp"%>
		    <%@include file="../_COMPONENTS_/UserRegister.jsp"%>
	    </div>
  		<%@include file="../_COMPONENTS_/Footer.jsp"%>
	</body>
</html>