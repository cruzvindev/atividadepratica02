package atividadepratica02;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		emprestimo emp  = new emprestimo();
		
		System.out.println("Digite sua idade: ");
	
		emp.idade = sc.nextInt();
		
		System.out.println("Qual o seu nome ? ");
		emp.nomeUsuario = sc.next();
		
		System.out.println("Qual o valor do emprestimo ? ");
		emp.valorEmprestimo = sc.nextDouble();
		
		System.out.println("Qual o percentual de juros ?");
		emp.percentualJurosMes = sc.nextDouble();
		
		System.out.println("Quantos meses ser?o necess?rios para pagar ? ");
		emp.mesesParaPagar = sc.nextInt();
		
		
		emp.imprimir();
		emp.calcularEmprestimo();
		

	}

}
