import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    System.out.print("Digite o primeiro nuemro : "); 
     Scanner sc = new Scanner(System.in);
     int number1 = sc.nextInt();
     System.out.println();
     System.out.print("Digite o segundo numero : ");
     int number2 = sc.nextInt();
     int soma = number1 + number2;
     System.out.println();
     sc.close();
            
     System.out.println("A soma dos numeros é " + soma ); 
            
    }
}
