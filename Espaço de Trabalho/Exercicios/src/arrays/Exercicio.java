package arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notaAluno = {5, 6.9, 9.1, 7.7};
		
		double total_notaAluno = 0;
		for(int i = 0; i < notaAluno.length; i++) {
			total_notaAluno += notaAluno[i];
			System.out.print(notaAluno[i]);
			
			if(i < 3) {
				System.out.print(" | ");
			}
		}
		double media_notaAluno = total_notaAluno / notaAluno.length;
		
		System.out.printf("\nA media do aluno eh de: %.1f\n", media_notaAluno);
		 
		//OU USAR FOREACH
		
		for(double notaAlunof: notaAluno) {
			System.out.print(notaAlunof + " | ");
			
		}
	}
}
