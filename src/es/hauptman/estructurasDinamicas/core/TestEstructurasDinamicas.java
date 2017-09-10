/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.estructurasDinamicas.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author mundakamacbook
 */
public class TestEstructurasDinamicas {
    
    public static void main(String[] args) {
        ArrayList cadenasGenerica = new ArrayList();
        ArrayList<String> cadenasEspecifica = new ArrayList();
        HashMap<String, Object> mapa = new HashMap<String, Object>();
        for (int i = 0; i < 10; i++) {
            String cadena = "Elemento " + (i + 1);
            cadenasGenerica.add(cadena);
            cadenasEspecifica.add(cadena);
            mapa.put(cadena, i);
        }
        //cadenaEspecifica tendra el doble de elementos
        cadenasEspecifica.addAll(cadenasGenerica);
        System.err.println("GENERICA");
        ManejadorDeEstructuras.imprime(cadenasGenerica);//Imprime ordenado
        System.err.println("ESPECIFICA");
        ManejadorDeEstructuras.imprime(cadenasEspecifica);//Imprime ordenada
        HashSet set = new HashSet(cadenasGenerica);
        //Aqui se va a eliminar los duplicados me permite duplicados
        //HashSet set = new HashSet(cadenasEspecifica); 
        System.err.println("SET");
        ManejadorDeEstructuras.imprime(set);//Imprime sin orden
        System.err.println("MAPA1 keySet()");
        ManejadorDeEstructuras.imprime(mapa.keySet());
        System.err.println("MAPA2 entrySet()");
        ManejadorDeEstructuras.imprime(mapa.entrySet());
        System.err.println("MAPA3 values()");
        ManejadorDeEstructuras.imprime(mapa.values());
        
    }
    
}
