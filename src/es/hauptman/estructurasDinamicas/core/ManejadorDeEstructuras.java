/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.estructurasDinamicas.core;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author mundakamacbook
 */
public class ManejadorDeEstructuras {
    
    public static void imprime(Collection collection) {
        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.err.println("" + next.toString());
            
        }
        
    }
    
}
