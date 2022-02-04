class Canon{

  public boolean fire(int i, int j, Board board){
    boolean bol = true;
    boolean bolCheck = false;
    char position = board.getArrayChar(i, j);
    if(position == 'o'){
      board.setChar(i, j, 'x');
      bol = true;
      System.out.println("*KABOOM*");
      board.showFog();
      board.increaseScore();
      System.out.println("GREAT SHOT: you get an extra round. Fire again Commander!");
    }
    else if(position == 'x'|| position == '.'){
      System.out.println("This position has already been cleared, choose another one!");
      bol = true;
    }
    else{
      board.setChar(i, j, '.');
      System.out.println("*SPLOOSH*");
      board.showFog();
      bol = false;
      bolCheck = checkNear(i, j, board);
      if(bolCheck == true){
        System.out.println("... but it was a close one!");
      }
    }

    return bol;
  }

  private boolean checkNear(int i, int j, Board board){
    boolean checkBol = false;
    char checkPosition;
    int length = board.getArrayLength();

    if(i != 0 && i != length-1 && j != 0 && j != length-1){
      checkPosition = board.getArrayChar(i-1, j);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
      checkPosition = board.getArrayChar(i+1, j);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
      checkPosition = board.getArrayChar(i, j-1);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
      checkPosition = board.getArrayChar(i, j+1);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
    }

    if(i == 0 && j != 0 && j != length-1){

      checkPosition = board.getArrayChar(i+1, j);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
      checkPosition = board.getArrayChar(i, j-1);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
      checkPosition = board.getArrayChar(i, j+1);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
    }
    if(i == length-1 && j != 0 && j != length-1){
      checkPosition = board.getArrayChar(i-1, j);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
      checkPosition = board.getArrayChar(i, j-1);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
      checkPosition = board.getArrayChar(i, j+1);
      if(checkPosition == 'o'|| checkPosition == 'x'){
        checkBol = true;
      }
    }
    return checkBol;
  }
}
