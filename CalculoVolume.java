package exercicios;

import javax.swing.JOptionPane;

public class CalculoVolume {

	private double base;
	private double altura;
	private double comprimento;
	
	
	 public void calculaVolume(){
		    
	        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da viga em metros: "));
	        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base da viga em metros: "));
	        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da viga em metros: "));
	           
	           double volume = (this.altura*this.base*this.comprimento);
	           
	           
	          JOptionPane.showMessageDialog(null, "O volume de concreto necess�rio para a viga � : " + volume +" m3" );
	    
	    }
	    
	}

