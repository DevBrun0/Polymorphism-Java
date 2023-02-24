package polimorfismo.animais;

import javax.swing.*;

public class Polimorfismo {

public static void Cachorro() {
	Cachorro c = new Cachorro();
	
	c.emitirSom();
	c.interagir(JOptionPane.showInputDialog(null, "Diga oi para o cachorrinho"));
	c.reagir(true);
	
}

public static void Nemo() {
	Nemo n = new Nemo();
	
	n.emitirSom();
	n.alimentar(JOptionPane.showInputDialog(null, "Deseja jogar comida para o Nemo?"));
	n.reagir(true);
	int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade do Nemo?"));
	n.saude(idade);
}

public static void Vaca() {
	Vaca v = new Vaca();
	
	v.emitirSom();
	v.interagir(JOptionPane.showInputDialog(null, "Deseja jogar comida para a vaca?"));
	v.cuidador(true);
	int condicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o peso da Vaca?"));
	v.saude(condicao);
}


	public static void main(String[] args) {
		
		String pergunta = JOptionPane.showInputDialog(null, "-----Qual animal deseja selecionar?------" 
															+ "\n-Cachorro"
															+ "\n-Nemo"
															+ "\n-Vaca");
		
		switch (pergunta) {
			
		case "Cachorro":
			Cachorro();
			break;
			
		case "Nemo":
			Nemo();
			break;
			
		case "Vaca":
			Vaca();
			break;
			}
	}

}
