import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  

 Scanner userInput = new Scanner(System.in);
 System.out.print("Type card notation: ");
 String inputNotation = userInput.nextLine();

 String cardValue = inputNotation.substring(0,1);
 String cardSymbol = inputNotation.substring(1,2);

 if (inputNotation.length() == 2) //if statement to confirm two character notation (eg. QS not QSS)
 {

 switch (cardValue) { //switch statement for card VALUE (first character)- catches invalid card values
 case "2":
 cardValue = "Two";
 break;
 case "3":
 cardValue = "Three";
 break;
 case "4":
 cardValue = "Four";
 break;
 case "5":
 cardValue = "Five";
 break;
 case "6":
 cardValue = "Six";
 break;
 case "7":
 cardValue = "Seven";
 break;
 case "8":
 cardValue = "Eight";
 break;
 case "9":
 cardValue = "Nine";
 break;
 case "10":
 cardValue = "Ten";
 break;
 case "Q":
 case "q":
 cardValue = "Queen";
 break;
 case "A":
 case "a":
 cardValue = "Ace";
 break;
 case "K":
 case "k":
 cardValue = "King";
 break;
 case "J":
 case "j":
 cardValue = "Jack";
 break;
 default:
 cardValue = "invalid";
 System.out.println("invalid card value entry");
 }

 switch (cardSymbol) { //switch statement for card SYMBOL (second character)- catches invalid card values
 case "S":
 cardSymbol = "Spades";
 break;
 case "C":
 cardSymbol = "Clubs";
 break;
 case "H":
 cardSymbol = "Hearts";
 break;
 case "D":
 cardSymbol = "Diamonds";
 break;
 default:
 cardSymbol = "invalid";
 System.out.println("invalid card symbol entry");
 }

 /* if statement for card description. if either the card value or card symbol were deemed
 invalid the card description CANNOT be formed since it does not exist */

 if (cardSymbol.equals("invalid") || cardValue.equals("invalid") ) 
 {
  System.out.println("Full card description cannot be given due to invalid input");
 }
 else 
 {
 System.out.println(cardValue + " of " + cardSymbol);
 }

 }
 else //other half of if statement from above- if given notation is more or less than two characters the program cannot work
  System.out.println("invalid notation length- must be two characters");





















  }
}