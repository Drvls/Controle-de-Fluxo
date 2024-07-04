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
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            int parametro = primeiroParametro - segundoParametro;

            for(int i = 0; i < parametro ; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
        
    }
}