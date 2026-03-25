// 05_variables_warmup_3 JavasScript code

function showMinutes() {
    var hours = Number(document.getElementById("txtHours").value);
    var minutes = Number(document.getElementById("txtMinutes").value);

    var hoursToMinutes = hours * 60;
    var totalMinutes = hoursToMinutes + minutes;

    document.getElementById("pOutput").innerHTML = totalMinutes + " minutes";
}