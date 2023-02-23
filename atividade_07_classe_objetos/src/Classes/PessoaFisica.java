package Classes;

public class PessoaFisica extends ContaCliente {
			private String estadoCivil;
			private int CPF;
			
			public PessoaFisica(String name, int age, String sex, int id, String city, String estadoCivil, int cPF) {
				super(name, age, sex, id, city);
				this.estadoCivil = estadoCivil;
				CPF = cPF;
			}

			public String getEstadoCivil() {
				return estadoCivil;
			}

			public void setEstadoCivil(String estadoCivil) {
				this.estadoCivil = estadoCivil;
			}

			public int getCPF() {
				return CPF;
			}

			public void setCPF(int cPF) {
				CPF = cPF;
			}
			
			public void toView() {
				super.toView();
				System.out.println("\n\nPESSOA FÍSICA");
				System.out.println("\nEstado Civil: " + this.estadoCivil);
				System.out.println("\nCPF: " + this.CPF);
			}
}
