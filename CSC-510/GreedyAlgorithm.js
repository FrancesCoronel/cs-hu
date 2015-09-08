var change = function(n) {
	var change = [],
		total = 0;
	[25, 10, 5, 1].forEach(function(coin) {
		while (total + coin <= n) {
			change.push(coin);
			total += coin;
		}
	});
	return change;
};

console.log(change(67));

var makeChange = function(n) {
	for (var i = 1; i <= n; i++) {
		d25 = 0;
		d10 = 0;
		d5 = 0;
		d1 = 0;
		while (n >= i) {
			d += 1;
			n -= i;
		}
	}
}

