/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import Pantalla.EspacioTablero;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author SetLopez1999
 */
public class MovAlien extends Thread{
    private boolean pausa=false;
    private final JLabel etiqueta;
    private final EspacioTablero tablero;

    public MovAlien(JLabel etiqueta, EspacioTablero tablero) {
        this.etiqueta = etiqueta;
        this.tablero = tablero;
    }
    
    
    public synchronized void pauseThread() {
        pausa = true;
    }

    public synchronized void resumeThread() {
        pausa = false;
        //notify();
    }
    
    
    
    @Override
    public void run(){
        int mov= 0;
        int x = 1;
        int cont = 0;
        while (true) { 
            while (pausa) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MovAlien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                //Agarramos la cord Y de la bala
                sleep((int)25);
                mov = etiqueta.getX();
                etiqueta.setLocation(etiqueta.getLocation().x+x ,etiqueta.getLocation().y);

                tablero.repaint();
                cont++;
                if(cont > 60){
                    x = -x;
                    cont = 0;
                }
                
            } catch(InterruptedException e){
                 System.out.println(e);
             }
        }
    }
    
    
}
