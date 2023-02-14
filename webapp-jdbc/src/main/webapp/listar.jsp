<%@page contentType="UTF-8" import="java.util.*, com.danbobadilla9.apiservlet.webapp.headers.models.*" %>
<%
    List<Producto> productos = (List<Producto>) request.getAttribute("productos");
    Optional<String> username = (Optional<String>) request.getAttribute("username");
    String mensajeRequest = (String) request.getAttribute("mensaje");
    String mensajeApp = (String) getServletContext().getAttribute("mensaje");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Listado de Productos</title>
</head>
<body>
    <h1>Listado de productos</h1>
    <% if(username.isPresent()){ %>
        <div>Hola <%=username.get()%> , Bienvenido !</div>
    <% } %>
    <table>
        <tr>
            <th>id</th>
            <th>Nombre</th>
            <th>Tipo</th>
            <% if(username.isPresent()){ %>
                <th>Precio</th>
            <% } %>
            <th>Agregar</th>
        </tr>
        <% for(Producto p: productos){ %>
            <tr>
                <td><%=p.getId()%></td>
                <td><%=p.getNombre()%></td>
                <td><%=p.getTipo()%></td>
                <% if(username.isPresent()){ %>
                    <td><%=p.getPrecio()%></td>
                    <td><a href="<%=request.getContextPath()%>/carro/agregar?id=<%=p.getId()%>"> Agregar al carro</a></td>
                <% } %>
            </tr>
        <% } %>
    </table>
    <p><%=mensajeApp%></p>
    <p><%=mensajeRequest%></p>
</body>































</html>