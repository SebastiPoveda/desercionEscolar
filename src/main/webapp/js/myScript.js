function peticionGet() {
	var select = document.getElementById("floatingSelect");
    var selectedOption = select.options[select.selectedIndex];
    var selectedText = selectedOption.text;

	$.ajax({

		url: 'api/Carreras'+'?area='+selectedText,
		type: 'GET',
		dataType: 'json',

		success: function(rta) {
			$("#respuesta").empty();
			$("#respuesta").append(paintRTA(rta));
		},
		 error: function(xhr, status) {
			alert('Disculpe, existió un problema');
		},
		complete: function(xhr, status) {
			//			alert('Petición realizada');
		}

	});
}


function paintRTA(rta) {
  var html = "";
  for (var i = 0; i < rta.length; i++) {
    html += '<div class="card"><div class="card-body">';
    html += '<h5 class="card-title">' + JSON.stringify(rta[i]['area']) + '</h5>'; // Nombre de la carrera
    html += '<h6 class="card-subtitle mb-2 text-muted">' + JSON.stringify(rta[i]['carrera']) + '</h6>'; // Área de la carrera
    html += '<p class="card-text">' + JSON.stringify(rta[i]['pensum']) + '</p>'; // Pensum de la carrera
    html += '</div></div>';
  }
  return html;
}

function sugerencias(){
	let area = $("#area").val();
	let carrera = $("#carrera").val();


	$.ajax({

		url: 'api/Servlet',
		data: { area: area, carrera: carrera},
		type: 'POST',

		success: function(rta) {
			$("#respuesta").empty();
			$("#respuesta").append("<br>" + rta);
		},
		error: function(xhr, status) {
			alert('Disculpe, existió un problema');
		},
		complete: function(xhr, status) {
			//			alert('Petición realizada');
		}

	});
}

/*
function paintRTA(rta) {
  var html = "";
  for (var i = 0; i < rta.length; i++) {
    html += '<div class="card" style="width: 18rem;">';
    html += '<div class="card-header">'+ JSON.stringify(rta[i]['area']) +'</div>';
    html += '<ul class="list-group list-group-flush">';
    html += '<li class="list-group-item">'+ JSON.stringify(rta[i]['carrera']) +'</li>';
    html += '<li class="list-group-item">'+ Pensum +'</li>';
    html += '</ul></div>';
  }
  return html;
}*/


