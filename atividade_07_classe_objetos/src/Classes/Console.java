package Classes;

public class Console extends ClasseProduto {
		private int numeroNucleos;
		private String Fabricante;
		public Console(String name, String category, float price, int amount, int launchYear, int numeroNucleos,
				String fabricante) {
			super(name, category, price, amount, launchYear);
			this.numeroNucleos = numeroNucleos;
			Fabricante = fabricante;
		}
		public int getNumeroNucleos() {
			return numeroNucleos;
		}
		public void setNumeroNucleos(int numeroNucleos) {
			this.numeroNucleos = numeroNucleos;
		}
		public String getFabricante() {
			return Fabricante;
		}
		public void setFabricante(String fabricante) {
			Fabricante = fabricante;
		}
		
		public void toView(){
			super.toView();
			System.out.println("\nNúmero de Nucleos: " + this.numeroNucleos);
			System.out.println("\nFabricante: " + this.Fabricante);
		}
}
