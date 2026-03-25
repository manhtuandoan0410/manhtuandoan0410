// Insert your JavaScript code here
/*A function can also return a value. For example, you can assign the return value to a variable.

The function Math.random() returns a value from the range [0, 1[. Call the function and assign the return value to the variable randomizedNumber. After that, write the value of the variable into the browser console.

NOTE!
There are not any automated test cases for this excecise. Please save the exercise. It will be evaluated manually by the teacher.
*/
function returnValue() {

let randomizedNumber = Math.floor((Math.random()*6)+1);

return randomizedNumber;
    
}

document.write(returnValue());