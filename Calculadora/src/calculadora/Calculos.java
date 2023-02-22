package calculadora;

 public class Calculos {
	public static double soma(double num1, double num2) {
		System.out.print("A soma do número A + B é: ");
		return num1 + num2;
	}
	public static double subtracao(double num1, double num2) {
		System.out.print("A subtração do número A +-B é: ");
		return num1 - num2;
	}
	public static double multiplicacao(double num1, double num2) {
		System.out.print("A multiplicação do número A x B é: ");
		return num1 * num2;
	}
	public static double divisao(double num1, double num2) {
		System.out.print("A divisão do número A / B é: ");
		return num1 / num2;
	}
}
