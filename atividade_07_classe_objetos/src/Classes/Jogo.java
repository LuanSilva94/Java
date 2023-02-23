package Classes;

public class Jogo extends ClasseProduto{
		private String plataforma;
		private String desenvolvedora;
		
		
		public Jogo(String name, String category, float price, int amount, int launchYear, String plataforma,
				String desenvolvedora) {
			super(name, category, price, amount, launchYear);
			this.plataforma = plataforma;
			this.desenvolvedora = desenvolvedora;
		
		}


		public String getPlataforma() {
			return plataforma;
		}


		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}


		public String getDesenvolvedora() {
			return desenvolvedora;
		}


		public void setDesenvolvedora(String desenvolvedora) {
			this.desenvolvedora = desenvolvedora;
		}
		
		public void toView() {
		super.toView();
		System.out.println("\nPlataforma: " + this.plataforma);
		System.out.println("\nDesenvolvedora: " + this.desenvolvedora);
		}
}
