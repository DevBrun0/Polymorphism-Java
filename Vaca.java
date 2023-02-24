package polimorfismo.animais;

import javax.swing.JOptionPane;

public class Vaca extends Mamifero {
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null, "Muuuuu");
	}
	
	public void interagir(String frase) {
		   switch(frase) {
		   case "Sim":
			   JOptionPane.showMessageDialog(null, "Vaquinha feliz");
			   break;
		   case "Não":
			   JOptionPane.showMessageDialog(null, "Se fastar");
			   break;
		   }
	}
	
	public void cuidador(boolean dono) {
		if (dono == true) {
			JOptionPane.showMessageDialog(null, "Lamber dono");
		} else
			JOptionPane.showMessageDialog(null, "Atacar com o chifre");
	}
	
	public void saude( float peso) {
		if (peso > 150) {
			JOptionPane.showMessageDialog(null, "Vaquinha saudável");
		}else if (peso < 50){
			JOptionPane.showMessageDialog(null, "Vaquinha está morta");
		}else {
			JOptionPane.showMessageDialog(null, "Vaquinha doente");
		}
		
	}
		
	}

