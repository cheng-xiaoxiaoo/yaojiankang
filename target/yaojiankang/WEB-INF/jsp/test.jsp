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
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>课程介绍管理</title>

    <!-- Bootstrap -->
    <link href="<%=request.getContextPath()%>/statics/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/statics/css/index.css" rel="stylesheet">
    <script src="<%=request.getContextPath()%>/statics/js/jquery.min.js"></script>


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
<!--     <header> -->
<!--     	<div> -->
<!-- 			<!--     <a>登录</a> |  -->
<!-- 			    欢迎来到易训汇！ -->
<!-- 		</div> -->
<!-- 	</header> -->
	<%@include file="../_COMPONENTS_/Header.jsp"%>
	
    <div class="main" style="padding-top:30px">
    <div style="display:flex">
	    <div style="width: 210px;">
	    	<%@include file="../_COMPONENTS_/LeftNav.jsp"%>
	    </div>
	    <div style="flex:1">
		    <%@include file="/WEB-INF/jsp/_COMPONENTS_/CourseIntroduceManage.jsp"%> 
	    </div>
    </div>
	<%@include file="/WEB-INF/jsp/_COMPONENTS_/ModalMsg.jsp"%>
  </div>

	<!-- jQuery (necessary for Bootstraps JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<%=request.getContextPath()%>/statics/js/bootstrap.min.js"></script>  
    <!-- Dynamic page helper script -->
    <script>var contextPath="<%=request.getContextPath()%>";</script>
    <script src="<%=request.getContextPath()%>/statics/js/jquery.cookie.min.js"></script>
    <script>
		leftNavInit("homepage","courseIntroduce")
	</script>

  </body>
</html>
