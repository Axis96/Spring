<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserimento numeri</title>
</head>
<body>
					<form action="homepage" method="POST" >
                            <div class="form-group">
                                <label for="your_text">Inserisci i 2 numeri a cui applicare l'operazione<i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="numero1" required="required" id="testo" value="Primo numero"/>
                                <input type="text" name="numero2" required="required" id="testo" value="Secondo numero"/>
                                <input type="text" name="operazione" hidden="hidden" id="testo" value=${operazione}/>
                                <input type="submit" name="Esegui" required="required" value="Esegui"/>
                            </div>
                     </form>


</body>
</html>