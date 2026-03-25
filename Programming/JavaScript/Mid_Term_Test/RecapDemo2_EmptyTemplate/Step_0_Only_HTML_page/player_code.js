var names = [];
var scores = [];

function addPlayers() {
    var name = document.getElementById("txtName").value;
    var score = Number(document.getElementById("txtScore").value);

names.push(name);
scores.push(score);

document.getElementById("txtName").value = "";
document.getElementById("txtScore").value = "";
}

function listPlayers() {

    let output = "";
    
    if (names.length === 0) {
        output += "No players added yet.";
    }

    for (var i = 0; i < names.length; i++) {
        output += names[i] + "<br>";
    }

    document.getElementById("pOutput").innerHTML = output;
}

function searchPlayer() {

    var txtName = document.getElementById("inputName").value;
    
    var found = false;
    var output = "";

    for (var i = 0; i < names.length; i++) {
        if (names[i].toLowerCase() === txtName.toLowerCase()) {
            found = true;
            output = "Player: " + names[i] + "<br>Score: " + scores[i];
        }
        break;
    }

    if (found) {
        document.getElementById("pOutput2").innerHTML = output;
    } else {
        document.getElementById("pOutput2").innerHTML = "Sorry, there is no such name in the list.";
    }

}

function findWinner() {

    //to prevent crash in case no players/scores added, we have to check at the begining
    if (scores.length === 0) {
        document.getElementById("pOutput3").innerHTML = "No players added yet.";
        return; // Stop the function
    }

    var output = "";
    var maxSoFar = scores[0];
    var winnerSoFar = names[0];

    for (var i = 1; i < scores.length; i++) {
        if (scores[i] > maxSoFar) {
            maxSoFar = scores[i];
            winnerSoFar = names[i];
        }
    }

    output += "The winner is " + winnerSoFar + " with a score of " + maxSoFar;
    document.getElementById("pOutput3").innerHTML = output;
}