"use strict";

function countRolls() {

    let dice = Math.floor((Math.random()*6) + 1);
    let count = 1;

    while (dice != 6) {
        dice = Math.floor((Math.random()*6)+1);
        count += 1;
    }

    document.getElementById("result").innerHTML = "It took " + count + " rolls to get a 6.";

}