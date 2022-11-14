<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@include file="/resources/includes/link.jsp" %>
<link rel="stylesheet" href="resources/css/common.css" >

</head>
<body>
	<%@page import="com.korea.dto.MemberDTO" %>
	<%
		MemberDTO dto = (MemberDTO)request.getAttribute("dto");
		
	
	%>


	<div class="container-md" id=wrapper style="margin:100px auto;">
		<!-- TopMenu -->
		<%@include file="/resources/includes/topmenu.jsp" %>
			
		<!-- NAV -->
		<%@include file="/resources/includes/nav.jsp" %>
		
		<!-- MainContents -->
		<div id=maincontents style="border:1px solid gray;margin-top:15px;">
			
			
			<form action="/MemberUpdate.do" method="post">
				<table class="table w-75 table-striped" style="margin:100px auto;">  	
					<tr>
						<td>Email</td>
						<td><input name=email value=<%=dto.getEmail() %> disabled></td>
					</tr>
					<tr>
						<td>Addr1</td>
						<td><input name=addr1 value=<%=dto.getAddr1() %> > </td>
					</tr>
					<tr>
						<td>Addr2</td>
						<td><input name=addr2 value=<%=dto.getAddr2() %> > </td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input name=pwd type=password value=<%=dto.getPwd() %>> </td>
					</tr>
					<tr>
						<td>
							<input type=submit value="정보수정" class="btn btn-primary w-50">
						</td>
						<td>
							<a class="btn btn-secondary w-50">메인이동</a>
						</td>
					</tr>
				</table>
			</form>
			
		</div>
		
		<!-- Footer -->
		
	
	</div>


</body>
</html>