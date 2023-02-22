
import Classes.ContaCliente;

public class Exercicio_01_Cliente {

	public static void main(String[] args) {
		ContaCliente C1 = new ContaCliente("Luan Silva", 28, "Male",12365782,"Osasco");
		ContaCliente C2 = new ContaCliente("Aerys Targaryen", 40, "Male",5666782,"Valíria");
		
		C1.toView();
		C2.toView();
			
		
	}

}
