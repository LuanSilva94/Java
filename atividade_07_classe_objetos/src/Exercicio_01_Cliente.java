
import Classes.PessoaFisica;
import Classes.PessoaJuridica;

public class Exercicio_01_Cliente {

	public static void main(String[] args) {
	
		
		PessoaFisica PF1 = new PessoaFisica("Luan Silva", 28, "Male",12365782,"Osasco","Solteiro",1565456874);
		PessoaFisica PF2 = new PessoaFisica("Carolina Silva", 26, "Female",46545646,"São Paulo","Solteira",1234893782);
		
		PF1.toView();
		PF2.toView();
		
		PessoaJuridica PJ1 = new PessoaJuridica("Michael Jordan", 60, "Male",589651237,"Chicago",45678213);
		PessoaJuridica PJ2 = new PessoaJuridica("Larry Bird", 66, "Male",215511497,"Boston",98745632);
		
		PJ1.toView();
		PJ2.toView();
			
		
	}

}
