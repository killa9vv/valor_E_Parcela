//3- Construir um método que receba como parâmetros o valor de uma compra e a
//quantidade de parcelas e calcula e retorna o valor da parcela, sabendo que a loja
//acrescenta 5% de juros para as compras parceladas.
//No algoritmo principal, solicite para o usuário o valor de uma compra e a quantidade de
//parcelas e utilizando o método descrito acima, mostre o valor da parcela.
//Exercícios de fixação

package javaproj;
import java.util.Scanner;
import java.util.Locale;
public class ValorEParcelas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o valor da compra: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Digite a quantidade de parcelas: ");
		int quantidadeParcelas = sc.nextInt();
		
		double valorParcelas = Juros(valorCompra, quantidadeParcelas);
		
		System.out.printf("O valor das parcelas é: R$ %.2f\n", valorParcelas);
		
		sc.close();

	}
public static double Juros(double valorCompra, int quantidadeParcelas) {
	
	double valorTotalComJuros = valorCompra * 1.05;
	
	double valorParcela = valorTotalComJuros / quantidadeParcelas;
	
	return valorParcela;
	}
}
