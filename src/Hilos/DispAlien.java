/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import Pantalla.EspacioTablero;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;

/**
 *
 * @author SetLopez1999
 */
public class DispAlien extends Thread{

    private final EspacioTablero tablero;

    public DispAlien( EspacioTablero tablero) {
        this.tablero = tablero;
    }
    
    @Override
    public void run(){

        while (true) {            
            try {
                //Agarramos la cord Y de la bala
                sleep((int)1000);
                tablero.AliensBalas();
                tablero.repaint();
                                 
            } catch(InterruptedException e){
                 System.out.println(e);
             }
        }
    }
    
    
}
