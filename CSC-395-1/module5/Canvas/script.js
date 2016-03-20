var canvas = document.getElementById('myCanvas');
var context = canvas.getContext('2d');
 
// Filling Circle with Colors of Google Logo
// Punch Color
context.beginPath();
context.arc(150, 285, 150, 0, 2 * Math.PI, false);
context.fillStyle = '#DB4734';
context.fill();  

// Shamrock Green Color
context.beginPath();
context.arc(170, 285, 150, 0, 2 * Math.PI, false);
context.fillStyle = '#009B57';
context.fill();

// Navy Blue Color
context.beginPath();
context.arc(190, 285, 150, 0, 2 * Math.PI, false);
context.fillStyle = '#1368EA';
context.fill();

// Mikado Yellow Color
context.beginPath();
context.arc(210, 285, 150, 0, 2 * Math.PI, false);
context.fillStyle = '#FFBC0C';
context.fill();

// Punch Color
context.beginPath();
context.arc(230, 285, 150, 0, 2 * Math.PI, false);
context.fillStyle = '#DB4734';
context.fill();

// Navy Blue Color
context.beginPath();
context.arc(250, 285, 150, 0, 2 * Math.PI, false);
context.fillStyle = '#1368EA';
context.fill();

// The letter G
context.beginPath();
context.lineWidth = 0;
context.fillStyle = 'white';
context.font="100px Roboto";
context.fillText("G", 210,310);
context.fill();
context.closePath();