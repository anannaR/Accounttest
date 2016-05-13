/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttest;

/**
 *
 * @author user
 */
public class Account {
    private int accountNumber;
    private String holderName;
    private String holderType;
   

    

    
   public Account( int n,String nu,String t){
          
            accountNumber=n;
            holderName= nu;
            holderType= t;
    
        
    }
    public void setAN(String an){
       
        holderName=an;
    }
    public void setHN(int hn){
        
        accountNumber=hn;
    }
    public void setHT(String ht){
        
        holderType=ht;
    }
    public int getAN()
    {
        return accountNumber;
    }
    public String getHN()
    {
        return holderName;
    }
    public String getHT()
    {
        return holderType;
    }
    
   
    
}
