import java.util.Arrays;
import java.util.Scanner;
public class BattleShips{
  public static void main(String[] args){

  startTheGameMenu();

  }

  public static int askInt(int boardSize) {
      while (true) {
        try {
          Scanner sc = new Scanner(System.in);
          int size = 11;
          System.out.println("Please enter an int:");
          int answer = sc.nextInt();
          if (answer > 0 && answer < boardSize+1) {
            answer = answer - 1;
            return answer;
          } else {
            int sizeMaximum = boardSize+1;
            System.out.println("Has to be larger than 0, and smaller than "+sizeMaximum+".");
          }
        } catch (Exception e) {
        }
      }
    }

  public static int askSize() {
      while (true) {
        try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter an int:");
          int answer = sc.nextInt();
          if (answer > 5 && answer < 16) {
            boardSize(answer);
            return answer;
          } else {
            System.out.println("Minium size is 6x6, maximum size is 15x15. Please try again!");
          }
        } catch (Exception e) {
        }
      }
    }

  public static char askChar() {
      while (true) {
        try {
          Scanner sc = new Scanner(System.in);
          System.out.println("V or v for vertical placement, H or h for horizontal placement.");
          char c = sc.next().trim().charAt(0);
          if (c == 'v'||c == 'V'||c == 'h'||c == 'H') {
            return c;
          } else {
            System.out.println("You must type in V or H:");
          }
        } catch (Exception e) {
        }
      }
  }

  public static String askString() {
    Scanner sc = new Scanner(System.in);
    String textLine = sc.nextLine();
  return textLine;
  }

  public static void startTheGameMenu(){
    while (true) {
      System.out.println("----------------------*******  WELCOME TO BATTLESHIPS  *******---------------------------");
      System.out.println(" ");
      System.out.println("---^^^^^^^---The authentic world war one naval battle experince---^^^^^^^^------------");
      System.out.println("---^^^^-------^^^^---The Royal Navy vs. k.u.k.Kriegsmarine----^^^^--------^^^^^^-----");
      System.out.println("-------^^^^^^^-----------^^^^^^^^----------^^^^^^^^----------^^^^^^^^^----------------");
      System.out.println("-----------------^^^^^^^^----------^^^^^^^^^^---------^^^^^^^-------------------------");
      System.out.println(" ");
      System.out.println("Start a new game: press 1");
      System.out.println("Mission briefing 2");
      System.out.println("How to play tutorial: press 3");
      System.out.println("Quit: press 4");                           // <-------- funktionen funkar men är trög. Man får klicka 2-3 ggr
      System.out.println(" ");

      String menuNavigation = askString();

        if(menuNavigation.equals("1")){
          gameOrder();
        }
        else if(menuNavigation.equals("2")){
          briefing();
        }
        else if(menuNavigation.equals("3")){
          turtorial();
        }
        else if(menuNavigation.equals("4")){
          break;
        }
    }
  }

  public static void briefing(){
    System.out.println("----------------------*******  Mission Briefing  *******---------------------------");
    System.out.println(" ");
    System.out.println("Your mission is to sink all of your enemies ships.");
    System.out.println("You have to skillfully aim (guess) where your enemies fleet is hiding and fire your ship cannons.");
    System.out.println("When you hit an enemy ship, the following explosion will reveal your enemies position. Take note of it.");
    System.out.println("In the meantime your enemy probably tries to put out fires and help the wounded crew, this gives you time to fire again. Do not hesitate.");
    System.out.println("If you try to hit the same position again the crew will allow you to fire another round (but only a fool would waste expensive ammo).");
    System.out.println("If your aim let you down and you only make a big splash in the ocean the initiative will pass over to your enemy");
    System.out.println("If your enemy got the advantage, pray to whatever god you belive in, that your enemies aim is weaker than yours.");
    System.out.println("Remember, if the luck is on the the enemies side, it's a commanders duty to leave the ship last.");
    System.out.println("As you can guess, in that case the enemy is victorious, you are forbidden to let the enemy salvage your fleet.");
    System.out.println("Keep your honour and follow your fleet down into the deep, and say hello to Davy Jones.");
    System.out.println("But let us hope it won't came to that. Be brave commander, our country's freedom depends on you!");
    System.out.println("Crush OUR enemy, and help your nation END THE WAR once and for all.");
    System.out.println(" ");
    System.out.println("/ THE NAVY HIGH COMMAND ");
    System.out.println(" ");
    String commandBriefingA;
      while(true) {
        System.out.println("Get back press 1");
        commandBriefingA = askString();
        if(commandBriefingA.equals("1")){
          break;
        }
      }
      startTheGameMenu();
  }

  public static void turtorial(){
    System.out.println("----------------------*******  Tutorial - how to play  *******---------------------------");
    System.out.println(" ");
    System.out.println("To play the game you first have to place out all your four ships on the board.");
    System.out.println("The board is a 10x10 grid, where position (1,1) is in the upper left corner and position (10,10) is in the lower right corner.");
    System.out.println("The first number represent the vertical position (y-axis) and the second number represent the horizontal position (x-axis)");
    System.out.println("You also need to specify if you want to place your ship horizontal or vertical on the board");
    System.out.println("You cannot place a ship on an another ship, nor can you place your ship outside the board.");
    System.out.println(" ");
    System.out.println("The best way to do this is to let player 1 go first and in the meantime player 2 looks away.");
    System.out.println("When player 1 is done, it's player 2's turn to place their ship. Now it's player 1's turn to look away.");
    System.out.println(" ");
    System.out.println("Finally when the board is ready player 1 starts firing their cannons at player 2's fleet.");
    System.out.println("This is the same mechanic as placing boats, you just type in x and y for your coordinates where your aim is.");
    System.out.println("When player 1 miss, the turns goes over to player 2 and then you keep switching turns as the game goes on.");
    System.out.println("Good luck, have fun and enjoy the game!");
    String commandBriefingA;
      while(true) {
        System.out.println("Get back press 1");
        commandBriefingA = askString();
        if(commandBriefingA.equals("1")){
          break;
        }
      }
      startTheGameMenu();
  }

  public static void gameOrder(){
    System.out.println("----------------------*******  GAME START UP  *******---------------------------");
    System.out.println("Before we start you have to decide how big of a grid you want the battle to take place on.");
    System.out.println("It's recommended to play on a 10x10 grid, but you may choose to play on a smaller or larger board.");
    System.out.println("The minimun size is 6x6 and the maximum is 15x15.");
    System.out.println("Type in the size of your board:");

    int boardSize = askSize();

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("----------------------*******  PLACE BOAT PHASE  *******---------------------------");
    System.out.println("Player 1 will take the role as an aspiring young british officer in the Royal Navy.");
    System.out.println("Player 2 will take the role as an daring austrian-hungarian officer in the kaiserliche und königliche Kriegsmarine.");
    System.out.println(" (shortened to k.u.k. Kriegsmarine) ");
    System.out.println(" ");
    System.out.println("When nations are decided, it's time to place all your boats on the board. Player 1 goes first.");
    System.out.println("Player 2, be a gentleman and look away!");

    Board player1 = initialize(boardSize);

    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Excellent, now it's time for player 2 to place their boats and player 1's turn to look away!");

    Board player2 = initialize(boardSize);

    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("----------------------*******  THE BATTLE BEGINS  *******---------------------------");

    while(player2.getScore() != 12 && player1.getScore() != 12) {
    System.out.println("Player 1, it's your turn!");
    turn(player2, boardSize);
      if(player2.getScore() == 12){
        System.out.println("----------------------*******  VICTORY  *******--------------------------");
        System.out.println("--------------------- Congratulations player 1---------------------------");
        System.out.println("----------------**A great victory for the Royal Navy**--------------------");
        System.out.println("The First Lord of the Admiralty Winston Churchill sends his regards and lights up a cigar.");
        System.out.println("Once again have The Royal Navy has proven to be worlds mightiest fleet! Well done Commander!");
        System.out.println(" ");
        String commandVictoryA;
          while(true) {
            System.out.println("Get back press 1");
            commandVictoryA = askString();
            if(commandVictoryA.equals("1")){
              break;
            }
          }
          player1.clearScore();
          player1.clearShipCounter();
          player2.clearScore();
          player2.clearShipCounter();
          startTheGameMenu();
        break;
      }
    System.out.println("Player 2, it´s yours turn!");
    turn(player1, boardSize);
    if(player1.getScore() == 12){
      System.out.println("----------------------*******  SIEG  *******---------------------------");
      System.out.println("--------------------- Congratulations player 2---------------------------");
      System.out.println("------------**A great victory for the k.u.k. Kriegsmarine**----------------");
      System.out.println("Generalfeldmarschall Franz Conrad von Hötzendorf takes a break from his mistress and makes a toast to celebrate your eternal glory!");
      System.out.println("Long live the Austro-Hungarian Empire, the greatest Dual Monarchy in the world. Gute gemacht kommandant");
      String commandVictoryB;
        while(true) {
          System.out.println("Get back press 1");
          commandVictoryB = askString();
          if(commandVictoryB.equals("1")){
            break;
          }
        }
        player1.clearScore();
        player1.clearShipCounter();
        player2.clearScore();
        player2.clearShipCounter();
        startTheGameMenu();
      break;
    }
   }
  }

  public static void turn(Board target, int boardSize){
    Canon canon = new Canon();
    boolean check = false;
    boolean fireBol = false;
    check = checkWinner(target);
    if(check == false){
      target.showFog();
      System.out.println("Commander, where shall we aim our guns?");
      System.out.println("Remember: first int is vertical, second is horizontal!");
      int i = askInt(boardSize);
      int j = askInt(boardSize);
      fireBol = canon.fire(i, j, target);
      System.out.println(" ");
      if(fireBol == true){
        turn(target, boardSize);
      }
    }
  }

  private static boolean checkWinner(Board board){
  boolean check = false;
  if (board.getScore() == 12){
    check = true;
  }
  return check;
  }

  private static Board initialize(int size){
    Board player = new Board(size);
    int counter = player.getShipCounter();
    while(counter != 4){
      int boatPlacerCounter = player.getShipCounter()+1;
      System.out.println("Place boat nr: "+boatPlacerCounter);
      int i = askInt(size);
      int j = askInt(size);
      char c = askChar();
      player.placeBoat(i, j, c);
      player.show();
      counter = player.getShipCounter();
      boatPlacerCounter = boatPlacerCounter +1;
      System.out.println(" ");
    }
    return player;
  }

  private static void boardSize(int size){
    int SizeOnBoard = size;
  }
}
