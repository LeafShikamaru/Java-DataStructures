/**
* Title: Stocks
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program simulates the buying and selling of stocks with a given file.
Program will create a map add and sell stocks using the map and file then print out after selling the gain or loss.
*/
/**
   A quantity and price of a block of stocks.
*/
public class Block
{
   private final int price;
   private int quantity;

   /**
      Constructor.
      @param quantity the quantity of this block.
      @param price the price of this block.
   */
   public Block(int quantity, int price)
   {
      this.price = price;
      this.quantity = quantity;
   }

   public int getQuantity() { return quantity; }
   public int getPrice() { return price; }
   public void sell(int shares) { quantity -= shares; }
}
