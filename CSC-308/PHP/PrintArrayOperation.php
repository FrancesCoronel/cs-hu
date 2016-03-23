<?php
  //
  // Print Array
  //
  
  // create short variable names
  $array = $_POST['array'];
 ?>
<html>
<body>
<?php
	for ($i = 0; $i < count($array); $i++)
		echo $array[$i]." ";
?>

</body>
</html>