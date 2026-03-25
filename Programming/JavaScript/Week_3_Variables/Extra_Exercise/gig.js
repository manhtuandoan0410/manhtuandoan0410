"use strict";

// Function to call on button click
function calculate() {
    var fee = Number(document.getElementById("fee").value);
    var participants = Number(document.getElementById("musicians").value);
    var managerCommission = Number(document.getElementById("commission").value);
    
    var managerGet = managerCommission * fee / 100;
    var musiciansGet = (fee - managerGet)/ participants;

    var output = `Each musician gets a share of ${musiciansGet.toFixed(2)} € <br> Manager gets ${managerGet.toFixed(2)} €`;

    document.getElementById("result").innerHTML = output;
}