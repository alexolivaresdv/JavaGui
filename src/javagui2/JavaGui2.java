/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui2;
//Paso 8 - Importar la clase con la ventana 
import Interfaces.MiVentana2;//Import paquete.clase
import javax.swing.JFrame;

/**
 *
 * @author LAB17
 */
public class JavaGui2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //PAso 9 - LLamado a la clase 
       MiVentana2 ventana = new MiVentana2();//Creo un objeto MiVentana2
       ventana.setVisible(true);
       ventana.setBounds(0, 0, 600, 600);
       //La siguiente inst. le pone titulo a la ventana
       ventana.setTitle("Mi primera aplicacion con ventana");
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
