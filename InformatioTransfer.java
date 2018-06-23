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
public class InformatioTransfer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student Sagor = new Student("SAGOR", "1505060");
        Student Mahbub = new Student("Mahbub","1505035");
        Student Danish = new Student("Danish", "1505053");
                
        InfoSystem syst = new InfoSystem();
        
        syst.register(Danish);
        syst.register(Sagor);
        syst.register(Mahbub);
        
        syst.notifyObservers("There will be online tomorrow");
        
        syst.remove(Danish);
        syst.notifyObservers("Danish removed");
        
    }
    
}
