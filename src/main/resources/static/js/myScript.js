 function loginData(){

	let email = $("#username").val();
	let password = $("#password").val();

	 let data = {
		 email:email,
		 password: password
	 }
	 
	 $.ajax({
		 
		 url:"/api/v1/auth/authenticate",
		 type:"POST",
		 contentType:"application/json",
		 dataType:"json",

		 data:JSON.stringify(data),

		 success: function(rta) {
			 $("#username").val("");
			 $("#password").val("");
			 Cookies.get('token');
			 window.location.replace("inicio.html");
		 },
		 error: function(xhr, status) {
			 alert('Usuario no existente');
		 },
		 complete: function(xhr, status) {
			 //alert('Petición realizada');
		 }

	 });
 }

 function logOut(){
	Cookies.get('token');
	window.location.replace("index.html");
 }


 function registerData(){

	 let firstname = $("#firstname").val();
	 let lastname = $("#lastname").val();
	 let email = $("#email").val();
	 let password = $("#password").val();

	 let data = {
		 firstname: firstname,
		 lastname: lastname,
		 email: email,
		 password: password
	 }

	 $.ajax({

		 url:"/api/v1/auth/register",
		 type:"POST",
		 contentType:"application/json",
		 dataType:"json",

		 data:JSON.stringify(data),

		 success: function(rta) {
			 console.log(rta);
			 $("#firstname").val("");
			 $("#lastname").val("");
			 $("#email").val("");
			 $("#password").val("");
			 parseJwt(token);
			 Cookies.set('token', rta.token);
			 window.location.replace("pagina_inicio_1.html")
		 },
		 error: function(xhr, status) {
			 alert('Disculpe, existió un problema');
		 },
		 complete: function(xhr, status) {
			 //alert('Petición realizada');
		 }

	 });
 }

 function parseJwt(token) {
     const base64Url = token.split('.')[1];
     const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
     const jsonPayload = decodeURIComponent(
         atob(base64)
             .split('')
             .map(function (c) {
                 return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
             })
             .join('')
     );
     return JSON.parse(jsonPayload);
 }

 function sendQuestion(){

	 let titulo = $("#titulo").val();
	 let contenido = $("#contenido").val();

	 let question = {
		 titulo: titulo,
		 contenido: contenido
	 }

	 $.ajax({

		url:"/api/v1/forum/create",
		type:"POST",
		contentType:"application/json",
		dataType:"json",

		data:JSON.stringify(question),

		success: function(rta) {
			console.log(rta);
			$("#titulo").val("");
			$("#contenido").val("");
		},
		error: function(xhr, status) {
			alert('Disculpe, existió un problema');
		},
		complete: function(xhr, status) {
			//alert('Petición realizada');
		}

	});
 }

 function CheckingA() {
	 // seleccionar todas las casillas de verificación en la página
	 const checkboxes = document.querySelectorAll('input[type="checkbox"]');

	 let areas = [];

	 // iterar sobre las casillas de verificación y encontrar las que están marcadas
	 for (let i = 0; i < checkboxes.length; i++) {
		 if (checkboxes[i].checked) {
			 areas.push(checkboxes[i].value);
		 }
	 }

	 $.ajax({

		 url:"/api/v1/auth/register",
		 type:"POST",
		 contentType:"application/json",
		 dataType:"json",

		 data:JSON.stringify(data),

		 success: function(rta) {
			 console.log(rta);
			 $("#name").val("");
			 $("#lastname").val("");
			 $("#email").val("");
			 $("#password").val("");
			 window.location.replace("pagina_inicio_2.html")

		 },
		 error: function(xhr, status) {
			 alert('Disculpe, existió un problema');
		 },
		 complete: function(xhr, status) {
			 //alert('Petición realizada');
		 }

	 });
 }

 function CheckingC() {
	 // seleccionar todas las casillas de verificación en la página
	 const checkboxes = document.querySelectorAll('input[type="checkbox"]');

	 let carreras = [];

	 // iterar sobre las casillas de verificación y encontrar las que están marcadas
	 for (let i = 0; i < checkboxes.length; i++) {
		 if (checkboxes[i].checked) {
			 carreras.push(checkboxes[i].value);
		 }
	 }

	 $.ajax({

		 url:"/api/v1/auth/register",
		 type:"POST",
		 contentType:"application/json",
		 dataType:"json",

		 data:JSON.stringify(data),

		 success: function(rta) {
			 console.log(rta);
			 $("#name").val("");
			 $("#lastname").val("");
			 $("#email").val("");
			 $("#password").val("");
			 window.location.replace("pagina_inicio_3.html")

		 },
		 error: function(xhr, status) {
			 alert('Disculpe, existió un problema');
		 },
		 complete: function(xhr, status) {
			 //alert('Petición realizada');
		 }

	 });
 }

 function CheckingM() {
	 // seleccionar todas las casillas de verificación en la página
	 const checkboxes = document.querySelectorAll('input[type="checkbox"]');

	 let materias = [];

	 // iterar sobre las casillas de verificación y encontrar las que están marcadas
	 for (let i = 0; i < checkboxes.length; i++) {
		 if (checkboxes[i].checked) {
			 materias.push(checkboxes[i].value);
		 }
	 }
	 window.location.replace("inicio.html")

 }
 