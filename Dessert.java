
/**
 *NAME : MUHAMMAD AKHMAL(2022870756), NIK YUSUF(2022606254), MUHAMMAD SYAFIQ(2022831866), 
 *       RIZALIFF NABIL (2022451146)
 *PROJECT : SERI MALAYA DESSERT CAFE
 *FILE : DESSERT (CLASS)
 *DATE START : 25/12/2023    DATE END :  /01/2024            
 */

public class Dessert
{
    //declaring attributes
    private String custName;
    private String desID;
    private String desName;
    private char desType;
    private int desQty;
    private double desPrice;
    private boolean local;
    
    //normal constructor
    public Dessert(String custName,String desID,String desName,char desType,int desQty,
                   double desPrice,boolean local){
        this.custName = custName;
        this.desID = desID;
        this.desName = desName;
        this.desType = desType;
        this.desQty = desQty;
        this.desPrice = desPrice;
        this.local = local;
    }
    
    //mutator method
    public void setCustName(String custName) { this.custName = custName; }
    public void setDesID(String desID) { this.desID = desID; }
    public void setDesName(String desName) { this.desName = desName; }
    public void setDesType(char desType) { this.desType = desType; }
    public void setDesQty(int desQty) { this.desQty = desQty; }
    public void setDesPrice(double desPrice) { this.desPrice = desPrice; }
    public void setLocal(boolean local) { this.local = local; }
 
    //accessor method
    public String getCustName() { return custName; }
    public String getDesID() { return desID; }
    public String getDesName() { return desName; }
    public char getDesType() { return desType; }
    public int getDesQty() { return desQty; }
    public double getDesPrice() { return desPrice; }
    public boolean getLocal() { return local; }
    
    //processor method
    public double calcPrice(){
        return desPrice * desQty;
    }
    
    public double calcPrice(boolean local){
        double update = 0.00;
        if(local == true){
            update = calcPrice() * 0.9; //discount 10%
        }
        else 
            update = calcPrice();
        return update;
    }
    
    //print method
    public String toString(){
        String type;
        if(desType =='C'|| desType =='c')
            type = "Cake";
        else if(desType =='P'|| desType =='p')
            type = "Pastry";
        else if(desType =='T' || desType =='t')
            type = "Tradisional";
        else if (desType =='B' || desType =='b')
            type = "Cookies";
        else
            type = "Others";
            
        return(" Customer Name: "+ custName+
               "\n Dessert ID: " + desID +
               "\n DessertName: " + desName +
               "\n Dessert Type: "+ type +
               "\n Quantity: " + desQty +
               "\n Price: RM " + desPrice +
               "\n Locality: " + local ) ;
    }
}
