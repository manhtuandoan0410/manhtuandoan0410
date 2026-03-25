
let membersArray = [{name: "Jack", age: 15},
                    {name: "Susan", age: 17},
                    {name: "Matt", age: 15},
                    {name: "Cecillia", age: 25},
                    {name: "Frank", age: 22}
];

//let name = document.getElementById("name").value;
//let age = Number(document.getElementById("age").value);

function showMinors() {
    let nameMinors = "";

    for (let i = 0; i < membersArray.length; i++) {
        if (membersArray[i].age < 18) {
            nameMinors += membersArray[i].name + ", " + membersArray[i].age + " years<br>";
        }
    }

    document.getElementById("minors").innerHTML = nameMinors;

}

function showAdults() {
    let nameAdults = "";

    for (let i = 0; i < membersArray.length; i++) {
        if (membersArray[i].age >= 18) {
            nameAdults += membersArray[i].name + ", " + membersArray[i].age + " years<br>";
        }
    }

    document.getElementById("adults").innerHTML = nameAdults;

}
