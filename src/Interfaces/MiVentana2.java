/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
//Paso 1 - importamos las librerias.
import java.awt.Color;
import javax.swing.*;//Inportamos todo de swing 
/*import java.awt.*;//Libreria grafica del SO(Sistema operativo)
import javax.swing.JButton;//Inportamos uno por uno de swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;*/

/**
 *
 * @author LAB17
 */
//paso 2 - Heredar la clase desde JFrame
public class MiVentana2 extends JFrame
{
    //Paso 3 - Declarar elementos a utilizar 
    
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;   
    
    //Paso 4 - definir el constructor 
    public MiVentana2()
    {
        //Paso 5 - crear e inicializar los objetos 
        panel = new JPanel();//Creo un objeto tipo JPanel 
        label = new JLabel();
        text = new JTextField(25);//25 son las cantidad de caracteres 
        boton = new JButton();
        
        //Paso 6 -  Agregar los elementos JFrame
        this.add(panel);//Recomendable agregar al JPanel al JFrame
        panel.add(label);//Agregamos los elementos al JPanel
        panel.add(text);
        panel.add(boton);
        
         //paso 7 - propiedades de los objetos 
         label.setText("Nombre");
         boton.setText("Enviar");
         panel.setBackground(Color.red);//Color de fondo de JPanel
    }
}
