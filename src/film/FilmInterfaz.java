/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
/**
 *
 * @author 57311
 */
public class FilmInterfaz extends JFrame implements ActionListener {
    
    //rrayList 
    
    //Pelicula pelicula = new Pelicula();
    JFrame ventana1 = new JFrame();
    //ventana1.setVisible(ture);
    JPanel panelp, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel titulo, l0, l1, l2, l3, l4, l5, l6, l7, l8, l9;
    
    public FilmInterfaz() {
        
        CineFilm pelicula1 = new CineFilm("Avengers Endgame", "Anthony Russo, Joe Russo", 2019, "Después de la devastadora lucha contra Thanos, el universo queda en ruinas. Con la ayuda de los aliados restantes, los Vengadores se juntan una vez más para intentar revertir las acciones de Thanos y restaurar el balance al universo."); 
        CineFilm pelicula2 = new CineFilm("Frozen II", "Chris Buck, Jennifer Lee", 2019, "Anna, Elsa, Kristoff, Olaf y Sven dejan Arendelle para viajar hasta el antiguo y otoñal bosque de una tierra encantada. Están dispuestos a encontrar el origen de los poderes de Elsa para salvar su reino."); 
        CineFilm pelicula3 = new CineFilm("Deadpool 2", "David Leitch", 2018, "El mercenario mutante Wade Wilson, conocido como Deadpool, reúne a un equipo de mutantes para proteger a un niño con habilidades sobrenaturales del brutal cyborg y viajero del tiempo, Cable."); 
        CineFilm pelicula4 = new CineFilm("Triple Amenaza", "Jesse V. Johnson", 2019, "Un equipo de mercenarios intentará detener a un grupo de sicarios profesionales antes de que acaben con su objetivo: la hija de un multimillonario, con la intención de terminar con un sindicato criminal."); 
        CineFilm pelicula5 = new CineFilm("Sherlock Holmes", "Guy Ritchie", 2009, "Tras una serie de brutales crímenes rituales, Holmes y Watson llegan a tiempo para salvar a la última víctima y descubrir al asesino: Lord Blackwood. Cuando se acerca el momento de su ejecución en la horca, Blackwood advierte a Holmes de que la muerte no le importa y que, de hecho, la ejecución coincide con sus planes. Y cuando, según todos los indicios, Blackwood lleva a cabo su promesa, su aparente resurrección siembra el pánico en Londres y desconcierta a Scotland Yard. Pero para Holmes, el juego está en marcha."); 
        CineFilm pelicula6 = new CineFilm("1917", "Sam Mendes", 2019, "6 de abril de 1917. Mientras un regimiento se alista para adentrarse en territorio enemigo, dos soldados reciben la tarea de correr contra el tiempo para entregar un mensaje que evitará que 1600 hombres caminen directo hacia una trampa mortal."); 
        CineFilm pelicula7 = new CineFilm("El Faro", "Robert Eggers", 2019, "Dos hombres que trabajan en un remoto faro intentan mantenerse cuerdos mientras viven en una alejada y misteriosa isla de Nueva Inglaterra en la década de 1890."); 
        CineFilm pelicula8 = new CineFilm("Presencias del Mal", "Floria Sigismondi", 2020, "Una joven es contratada como tutora privada de una acaudalada joven heredera que atestiguó la trágica muerte de sus padres y de su hermano que acaba de regresar del internado. La tutora tiene inexplicables experiencias en la casa y comienza a sospechar que hay más en su historia. Basada en la novela de Henry James, La vuelta de tuerca."); 
        CineFilm pelicula9 = new CineFilm("Bad Boys For Life", "Adil El Arbi, Bilall Fallah", 2020, "Marcus y Mike deben confrontar cambios de carrera y crisis de edad media, cuando se unen a un equipo de élite recién creado del departamento de policía de Miami para capturar al implacable Armando Armas, líder de un cartel de drogas."); 
        CineFilm pelicula10 = new CineFilm("Room", "Christian Volckman", 2019, "Matt y Kate compran una casa alejada. Mientras se mudan, descubren un extraño cuarto que les concede ilimitados deseos materiales. Pero como Kate ya tuvo dos abortos espontáneos, lo que ellos más sienten que les falta es un hijo"); 

        ArrayList <CineFilm> lista = new ArrayList<>();
        
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(pelicula3);
        lista.add(pelicula4);
        lista.add(pelicula5);
        lista.add(pelicula6);
        lista.add(pelicula7);
        lista.add(pelicula8);
        lista.add(pelicula9);
        lista.add(pelicula10);
        
        //panelp = new JPanel();
        setBounds(200, 200, 900, 566);
        setLayout(new FlowLayout());
        //setLayout(new BorderLayout());
        
        JLabel titulo = new JLabel("Películas en cartelera: ");
        //panelp.add(titulo);
        
        p0 = new JPanel();
        p0.setBounds(100, 100, 100, 158);
        p0.setBackground(Color.blue);
        l0 = new JLabel();
        l0.setSize(81, 120);
        l0.setIcon(new ImageIcon("ae.jpg"));
        b0 = new JButton("Más info");
        b0.setSize(27, 9);
        b0.setActionCommand("Botón 1");
        p0.add(l0);
        p0.add(b0);
        panelp.add(p0);
        
        p1 = new JPanel();
        p1.setSize(100, 158);
        l1 = new JLabel();
        l1.setSize(81, 120);
        l1.setIcon(new ImageIcon("fi.jpg"));
        b1 = new JButton("Más info");
        b1.setSize(27, 9);
        b1.setActionCommand("Botón 2");
        p1.add(l0);
        p1.add(b0);
        panelp.add(p1);
        
        p2 = new JPanel();
        p2.setSize(100, 158);
        l2 = new JLabel();
        l2.setSize(81, 120);
        l2.setIcon(new ImageIcon("dp2.jpg"));
        b2 = new JButton("Más info");
        b2.setSize(27, 9);
        b2.setActionCommand("Botón 3");
        p2.add(l0);
        p2.add(b0);
        panelp.add(p2);
        
        p3 = new JPanel();
        p3.setSize(100, 158);
        l3 = new JLabel();
        l3.setSize(81, 120);
        l3.setIcon(new ImageIcon("tt.jpg"));
        b3 = new JButton("Más info");
        b3.setSize(27, 9);
        b3.setActionCommand("Botón 4");
        p3.add(l0);
        p3.add(b0);
        panelp.add(p3);
        
        p4 = new JPanel();
        p4.setSize(100, 158);
        l4 = new JLabel();
        l4.setSize(81, 120);
        l4.setIcon(new ImageIcon("sh.jpg"));
        b4 = new JButton("Más info");
        b4.setSize(27, 9);
        b4.setActionCommand("Botón 5");
        p4.add(l0);
        p4.add(b0);
        panelp.add(p4); 
        
        p5 = new JPanel();
        p5.setSize(100, 158);
        l5 = new JLabel();
        l5.setSize(81, 120);
        l5.setIcon(new ImageIcon("1917.jpg"));
        b5 = new JButton("Más info");
        b5.setSize(27, 9);
        b5.setActionCommand("Botón 6");
        p5.add(l0);
        p5.add(b0);
        panelp.add(p5);
        
        p6= new JPanel();
        p6.setSize(100, 158);
        l6= new JLabel();
        l6.setSize(81, 120);
        l6.setIcon(new ImageIcon("ef.jpg"));
        b6 = new JButton("Más info");
        b6.setSize(27, 9);
        b6.setActionCommand("Botón 7");
        p6.add(l0);
        p6.add(b0);
        panelp.add(p6);
        
        p7 = new JPanel();
        p7.setSize(100, 158);
        l7 = new JLabel();
        l7.setSize(81, 120);
        l7.setIcon(new ImageIcon("pm.jpg"));
        b7 = new JButton("Más info");
        b7.setSize(27, 9);
        b7.setActionCommand("Botón 8");
        p7.add(l0);
        p7.add(b0);
        panelp.add(p7);
        
        p8= new JPanel();
        p8.setSize(100, 158);
        l8= new JLabel();
        l8.setSize(81, 120);
        l8.setIcon(new ImageIcon("bd4.jpeg"));
        b8 = new JButton("Más info");
        b8.setSize(27, 9);
        b8.setActionCommand("Botón 9");
        p8.add(l0);
        p8.add(b0);
        panelp.add(p8);
        
        p9 = new JPanel();
        p9.setSize(100, 158);
        l9 = new JLabel();
        l9.setSize(81, 120);
        l9.setIcon(new ImageIcon("room.jpg"));
        b9 = new JButton("Más info");
        b9.setSize(27, 9);
        b9.setActionCommand("Botón 10");
        p9.add(l0);
        p9.add(b0);
        panelp.add(p9);
        
        setVisible(true);
    }
    
    
    
    
    
@Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Botón 1")){
            //JFrame = ventana1;
            //System.out.println(b0);
        }
        if (ae.getActionCommand().equals("Botón 2")){
            //System.out.println(b1);
        }
        if (ae.getActionCommand().equals("Botón 1")){
            //System.out.println(b2);
        }
        if (ae.getActionCommand().equals("Botón 2")){
            //System.out.println(b3);
        }
        if (ae.getActionCommand().equals("Botón 1")){
            //System.out.println(b4);
        }
        if (ae.getActionCommand().equals("Botón 2")){
            //System.out.println(b5);
        }
        if (ae.getActionCommand().equals("Botón 1")){
            //System.out.println(b6);
        }
        if (ae.getActionCommand().equals("Botón 2")){
            //System.out.println(b7);
        }
        if (ae.getActionCommand().equals("Botón 1")){
            //System.out.println(b8);
        }
        if (ae.getActionCommand().equals("Botón 2")){
            //System.out.println(b9);
        }
        
    }
    
}
