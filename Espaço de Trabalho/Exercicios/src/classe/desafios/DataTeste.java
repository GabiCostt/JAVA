package classe.desafios;

public class DataTeste {
	public static void main(String[] args) {
		Data date = new Data();
		date.day = 04;
		date.month = 05;
		date.year = 2004;
		System.out.println(date.DataFormatada());
		
		Data date2 = new Data();
		System.out.println(date2.DataFormatada());
		
		Data date3 = new Data(18, 8, 1978);
		System.out.println(date3.DataFormatada());
	}
}
