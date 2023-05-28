
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
		   forumRequest();
	   },
	   error: function(xhr, status) {
		   alert('Disculpe, existió un problema');
	   },
	   complete: function(xhr, status) {
		   //alert('Petición realizada');
	   }

   });
}

function forumRequest() {
	$.ajax({
		url: "/api/v1/forum/all",
		type: "GET",
		contentType: "application/json",
		dataType: "json",

		success: function (rta) {
			console.log(rta);
			paintQuest(rta);
		},
		error: function (xhr, status) {
			alert('F');
		},
		complete: function (xhr, status) {
			//alert('Petición realizada');
		}

	});
}

function paint(o) {
	let k = "";
	for (let i = 0; i < o.length; i++) {
		k += `<div class="card">
		<div class="card-header">
		  Featured
		</div>
		<div class="card-body">
		  <h5 class="card-title">Special title treatment</h5>
		  <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
		  <a href="#" class="btn btn-primary">Go somewhere</a>
		</div>
	  </div>`
	}
	$("#respuesta").empty();
	$("#respuesta").append(k);
}

function paintQuest(o) {
	let k = "";
	for (let i = 0; i < o.length; i++) {
		k += `<h4> ${o[i].titulo} </h4>
		<p> ${o[i].contenido} </p> <br>`
	}
	$("#forumquestions").empty();
	$("#forumquestions").append(k);
}

function paintProfile(o) {
	let k = "";
	for (let i = 0; i < o.length; i++) {
		k += `
			<a class="list-group-item list-group-item-action" href="#${o[i].usuario.id}">
				<div class="d-flex w-100 justify-content-between">
	 				<h5 class="mb-1">${o[i].usuario.firstname}</h5>
 				</div>
			</a><br>
		`
	}
	$("#list-example").empty();
	$("#list-example").append(k);
}