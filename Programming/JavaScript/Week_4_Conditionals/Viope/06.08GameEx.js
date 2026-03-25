function play() {
		// Read value from the input field
		var bet = Number(document.getElementById("bet").value);
		// Randomize dice pips between 1-6
		var pips = Math.round((Math.random() * 6) + 1);

		// Calculate win base on pips
		if (pips === 6) {
			var win = bet * 150/100;
			document.getElementById("answer").innerHTML = "Pips was 6 - Paid back: " + win + " euros";
		} else if (pips === 1 || pips === 3 || pips === 5) {
			document.getElementById("answer").innerHTML= "Pips was " + pips + " - no pay";
		} else {
			var win = bet * 125/100;
			document.getElementById("answer").innerHTML= "Pips was " + pips + " - Paid back: " + win + " euros";
		}
		// Write the answer on the page, to the answer div, as content of the div

}