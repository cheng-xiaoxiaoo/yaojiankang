<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 网站底部 -->
<style type="text/css">
.footer{
	background: #f2f2f2;
	height: 90px;
	
}
/* .footerfix{ */
/* 	position: fixed; */
/* 	bottom: 0px; */
/* } */
</style>
<!--Anchor_Start-->
<div id="page-footer" class="footer row col-xs-12 ">
  <div class="text-center" style="margin-top: 15px">“药健康”开发团队 </div>
  <div class="text-center">Copyright 2016~2018 药健康开发团队 All Rights Reserved</div>
  <div class="text-center">“药健康”开发团队版权所有</div>
</div>
<!--Anchor_End-->
<script type="text/javascript">
  var innerHeight = $("#page-footer").height()
  var outerHeight = $("#page-footer").offset().top
  var windowHeight = document.body.scrollHeight
  if (innerHeight + outerHeight < windowHeight){
  	  $("#page-footer").addClass("footerfix")
  } else {
	  $("#page-footer").removeClass("footerfix")
  }
  $(window).resize(function(){
	  var innerHeight = $(".footer").height()
	  var outerHeight = $(".footer").offset().top
	  var windowHeight = document.body.scrollHeight
	  // console.log(innerHeight,outerHeight,windowHeight)
	  if (innerHeight + outerHeight < windowHeight){
	  	  $("#page-footer").addClass("footerfix")
	  } else {
		  $("#page-footer").removeClass("footerfix")
	  }
  })
</script>
