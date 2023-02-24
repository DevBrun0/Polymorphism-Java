package polimorfismo.animais;

public class Aves extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		  	  System.out.println("Voando");
	     	
	}

	@Override
	public void alimentar() {
		 System.out.println("Alpiste");
		
	}

	@Override
	public void emitirSom() {
		 System.out.println("Piu.. piu..");
		
	}
	 public void  contruirNinho() {
   	  System.out.println("Contruindo Ninho");
     }
	

}
