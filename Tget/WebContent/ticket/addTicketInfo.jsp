<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page pageEncoding="EUC-KR"%>


<!DOCTYPE html>

<html lang="ko">
	
<head>
	<meta charset="EUC-KR">
	
	<!-- 참조 : http://getbootstrap.com/css/   참조 -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	
	<!-- Bootstrap Dropdown Hover CSS -->
   <link href="/css/animate.min.css" rel="stylesheet">
   <link href="/css/bootstrap-dropdownhover.min.css" rel="stylesheet">
   
    <!-- Bootstrap Dropdown Hover JS -->
   <script src="/javascript/bootstrap-dropdownhover.min.js"></script>
   
	<style>
       body > div.container{
        	border: 3px solid #D6CDB7;
            margin-top: 10px;
        }
	   body {
            padding-top : 50px;
        }
    
    </style>
    
     <!--  ///////////////////////// JavaScript ////////////////////////// -->
	<script type="text/javascript">	
		
		
	function fncAddTicketInfo(){
		//Form 유효성 검증
	 	var amount = $("input[name='amount']").val();
		var type = $("input[name='type']").val();
		var seat = $("input[name='seat']").val();
		
		if(amount == null || amount.length<1){
			alert("수량은 반드시 입력하여야 합니다.");
			return;
		}
		if(isNaN(amount)==true) {
			alert("수량에 숫자입력 바랍니다.");
			return;
		}
		if(type == null || type.length<1){
			alert("형태는 반드시 입력하여야 합니다.");
			return;
		}
		if(seat == null || seat.length<1){
			alert("좌석 반드시 입력하셔야 합니다.");
			return;
		}
	
		$("form").attr("method" , "POST").attr("action" , "/ticket/addTicketInfo").submit();
	}		
	
	$(function(){
	    
	    $("button").on("click",function(){
	    	
	    	fncAddTicketInfo();
	    	
	    });
		
	    $("a[href='#']").on("click",function(){
	    	
	    	self.location = "/";
	    	
	    });
	    
	});
	</script>		
    
</head>

<body>
	
	<div class="container">
	<br/>
		<h1 class="text-center">티 켓 판 매 : ${event.eventName}</h1>
				
		<form class="form-horizontal">
		<input type="hidden" name="event.eventId" value="${event.eventId}" >
		<input type="hidden" name="event.eventName" value="${event.eventName}" >
		<input type="hidden" name="seller.userId" value="seller" >
		
		<br/>
		  <div class="form-group">
		    <label class="col-sm-offset-1 col-sm-3 control-label">장소</label>
		    <div class="col-sm-4">
		      ${event.eventLocation}
		    </div>
		  </div>
		<br/>
		  <div class="form-group">
		    <label class="col-sm-offset-1 col-sm-3 control-label">일자</label>
		    <div class="col-sm-4">
		      ${event.eventDate}
		    </div>
		  </div>
		<br/>
		  <div class="form-group">
		    <label for="amount" class="col-sm-offset-1 col-sm-3 control-label">판매 수량</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="amount" name="amount" placeholder="판매수량입력">
		    </div>
		  </div>
		<br/>  
		  <div class="form-group">
		    <label for="type" class="col-sm-offset-1 col-sm-3 control-label">형태</label>
		    <div class="col-sm-4">
		      <input type="radio" name="type" value="0" checked="checked" /> 종이티켓
			  <input type="radio" name="type" value="1" /> 전자티켓
		    </div>
		  </div>
		<br/>  
		  <div class="form-group">
		    <label for="seat" class="col-sm-offset-1 col-sm-3 control-label">좌석</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="seat" name="seat" placeholder="좌석입력">
		    </div>
		  </div>
		<br/>  
		  <div class="form-group">
		    <label for="options" class="col-sm-offset-1 col-sm-3 control-label">특이사항</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="options" name="options" placeholder="특이사항">
		    </div>
		  </div>
		<br/>		  
		  <div class="form-group">
		    <div class="col-sm-offset-4  col-sm-4 text-center">
		      <button type="button" class="btn btn-primary"  >계 &nbsp;속</button>
			  <a class="btn btn-primary btn" href="#" role="button">취&nbsp;소</a>
		    </div>
		  </div>
		</form>
				
 	</div>
	
</body>

</html>