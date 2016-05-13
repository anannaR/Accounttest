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
public class SavingsAccount extends BankAccount {
    
    private  double depositAmount;
    
    private  double withdrawalAmount;
    
    private int passbookNo;
    
     public SavingsAccount(int x,String y,String z,String bn,double bl,double dp,double wd,int pn)
             
    {   super(x,y,z,bn,bl);
    
        depositAmount=dp;
        
        withdrawalAmount=wd;
        
        passbookNo=pn;
    }

   
    
    public double getDA(){
        return depositAmount;
        
        
    }
    public double getWA()
    {
        return withdrawalAmount;
    }
    public int getPN(){
        return passbookNo;
        
    }
    public void deposit(double y)
    {
        
        
        setBL(getBL()+y);
        
    }
    public double withdrawal(int y)
    {
        if(y<getBL())
            return (y+(getBL()%10));
            
        else 
            return 0;
            
    }
    public double chargeonaccount(){
        
        if(getBL()<1000)
            
            return 200;
        else 
            return 0;
    }


}
