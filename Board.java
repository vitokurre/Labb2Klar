public class Board{

  private int score = 0;
  private char[][] gameBoard;
  private int shipCounter = 0;
  public Board(int size){
  gameBoard = new char[size][size];
  makeGameBoard();
}
  public void show(){
    for(int i = 0; i < gameBoard.length; i++){
      for(int j = 0; j < gameBoard[0].length; j++) {
      System.out.print(" ["+gameBoard[i][j]+"] ");
    }
    System.out.println();
    }
  }
  public void makeGameBoard(){
    for(int i = 0; i < gameBoard.length; i++){
      for(int j = 0; j < gameBoard[0].length; j++) {
          gameBoard[i][j] = ' ';
      }
    }
  }
  public char getArrayChar(int i, int j){
    char charOnPosition = gameBoard[i][j];
    return charOnPosition;
  }
  public void showArrayChar(int i, int j){
    char charOnPosition = gameBoard[i][j];
    System.out.println(charOnPosition);
  }
  public void setChar(int i, int j, char c){
    gameBoard[i][j] = c;
  }
  public void clear(int i, int j) {
    gameBoard[i][j] = ' ';
  }
  public void placeBoat(int i, int j, char orient){

    if(orient == 'v'|| orient == 'V'){
      System.out.println("Placing ship vertical:");
      if(i == 0 || i == gameBoard.length-1){
        System.out.println("Can't place boat vertical, placement out of bounds. Try Again!");
      }
      else if(gameBoard[i][j] == 'o'||gameBoard[i-1][j] == 'o'||gameBoard[i+1][j] == 'o'){
        System.out.println("Can't place on another boat. Try again!");
      }
      else{
        System.out.println("An excellent position Commander!");
        setChar(i, j, 'o');
        setChar(i+1, j, 'o');
        setChar(i-1, j, 'o');
        shipCounter++;
      }
    }
    if (orient == 'h'|| orient == 'H') {//om den skall placeras horisontellt
      System.out.println("Placing ship horizontal:"); //funkar                   j är horisontellt
      if(j == 0 || j == gameBoard.length-1){  //ändrade här till gameBoard.lenght istället för 10.     <---------- här sker det out of bounds
        System.out.println("Can't place boat vertical, placement out of bounds. Try Again!");
      }

      else if(gameBoard[i][j] == 'o'||gameBoard[i][j-1] == 'o'||gameBoard[i][j+1] == 'o'){   //platsen redan tagen
        System.out.println("Can't place on another boat. Try again!");
      }
      else{
        System.out.println("An excellent position Commander!");
        setChar(i, j, 'o');
        setChar(i, j+1, 'o');
        setChar(i, j-1, 'o');
        shipCounter++;
      }
    }
  }
  public int getShipCounter(){
    return shipCounter;
  }
  
  public void increaseScore(){
    score++;
  }
  public int getScore(){
    return score;
  }
  public void showFog(){
    for(int i = 0; i < gameBoard.length; i++){
      for(int j = 0; j < gameBoard[0].length; j++) {
      if(gameBoard[i][j]=='o'){
        System.out.print(" [ ] ");
      }
      else {
      System.out.print(" ["+gameBoard[i][j]+"] ");
      }
    }
    System.out.println();
    }
  }
  public int getArrayLength(){
    int length = gameBoard.length;
    return length;
  }
  public void clearShipCounter(){
    shipCounter = 0;
  }
  public void clearScore(){
    score = 0;
  }
}
