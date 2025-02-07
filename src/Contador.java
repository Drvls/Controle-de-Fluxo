import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro parametro");
        int primeiroParametro = sc.nextInt();
        
        System.out.println("Informe o segundo parametro");
        int segundoParametro = sc.nextInt();

        sc.close();
        try {   // validação
            if(primeiroParametro <= segundoParametro){
                contar(primeiroParametro, segundoParametro);
            } else{
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{ 
        int parametro = segundoParametro - primeiroParametro;
            
        for(int i = 1; i <= parametro ; i++){
            System.out.println("Imprimindo o número " + i);
        }
        
    }
}