package javaapplication25;
import java.util.Scanner; 
public class JavaApplication25 {
    public static void main(String[] args) {
        int idade, cont; 
        cont = 0; 
        Scanner ler; 
        
        ler = new Scanner (System.in); 
        
        for (int i = 1; 1 < 10; i++) {
            System.out.print("Digite uma idade: ");
            idade = ler.nextInt(); 
            
            if(idade >= 18) {
                cont = cont + 1;
            }
            System.out.println("A quantidade de pessoas maiores de idade é: " + cont);
        }
    }
    
}
