//Package
package Game_Memory.MemoryApp;
//Imports
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
//Inicio
public class App 
{
    public static void main( String[] args )
    {

    	//Creacion Pantalla
    	JFrame f = new JFrame("Flow Layout"); 
    	JPanel pantalla = new JPanel(new GridLayout(4,4));
    	
    	//Creacion Imagenes
    	JButton I1=new JButton("IMG1"); 
    	JButton I2=new JButton("IMG2"); 
    	JButton I3=new JButton("IMG3"); 
    	JButton I4=new JButton("IMG4"); 
    	JButton I5=new JButton("IMG5"); 
    	JButton I6=new JButton("IMG6");
    	JButton I7=new JButton("IMG7"); 
    	JButton I8=new JButton("IMG8"); 
    	JButton I9=new JButton("IMG9"); 
    	JButton I10=new JButton("IMG10");
    	JButton I11=new JButton("IMG11");
    	JButton I12=new JButton("IMG12");
    	JButton I13=new JButton("IMG13");
    	JButton I14=new JButton("IMG14");
    	JButton I15=new JButton("IMG15");
    	JButton I16=new JButton("IMG16");
    	
    	//Dimensiones
    	I1.setBounds(130,100,100, 40); 
    	
    	//Anadir Botones
    	pantalla.add(I1); 
    	pantalla.add(I2);
    	pantalla.add(I3);
    	pantalla.add(I4);
    	pantalla.add(I5);
    	pantalla.add(I6);
    	pantalla.add(I7);
    	pantalla.add(I8);
    	pantalla.add(I9);
    	pantalla.add(I10);
    	pantalla.add(I11);
    	pantalla.add(I12);
    	pantalla.add(I13);
    	pantalla.add(I14);
    	pantalla.add(I15);
    	pantalla.add(I16);
    	f.add(pantalla);
    	
    	//Distribucion Pantalla
    	f.setLayout(new FlowLayout());
        f.setSize(500,500);  
        f.setVisible(true); 
        
        
    }

}
//Final del Codigo