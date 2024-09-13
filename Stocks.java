public class Stocks
{
   private double closing;
   private double current;
/**
   Constructor
   >defult constructor that accepts arguments
   @paran "a" is the jus the place holder for now  << change name
   @param "b" is just a place holder for now    << change name
**/ 
   public Stocks(double a, double b)
   {
      closing = a;
      current = b;
   }
   
   /**
      method that returns the chercentage chang eof the closing and current price  of the stocks
      @param a is the closing price
      @param b is the current price 
      @return returns the price change percantage     
   **/
   
   public double getPercent()
   {
      return (closing/current)*100;
      
   }
}