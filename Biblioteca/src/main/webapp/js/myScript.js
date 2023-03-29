
function agregarL() {
	let nombre = $("#nombre").val();
	let autor = $("#autor").val();
	let editorial = $("#editorial").val();
	
	$.ajax({

		url: 'Servlet',
		data: { nombre: nombre, autor: autor, editorial: editorial },
		type: 'GET',

		success: function(rta) {
			$("#respuestaL").append("El resultado del server es: " + rta + "<br>");
		},
		error: function(xhr, status) {
			alert('Disculpe, existió un problema');
		},
		complete: function(xhr, status) {
//			alert('Petición realizada');
		}

	});
}

