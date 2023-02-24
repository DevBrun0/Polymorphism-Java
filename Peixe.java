package polimorfismo.animais;

public class Peixe extends Animal {
	 private String corEscama ;

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Minhoca");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Glub.. Glub");
		
	}
	public void soltandoBolhas() {
		System.out.println("Soltando Bolhas");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
