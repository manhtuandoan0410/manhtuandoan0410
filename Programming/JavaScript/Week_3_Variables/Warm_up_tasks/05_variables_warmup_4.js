// 05_variables_warmup_4 JavasScript code

function showHoursAndMinutes() {
    var minutes = Number(document.getElementById("txtMinutes").value);
    var minutesToHours = Math.floor(minutes / 60);
    var remainMinutes = minutes % 60;

    document.getElementById("pOutput").innerHTML= minutesToHours + " hours " + remainMinutes + " minutes";
}