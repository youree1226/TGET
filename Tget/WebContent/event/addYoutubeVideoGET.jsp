<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Searching Youtube Video</title>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script type="text/javascript">
	
	var videoList = [];
	$(function(){
		$("#searchSubmit").on("click",function(){
			//alert("searchKeyword : "+$("#searchKeyword").val());
			//$("form").attr("method" , "POST").attr("action" , "/event/youtubeSearch").submit();
			
			$.ajax(
					{
						url : "/event/rest/addYoutubeVideo/"+$("#requestPageToken").val(),
						method : "GET",
						data : {
										eventName : $("#eventName").val()
									},
						dataType : "json",
						success : function(JSONData, status){
							alert(status);
							alert("JSONData : \n"+JSONData);		
					
						},
						error : function(request, status, error ) {   
						 	alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
						}
			
					});			
		});		
	});
	
	</script>
</head>

<body>

<form>
	<div class="container-fluid">
		<input type="hidden" id="eventName" name="eventName" value="${eventName}"/>
		<div>
			<input type="text" class="form-control" id="searchKeyword" name="searchKeyword"  placeholder="검색어" value="${!empty search.searchKeyword? search.searchKeyword : ''}" >
			<button type="button"  id="searchSubmit" >검색</button>
		</div>
	
		<c:forEach items="${youtubeList}"  var="i">
			<div class="videoInfo">
				<input type="hidden" id="videoId" name="videoId" value="${i.videoId}"/>
				<img src="${i.thumbnails}"><br/>
				videoId : ${i.videoId}<br/>
				title : ${i.title}<br/>
				description : ${i.description} <br/><br/>
				<button class="getYoutubePlayer" name="getYoutubePlayer">동영상보기</button><br/><br/>
			</div>
			------------------------------------------------<br/>
		</c:forEach>
		
		<div align="center">
			<input type="hidden" id="requestPageToken" name="requestPageToken"/>
			<button id="prevPageToken" name="prevPageToken" value="${!empty prevPageToken? prevPageToken : ''}">◀</button>&nbsp;&nbsp;
			<button id="nextPageToken" name="nextPageToken" value="${!empty nextPageToken? nextPageToken : ''}">▶</button>
		</div>
	</div>
	
</form>

</body>
</html>