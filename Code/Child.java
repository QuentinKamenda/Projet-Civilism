/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 *
 * @author qkame
 */
public class Child extends Human{
    
    protected Integer education;
    protected Degree degree;
    
    public void findTreasure(){
        
    }
    
    public void born(){
        
    }
    
    public void study(){
        this.education++;
    }
    
    public void becomeAdult(){
        // Delete the object "Child" and create an object "Adult"
        
        System.out.println("");
    }
}
