<!--
FRANCES CORONEL
CSC 308
PHP BUBBLE SORT
-->

<html>
<body>
<?php

  // create short variable name from array
  $array = $_POST['array'];

  // print unsorted array
  echo "Unsorted Array<br>";
  for ($i = 0; $i < count($array); $i++)
    echo $array[$i]." ";

  echo "<br>";

  // bubble sort
  $array_length = count($array);
  for ($i = 0; $i < $array_length - 1; $i++) {
    for ($j = $i + 1; $j < $array_length; $j++) {
      if ($array[$i] > $array[$j]) {
        $temp = $array[$i];
        $array[$i] = $array[$j];
        $array[$j] = $temp;
      }
    }
  }

  echo "<br>";

  // print sorted array
  echo "Sorted Array<br>";
  for ($i = 0; $i < count($array); $i++)
    echo $array[$i]." ";
?>

</body>
</html>