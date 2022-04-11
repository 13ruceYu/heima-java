<%--
  Created by IntelliJ IDEA.
  User: yuhongbo
  Date: 2022/4/11
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<input type="button" value="add"><br>
<hr>
<table border="1" cellspacing="0" width="800"></table>
    <tr>
        <th>id</th>
        <th>brand_name</th>
        <th>company_name</th>
        <th>order</th>
        <th>description</th>
        <th>status</th>
        <th>operation</th>
    </tr>

    <c:forEach items="${brands}" var="brand" varStatus="status">
        <tr align="center">
<%--            <td>${brand.id}</td>--%>
            <td>${status.count}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test="${brand.status == 1}">
                <td>open</td>
            </c:if>
            <c:if test="${brand.status != 1}">
                <td>close</td>
            </c:if>
            <td>
                <a href="#">edit</a>
                <a href="#">delete</a>
            </td>
        </tr>
    </c:forEach>
</body>
</html>
