var earth;

function initialize() {
    var options = {
        atmosphere: true,
        center: [0, 0],
        zoom: 0
    };
    earth = new WE.map('earth_div', options);
  
    WE.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '© OpenStreetMap contributors'
    }).addTo(earth);

}

function goHome() {
   // todo
   document.getElementById("goHome").innerHTML=earth.setView([41.893292620836945,12.483070431973514], 13);
}

function showCoords() {
   // todo
//    let center = earth.getCenter();
//    alert(center.lat + ", " + center.lng);
alert(earth.getCenter());
}