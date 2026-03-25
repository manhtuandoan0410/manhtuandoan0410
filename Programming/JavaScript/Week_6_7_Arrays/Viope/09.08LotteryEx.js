	// The array variable names is declared inside the script element, but NOT inside the function. 
	// The array is availabe for both functions to read from or write to.
	let names = [];

	function addName() {
		// Assign name from the input field to the array (use push())
		let newName = document.getElementById("name").value;
		names.push(newName);

		let namesText = "Inserted names: ";
		for (let i = 0; i < names.length; i++) {
			
			namesText += names[i] + " ";
			document.getElementById("nameList").innerHTML = namesText;
			document.getElementById("name").innerHTML = "";
		}
		// Go through the array in a for loop adding each name at the end of the namesText
		
		// Write the names on the page, to the names div, as content of the div
		// Empty the input field of name as that name was just put in the array
		// Empty the answer text
	}

	function makeDraw() {

		// Randomize the index of the winner
		let randomIndex = Math.floor(Math.random() * names.length);
		
		// Write the answer on the page, to the answer div, as content of the div
		let winner = names[randomIndex];

		document.getElementById("answer").innerHTML = "Winner is " + winner;

	}
