// 05_variables_warmup_5 JavasScript code

function calculate() {
    var startingBalance = parseFloat(document.getElementById("txtStartingBalance").value);
    var interestRate = parseFloat(document.getElementById("txtInterestRate").value);

    var output = "";

    for (let i = 1; i < 3; i++) {
        startingBalance = startingBalance * (1 + interestRate / 100);
        output += i + ". year: " + startingBalance.toFixed(2) + "<br>";
    }

    document.getElementById("pOutput").innerHTML = output;
}