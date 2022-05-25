package caixa.eletronica;
import java.util.Scanner; 
public class CaixaEletronica {
    public static void main(String[] args) {
        String CPFCorreto = "12345678900", CPF, senha, senhaCorreta = "01020304";
        int saque, saldo = 1000;
        int opçao = 0, depositar, saldoAlterado, saqueAlterado;
        
        Scanner ler = new Scanner(System.in);
        
        while(true){
        System.out.println("Bem-vindo ao Bank NNS");
        System.out.println();
        System.out.print("Digite o seu CPF: ");
        CPF = ler.next();
        
        if (!CPF.equals(CPFCorreto)){
            System.out.println("CPF INVÁLIDO!");
            break;
        } else {
            for (int i = 0; i <= 2; i++) {
                
                System.out.print("Digite a sua senha: ");
                senha = ler.next();
                
                if (senha.equals(senhaCorreta)){
                    
                    System.out.println("SENHA CORRETA.");
                    break;
                    
                } else if (!senha.equals(senhaCorreta)) {
                    
                    System.out.print("Senha incorreta, tente novemnete.");
                    
                } if (i==2){ //Quantidade de tentativas.
                    
                    System.out.println("ACESSO BLOQUEADO.");
                    System.exit(0);
                    
                }
            }
        } do {
           System.out.println("Escolha uma das opções: ");
                    System.out.println();
                    
                    System.out.println("Saldo: 1");
                    System.out.println("Depósito: 2 ");
                    System.out.println("Saque: 3");
                    System.out.println("Sair: 0");
                    System.out.println();
                    
                    System.out.print("Digite a sua opção: ");
                    opçao = ler.nextInt();  
                    
        } while (opçao > 4);
        
        switch(opçao){ //Opçãoes de operações.
            case 1:
                System.out.println("Saldo atual é R$ " + saldo);
                break; 
                
            case 2: 
                System.out.println("Saldo atual é R$ " + saldo);
                System.out.println();
                
                System.out.print("Qual o valor desejado para o depósito? ");
                depositar = ler.nextInt();
                System.out.println("O valor atual é de R$ " + (depositar + saldo));
                break; 
            
            case 3: 
                System.out.println("Saldo atual é R$ " + saldo);
                System.out.println();
                
                System.out.print("Quanto você deseja sacar? ");
                saque = ler.nextInt(); 
                System.out.println("O valor atual é de R$ " + (saldo - saque));
                break; 
                
            case 0: 
                System.exit(0);
                break; 
            default:
                System.out.println("Opção inválida");
                break;
        }
       
    }
        
  }
    
}


    

