/*Define a new function called getGreetingWithAge, that is given a name and year of 
birth (yob) as arguments. The function will NOT display anything to console nor to 
the web page. But it will return the greeting, e.g. "Hello Anne! You are 19 years old 
this year." to whoever was the caller code. 
 
Now make the displayGreetingWithAge function to call the getGreetingWithAge, 
and after the call returns, displayGreetingWithAge will print the greeting to the 
console.  
 
Use the same test input as earlier. But make sure the getGreetingWithAge is not 
printing/showing/displaying anything to the console. 
*/

function getGreetingWithAge(name, yearOfBirth) {

    let currentYear = new Date().getFullYear();
    let age = currentYear - yearOfBirth;

    let greeting = "Hello " + name + "! You are " + age + " years old this year.";

    return greeting;
}

function displayGreetingWithAge(name, yearOfBirth) {
    let greeting = getGreetingWithAge(name, yearOfBirth);
    console.log(greeting);
}

displayGreetingWithAge("Tuan", 1984);
// displayGreetingWithAge("Tu An", 1989);
// displayGreetingWithAge("Joe",    2010);
// displayGreetingWithAge("Ann", 2026);