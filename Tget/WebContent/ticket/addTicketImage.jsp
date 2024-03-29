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
   <script src="/resources/javascript/common.js" ></script>
   
	<style>
       body > div.container{
        	border: 3px solid #D6CDB7;
            margin-top: 10px;
        }
	   body {
            padding-top : 50px;
        }
    </style>
    <style type="text/css">
	    .img_wrap {
			width: 300px;
			margin: auto;
		}
		.img_wrap img {
			max-width: 100%;
		}    
    </style>
    
     <!--  ///////////////////////// JavaScript ////////////////////////// -->
	<script type="text/javascript">	
		
		
	function fncAddTicketImage(){
		//Form 유효성 검증
	 	var file = $("input[name='file']").val();
		
		if(file == null || file.length<1){
			alert("이미지등록 바람");
			return;
		}
	
		$("form").attr("method" , "POST").attr("action" , "/ticket/addTicketImage").attr("enctype" , "multipart/form-data").submit();
	}		
	
	$(function(){
	    
	    $("button").on("click",function(){
	    	
	    	fncAddTicketImage();
	    	
	    });
		
	    $("a[href='#']").on("click",function(){
	    	
	    	self.location = "/";
	    	
	    });
	    
	    $("#file").change(function(){
	    	readURL(this);
	    });
	    
	    
	});
	</script>		
    
</head>

<body>	
	<div class="container">
	<br/>
		<h1 class="text-center">실물 이미지 등록 : ${sellticketInfo.event.eventName}</h1>
		<br/>	
		<div class="img_wrap">
		<img id="preview" />	
		</div>
		<form class="form-horizontal">				  
		<br/>		
		    <label for="file" class="col-sm-offset-1 col-sm-3 control-label">티켓 이미지(실물,영수증)</label>
		    <div class="col-sm-4">
		       <input type="file" class="form-control" id="file" name="file" value="" placeholder="file input...">
		    </div>
		  </div>
		<br/>
		  <div class="form-group">
		    <div class="col-sm-offset-4  col-sm-4 text-center">
		      <button type="button" class="btn btn-primary"  >요 &nbsp;청</button>
			  <a class="btn btn-primary btn" href="#" role="button">취&nbsp;소</a>
		    </div>
		  </div>
		</form>
		
 	</div>
</body>

</html>