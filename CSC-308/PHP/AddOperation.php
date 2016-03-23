<?php
  //
  // Add Two Numbers
  //
  
  // create short variable names
  $number1 = $_POST['number1'];
  $number2 = $_POST['number2'];
?>
<html>
<body>
<?php
	echo $number1."<br>";
	echo $number2."<br>";
	$result = 0;
	$result = $number1 + $number2;
	echo "The sum is ".$result."<br>";
?>

</body>
</html>