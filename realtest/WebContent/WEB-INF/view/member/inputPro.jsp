<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "ch11.logon.LogonDBBean" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<script>
	alert("���ԵǾ����ϴ�...!!");
	window.location="/realtest/member/loginForm.do";
</script>
<%
   // response.sendRedirect("loginForm.jsp"); �̷��� �ص� ��!
   //�����ֱ⸸ �ϴ� �ű� ������ ��ũ��Ʈ�� �ᵵ �ǰ� redirect�� ����ص���.
%>