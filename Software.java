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
public interface Software {
    public void register(Observer obs);
    public void remove(Observer obs);
    public void notifyObservers(String msg);
}
