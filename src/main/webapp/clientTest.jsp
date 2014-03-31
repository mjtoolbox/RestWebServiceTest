<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,com.mjtoolbox.ws.*, com.mjtoolbox.wsclient.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REST WebService Test page</title>
</head>
<body>
	<%
		StudentWSClient client = new StudentWSClient();
	%>
	<p>
		Display student over age <br>

		<%
			Collection<Student> students = client.getStudentsOverAge("20");
		%>

		Student over age Size :	<%=students.size()%><br>
		<%
			for (Student aStudent : students) {
		%>
		<%=aStudent.toString()%><br>
		<%
			}
		%>
	<p>
		Display students by name (Mike, Jane, Debbie) <br>

		<%
			List<String> studentsName = Arrays.asList("Mike", "Jane", "John", "Debbie");
			Collection<Student> studentList = client.getStudentsByNameJson(studentsName);

		%>

		Student over age Size :	<%=studentList.size()%><br>
		<%
			for (Student aStudent : studentList) {
		%>
		<%=aStudent.toString()%><br>
		<%
			}
		%>	
</body>
</html>