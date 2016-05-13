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
public class StudentAccount extends Account{
    
    private String Institution;
    
    private String status;
    
    public StudentAccount(int x,String y,String z,String in,String st){
        super(x,y,z);
        
        Institution=in;
        
        
        status=st;
    
    }
    public void setIN(String in)
    {
        Institution=in;
    }
    public void setST(String st)
    {
        status=st;
    }
    public String getIN()
    {
        return Institution;
    }
    public String getST()
    {
        return status;
    }
    
}
