package classe.desafios;

public class Data {
	int day;
	int month;
	int year;
	
	Data() {
		day = 1;
		month = 1;
		year = 1970;
	}
	
	// day, month, year
	Data(int dayConst, int monthConst, int yearConst) {
		day = dayConst;
		month = monthConst;
		year = yearConst;
	}
	
	String DataFormatada () {
		return String.format("%d/%d/%d", day, month, year);
	}
}
