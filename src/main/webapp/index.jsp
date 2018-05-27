<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<body>
<h2>Hello World!</h2>
<%=(String)application.getAttribute("zgm") %>
${applicationScope.zgm }

</body>
</html>
