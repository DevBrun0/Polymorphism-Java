package polimorfismo.animais;

import javax.swing.*;

public class Nemo extends Peixe {
	
	public void emitirSom() {
		System.out.println("Glub Glub");
	}
	
	public void alimentar(String acao) {
		   switch(acao) {
		   
		   case "Sim":   
			   JOptionPane.showMessageDialog(null, "Balançar nadadeira");
			   break;
			   
		   case "Não":
			   JOptionPane.showMessageDialog(null, "Se esconder no aquário");
		   }
			   
	   
	}
	
	public void reagir(boolean cuidador) {
		if (cuidador == true) {
			JOptionPane.showMessageDialog(null, "Brincar");
		} else
			JOptionPane.showMessageDialog(null, "Mudar coloração");
	}
	
	public void saude(int idade) {
		if (idade < 10) {
			JOptionPane.showMessageDialog(null, "Novo");
		}else if(idade > 18) {
			JOptionPane.showMessageDialog(null, "O peixe está morto");
		}else {
			JOptionPane.showMessageDialog(null, "Jovem");
		}
		
	}
}
