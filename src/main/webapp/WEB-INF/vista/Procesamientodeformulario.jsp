<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado de formulario</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/estilo1.css">
</head>
<body>

Hola ${param.nombre}

<p><br>

<h2>Atención</h2>

${mensajeClaro}
</p>

<img alt="foto" src="${pageContext.request.contextPath}/recursos/img/casa.jpg">

</body>
</html>