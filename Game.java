package com.java24hours;

class Game {
    /*
    * Pracitce exercises from java24hours coursebook
    */
    public static void main(String[] arguments) {
    /* public static void main(String[] arguments) {
    int total = 0;
    int score = 6;
    if(score == 6) {
    System.out.println("You score a touchdown");
    }
    if(score == 3) {
    System.out.println("You kick a field goal!");
    
    }
    total = total + score;
    System.out.println("Total Score: " + total);*/

    /*    int playerScore = 120;
    int playerLives = 3;
    int difficultyLevel = 10;
    
    if (playerScore < 9999) {
    playerLives++;
    System.out.println("Extra Life!");
    difficultyLevel = difficultyLevel + 5;
    System.out.println("Difficulty Level increased to level:  " + difficultyLevel);
    
    }*/
    /*int answer = 10;
    int correctAnswer = 13;
    int score = 0;
    
    if (answer == correctAnswer) {
    score += 10;
    System.out.println("That's right. You get 10 points");
    
    }else {
    score = -5;
    System.out.println("Sorry, that's wrong. You lose 5 points");*/
    /*char grade = 'B';
    switch(grade) {
    
    
    case 'A' :
    System.out.println("You got an A. Awesome");
    break;
    case 'B':
    System.out.println("You got an B. Beautiful");
    break;
    case 'C':
    System.out.println("You got an C. Concerning");
    break;
    default:
    System.out.println("You got an F. You'll do well in Congress");*/
    int skillLevel = 10;
   // int numberOfEnemies;
   
    /* if(skillLevel > 5 ) {
    numberOfEnemies = 20;
    }else{
    numberOfEnemies = 10;*/
    
    //use of the Ternary Operator
    //5 parts the condition to test surrounded by()
    //A question (?) is the value to use if condition is TRUE
    //A colon (:) the value to use if the condtion is FALSE
    
    int numberOfEnemies = (skillLevel > 5 ? 20 : 10); 
    //                      condition  ? value T : value F
        System.out.println("Your Skill Level is: " + skillLevel + "\n" +
                "Spawning " + numberOfEnemies + " enemies. Get Ready!");
}
}