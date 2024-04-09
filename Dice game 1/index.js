
var randomNumber1 = Math.floor((Math.random()*6))+1;
var randomDiceImage= "images/" + "dice" + randomNumber1 +".png";

var playerDice1 = document.querySelectorAll("img")[0];
playerDice1.setAttribute("src",randomDiceImage);

var randomNumber2 = Math.floor((Math.random()*6))+1;
var randomDiceImage2 = "images/" + "dice" + randomNumber2 +".png";
console.log(randomDiceImage2);

var playerDice2 = document.querySelectorAll("img")[1];
playerDice2.setAttribute("src",randomDiceImage2);

if(randomNumber1 === randomNumber2){
    document.querySelector("h1").innerHTML="Draw";
}
if(randomNumber1 > randomNumber2){
    document.querySelector("h1").innerHTML="Player one wins";
}else{
    document.querySelector("h1").innerHTML="Player two wins";
}