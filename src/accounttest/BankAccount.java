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
public class BankAccount extends Account {
    
    private String bankName;
    
    private double balance;
    
    public BankAccount(int x,String y,String z,String Bn,double bl){
        
        super(x,y,z);
        
        
        bankName=Bn;
        
        balance=bl;
        
        
    }
    public void setBN(String bn)
    {
        bankName=bn;
    }
    public void setBL(double bl)
    {
        balance =bl;
    }
    public String getBN()
    {
        return bankName;
    }
    public double getBL()
    {
        return balance;
    }
}

   
    

