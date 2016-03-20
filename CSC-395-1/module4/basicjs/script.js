$(document).ready(function() {

    $("#image1").click(function() {
        if ($("#image1").attr("src") === "buttonBefore.png") {
            $("#image1").attr("src", "buttonAfter.png");
        } else {
            $("#image1").attr("src", "buttonBefore.png");
        }
    });

    $("#image2").click(function() {
        if ($("#image2").attr("src") === "planeBefore.png") {
            $("#image2").attr("src", "planeAfter.png");
        } else {
            $("#image2").attr("src", "planeBefore.png");
        }
    });

    $("#image3").click(function() {
        if ($("#image3").attr("src") === "bluetoothBefore.png") {
            $("#image3").attr("src", "bluetoothAfter.png");
        } else {
            $("#image3").attr("src", "bluetoothBefore.png");
        }
    });

    $("#image4").click(function() {
        if ($("#image4").attr("src") === "wifiBefore.png") {
            $("#image4").attr("src", "wifiAfter.png");
        } else {
            $("#image4").attr("src", "wifiBefore.png");
        }
    });

    $("#image5").click(function() {
        if ($("#image5").attr("src") === "sunBefore.png") {
            $("#image5").attr("src", "sunAfter.png");
        } else {
            $("#image5").attr("src", "sunBefore.png");
        }
    });

    $("#checkDate").click(function() {

        var d, m, text;
        d = document.getElementById('dd').value;
        m = document.getElementById('mm').value;
        var mOkay = 0;

        if (m < 1 || m > 12) {
            text = "Month not valid.";
        } else {
            text = "Great, thanks!";
            mOkay = 1;
        }

        if (mOkay === 1) {
            if (m < 1 || m > 31) {
                text = "Day not valid.";
            } else {
                if (m === 2 && d > 28) {
                    text = "February cannot have more than 28 days.";
                } else {
                    if ((m === 4 || m === 5 || m === 6 || m === 8 || m === 9 || m === 11) && d > 30) {
                        text = "This month cannot have more than 30 days.";
                    } else {
                        text = "Great, thanks!";
                    }
                }
            }
        }

        document.getElementById("checkedDate").innerHTML = text;
    });

    $("#checkVowels").click(function() {

        var phrase = "";
        phrase = document.getElementById('theString').value;
        var avowels = 0;
        var evowels = 0;
        var ivowels = 0;
        var ovowels = 0;
        var uvowels = 0;

        for (var i = 0; i < phrase.length; i++) {
            if (phrase[i] === "a" || phrase[i] === "A") {
                avowels++;
            } else if (phrase[i] === "e" || phrase[i] === "E") {
                evowels++;
            } else if (phrase[i] === "i" || phrase[i] === "I") {
                ivowels++;
            } else if (phrase[i] === "o" || phrase[i] === "O") {
                ovowels++;
            } else if (phrase[i] === "u" || phrase[i] === "U") {
                uvowels++;
            }
        }
        document.getElementById("theavowels").innerHTML = avowels;
        document.getElementById("theevowels").innerHTML = evowels;
        document.getElementById("theivowels").innerHTML = ivowels;
        document.getElementById("theovowels").innerHTML = ovowels;
        document.getElementById("theuvowels").innerHTML = uvowels;
    });

    $("#getStats").click(function() {

        var thesum = 0;

        var number1 = document.getElementById('number1').value;
        var number2 = document.getElementById('number2').value;
        var number3 = document.getElementById('number3').value;
        var number4 = document.getElementById('number4').value;
        var number5 = document.getElementById('number5').value;

        number1 = parseInt(number1) || 0;
        number2 = parseInt(number2) || 0;
        number3 = parseInt(number3) || 0;
        number4 = parseInt(number4) || 0;
        number5 = parseInt(number5) || 0;

        var themin = Math.min(number1, number2, number3, number4, number5);
        var themax = Math.max(number1, number2, number3, number4, number5);
        thesum += number1 + number2 + number3 + number4 + number5;
        var theaverage = (thesum) / (5);

        document.getElementById("themin").innerHTML = themin;
        document.getElementById("themax").innerHTML = themax;
        document.getElementById("thesum").innerHTML = thesum;
        document.getElementById("theaverage").innerHTML = theaverage;
    });

});