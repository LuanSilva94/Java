package Classes;

public class PessoaJuridica extends ContaCliente {
		private int CNPJ;
		
		public PessoaJuridica(String name, int age, String sex, int id, String city, int cNPJ) {
			super(name, age, sex, id, city);
			CNPJ = cNPJ;
		}
		public int getCNPJ() {
			return CNPJ;
		}
		public void setCNPJ(int cNPJ) {
			CNPJ = cNPJ;
		}
		
		public void toView() {
			super.toView();
			System.out.println("\n\nPESSOA JURÍDICA");
			System.out.println("\nCNPJ: " + this.CNPJ);
			}
		
		
}
