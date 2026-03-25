// Hints:
// Check that the given year of birth is not more than the current year
// const today = new Date() gives the date + time of this moment.
// getFullYear() method can be used to get the current year out from the today variable.
// Check the year
// And calculate the (rough estimate of the) age based on a) given year and b) the resolved current year
// Hint:w3shools Date Methods, https://www.w3schools.com/js/js_date_methods.asp




function tellAge() {
    // Read value of yearOfBirth from the input field 
    let yearOfBirth = Number(document.getElementById("yearOfBirth").value);

    // Figure out the current date into today variable 
    let currentDate = new Date(); // or new Date ("2023-09-23") to get the year 2023
    
    // Use getFullYear() method to get the current year out from the today variable
    currentDate.getFullYear();

    // Calculate the (rough estimate of the) age
    let age = currentDate.getFullYear() - yearOfBirth;

    // If age is less than zero
    if (age < 0) {
        //  Show an error message
        document.getElementById("answer").innerHTML = "Please check again and enter your year of birth correctly!"
    } else {
        document.getElementById("answer").innerHTML = "You are now " + age + " years old.<br>(Current year is " + currentDate.getFullYear() + ".)";
    }
    // otherwise tell the age
    
}