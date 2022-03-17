<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Task3</title>
</head>
<body>

<spring:message code="label.lang"/>
<button onclick="location.href = '<c:url value="?lang=en"/>';"><spring:message code="label.lang.en"/></button>
<button onclick="location.href = '<c:url value="?lang=ru"/>';"><spring:message code="label.lang.ru"/></button>
<spring:message code="label.message"/>
</body>
</html>
