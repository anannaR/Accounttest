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
public class Accounttest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        SavingsAccount ob1=new SavingsAccount(1000,"a","permanent","sonalibank",20000,20000,5000,700);
        
        BasicAccount ob2=new BasicAccount(1000,"a","permanent","sonali bank",20000,20000,5000,700);
        
        DepositeAccount ob3=new DepositeAccount(1000,"a","permanent","sonali bank",20000,20000,5000);
        
    }
    
}
