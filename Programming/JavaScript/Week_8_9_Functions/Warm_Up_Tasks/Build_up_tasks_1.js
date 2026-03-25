/*Define a function called displayGreeting that is given a name as argument:   
 
displayGreeting( name ) {  .... 
 
When called e.g., by providing value "Joe" as name, the function will show "Hello 
Joe!" on the console.  
 
Test-call the function three times in the code. With values: "Mike", "Joe", "Anne". 
*/

function displayGreeting(name) {

    let greeting = "Hello " + name + "!";

    console.log(greeting);

}

displayGreeting("Tuan");
displayGreeting("Manh");
displayGreeting("Doan");
