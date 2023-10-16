/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import Pantalla.EspacioTablero;
import java.awt.Color;
import javax.swing.JLabel;
/**
 *

 * @author SetLopez1999
 */
public class Disparo extends Thread{
    //Atributos de disparar
    private final JLabel etiqueta;
    private final EspacioTablero tablero;
    private int direccion;
    private int velocidad = 5;
    
    private boolean colision;

    public Disparo(JLabel etiqueta, EspacioTablero tablero, int direccion) {
        this.etiqueta = etiqueta;
        this.tablero = tablero;
        this.direccion = direccion;
    }
    
    
    
    @Override
    public void run(){
        int bala= 0;
        int y = 0;
        int x = 0;
        int v =velocidad;
        //Hacemos segun la entidad
        if(direccion == 1) y = 1;
        else if(direccion == 2) y = -1;
        else if(direccion == 3) x = 1;
        else if(direccion == 4) x = -1;
        
        while (true) {            
            try {
                //Agarramos la cord Y de la bala

                sleep((int)v);
                bala = etiqueta.getY();
                etiqueta.setLocation(etiqueta.getLocation().x-x ,etiqueta.getLocation().y-y);
                tablero.repaint();
                if(bala< 0 || bala >575){
                    //etiqueta.setBackground(Color.yellow);
                    tablero.remove(etiqueta);
                    tablero.repaint();
                    break;
                }
                //Tenemos que hacer que detecte cada vez si esta colisionando
                if (tablero.Colision(etiqueta)){
                    tablero.repaint();
                }
                
                //Verificamos si los malos ya son 0 y si es asi, felicitamos
                if(tablero.getCant_enemigos() == 0){
                    tablero.juegoCompletado();
                    break;
                }

            } catch(InterruptedException e){ System.out.println(e); }
        }

                
    }
    
}
