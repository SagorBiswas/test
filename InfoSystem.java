/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatiotransfer;

import java.util.ArrayList;

/**
 *
 * @author SAGOR
 */
public class InfoSystem implements Software{
    
    private ArrayList<Observer> Observers = new ArrayList<Observer>();

    @Override
    public void register(Observer obs) {
        Observers.add(obs);
    }

    @Override
    public void remove(Observer obs) {
        Observers.remove(obs);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer observer : Observers ){
            observer.update(msg);
        }
    }
    
}
