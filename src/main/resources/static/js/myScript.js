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
			 Cookies.set('token', rta.token);
			 window.location.replace();
		 },
		 error: function(xhr, status) {
			 alert('Disculpe, existió un problema');
		 },
		 complete: function(xhr, status) {
			 alert('Petición realizada');
		 }

	 });
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

 function Checking() {
	 // seleccionar todas las casillas de verificación en la página
	 const checkboxes = document.querySelectorAll('input[type="checkbox"]');

	 let values = [];

	 // iterar sobre las casillas de verificación y encontrar las que están marcadas
	 for (let i = 0; i < checkboxes.length; i++) {
		 if (checkboxes[i].checked) {
			 values.push(checkboxes[i].value);
		 }
	 }
	 console.log(values);
 }
 
 
 