package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		int f = 86;
		double c = (f - AJUSTE) * FATOR;
		
		System.out.println("°F convertido em °C = " + c);
	}
}

