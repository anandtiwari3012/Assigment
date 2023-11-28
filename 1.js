function reverseWords(sentence) {
    // Function to reverse a word
    function reverseWord(word) {
        var reversed = '';
        for (var i = word.length - 1; i >= 0; i--) {
            reversed += word[i];
        }
        return reversed;
    }

    // Split the sentence into words
    var words = [];
    var currentWord = '';
    for (var i = 0; i < sentence.length; i++) {
        if (sentence[i] !== ' ') {
            currentWord += sentence[i];
        } else {
            // Add the current word to the array
            words.push(currentWord);
            // Reset the current word
            currentWord = '';
        }
    }
    // Add the last word to the array
    words.push(currentWord);

    // Reverse each word in the array
    for (var i = 0; i < words.length; i++) {
        words[i] = reverseWord(words[i]);
    }

    // Join the reversed words into a sentence
    var reversedSentence = words.join(' ');

    return reversedSentence;
}

// Example usage
var inputSentence = prompt("Enter a sentence:");
var reversedResult = reverseWords(inputSentence);
console.log("Reversed sentence:", reversedResult);
