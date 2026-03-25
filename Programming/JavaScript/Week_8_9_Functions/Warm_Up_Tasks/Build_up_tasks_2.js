/*
Define a function called displayGreetingWithAge that is given a name and year of 
birth (yob) as arguments.  
 
When called e.g., by providing values "Mike" and 1989, the function will show "Hello 
Mike! You are 32 years old this year." on the console. 
 
Test by calling the function with these values: 
"Mike"  1989                   => 32 years old 
"Anne"  2002                   => 19 years old 
"Joe"     2010                   => 11 years old 
 
 
(Hint: You can use the current year 2021 as hard-coded / literal value in your 
calculation.) 
 
(Or, advanced extra version: Get the current year dynamically using means you find 
by googling “MDN date”. You’ll need two services from here. How to create Date 
object representing now/today, and how to get year part out of it)
*/

function displayGreetingWithAge(name, yearOfBirth) {

    let currentYear = new Date().getFullYear();
    let age = currentYear - yearOfBirth;

    let greeting = "Hello " + name + "! You are " + age + " years old this year.";

    console.log(greeting);
}

displayGreetingWithAge("Tuan", 1984);
displayGreetingWithAge("Tu An", 1989);
displayGreetingWithAge("Joe",    2010);
displayGreetingWithAge("Ann", 2026);