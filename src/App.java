import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o Numero a ser multiplicado: ");
        int numero = entrada.nextInt();  
        entrada.close();
        System.out.println("Tabela de multiplicação de " + numero);
        for (int i = 1; i < 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }    
    }
}
