<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hangman Game with Datamuse API</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      text-align: center;
      margin: 20px;
    }
    #word-display {
      font-size: 24px;
      margin-bottom: 20px;
    }
    #hangman-image {
      max-width: 100%;
      height: auto;
      margin-bottom: 20px;
    }
    #letter-buttons {
      margin-top: 20px;
    }
    button {
      font-size: 18px;
      margin: 5px;
      padding: 10px;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <h1>Hangman Game with Datamuse API</h1>

  <div id="word-display"></div>
  <img id="hangman-image" src="hangman_0.png" alt="Hangman Image">

  <div id="letter-buttons"></div>

  <script>
    const apiKey = 'api.datamuse.com/words'; // Datamuse에서 발급받은 API 키를 넣으세요

    let selectedWord = '';
    let guessedWord = [];
    let wrongAttempts = 0;
    let usedLetters = [];

    async function getRandomWord() {
      const url = `https://api.datamuse.com/words?sp=*&max=1`;

      try {
        const response = await fetch(url, {
          method: 'GET',
          headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json',
            'Access-Control-Allow-Origin': '*',
          },
        });

        const data = await response.json();
        selectedWord = data[0].word.toLowerCase();
        guessedWord = Array(selectedWord.length).fill('_');
        console.log(selectedWord);

        updateUI();
      } catch (error) {
        console.error('Error fetching random word:', error);
      }
    }

    function initializeGame() {
      wrongAttempts = 0;
      usedLetters = [];
      getRandomWord();
    }

    function updateUI() {
      document.getElementById('word-display').textContent = guessedWord.join(' ');
      document.getElementById('hangman-image').src = `hangman_${wrongAttempts}.png`;

      const letterButtonsContainer = document.getElementById('letter-buttons');
      letterButtonsContainer.innerHTML = "";

      for (let i = 65; i <= 90; i++) {
        const letter = String.fromCharCode(i);
        const button = document.createElement('button');
        button.textContent = letter;
        button.addEventListener('click', () => handleLetterClick(letter));
        letterButtonsContainer.appendChild(button);
      }
    }

    function handleLetterClick(letter) {
      if (usedLetters.includes(letter)) {
        alert("You've already guessed this letter. Choose a different one.");
        return;
      }

      usedLetters.push(letter);

      if (selectedWord.includes(letter)) {
        for (let i = 0; i < selectedWord.length; i++) {
          if (selectedWord[i] === letter) {
            guessedWord[i] = letter;
          }
        }
      } else {
        wrongAttempts++;
      }

      if (guessedWord.join('') === selectedWord) {
        alert("Congratulations! You guessed the word.");
        initializeGame();
      } else if (wrongAttempts === 6) {
        alert(`Oops! The word was "${selectedWord}". Better luck next time.`);
        initializeGame();
      } else {
        updateUI();
      }
    }

    initializeGame();
  </script>
</body>
</html>

