<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Filtrar Carreras</title>
    <style>
      body {
        background-color: #f4f4f4;
        font-family: Arial, sans-serif;
      }
      
      h1 {
        text-align: center;
        margin-top: 30px;
      }
      
      form {
        margin: 30px auto;
        width: 500px;
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.3);
      }
      
      label {
        display: block;
        margin-bottom: 10px;
        font-size: 16px;
        font-weight: bold;
      }
      
      input[type="text"], select {
        width: 80%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
        margin-bottom: 20px;
      }
      
      input[type="submit"] {
        background-color: #0099cc;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s ease;
      }
      
      input[type="submit"]:hover {
        background-color: #006699;
      }
      
      select {
        margin-bottom: 20px;
      }
    </style>
  </head>
  <body>
    <h1>Filtrar Carreras</h1>
    <form action="/carreras" method="GET">
      <label for="nombre">Nombre de la carrera:</label>
      <input type="text" name="nombre" id="nombre">
      <label for="nivel">Nivel de la carrera:</label>
      <select name="nivel" id="nivel">
        <option value="">Seleccione un nivel</option>
        <option value="pregrado">Pregrado</option>
        <option value="posgrado">Posgrado</option>
      </select>
      <label for="facultad">Facultad:</label>
      <input type="text" name="facultad" id="facultad">
      <input type="submit" value="Filtrar">
    </form>
  </body>
</html>