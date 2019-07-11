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
	
	var events = [];
	$(function(){
		$("#addEvent").on("click",function(){
			alert("requestPageToken+1 : "+parseInt($("#requestPageToken").val())+1);
			var requestPT = parseInt($("#requestPageToken").val())+1;
			$.ajax(
					{
						url : "/event/rest/getEventList/"+requestPT,
						method : "POST",
						data : {
										searchKeyword : $("#searchKeyword").val()
									},
						dataType : "json",
						success : function(JSONData, status){
							alert(status);
							alert("JSONData : \n"+JSONData);		
							alert("eventList : \n"+JSONData.eventList);		
							alert("totalResults : \n"+JSONData.totalResults);		
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
	<%-- 	<input type="hidden" id="currentPage" name="currentPage" value="${!empty search.currentPage? search.currentPage: ''}"/> --%>
		<input type="hidden"  id="searchKeyword" name="searchKeyword"  placeholder="검색어" value="${!empty search.searchKeyword? search.searchKeyword : ''}" >
		<input type="hidden"  id="requestPageToken" name="requestPageToken"  value="0"/>
		
		총 ${totalResults} 건의 검색 결과</br></br>
		eventList
		<c:forEach items="${eventList}"  var="i">
			<div class="row">
				<div class="col-md-1"></div>
				<div class="col-md-10 event">
					이벤트명 : ${i.name }</br>
					이벤트 장소 : ${i.venueName }</br>
					============================</br>
				</div>
				<div class="col-md-1"></div>
			</div>
		</c:forEach>
		<button type="button"  id="addEvent" >더보기</button>
		
	</div>
</form>

</body>
</html>