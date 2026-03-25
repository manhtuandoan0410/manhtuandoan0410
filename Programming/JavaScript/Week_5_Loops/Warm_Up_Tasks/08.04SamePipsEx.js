let pips1 = Math.round((Math.random() *5) +1);
let pips2 = Math.round((Math.random() *5) +1);
let count = 1;

while (pips1 !== pips2) {
	pips1 = Math.round((Math.random() *5) +1);
	pips2 = Math.round((Math.random() *5) +1);
	count = count + 1;
	
}
document.getElementById("answer").innerHTML = 
		"Same dice pips: " + pips1 + " and " + pips2 + "<br>There were " + count + " randomization rounds until we got the same pips."

// Hints:
// Initialize the count variable to be zero. That variable is used to count the randomization rounds.
// Make a loop inside of which you randomize the two pips values until they will be the same. Use the while loop.
// You can randomize the pips by

// let pips1 = Math.round((Math.random() * 5) + 1);
// Idea of the code

// // randomize the pips1 and pips2 once 
// // set the count to be one (now you have randomized once) 
// // repeat as long as (pips are not equal) { 
//    // randomize again 
//    // increment counter by one 
// } 
// Write the answer (including the count) to the html page (answer div)