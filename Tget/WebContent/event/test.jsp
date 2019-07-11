<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script type="text/javascript">
	$(function(){
		$("#testSubmit").on("click",function(){
			$("form").attr("method" , "POST").attr("action" , "/event/getEventList").submit();
		});
	});	
	</script>
</head>

<body>

<form>
	<div class="container-fluid">
	<br/><br/><br/>
	searchCondition이 0이면 카테고리 검색<br/>
	searchCondition이 1이면 키워드 검색<br/><br/>
	<input type="hidden" id="requestPageToken" name="requestPageToken" value="${requestPageToken }"/><br/>
	<input type="text" id="searchCondition" name="searchCondition" placeholder="searchCondition"/><br/>
	<input type="text"  id="searchKeyword" name="searchKeyword"  placeholder="searchKeyword" value="${!empty search.searchKeyword? search.searchKeyword : ''}" ><br/>
	<button type="submit" id="testSubmit" >이벤트검색테스트</button><br/>
	</div>
</form>

</body>
</html>