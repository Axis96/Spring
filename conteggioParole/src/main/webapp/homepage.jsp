<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

    <link rel="stylesheet" href="static/fonts/material-icon/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="static/css/style.css">
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>

<body>
	<div class="main">
  <section class="sign-in">
            <div class="container">
                <div class="signin-content">

                    <div class="signin-form">
                        <h2 class="form-title">Inserisci un testo da analizzare</h2>
                        <br>
                        
                        <form action="homepage" method="POST" >
                            <div class="form-group">
                                <label for="your_text"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="testo" required="required" id="testo" placeholder="Inserisci il testo da analizzare "/>
                            </div>
                     
                            <div class="form-group form-button">
                            <form action="homepage" method="POST" >
                            	<input type="radio" id="parole" name="scelta" value="parole">
								<label for="parole">Conteggio Parole</label><br>
								<input type="radio" id="vocali" name="scelta" value="vocali">
								<label for="vocali">Conteggio Vocali</label><br>
								<input type="radio" id="consonanti" name="scelta" value="consonanti">
								<label for="consonanti">Conteggio Consonanti</label><br>
								<input type="submit" name="Esegui" required="required" value="Esegui"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
</div>
</body>
</html>