public class Exercicio_2_B {
	public static void main(String[] args) {
		int x = 5;
		while(x>1) {
			x = x-1;
			System.out.println("X agora é: " + x);
			if(x<3) {
				System.out.println("Small x");
			}
		}
	}
}