package aula_07_interface;

public class TestaAtleta {

	public static void main(String[] args) {
		
		Triatleta at1 = new Triatleta("Luan");
		
		Triatleta at2 = new Triatleta("Wallace");
		
		at1.aquecer();
		at1.correr();
		
		at2.aquecer();
		at2.pedalar();
		at2.nadar();
	}

}
