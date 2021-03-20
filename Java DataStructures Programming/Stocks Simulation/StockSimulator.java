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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.TreeMap;

/**
   Class for simulating trading a single stock at varying prices.
*/
public class StockSimulator
{
 private Map<String, Queue<Block>> blocks;

    /**
     * Constructor.
     */
    public StockSimulator() {
        blocks = new TreeMap<>();
    }

    /**
      Handle a user buying a given quantity of stock at a given price.

      @param quantity how many to buy.
      @param price the price to buy.
   */
    public void buy(String symbol, int quantity, int price)
    {
        Queue<Block> stock; //initialize stock
        stock = new LinkedList<>();

        if (!blocks.containsKey(symbol)){ //if there exist the same symbol in the map
        } else {
            Queue<Block> cv; //add the new quantity/price to the list
            cv = blocks.get(symbol);
            boolean add;
            add = stock.add(cv.peek());
     }
     stock.add(new Block(quantity, price));

     Queue<Block> put; //insert into map
     put = blocks.put(symbol, stock);
    }

    /**
      Handle a user selling a given quantity of stock at a given price.
      @param symbol the stock to sell
      @param quantity how many to sell.
      @param price the price to sell.
   */
    public void sell(String symbol, int quantity, int price)
    {

        String nextSymbol;
        nextSymbol = "";

     for(Iterator<String> it = blocks.keySet().iterator(); it.hasNext();){ //Search for symbol
         String findSymbol = it.next();
         if (!findSymbol.equals(symbol)){
                }else{
                    nextSymbol = symbol;
                    break;
                   }
     }

        if (nextSymbol.isEmpty()){ //check if the symbol exists
            System.out.println("Stock symbol could not be found. Try again or type quit to end simulator.");
        }else{
            int profit;
            profit = 0;

            //Scanning the Queue list of the Stock symbol
            Queue<Block> bo;
            bo = blocks.get(nextSymbol);
            Iterator<Block> it;
            it = bo.iterator();

            while(it.hasNext() && quantity != 0){
                Block go;
                go = it.next();

                if(go.getQuantity() > 0){ //check for any quantity left
                    if(go.getQuantity() >= quantity){ //calculate the total profit
                        if(go.getQuantity() < quantity){
                            }else{
                                profit += (quantity * price) - (quantity * go.getPrice());
                                go.sell(quantity);
                                quantity = 0;
                                }
                        }else{
                            profit += (go.getQuantity() * price) - (go.getQuantity() * go.getPrice());
                            quantity -= go.getQuantity();
                            go.sell(go.getQuantity());
                            }
                    }else{
                        }
            }

            if (profit >= 0){ //check for a lost
                System.out.println("Gain: $" + profit);
                    }else{
                        System.out.println("Gain: $0" + " (You lost $" + Math.abs(profit) + " )");
                    }
            }
     }
}