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

public class BasicAccount extends BankAccount {
    
   private double checkAmount;
   
   private int countChecks;
   
   private int  checkbookNo;
   private double p;
   
   public BasicAccount(int x,String y,String z,String bn,double bl,double ca,int cc,int cn)
   {   
       super(x,y,z,bn,bl);
   
       checkAmount=ca;
       
       countChecks=cc;
       
       checkbookNo=cn;
       
   }
   public double getCA(){
       
       return checkAmount;
   }
   public int getCC(){
       
       return countChecks;
   }
   public int getCN(){
       
       return checkbookNo;
   }
   public void check(double y)
   {   
       countChecks++;
       
       
       checkAmount=y;
       
      
       
      if(getBL()>y){
       
          setBL(getBL()-y);
      }
      else{
          
          System.out.println(" less account balance");
      }
      if(countChecks>10){
          System.out.println("number of checks are greater than number per months");
           p= getBL()-500;
           setBL(p);
       }
           
       
       
       else{
           setBL(0);
   }
   
   }
}
