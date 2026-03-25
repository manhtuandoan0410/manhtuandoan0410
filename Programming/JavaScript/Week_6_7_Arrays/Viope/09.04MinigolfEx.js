// Create an array with minigolf results of eight players 
let minigolf = [23, 19, 37, 20, 21, 30, 26, 24];

function showResults() {
    // Sort the array
   minigolf.sort((a, b) => a - b);
    // Assign the smallest result of to a variable
   let smallest = minigolf[0];
    // Assign the index of last array item to an variable
    let lastIndex = minigolf[minigolf.length - 1];

    // Assign the biggest result to a variable
    let biggest = lastIndex;

    // Write the answer on the page, to the answer div, as content of the div
    document.getElementById("answer").innerHTML = "The smallest result is " + smallest + " (winner). <br>The biggest result is " + biggest + ".";
}