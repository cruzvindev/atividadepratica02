package atividadepratica02;
import java.util.Scanner;
public class emprestimo {
	

	
	String nomeUsuario;
	int idade;
	double valorEmprestimo;
	double percentualJurosMes;
	int mesesParaPagar;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	public void imprimir() {
		System.out.println("O seu nome ?: " + nomeUsuario);
		System.out.println("Sua idade ?: " + idade);
		System.out.println("O valor do seu emprestimo ?: " + valorEmprestimo+"R$");
		System.out.println("O seu percentual de juros ?: " + percentualJurosMes +"%");
		System.out.println("Voc? tem " + mesesParaPagar + " meses para pagar");
	}
	
		public void calcularEmprestimo(){
		if(idade>=18 && idade<23) {
			
			valorEmprestimo += (valorEmprestimo / mesesParaPagar) * percentualJurosMes;
			System.out.println("O valor do emprestimo ficara em: " + valorEmprestimo+"R$");
		} 
			if(idade>23 && idade <= 33){
			valorEmprestimo = (valorEmprestimo * 10)/100;
			System.out.println("O valor do emprestimo ficara em: " + valorEmprestimo+"R$");
			}
		}
		
		
	}



	


