<%-- 
    Document   : index
    Created on : 04/11/2023, 19:04:23
    Author     : Gabriel
--%>

    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="controladorcomunicacion?accion=Listar">Listar</a>
        <a href="controladorcomunicacion?accion=Nada">Nada</a>
        <div>
            <table>
                <tr>
                    <th>Usuario</th>
                    <th>clave</th>
                </tr>
                <tr>
                    <c:forEach var="Usuarios" items="${Usuarios}">
                        <td> <c:out value="${Usuarios.nombre}"></c:out></td>
                        <td> <c:out value="${Usuarios.clave}"></c:out></td>
                            <td>
                                <a>Editar</a>
                            </td>
                    </c:forEach>
                </tr>
            </table>
        </div>

    </body>
</html>
