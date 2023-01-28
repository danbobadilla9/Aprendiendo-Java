<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%
 Map<String,String> errores = (Map<String,String>)request.getAttribute("errores");

 %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularios de usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
    <h3>Formulario de usuarios</h3>

    <%
    if( errores != null && errores.size() > 0){
    %>
    <ul class="alert alert-danger mx-5">
    <%for(String error: errores.values()){%>
        <li><%=error%></li>
    <%}%>
    </ul>
    <%}%>
<div class="px-5">
    <form action="/webapp-form/registro" method="post">

        <div class="row mb-3">
            <label  class="col-form-label col-sm-2" for="username">Usuario</label>
            <div class="col-sm-4">
                    <input class="form-control" type="text" name="username" id="username">
            </div>
            <%
                if(errores != null && errores.containsKey("username")){
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red'>"+errores.get("username")+"</small>");
                }
            %>
        </div>

        <div class="row mb-3">
            <label  class="col-form-label col-sm-2" for="password">Contraseña</label>
            <div class="col-sm-4">
                <input class="form-control" type="password" name="password" id="password">
            </div>
            <%
                 if(errores != null && errores.containsKey("password")){
                       out.print("<small class='alert alert-danger col-sm-4' style='color: red'>"+errores.get("password")+"</small>");
                 }
            %>
        </div>

        <div class="row mb-3">
            <label  class="col-form-label col-sm-2" for="email">Email</label>
            <div class="col-sm-4">
                <input class="form-control" type="text" name="email" id="email">
            </div>
            <%
               if(errores != null && errores.containsKey("email")){
                  out.print("<small class='alert alert-danger col-sm-4' style='color: red'>"+errores.get("email")+"</small>");
               }
            %>
        </div>
        
        <div class="row mb-3">
            <label  class="col-form-label col-sm-2" for="pais">País</label>
            <div class="col-sm-4">
                <select name="pais" id="pais" class="form-select">
                    <option value="">-- seleccionar --</option>
                    <option value="ES">España</option>
                    <option value="MX">México</option>
                    <option value="CL">Chile</option>
                    <option value="AR">Argentina</option>
                    <option value="PE">Perú</option>
                    <option value="CO">Colombia</option>
                    <option value="VE">Venezuela</option>
                </select>
            </div>
            <%
               if(errores != null && errores.containsKey("pais")){
                  out.print("<small class='alert alert-danger col-sm-4' style='color: red'>"+errores.get("pais")+"</small>");
               }
            %>
        </div>

        <div class="row mb-3">
            <label  class="col-form-label col-sm-2" for="lenguajes">Lenguajes de programación</label>
            <div class="col-sm-4">
                <select name="lenguajes" id="lenguajes" multiple class="form-select">
                    <option value="java">Java SE</option>
                    <option value="jakartaee">Jakarta EE9</option>
                    <option value="spring">Spring Boot</option>
                    <option value="js">JavaScript</option>
                    <option value="angular">Angular</option>
                    <option value="react">React</option>
                </select>
            </div>
            <%
               if(errores != null && errores.containsKey("lenguajes")){
                  out.print("<small class='alert alert-danger col-sm-4' style='color: red'>"+errores.get("lenguajes")+"</small>");
               }
            %>
        </div>
        
        <div class="row mb-3">
            <label class="col-form-label col-sm-2" >Roles</label>
            <div class="form-check">
                <input type="checkbox" name="roles" value="ROLE_ADMIN" class="form-check-input">
                <label class="form-check-label">Administrador</label>
            </div>
            <div class="form-check">
                <input type="checkbox" name="roles" value="ROLE_USER" class="form-check-input">
                <label class="form-check-label">Usuario</label>
            </div>
            <div class="form-check">
                <input type="checkbox" name="roles" value="ROLE_MODERATOR" class="form-check-input">
                <label class="form-check-label">Moderador</label>
            </div>
            <%
               if(errores != null && errores.containsKey("roles")){
                  out.print("<small class='alert alert-danger col-sm-4' style='color: red'>"+errores.get("roles")+"</small>");
               }
            %>
        </div>

        <div class="row mb-3">
            <label class="col-form-label col-sm-2" >Idiomas</label>
            <div class="form-check">
                <input type="radio" name="idioma" value="es" class="form-check-input">
                <label class="form-check-label">Español</label>
            </div>
            <div class="form-check">
                <input type="radio" name="idioma" value="en" class="form-check-input">
                <label class="form-check-label">Inglés</label>
            </div>
            <div class="form-check">
                <input type="radio" name="idioma" value="fr" class="form-check-input">
                <label class="form-check-label">Frances</label>
            </div>
            <%
               if(errores != null && errores.containsKey("idioma")){
                  out.print("<small class='alert alert-danger col-sm-4' style='color: red'>"+errores.get("idioma")+"</small>");
               }
            %>
        </div>


        <div class="row mb-3">
            <label  class="col-form-label col-sm-2" for="habilitar">Habilitar</label>
            <div class="form-check">
                <input type="checkbox" name="habilitar" id="habilitar" checked class="form-check-input">
            </div>
        </div>

        <input type="hidden" name="secreto" value="12345">

        <div class="row mb-3">
            <div>
                <input type="submit" value="Enviar" class="btn btn-primary">
            </div>
        </div>

    </form>
    <div>
</body>
</html>




































