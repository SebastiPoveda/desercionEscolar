$('document').ready(function(){
    areaRequest();
});
function areaRequest() {
    $.ajax({
        url: "/api/v1/area/all",
        type: "GET",
        contentType: "application/json",
        dataType: "json",

        success: function (rta) {
            console.log(rta);
            paintArea(rta);
        },
        error: function (xhr, status) {
            alert('F');
        },
        complete: function (xhr, status) {
            //alert('Petición realizada');
        }

    });
}

function paintArea(a) {
    let k = "";
    for (let i = 0; i < a.length; i++) {
        k += `
            <div class="col">
                <div class="card h-100 border-success">
                    <div class="card-body">
                        <h5 class="card-title" style="font-size: 25px;">${a[i].name} </h5>
                    </div>
                    <div class="card-footer">
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="${a[i].name}" id="${a[i].id}">
                            <label class="form-check-label">
                            Seguir
                            </label>
                        </div>
                    </div>
               </div>
            </div>
        `
    }

    $("#areasInicio").empty();
    $("#areasInicio").append(k);
}