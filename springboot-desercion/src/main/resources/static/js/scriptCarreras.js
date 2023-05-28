$('document').ready(function(){
    carreraRequest();
});
function carreraRequest() {
    $.ajax({
        url: "/api/v1/careers/all",
        type: "GET",
        contentType: "application/json",
        dataType: "json",

        success: function (rta) {
            console.log(rta);
            paintCarrera(rta);
        },
        error: function (xhr, status) {
            alert('F');
        },
        complete: function (xhr, status) {
            //alert('Petición realizada');
        }

    });
}

function paintCarrera(c) {
    let k = "";
    for (let i = 0; i < c.length; i++) {
        k += `
            <div class="col">
              <div class="card border-success">
                <div class="card-body">
                  <h6 class="card-title" style="font-size: 25px;"><strong>${c[i].nombre}</strong></h6>
                  <h6>Creditos: ${c[i].creditos}</h6>
                  <h6>Semestres: ${c[i].semestres}</h6>
                  <h6><small class="text-body-secondary">Modalidad: ${c[i].modalidad}</small></h6>
                </div>
                <div class="card-footer">
                  <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="${c[i].nombre}" id="${c[i].id}">
                    <label class="form-check-label">
                      Seguir
                    </label>
                  </div>

                </div>
              </div>
            </div>
        `
    }
    $("#carrerasInicio").empty();
    $("#carrerasInicio").append(k);
}