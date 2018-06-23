/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatiotransfer;

/**
 *
 * @author SAGOR
 */
public class Student implements Observer{
    
    String name;
    String ID;
    
    public Student(String nme, String id){
        this.name = nme ;
        this.ID = id ;
    }

    @Override
    public void update(String msg) {
        System.out.println("Student: "+name+" with ID: "+ID+" was updated with message: ");
        System.out.println(msg);
    }
    
}
