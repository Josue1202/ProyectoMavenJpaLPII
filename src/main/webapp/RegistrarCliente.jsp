<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="Modelo.TblCliente" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registrar Cliente</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container">
    <h1 class="text-center my-4">Registrar Cliente</h1>
    <form action="ControladorCliente" method="post">
        <div class="form-group row">
            <label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="nombre" id="nombre" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="apellido" class="col-sm-2 col-form-label">Apellido</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="apellido" id="apellido" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="dni" class="col-sm-2 col-form-label">Dni</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="dni" id="dni" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="email" class="col-sm-2 col-form-label">Email</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" name="email" id="email" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="telefono" class="col-sm-2 col-form-label">Telefono</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="telefono" id="telefono" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="sexo" class="col-sm-2 col-form-label">Sexo</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="sexo" id="sexo" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="nacionalidad" class="col-sm-2 col-form-label">Nacionalidad</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="nacionalidad" id="nacionalidad" required>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-10 offset-sm-2">
                <button type="submit" class="btn btn-primary">Registrar</button>
            </div>
        </div>
    </form>

    <h1 class="text-center my-4">Lista Clientes</h1>
    <table class="table table-striped table-bordered">
        <thead class="thead-dark">
            <tr>
                <th>Codigo de Cliente</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Dni</th>
                <th>Correo</th>
                <th>Telefono</th>
                <th>Sexo</th>
                <th>Nacionalidad</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<TblCliente> ListadoClientes = (List<TblCliente>) request.getAttribute("listado");
                if (ListadoClientes != null) {
                    for (TblCliente lis : ListadoClientes) {
            %>
            <tr>
                <td><%= lis.getIdcliente() %></td>
                <td><%= lis.getNombre() %></td>
                <td><%= lis.getApellido() %></td>
                <td><%= lis.getDni() %></td>
                <td><%= lis.getEmail() %></td>
                <td><%= lis.getTelf() %></td>
                <td><%= lis.getSexo() %></td>
                <td><%= lis.getNacionalidad() %></td>
            </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
