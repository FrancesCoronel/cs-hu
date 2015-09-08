/*
	FVCproductions 2015
	Cooking Baking App
	app.js file

	This file is in charge of manipulating the buttons within the index.html file
 */

// var inventory = {
//   product: {
//     money: 1000,
//     cookies: 0
//   },
//   ingredients: {
//     sugar: 10,
//     flour: 10
//   },
//   pot: {
//     sugar: 0,
//     flour: 0
//   }
// };

$(document).ready(function() {

	// when you click on 'use 1 sugar'
	// decrement 1 from sugar in ingredients
	// add 1 to sugar in pot

	$('#ingredients .use-sugar').on('click', function() {

		//update the object
		//inventory.ingredients.sugar -= 1;
		//$('#ingredients .sugar').text(inventory.ingredients.sugar)

		// getting sugar value using parseInt which just takes the numerical value
		var sugarValue = parseInt($('#ingredients .sugar').text(), 10);
		
		// updating sugar value (-1)
		var newSugarValue = sugarValue - 1;
		
		// updating text - using Math.max so value cannot be negative
		$('#ingredients .sugar').text(Math.max(0, newSugarValue));

		// getting sugar value in pot
		var sugarInPotValue = parseInt($('#pot .sugar').text(), 10);
		
		// updating sugar value in pot (+1)
		var newSugarInPotValue = sugarInPotValue + 1;

		// if there are more than 0 sugars, 
		// then we can update the value of sugars in pot
		// to prevent sugar in pot value from over increasing
		
		if (newSugarValue > 0) {
			$('#pot .sugar').text(newSugarInPotValue);
		}

		// if there are no sugars at all
		// then we highlight button text in red as a warning
		else if (newSugarValue == 0) {
			$('.use-sugar').css('color','red');
		}
    	

	});

	// when you click on 'use 1 flour'
	// decrement 1 from flour in ingredients
	// add 1 to flour in pot
	
	// exact procedure as above but dealing with flour instead
	
	$('#ingredients .use-flour').on('click', function() {

		var flourValue = parseInt($('#ingredients .flour').text(), 10);
		var newFlourValue = flourValue - 1;
		$('#ingredients .flour').text(Math.max(0, newFlourValue));

		var flourInPotValue = parseInt($('#pot .flour').text(), 10);
		var newFlourInPotValue = flourInPotValue + 1;
		

		if (flourValue > 0) {
			$('#pot .flour').text(newFlourInPotValue);
		}

		else if (flourValue == 0) {
			$('.use-flour').css('color','red');
		}
    
    });

	// when someone clicks 'Cook a cookie', 
	// deplete 6 units of flour and 3 units of sugar
	
	$('#pot .cook-cookie').on('click', function() {

		// get the flour and sugar pot values again

		var flourInPotValue = parseInt($('#pot .flour').text(), 10);
		var sugarInPotValue = parseInt($('#pot .sugar').text(), 10);

		// verify that there's enough to bake a cookie
		// if there is, than we subtract the values and display the new text
		
		if (flourInPotValue >= 6 && sugarInPotValue >= 3) {
			var newFlourInPotValue = flourInPotValue - 6;
			$('#pot .flour').text(newFlourInPotValue);

			var newSugarInPotValue = sugarInPotValue - 3;
			$('#pot .sugar').text(newSugarInPotValue);

			var cookieValue = parseInt($('#product .cookies').text(), 10);
			var newCookieValue = cookieValue + 1;
			$('#product .cookies').text(newCookieValue);
		}

		// otherwise, if not enough to bake cookies
		// highlight button in red as warning
		
		else if(flourInPotValue < 6 || sugarInPotValue < 3) {
			
			$('.cook-cookie').css('color','red');
		
		}

    });

	// when you click on 'buy 1 sugar for $10'
	// add 1 unit of sugar for $10 
	
	$('#ingredients .buy-sugar').on('click', function() {

		// getting sugar value
		
		var sugarValue = parseInt($('#ingredients .sugar').text(), 10);
		
		// adding +1 to sugar value
		
		var newSugarValue = sugarValue + 1;

		// getting money value
		
		var moneyValue = parseInt($('#product .money').text(), 10);
		
		// minus 10 from money value
		
		var newMoneyValue = moneyValue - 10;

		// if there is enough money (at least 10 bucks)
		// then display new text values for money and sugar
		
		if (moneyValue >= 10) {
			$('#product .money').text(newMoneyValue);
			$('#ingredients .sugar').text(Math.max(0, newSugarValue));
		}

		// if not enough money
		// give button red color for warning
		
		else {
			$('.buy-sugar').css('color','red');
		}

	});
	
	// when you click on 'buy 1 flour for $15'
	// add 1 unit of flour for $15
	
	// exact same as above with sugar 
	// but replacing with flour values and changing money value to 15 instead
	
	$('#ingredients .buy-flour').on('click', function() {

		var flourValue = parseInt($('#ingredients .flour').text(), 10);
		var newFlourValue = flourValue + 1;
		

		var moneyValue = parseInt($('#product .money').text(), 10);
		var newMoneyValue = moneyValue - 15;

		if (moneyValue >= 15) {
			$('#product .money').text(newMoneyValue);
			$('#ingredients .flour').text(Math.max(0, newFlourValue));
		}

		else {
			$('.buy-flour').css('color','red');
		}

	});

});