package Classes;

public class Perfumaria extends Farmacia {
			
		private String fragrancia;

		public Perfumaria(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
				int tipo, String fragrancia) {
			super(id, nome, nomeComercial, fabricante, foto, preco, tipo);
			this.fragrancia = fragrancia;
		}

		public String getFragrancia() {
			return fragrancia;
		}

		public void setFragrancia(String fragrancia) {
			this.fragrancia = fragrancia;
		}
		
		public void visualizar() {
			super.visualizar();
			System.out.println("Frangrância: " + this.fragrancia);
		}
		
		@Override
		public void reajuste(float percentual) {
			this.setPreco(this.getPreco() + (this.getPreco()* percentual));
		}
}
