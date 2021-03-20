//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 9  
// DUE: April 5       
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package loops;

public class App {

    public static void main(String[] args) {
       // for(int i=0; i<10;i++){
       // System.out.println("XXXXXXXXXX");
    //}
    
       // for(int row=1; row<=10; row++){
         //   if(row%2==1){
          //      System.out.println("XXXXXXXXXX");
          //  }else{
            //    System.out.println("OOOOOOOOOO");
            //}
        //}
        
        for(int row=1; row<=10; row++){

                if(row==1 || row==10){
                    System.out.println("XOOOOOOOOX");
                }else if(row==2 || row==9){
                    System.out.println("OXOOOOOOXO");
                }else if(row==3 || row==8){
                    System.out.println("OOXOOOOXOO");
                }else if(row==4 || row==7){
                    System.out.println("OOOXOOXOOO");
                }else{
                    System.out.println("OOOOXXOOOO");
                }
                
        }
    }
    
}
