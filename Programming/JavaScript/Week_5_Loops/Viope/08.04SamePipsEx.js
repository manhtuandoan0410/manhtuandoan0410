// Randomize the pips once

// Set the count to be one (now you have randomized once)

// Repeat as long as (pips are not equal) 


    // Randomize again
    
    // Increment counter by one


// Write the answer (including the count) to the html page (answer div)

let pips1 = Math.round((Math.random() *5) +1);
let pips2 = Math.round((Math.random() *5) +1);
let count = 1;

while (pips1 !== pips2) {
	pips1 = Math.round((Math.random() *5) +1);
	pips2 = Math.round((Math.random() *5) +1);
	count++;
	
}
document.getElementById("answer").innerHTML = 
		"Same dice pips: " + pips1 + " and " + pips2 + "<br>There were " + count + " randomization rounds until we got the same pips."