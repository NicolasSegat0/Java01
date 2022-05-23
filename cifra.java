package javaapplication57;
import java.util.Scanner; 
public class JavaApplication57 {
    public static void main(String[] args) {
        String texto, cifra = "", texto2, decifrar = "";
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Digite a sua mensagem: ");
        texto = ler.next(); 
        System.out.println();
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i); 
            int d = (int)c; 
            int numerica = d + ((45 - 25)/2);
            cifra += (char) numerica; 
            
        }
        
        System.out.println("A mensagem é: " + cifra);
        System.out.println();
        
        System.out.print("Agora digite o código: ");
        texto2 = ler.next(); 
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int d = (int)c; 
            int numerica = d - ((45 - 25)/2);
            decifrar += (char) numerica; 
        }
        System.out.println("A mensagem é: " + decifrar);
        
        
    }
    
}
