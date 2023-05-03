 function loginData(){

	let email = $("#username").val();
	let password = $("#password").val();

	 let data = {
		 email:email,
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
			 $("#username").val("");
			 $("#password").val("");
			 Cookies.set('token', rta.token);
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

	 let name = $("#name").val();
	 let lastname = $("#lastname").val();
	 let email = $("#email").val();
	 let password = $("#password").val();

	 let data = {
		 name:name,
		 lastname:lastname,
		 email:email,
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
			 $("#name").val("");
			 $("#lastname").val("");
			 $("#email").val("");
			 $("#password").val("");
			 window.location.replace("index.html")
			 parseJwt(rta)
		 },
		 error: function(xhr, status) {
			 alert('Disculpe, existió un problema');
		 },
		 complete: function(xhr, status) {
			 alert('Petición realizada');
		 }

	 });
 }

 window.onload = function() {
	 var form = document.getElementById("register-form");
	 form.addEventListener("submit", function(event) {
		 event.preventDefault();
		 showModal();
	 });
 }

 function showModal() {
	 var modal = document.getElementById("modal");
	 var closeButton = document.getElementById("close-button");
	 modal.classList.add("show-modal");
	 closeButton.addEventListener("click", function() {
		 modal.classList.remove("show-modal");
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
 
 
 