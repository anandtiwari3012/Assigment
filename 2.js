function bubbleSortDescending(arr) {
    var len = arr.length;
  
    for (var i = 0; i < len - 1; i++) {
      for (var j = 0; j < len - 1 - i; j++) {
        // Swap if the element found is greater than the next element
        if (arr[j] < arr[j + 1]) {
          var temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  
    return arr;
  }
  
  // Take user input for the array
  var inputArray = prompt("Enter elements of the array separated by commas:").split(',').map(Number);
  
  // Check if the user provided valid input
  if (inputArray.length > 0) {
    var sortedArray = bubbleSortDescending(inputArray);
    console.log("Sorted Array in Descending Order:", sortedArray);
  } else {
    console.log("Please provide a valid array.");
  }
  