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
                        <h2 class="form-title">Select your operation</h2>
                        <br>
                        

                     
                            <div class="form-group form-button">
                            <form action="homepage" method="POST" >
                            	<input type="radio" id="parole" name="choice" value="check">
								<label for="products">Check the products in store by field</label><br>
								<input type="radio" id="vocali" name="choice" value="add">
								<label for="add">Add product</label><br>
								<input type="radio" id="consonanti" name="choice" value="remove">
								<label for="remove">Remove product</label><br>
								<input type="radio" id="consonanti" name="choice" value="edit">
								<label for="edit">Edit product</label><br>
								<input type="submit" name="Execute" required="required" value="Execute"/>
								</form>
                            </div>
                       
                    </div>
                </div>
            </div>
        </section>
</div>
</body>
</html>