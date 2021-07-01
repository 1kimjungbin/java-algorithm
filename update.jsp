<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="test.DBconnect" %>
<%@ page import="java.sql.*" %>
<%

	String sql="select custno, custname, phone, address, to_char(joindate,'yyyymmdd')joindate, grade, city from member_tbl_02 where custno=" + request.getParameter("click_custno");
	
	Connection conn =  DBconnect.getConnection();
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	
	rs.next();

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;" charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">

<script type="text/javascript">
	function checkValue() {
		if(!document.u_data.custname.value) {
			alert("회원 성명을 입력하세요");
			document.u_data.custname.focus();
			return false;
		} else if (!document.u_data.phone.value) {
			alert("전화번호를 입력하세요.");
			document.u_data.phone.focus();
			return false;
		} else if (!document.u_data.address.value) {
			alert("주소를 입력하세요");
			document.u_data.address.focus();
			return false;
		} else if (!document.u_data.joindate.value) {
			alert("가입일자를 입력하세요");
			document.u_data.joindate.foucs();
			return false;
		} else if (!document.u_data.grade.value) {
			alert("등급을 입력하세요");
			document.u_data.grade.focus();
			return false;
		} else if (!document.u_data.city.value) {
			alert("도시코드를 입력하세요.");
			document.u_data.city.focus();
			return false;
		}
	}
	
	function checkDel(custno) {
		msg="삭제하시겠습니까?";
		if(confirm(msg)!=0) {
			alert("삭제");
			location.href="delete.jsp?d_custno="+custno;
		} else {
			alert("취소");
		}
	}
</script>

<title>쇼핑몰 회원관리</title>
</head>
<body>
	<jsp:include page="layout/header.jsp"></jsp:include>
	<jsp:include page="layout/nav.jsp"></jsp:include>
	
	<div class="section">
		<h3 class="title">홈쇼핑 회원정보 수정</h3>
		<form name="u_data" action="update_p.jsp" method="post" onsubmit="return checkValue()">
		<table class="table_line">
			<tr>
				<th>회원번호</th>
				<td><input type="text" name="custno" value="<%= rs.getString("custno") %>" size="10" readonly></td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td><input type="text" name="custname" value="<%= rs.getString("custname") %>" size="10"></td>
			</tr>
		</table>
		</form>
	
	</div>

</body>
</html>