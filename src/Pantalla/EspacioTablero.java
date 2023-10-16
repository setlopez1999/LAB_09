package Pantalla;

import Hilos.DispAlien;
import Hilos.Disparo;
import Hilos.MovAlien;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JLabel;

/**
 *
 * @author SetLopez1999
 */
public class EspacioTablero extends javax.swing.JFrame implements KeyListener{

    
    /**
     * Creates new form EspacioTablero
     * @param padre
     */
    private int vidasJ = 4;
    private int puntaje=0;
    private int cant_enemigos= 12;
    private boolean key = false;
    private boolean poderes = false;
    private DispAlien mov = new DispAlien(this);

    
    
    public boolean isPoderes() {
        return poderes;
    }
    public void setPoderes(boolean poderes) {
        this.poderes = poderes;
    }

    public boolean isKey() {
        return key;
    }
    public void setKey(boolean key) {
        this.key = key;
    }

    public int getCant_enemigos() {
        return cant_enemigos;
    }
    public void setCant_enemigos(int cant_enemigos) {
        this.cant_enemigos = cant_enemigos;
    }

    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public int getVidasJ() {
        return vidasJ;
    }
    public void setVidasJ(int vidasJ) {
        this.vidasJ = vidasJ;
    }
    
    
    
    public EspacioTablero() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);
        
        this.lblAlien4.setBackground(Color.GREEN);
        this.lblAlien9.setBackground(Color.GREEN);
        this.lblAlien10.setBackground(Color.GREEN);
        this.lblAlien11.setBackground(Color.GREEN);
        this.lblAlien12.setBackground(Color.GREEN);
        
        this.lblFLC.setVisible(false);
        this.lblParamax.setVisible(false);
        
        this.lblGO.setText("GAME OVER");
        this.lblGO.setVisible(false);
        this.lblParaReiniciar.setVisible(false);
        this.corazon.setLocation(10, 15);
        this.corazon.setText("Vidad  ☻☻☻☻☻");
        Font nuevaFuente = new Font("Berlin Sans FB Demi", Font.BOLD, 36);
        this.corazon.setFont(nuevaFuente);
        //Ponemos en accion el hilo de los aliens
        MoverAliens();
        
        mov.start();
        
    }

    // Definir la acción de reinicio
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlien8 = new javax.swing.JLabel();
        lblAlien9 = new javax.swing.JLabel();
        lblAlien10 = new javax.swing.JLabel();
        lblAlien11 = new javax.swing.JLabel();
        lblAlien12 = new javax.swing.JLabel();
        lblAlien2 = new javax.swing.JLabel();
        lblAlien3 = new javax.swing.JLabel();
        lblAlien1 = new javax.swing.JLabel();
        lblAlien5 = new javax.swing.JLabel();
        lblAlien4 = new javax.swing.JLabel();
        lblAlien6 = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        lblAlien7 = new javax.swing.JLabel();
        lblGO = new javax.swing.JLabel();
        corazon = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lblParamax = new javax.swing.JLabel();
        lblFLC = new javax.swing.JLabel();
        lblParaReiniciar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guerra de las Geometras by SetLopez1999");
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        lblAlien8.setBackground(new java.awt.Color(255, 153, 0));
        lblAlien8.setOpaque(true);

        lblAlien9.setBackground(new java.awt.Color(0, 204, 0));
        lblAlien9.setOpaque(true);

        lblAlien10.setBackground(new java.awt.Color(0, 204, 0));
        lblAlien10.setLabelFor(lblAlien10);
        lblAlien10.setOpaque(true);

        lblAlien11.setBackground(new java.awt.Color(0, 204, 0));
        lblAlien11.setOpaque(true);

        lblAlien12.setBackground(new java.awt.Color(0, 204, 0));
        lblAlien12.setOpaque(true);

        lblAlien2.setBackground(new java.awt.Color(255, 51, 51));
        lblAlien2.setOpaque(true);

        lblAlien3.setBackground(new java.awt.Color(255, 51, 51));
        lblAlien3.setOpaque(true);

        lblAlien1.setBackground(new java.awt.Color(255, 51, 51));
        lblAlien1.setOpaque(true);

        lblAlien5.setBackground(new java.awt.Color(255, 153, 0));
        lblAlien5.setOpaque(true);

        lblAlien4.setBackground(new java.awt.Color(0, 204, 0));
        lblAlien4.setOpaque(true);

        lblAlien6.setBackground(new java.awt.Color(255, 153, 0));
        lblAlien6.setOpaque(true);

        lblJugador.setBackground(new java.awt.Color(51, 51, 255));
        lblJugador.setOpaque(true);

        lblAlien7.setBackground(new java.awt.Color(255, 153, 0));
        lblAlien7.setOpaque(true);

        lblGO.setBackground(new java.awt.Color(0, 0, 0));
        lblGO.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        lblGO.setForeground(new java.awt.Color(255, 255, 255));
        lblGO.setText("GAME OVER");

        corazon.setBackground(new java.awt.Color(0, 0, 0));
        corazon.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        corazon.setForeground(new java.awt.Color(255, 255, 255));
        corazon.setText("Vida ☻☻☻☻☻");

        lblPuntos.setBackground(new java.awt.Color(0, 0, 0));
        lblPuntos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntos.setText("Puntos 0000");

        lblParamax.setBackground(new java.awt.Color(0, 0, 0));
        lblParamax.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblParamax.setForeground(new java.awt.Color(255, 255, 255));
        lblParamax.setText("Presiones X para reiniciar");

        lblFLC.setBackground(new java.awt.Color(0, 0, 0));
        lblFLC.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        lblFLC.setForeground(new java.awt.Color(255, 255, 255));
        lblFLC.setText("FELICITACIONES");

        lblParaReiniciar.setBackground(new java.awt.Color(0, 0, 0));
        lblParaReiniciar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblParaReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        lblParaReiniciar.setText("Presiones X para reiniciar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(corazon, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(lblAlien1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80)
                                            .addComponent(lblAlien2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(85, 85, 85)
                                            .addComponent(lblAlien3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAlien7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80)
                                            .addComponent(lblAlien5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(85, 85, 85)
                                            .addComponent(lblAlien6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(81, 81, 81)
                                            .addComponent(lblAlien8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(49, 49, 49))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblAlien4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addComponent(lblAlien11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)
                                    .addComponent(lblAlien9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(lblAlien10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(81, 81, 81)
                                    .addComponent(lblAlien12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lblGO, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addComponent(lblPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblParaReiniciar)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFLC, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblParamax)
                        .addGap(194, 194, 194))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(corazon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPuntos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlien1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlien7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlien11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblFLC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblParamax)
                .addGap(18, 18, 18)
                .addComponent(lblGO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblParaReiniciar)
                .addGap(12, 12, 12)
                .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel corazon;
    private javax.swing.JLabel lblAlien1;
    private javax.swing.JLabel lblAlien10;
    private javax.swing.JLabel lblAlien11;
    private javax.swing.JLabel lblAlien12;
    private javax.swing.JLabel lblAlien2;
    private javax.swing.JLabel lblAlien3;
    private javax.swing.JLabel lblAlien4;
    private javax.swing.JLabel lblAlien5;
    private javax.swing.JLabel lblAlien6;
    private javax.swing.JLabel lblAlien7;
    private javax.swing.JLabel lblAlien8;
    private javax.swing.JLabel lblAlien9;
    private javax.swing.JLabel lblFLC;
    private javax.swing.JLabel lblGO;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblParaReiniciar;
    private javax.swing.JLabel lblParamax;
    private javax.swing.JLabel lblPuntos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            //case 'w':
            //    lblJugador.setLocation(lblJugador.getX(),lblJugador.getY()-10);
            //    break;
            //case 's':
            //    lblJugador.setLocation(lblJugador.getX(),lblJugador.getY()+10);
            //    break;
            case 'a':
                lblJugador.setLocation(lblJugador.getX()-10,lblJugador.getY());
                break;
            case 'd':
                lblJugador.setLocation(lblJugador.getX()+10,lblJugador.getY());
                break;
            
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            
            /*
            case 38:
                lblJugador.setLocation(lblJugador.getX(),lblJugador.getY()-10);
                this.repaint();
                break;
            case 40:
                lblJugador.setLocation(lblJugador.getX(),lblJugador.getY()+10);
                break;
            */
            case 37:
                lblJugador.setLocation(lblJugador.getX()-10,lblJugador.getY());
                break;
            case 39:
                lblJugador.setLocation(lblJugador.getX()+10,lblJugador.getY());
                break;
            case 32://Este es espacio, osea el disparar
                //Se crea el panel
                Disparo disparo = new Disparo(CrearBala(lblJugador,1),this,1);
                disparo.start();
                break;
            //TRUCOS
            case 88://este es X
                if(key){
                    reiniciar(4);
                }
                break;
            case 49://este es 1 - inmunidad
                boolean estado = isPoderes();
                setPoderes(!estado);
                break;
            case 50://este es 2 - Disparo rapido
                
                break;
            //Reiniciar el juego - Game over
            case 82://este es r
                //Hace que se reinicie el juego
                corazon.setText("Vida ☻☻☻☻☻ ");
                setVidasJ(5);
                //Esto de abajo hace que se congele
                //this.frameInit();
                
            break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.print("La tecla presionada es : " + e.getKeyChar()+"   |    ");
        System.out.println("El code de la tecla es : " + e.getKeyCode());
        
            
    }
    
    
    
    public void juegoCompletado(){
        //Mostramos las felicitaciones y el puntaje obtenido
        
        setKey(true);
        this.lblFLC.setVisible(true);
        this.lblParamax.setText("Max Puntaje : " + this.getPuntaje());
        this.lblParamax.setVisible(true);
        this.lblParaReiniciar.setVisible(true);
        
        this.lblPuntos.setVisible(false);
        this.frameInit();
        
    }
    
    public void ActivarRepetirjuego(){
        this.setKey(true);
    }
    public void GameOver(){
        //quitamos la vida restante
        String vidas = this.corazon.getText();
        this.corazon.setText(vidas.substring(0, vidas.length()-1 ));
        //pausamos
        
        ActivarRepetirjuego();
        //Mostramos el mensaje de game over
        lblGO.setVisible(true);
        lblParamax.setVisible(true);
        //Mostramos la musica game over
        
        //Señalamos r para que se reinicie el contador
    }
    
    public void reiniciar(int vidasJ) {
        // Cerrar el JFrame actual
        
        this.dispose();

        // Crear un nuevo JFrame
        EspacioTablero nuevoTablero = new EspacioTablero();
        
        nuevoTablero.setVidasJ(vidasJ) ;
        String vidas = this.corazon.getText();
        int puntosAnteriores = this.getPuntaje();
        if(vidasJ == 4){
            vidas = "Vida ☻☻☻☻☻ ";
            puntosAnteriores = 0;
            nuevoTablero.setKey(false);
        }
        nuevoTablero.setPuntaje(puntosAnteriores);
        nuevoTablero.ActualizarPuntaje();
        nuevoTablero.corazon.setText(vidas.substring(0, vidas.length()-1 ));
    }
    

    public JLabel CrearBala(JLabel entidad,int direccion){
        JLabel bala = new JLabel("");
        int x =10, y=10;
        if(direccion == 1) y=-y;
        else if (direccion == 2) y = 30;
        
        
        
        //Creamos la bala segun el mounstro
        //java.awt.Color(0, 204, 0)
        if(entidad.getBackground().equals(java.awt.Color.GREEN)){
            x = 0;
            int posx = entidad.getX() + x;
            int posy = entidad.getY() + y;
            
            //Si es igual a verde hacer
            bala.setBounds(posx, posy, 30, 10);
        }
        else{
            int posx = entidad.getX() + x;
            int posy = entidad.getY() + y;
            
            bala.setBounds(posx, posy, 10, 10);
        }
        
        
        
        bala.setBackground(Color.WHITE);
        bala.setOpaque(true);
        this.add(bala);
        
        this.repaint();
        return bala;
    }
    
    
    //este label indicara si hay colision con cualquier otro lbl
    //tambien eliminara el lbl con el que colisiona, solo si es true
    
    int cont=0;
    public boolean ColisionEliminarNave(JLabel entidad, int vida, JLabel bala){
        //Selecionamos vida
        //Si vienen aqui es por que si chocan
        Rectangle area = bala.getBounds();
        
        if(entidad.getBounds().intersects(area)){
            bala.setBackground(Color.BLACK);
            cont++;
            //Aqui entrara solo si es el jugador
            if(vida == 1 ){
                //Borramos la nave
                entidad.setBounds(0, -100, 0, 0);
                //pausamosd
                if(vidasJ == 0){
                    GameOver();
                    System.out.println("JAJAJ LOSER"); 
                }
                else{
                    reiniciar(vidasJ-1);
                    
                }
                
                //this.frameInit();
                //quitamos una vida
                
            }
            else if(cont > vida){
                if(vida ==10) puntaje += 50; //sumamos 50 al puntaje
                else if (vida == 75) puntaje += 100;
                else if (vida == 150) puntaje += 250;
                ActualizarPuntaje();
                
                //si le damos 20 disparos, lo movemos
                entidad.setBounds(0, -100, 0, 0);
                entidad.setBackground(Color.YELLOW);
                entidad.setOpaque(true);
                //Si lo movimos es porque murio- restamos un enemigo menos
                cant_enemigos--;
                //remove(entidad);
                cont=0;
            }
            return true;
        }
        return false;
        
        
    }
    
    public void ActualizarPuntaje(){
        String comple = "000";
        if(puntaje > 49) comple = "00";
        else if(puntaje > 99) comple = "0";
        else if (puntaje > 999) comple = "";
        lblPuntos.setText("Puntos " + comple + puntaje);
    } 
    
    public boolean Colision(JLabel bala){
        
        //verificamos si colisiona con uno de las naves
        //Rojas
        if(ColisionEliminarNave(lblAlien1, 150, bala)) return true;
        else if(ColisionEliminarNave(lblAlien2, 150, bala)) return true;
        else if(ColisionEliminarNave(lblAlien3, 150, bala)) return true;
        
        //Naranjas
        else if(ColisionEliminarNave(lblAlien5, 75, bala)) return true;
        else if(ColisionEliminarNave(lblAlien6, 75, bala)) return true;
        else if(ColisionEliminarNave(lblAlien7, 75, bala)) return true;
        else if(ColisionEliminarNave(lblAlien8, 75, bala)) return true;
        
        //Verdes
        else if(ColisionEliminarNave(lblAlien4, 10, bala)) return true;
        else if(ColisionEliminarNave(lblAlien9, 10, bala)) return true;
        else if(ColisionEliminarNave(lblAlien10, 10, bala)) return true;
        else if(ColisionEliminarNave(lblAlien11, 10, bala)) return true;
        else if(ColisionEliminarNave(lblAlien12, 10, bala)) return true;
        
        //jugador
        if(!poderes){
            if(ColisionEliminarNave(lblJugador, 1, bala)) return true;
        }
        
        
        return false;
        
    }
      
    
    
    public void MoverAliens(){
        MovAlien mov = new MovAlien(lblAlien1,this);
        MovAlien mov2 = new MovAlien(lblAlien2,this);
        MovAlien mov3 = new MovAlien(lblAlien3,this);
        MovAlien mov4 = new MovAlien(lblAlien4,this);
        MovAlien mov5 = new MovAlien(lblAlien5,this);
        MovAlien mov6 = new MovAlien(lblAlien6,this);
        MovAlien mov7 = new MovAlien(lblAlien7,this);
        MovAlien mov8 = new MovAlien(lblAlien8,this);
        MovAlien mov9 = new MovAlien(lblAlien9,this);
        MovAlien mov10 = new MovAlien(lblAlien10,this);
        MovAlien mov11 = new MovAlien(lblAlien11,this);
        MovAlien mov12 = new MovAlien(lblAlien12,this);
        mov.start();
        mov2.start();
        mov3.start();
        mov4.start();
        mov5.start();
        mov6.start();
        mov7.start();
        mov8.start();
        mov9.start();
        mov10.start();
        mov11.start();
        mov12.start();
        
        
        
    }
    public void AliensBalas(){
        
        Disparo disparo1 = new Disparo(CrearBala(lblAlien5,2),this,2);
        disparo1.start();
        
        Disparo disparo2 = new Disparo(CrearBala(lblAlien6,2),this,2);
        disparo2.start();

        Disparo disparo3 = new Disparo(CrearBala(lblAlien7,2),this,2);
        disparo3.start();
        
        Disparo disparo4 = new Disparo(CrearBala(lblAlien8,2),this,2);     
        disparo4.start();
        
        
        Disparo disparoA = new Disparo(CrearBala(lblAlien4,2),this,2);     
        disparoA.start();
        Disparo disparoB = new Disparo(CrearBala(lblAlien9,2),this,2);     
        disparoB.start();
        Disparo disparoC = new Disparo(CrearBala(lblAlien10,2),this,2);     
        disparoC.start();
        Disparo disparoD = new Disparo(CrearBala(lblAlien11,2),this,2);     
        disparoD.start();
        Disparo disparoE = new Disparo(CrearBala(lblAlien12,2),this,2);     
        disparoE.start();
    }
}
