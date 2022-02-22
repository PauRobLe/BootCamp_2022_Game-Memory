//Package
package Controlador;
//Imports
import java.awt.Color;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Inicio
public class ControladorMemory {
	//Filtro colores (A elejir y Descartar)
	Color[] colores = {Color.BLUE,Color.RED,Color.GREEN,Color.ORANGE,Color.YELLOW,Color.WHITE,Color.BLACK,Color.CYAN,Color.BLUE,Color.RED,Color.GREEN,Color.ORANGE,Color.YELLOW,Color.WHITE,Color.BLACK,Color.CYAN};
	Color[] descartado = (Color[]) colores.clone();

	//Asignar color a los botones
	private static void asignarcolor() {
		for (int i = 0; i < 8; i++) {
			Random rand = new Random();
		    colores[i].setDrawColor(new Color(Random.nextInt()));
		    
		    //Poner el color
		    I1.setBackground(rand);
		}	
	} //Final Bucle Colores
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   if(I1.background == I4.background) {
			   
            }
	
	}
}
//Final Codigo