<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: cramirez
  Date: 10/11/2017
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Location</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
</head>
<body style="padding-top: 70px;">
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">Zoo Management</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Control <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Ubicaciones</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Supervisores</a>
            </li>
        </ul>
    </div>
</nav>
<main role="main">
    <div class="container">
        <table class="table table-striped table-dark">
            <h3>Listado de animales</h3>
            <h4><a href="">Crear nuevo</a></h4>
            <thead>
            <tr class="tr tr-success">
                <th scope="col">Id</th>
                <th scope="col">Nombre</th>
                <th scope="col">Raza</th>
                <th scope="col">Edad</th>
                <th scope="col">Genero</th>
                <th scope="col">Ubicacion</th>
                <th scope="col">Supervisor</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${listAnimals}" var="temp">
                <tr>
                    <td>${temp.id}</td>
                    <td>${temp.name}</td>
                    <td>${temp.breed}</td>
                    <td>${temp.age}</td>
                    <td>${temp.gender}</td>
                    <td>${temp.location.description}</td>
                    <td>${temp.supervisor.firstName} ${temp.supervisor.lastName}</td>
                    <td>
                        <a class="btn btn-info" href="/update-animal?id=${temp.id}">Editar </a>
                        <a class="btn btn-danger" onclick="return confirm('Estas seguro que quieres eliminar el registro?')" href="/delete-animal?id=${temp.id}">Eliminar</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</main>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</body>
</html>