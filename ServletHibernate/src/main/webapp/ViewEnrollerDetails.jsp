<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"

    import="com.training.hibernateservlet.bean.AadharDetails"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

    <%

    session = request.getSession();

    AadharDetails data = (AadharDetails) session.getAttribute("curUser");

    %>

    <h1>Your Details:</h1>

   
    <p> Aadhar Number: <%=data.getAadhar_ID() %></p><br>
    
    <p>Name: <%=data.getName()%></p><br>

    <p>Email:<%=data.getEmail_ID() %></p><br>
    <p>Phone Number:<%=data.getPhone_no() %></p><br>
    <p>Address Line:<%=data.getAddress()%></p><br>

    <p>City:<%=data.getCity()%></p><br>

    <p>State:<%=data.getState()%></p><br>


    <p>Pincode:<%=data.getPin() %></p><br>

    <a href="index.html">Click here to redirect</a>

</body>

</html>