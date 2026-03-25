
let courses = [ 
{  name: "Introduction to Software Development",
    code   : "SOF001IT1AE",
    extent : 5,
    timing : "1.semester"
      }, 
{  name: "Programming 1",
    code   : "SOF005AS2AE",
    extent : 5,
    timing : "2.semester"
      }, 
{  name: "Programming 2",
    code   : "SOF001AS3AE",
    extent : 5,
    timing : "2.semester"
      }, 
{  name: "Data Management and Databases",
    code   : "SOF001AS2AE",
    extent : 5,
    timing : "2.semester"
      }, 
{  name: "Front End Programming",
    code   : "SOF004AS3AE",
    extent : 5,
    timing : "3.semester"
      }
];

function listCourses() {
    var output = "";
    // List courses from an object array , i is an index of array
    for (var i = 0; i < courses.length; i++) {
        var course = courses[i];
        output += "<p>";

        output += 
        "Code: " + course.code + "<br> Name: " + course.name + "<br> Extent: " + course.extent + "<br> Timing: " + course.timing;

        output += "</p>";

    }
    // Write the answer on the page, to the answer div, as content of the div
    document.getElementById("answer").innerHTML = output;
}
