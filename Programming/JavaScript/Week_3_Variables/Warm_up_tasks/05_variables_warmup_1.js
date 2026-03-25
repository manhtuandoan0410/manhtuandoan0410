// 05_variables_warmup_1 JavasScript code

function showEmail() {
var givenName = document.getElementById("txtGivenName").value;
var surName = document.getElementById("txtSurname").value;

var email = givenName + "." + surName + "@myy.haaga-helia.fi";

document.getElementById("pOutput").innerHTML = email;
    
}
