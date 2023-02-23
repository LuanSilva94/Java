package aula_07_interface;

public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {
	// ele vai herdar a Classe Pessoa, e implementar os metodos das 3 Interfaces;
	
	// aparece Override pois os metodos serao sobreescritos
	
	public Triatleta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo");
		
	}

	@Override
	public void nadar() {
		System.out.println("Nadando");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo");
		
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando");
		
	}

	@Override
	public void cansou() {
		// TODO Auto-generated method stub
		
	}

	
	
}
