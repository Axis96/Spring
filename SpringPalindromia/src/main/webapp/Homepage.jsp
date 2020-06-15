<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

    <!-- Font Icon -->
    <link rel="stylesheet" href="static/fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="static/css/style.css">
<head>
<meta charset="ISO-8859-1">
<title>Palindromia</title>
</head>

<body>
	<div class="main">
  <section class="sign-in">
            <div class="container">
                <div class="signin-content">

                    <div class="signin-form">
                        <h2 class="form-title">Analisi della palindromia di un testo</h2>
                        <br>
                        
                        <form action="FirstController" method="POST" >
                            <div class="form-group">
                                <label for="your_text"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="testo" required="required" id="your_text" placeholder="Inserisci il testo da analizzare "/>
                            </div>
                            <div class="form-group form-button">
                                <input type="submit" name="scelta" id="signin" class="form-submit" value="Analizza Palindromia"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
</div>
</body>
</html>