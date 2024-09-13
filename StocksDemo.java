import java.util.Scanner;
public class StocksDemo
{
   public static void main(String[] args)
   {
      String symbol; // store the stocks symbol
      String name; // store the stock's name
      double priorClosingPrice; // store the stock price for the prevoice day 
      double currentPrice; // store the current stock price
   
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the stocks symbol: ");
      symbol = keyboard.nextLine();
      
      System.out.print("Please enter the stocks name: ");
      name = keyboard.nextLine();
      
      System.out.print("Please enter the closing price of the stock the prior day: ");
      priorClosingPrice = keyboard.nextDouble();
      
      System.out.print("Please enter the Current price of the stock: ");
      currentPrice = keyboard.nextDouble();         
   
      Stocks s = new Stocks(priorClosingPrice , currentPrice);
   
      System.out.println();
      displayInformation(symbol, name,priorClosingPrice, currentPrice, s);
   }
   /**
      display all the user infomation of the stock
   **/
   public static void displayInformation(String symbol, String name, double closing, double current, Stocks s)
   {
      System.out.println("Stock symbol: " + symbol);
      System.out.println("Stock name: " + name);
      System.out.printf("Closing price prior the day is $%.2f \n", closing);
      System.out.printf("Current price is $%.2f \n", current);
      System.out.printf("The percentage change of the price was %.2f percent\n", s.getPercent());
   }
}
