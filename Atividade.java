package atividadeSegundoModulo;

import java.util.Scanner;

public class Atividade {
    
    public static void main(String[] args){
        int opcao;  
       do{
        menu();   
        Scanner scanner =  new Scanner(System.in);
        opcao = scanner.nextInt();
        processar(opcao);
       }while(opcao!=3);
    }

    public static void processar(int opcao){
        switch(opcao){
            case 1: {System.out.println("Opção 1 Foi escolhida"); break;}
            case 2: {System.out.println("Opção 2 Foi escolhida"); break;}
            case 3: {System.out.println("O programa foi encerrado"); break;}
            default: {System.out.println("Opção Inválida");}
        }

    }

    public static void menu(){
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("**                                      **");
        System.out.println("**          MENU                        **");
        System.out.println("**          1 - Opção 1                 **");
        System.out.println("**          2 - Opção 2                 **");
        System.out.println("**          3 - Sair                    **");
        System.out.println("**                                      **");
        System.out.println("**  Escolha uma opção para Prosseguir   **");        
        System.out.println("**                                      **");
        System.out.println("******************************************");
        System.out.println("******************************************");
    }
}
