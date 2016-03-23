<?php
  //
  // Compare Two Numbers
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
	if ($number1 >= $number2)
		echo $number1." is the larger number<br>";
	else
		echo $number2." is the larger number<br>";
?>

</body>
</html>