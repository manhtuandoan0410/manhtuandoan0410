"use strict";
function countSixes() {

let count = 0;

for (var i = 1; i <= 50; i++) {

    let dice = Math.floor((Math.random()*6)+1);

    if (dice == 6) {
        count++;
    }

}

let percentageOfSix = (count / 50) * 100;

document.getElementById("result").innerHTML = `Number of sixes in 50 rolls: ${count} (${percentageOfSix.toFixed(0)}%)`;

}
