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
public class DepositeAccount extends BankAccount{

    private double depositAmount;
    private int countCheck;
    public DepositeAccount(int x,String y,String z,String bn,double bl,double da,int cc)
    {   super(x,y,z,bn,bl);
        depositAmount=da;
        countCheck=cc;
    }

    public void DoDeposit()
    {   
        if(depositAmount<500000)
        { 
           
            System.out.println("not higher amount");
            
         
        }
        else 
            setBL(getBL()+depositAmount);
            
    }
    public double afterWithdrawaccount (int x)
    {   
        countCheck++;
        if(countCheck>3)
            return 0;
        
        if(getBL()<x)
            
        {   System.out.println("not enough money");
        
            return 0;
        }
        else if(getBL()>x)
        {   
            return getBL()-x-(depositAmount*15)/300;
            
        }
        else
            return 1;
        
    }
    public double Charged(){
        
        if(getBL()<1000){
            
            System.out.println("charged because of low amount");
            return 200;
            
            
        }
        
        else 
            return 0;
    }
    
}

