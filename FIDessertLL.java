/**
 * PROJECT DATA STRUCTURE LINKEDLIST (SERI MALAYA DESSERT)
 * MUHAMMAD AKHMAL(2022870756), NIK YUSUF(2022606254), RIZALIFF NABIL(2022451146), MUHAMMAD SYAFIQ(2022831866)
 * CLASS : CS1103E
 * PREPARED FOR : MADAM NORZALINA BINTI ISMAIL
 * DATE START : 25/12/2023 (WEEK 11)
 * DATE END : 19/01/2024 (WEEK 14)
 */

import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
import java.text.*;
public class FIDessertLL
{
    public static void main(String args[]) throws IOException //must throws IOException for file input/output 
    {   
    try{//start try
        //declare linkedlist data structure 
        LinkedList dessertLL = new LinkedList();
        
        //create LinkedList for localLL and nonLocalLL
        LinkedList localLL = new LinkedList();
        LinkedList nonLocalLL = new LinkedList();
        
        //insert data from DessertOrder.txt into LinkedList DS
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        
        //[E1] to open input file
        FileReader fr=new FileReader("CustomerOrder.txt"); 
        BufferedReader br = new BufferedReader(fr);
        DecimalFormat decfor = new DecimalFormat("0.00");  //declare 2 point number
        int count=0;
        StringTokenizer st=null;
        String dataRow=br.readLine(); //to read one line of data  // [1]
        
        String custName,desID,desName;
        char desType;
        int desQty;
        double desPrice;
        boolean local;
        while(dataRow!=null)            //to make sure read until the end of data
        {   st=new StringTokenizer(dataRow,","); //to cut the word based on "," delimiter
            
            custName = st.nextToken();
            desID= st.nextToken();   
            desName = st.nextToken(); 
            desType = st.nextToken().charAt(0);
            desQty = Integer.parseInt(st.nextToken());
            desPrice = Double.parseDouble(st.nextToken());
            local = Boolean.parseBoolean(st.nextToken());
            
            //passing value to object
            Dessert des= new Dessert(custName,desID,desName,desType,desQty,desPrice,local);
            dessertLL.addFront(des);
            
            count++;
            dataRow=br.readLine();  //to read the new line of data
        }
        
        //menu and greeting
        System.out.print("WELCOME TO SERI MALAYA CAFE :) (LINKEDLIST) ");
        System.out.println("\n\n+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|                      CAKE(C)                   |          |                   PASTRY(P)                |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   CODE   |         NAME          |   PRICE(RM) |          |   CODE   |         NAME        |   PRICE   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D001   |   CHEESECAKE          |     45.90   |          |   D101   |  CREAM CHEESE       |    8.00   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D002   |   CHIFFON CKAE        |     25.50   |          |   D102   |  POTATO CINAMON     |    6.60   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D003   |   CHOC INDULGENCE     |     87.40   |          |   D103   |  CROMBOLONI         |    4.50   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D004   |   MARBLE CKAE         |     20.00   |          |   D104   |  ROLL CHEESE HOTDOG |    3.60   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D005   |   RED VELVET CUPCAKES |     12.90   |          |   D105   |  CHURROS PUFF       |    4.00   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D006   |   VANILLA POUND       |     14.20   |          |   D106   |  CHEESE TART        |    2.70   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D007   |   BATIK CAKE          |      7.50   |          |   D107   |  DONUTS             |    2.40   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        
        
        System.out.println("\n+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|            TRADISIONAL(T) - 30 PCS             |          |                  OTHERS (O)                |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   CODE   |         NAME          |   PRICE(RM) |          |   CODE   |         NAME        |   PRICE   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D201   |   KUIH BAKAR          |     20.00   |          |   D301   |  JELLY PUDDING      |    4.50   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D202   |   SERI MUKA           |     25.00   |          |   D302   |  ICE CREAM CUP      |    7.90   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D203   |   PUTU KACANG         |     17.40   |          |   D303   |  BANANA PUDDING     |    5.00   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D204   |   LOMPAT TIKAM        |     26.40   |          |   D304   |  BROWNIES           |    5.60   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D205   |   KUIH CARA           |     14.00   |          |   D305   |  COOKIES DIP N' DAP |   18.00   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D206   |   TEPUNG PELITA       |     30.40   |          |   D306   |  RICE KRISPIE TREATS|    2.00   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|   D207   |   KUIH LAPIS PELANGI  |     20.20   |          |   D307   |  CHOCOLOATE MOUSSE  |    4.60   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        
        
        //[P1] add 2 more data at the back
        System.out.print("\n\n Two Additional Customer Order Details At The Back:- ");
        FileWriter fwBd = new FileWriter("CustomerOrder.txt", true); // Open file in append mode
        BufferedWriter bwBd = new BufferedWriter(fwBd);
        PrintWriter pwBd = new PrintWriter(bwBd);
        
        System.out.println("\n+-------------------------------------------------------+");
        System.out.println("|                Input Customer Details:-               |");
        System.out.println("+-------------------------------------------------------+");
        for(int i=0; i<2; i++){
            System.out.print(" Enter Customer Name: ");
            custName = inputText.nextLine();
            
            System.out.print(" Enter Dessert ID: ");
            desID = inputText.nextLine();
            System.out.print(" Enter Dessert Name: ");
            desName = inputText.nextLine();
            System.out.print(" Enter Dessert Type [C/P/T/O]: ");
            desType = inputText.next().charAt(0);
            System.out.print(" Enter Quantity: ");
            desQty = inputNum.nextInt();
            System.out.print(" Enter Price: ");
            desPrice = inputNum.nextDouble();
            System.out.print(" It's Dessert Local? [true/false]: ");
            local = inputNum.nextBoolean();
            inputText.nextLine();
            
            System.out.println("+-------------------------------------------------------+");
            
            Dessert des= new Dessert(custName,desID,desName,desType,desQty,desPrice,local);
            dessertLL.addBack(des);
        }
        System.out.println(" Successful Added The New Data!");
        
        //[E4] update price for Batik Cake
        Dessert des = (Dessert)dessertLL.getHead(); //[P3]
        while(des!=null){
            if(des.getDesName().equalsIgnoreCase("Batik Cake"))
                des.setDesPrice(12.00); 
                
            des = (Dessert)dessertLL.getNext();
        }
        
        //[P2] remove last data 
        dessertLL.removeFirst();
        
        //[P6] display the content in the LinkedList into PurchasedDataLL.txt 
        FileWriter fwData=new FileWriter("PurchasedDataLL.txt");  //create file "PurchasedDatalLL.txt"
        BufferedWriter bwData=new BufferedWriter(fwData);
        PrintWriter pwData=new PrintWriter(bwData);  //[2]
        
        //display and rewrite into txt file(avoid eficiency distribution)
        pwData.println("\n***Welcome to the Dessert Purchase Management System !***"+
                       "\n\n+--------------------------------------------------+"+
                       "\n|  Details Customer Order Management System  (LL)  |"+
                       "\n+--------------------------------------------------+");
        des = (Dessert)dessertLL.getHead();
        while(des!=null){
            pwData.println(des.toString());
            pwData.println("+-------------------------------------------------------+");
            des = (Dessert)dessertLL.getNext();
        }
        
        //[E5] display the detail of List Local Dessert in file LocalLL.txt and the console
        //to open output file
        FileWriter fwL=new FileWriter("LocalLL.txt"); //create file "LocalLL.txt"
        BufferedWriter bwL=new BufferedWriter(fwL);
        PrintWriter pwL=new PrintWriter(bwL); //3
        
        pwL.println("\n+--------------------------------------------------+"+
                    "\n|      Details of Purchase Local Dessert (LL)      | "+
                    "\n+--------------------------------------------------+");
        int countLocal= 0;
        int countNonLocal= 0;
        des = (Dessert)dessertLL.getHead();
        while(des != null){
            if(des.getLocal() == true){  //[E2]
                countLocal++;
                localLL.addBack(des);
            }
            else{
                countNonLocal++;
                nonLocalLL.addBack(des);
            }
               
            des = (Dessert)dessertLL.getNext();
        }
        
        des = (Dessert)localLL.getHead();
        while(des!=null){
            pwL.println(des.toString());
            pwL.println("+-------------------------------------------------------+");
            des = (Dessert)localLL.getNext();
        }
        
        //[E5] display the detail of Non Local Dessert in file NonLocalLL.txt and the console
        FileWriter fwNL=new FileWriter("NonLocalLL.txt"); //create file "NonLocalLL.txt"
        BufferedWriter bwNL=new BufferedWriter(fwNL);
        PrintWriter pwNL=new PrintWriter(bwNL); //3
        pwNL.println("\n+---------------------------------------------------+"+
                    "\n|     Details of Purchase Non Local Dessert (LL)    | "+
                    "\n+---------------------------------------------------+");
        des = (Dessert)nonLocalLL.getHead();
        while(des!=null){
            pwNL.println(des.toString());
            pwNL.println("+-------------------------------------------------------+");
            des = (Dessert)nonLocalLL.getNext();
        }
        
        //total fee for each customer, total sales and average sales
        double fee=0;
        FileWriter fwF=new FileWriter("OrderFeeLL.dat");
        BufferedWriter bwF=new BufferedWriter(fwF);
        PrintWriter pwF=new PrintWriter(bwF); //3
        
        System.out.println("\n+---------------------------------------------------+"+
                           "\n|      Fee for each Customer Purchased (LL)         | "+
                           "\n+---------------------------------------------------+");
        pwF.println("\n+---------------------------------------------------+"+
                           "\n|      Fee for each Customer Purchased (LL)         | "+
                           "\n+---------------------------------------------------+");
        
        des = (Dessert) dessertLL.getHead();
        while(des!=null){
            //internal output
            fee=des.calcPrice(des.getLocal());
            System.out.println(" Customer Name: "+des.getCustName() + "\n Dessert ID: "+des.getDesID()+ "\n Dessert Name: "+des.getDesName()+"\n Quantity: "+des.getDesQty()+ "\n Fee: RM "+decfor.format(fee));
            System.out.println("+-------------------------------------------------------+");
            //file output
            pwF.println(" Customer Name: "+des.getCustName() + "\n Dessert ID: "+des.getDesID()+ "\n Quantity: "+des.getDesQty()+ "\n Fee: RM "+decfor.format(fee));
            pwF.println("+-------------------------------------------------------+");
            des = (Dessert) dessertLL.getNext();
        }
        
        //[E6] total sales according to each list (LocalLL and nonLocalLL)
        des = (Dessert)localLL.getHead();
        double sumLocal = 0.00;
        while(des!=null){
            sumLocal = sumLocal + des.calcPrice(des.getLocal());
            des = (Dessert)localLL.getNext();
        }
        
        double sumNonLocal = 0.00;
        des = (Dessert)nonLocalLL.getHead();
        while(des!=null){ //[P5]
            sumNonLocal = sumNonLocal + des.calcPrice(des.getLocal());
            des = (Dessert)nonLocalLL.getNext();
        }
        
        System.out.println("\n+-------------------------------------------------------------+");
        System.out.println(" Total sales for local product : RM "+decfor.format(sumLocal));
        System.out.println("---------------------------------------------------------------");
        System.out.println(" Total sales for non local product : RM "+decfor.format(sumNonLocal));
        System.out.println("---------------------------------------------------------------");
        
        double avgSales = (sumLocal + sumNonLocal) / (countLocal + countNonLocal);
        System.out.println(" Average Sales: RM "+decfor.format(avgSales));
        System.out.println("+-------------------------------------------------------------+");
        
        //[P4] size of the list localLL and nonLocalLL
        System.out.println("\n\n+-------------------------------------------------------------+");
        System.out.println(" The Size for Local List is "+countLocal);
        System.out.println("---------------------------------------------------------------");
        System.out.println(" The Size for Non Local List is "+countNonLocal);
        System.out.println("+-------------------------------------------------------------+");
        
        //[E3] searching for customer order according to the user input customer name
        Scanner inputT = new Scanner(System.in);
        System.out.println("\n\n Find A Customer Order;-");
        System.out.println("+-------------------------------------------------------------+");
        System.out.print(" Enter Customer Name: ");
        String search = inputT.nextLine();
        System.out.println("+-------------------------------------------------------------+");
        
        boolean found=false;
        des = (Dessert) dessertLL.getHead();
        while(des!=null){
            if(des.getCustName().equalsIgnoreCase(search)){
                found = true; 
                System.out.println(" Order details for "+search+ " :-"); 
                System.out.println("---------------------------------------------------------------");
                System.out.println(des.toString()+ "\n Fee: "+des.calcPrice());
                System.out.println("+-------------------------------------------------------------+");
                break;
            }
            des = (Dessert)dessertLL.getNext();
        }
        
        if(!found){
            System.out.println(" Dessert with Customer Name "+search+ " is not found.");
            System.out.println("+-------------------------------------------------------------+");
        }
        
        br.close();
        pwBd.close();
        pwData.close();
        pwL.close();
        pwNL.close();
        pwF.close();
    }// end try
    catch(EOFException eof) //to display a message if an error related to file occur
    {    System.out.println("Problem: "+eof.getMessage());}
    catch(FileNotFoundException e)
    {    System.out.println("Problem: "+e.getMessage());}
    catch(IOException ioe)
    {    System.out.println("Problem: "+ioe.getMessage());}
    finally
    { System.out.println("\nEnd of the program"); }    //end of coding (FINAL)
    }
}
