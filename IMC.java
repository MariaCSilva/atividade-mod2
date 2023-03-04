package atividadeSegundoModulo;

import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");        
        double altura = scanner.nextDouble();

        System.out.print("Informe a sua peso: ");    
        double peso = scanner.nextDouble();
        imc(peso, altura);
    }

    public static void imc(double peso, double altura){
        String classificacao;
        double imc = peso / (altura *altura);

        
        if(imc < 18.5 ){
            classificacao = "MAGREZA";
        }else{
            if(imc < 25){
                classificacao = "NORMAL"; 
            }else{
                if(imc < 30){
                    classificacao = "SOBREPESO";
                }else{
                    if(imc < 40){
                        classificacao = "OBESIDADE";
                    }else{
                        classificacao = "OBESIDADE GRAVE";
                    }

                }
            }
        }
       
        System.out.printf("Seu IMC: %.2f", imc);
        System.out.println(" Sua classificação é: "+classificacao);

    }

}
