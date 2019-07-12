<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page pageEncoding="EUC-KR"%>


<!--  ///////////////////////// JSTL  ////////////////////////// -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html lang="ko">
	
<head>
	<meta charset="EUC-KR">
	
	<!-- 참조 : http://getbootstrap.com/css/   -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
	<!--  ///////////////////////// Bootstrap, jQuery CDN ////////////////////////// -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	
	<style>
	</style>
   	
   	<!--  ///////////////////////// JavaScript ////////////////////////// -->
	<script type="text/javascript">
		$( function(){

			$("a:contains('이벤트검색')").on("click",function(){
				self.location = "/event/test";
			});
			
			$("a:contains('티켓판매')").on("click",function(){
				self.location = "/ticket/addTicketInfo?eventId=104175822";
			});
			
			
		});
		
		
	</script>	
	
</head>

<body>

	<!-- ToolBar Start /////////////////////////////////////-->
	<div class="navbar  navbar-default">
		
        <div class="container">
        	
        	<a class="navbar-brand" href="#"><img src="/resources/images/logo.png" width="100" height="50"></img></a>
			
			
			<div class="collapse navbar-collapse"  id="target" >
	            <ul class="nav navbar-nav navbar-right">
	            <li><a href="#">이벤트검색</a></li>
	            <li class="dropdown">
			        <a  href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
			           <span >티켓</span>
			           <span class="caret"></span>
			        </a>
			        <ul class="dropdown-menu">
			           <li><a href="#">티켓구매</a></li>
			           <li><a href="#">티켓판매</a></li>
			           <li><a href="#">티켓목록</a></li>
			           <li class="divider"></li>
			        </ul>
		    	</li>
	             <li><a href="#">회원가입</a></li>
	             <li><a href="#">로 그 인</a></li>
	             <li><a href="#">채팅</a></li>
	           	</ul>
	       </div>
   		
   		</div>
   	</div>
   	
</body>

</html>