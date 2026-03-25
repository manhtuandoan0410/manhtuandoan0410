/*
Hints:
a function isSunday(dateText). This function gets the date text in the format "dd.MM.yyyy". The function should return Boolean value true if the date is for a Sunday, otherwise false. For example for the date text "29.03.2020" it would return true.
First split the given date text into day, month and year parts using the substring(startPosition, endPosition) method.
Create a new Date object to a variable asDate
const asDate = new Date();
Set day, month and year properties of asDate object with setDate(), setMonth() and setFullYear() method. (Observe! You’ll need to give month as one number smaller than how we write it => 0 = January, 1= February...)
After creating a valid date object in the asDate variable, you can get the day of the week with its getDay() method. Sunday is 0 .
*/

function calculate() {

    // Read date text from the input field
    const date = document.getElementById("date").value;
        // If it is not Sunday  (Call isSunday() function with a date text as a parameter)
    if (!isSunday(date)) {
        document.getElementById("answer").innerHTML = "The price of this repair work is 48 euros per hour.";
    }   else {
        document.getElementById("answer").innerHTML = "The price of this repair work is 72 euros per hour.";
    }
        
}


function isSunday(dateText) {
	
	// Split the given dateText into day, month and year parts using the substr() method
	const stringDay = dateText.substring(0, 2);
    const stringMonth = dateText.substring(3, 5);
    const stringYear = dateText.substring(6, 10);

    const day = parseInt(stringDay);
    const month = parseInt(stringMonth);
    const year = parseInt(stringYear);
	// Create a new Date object to a variable 
	const asDate = new Date(year, month - 1, day);
    
	// Get the day of the week with its getDay() method. Sunday is number 0 .
    asDate.getDay();

	// If day of the week is Sunday 
        if (asDate.getDay() === 0) {
		// return Boolean value true
		    return true;
        } else {return false;}
	// otherwise	
	
       // return Boolean value false		
	
}

