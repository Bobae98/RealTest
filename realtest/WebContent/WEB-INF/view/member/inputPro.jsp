<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "ch11.logon.LogonDBBean" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<script>
	alert("가입되었습니다...!!");
	window.location="/realtest/member/loginForm.do";
</script>
<%
   // response.sendRedirect("loginForm.jsp"); 이렇게 해도 됨!
   //보내주기만 하는 거기 때문에 스크립트를 써도 되고 redirect를 사용해도됨.
%>