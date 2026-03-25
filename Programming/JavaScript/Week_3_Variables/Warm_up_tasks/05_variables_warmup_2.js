// 05_variables_warmup_2 JavasScript code

function add() {
    var firstNum = Number(document.getElementById("txtFirst").value);
    var secondNum = Number(document.getElementById("txtSecond").value);

    var sum = firstNum + secondNum;

    document.getElementById("pOutput").innerHTML=sum;
}