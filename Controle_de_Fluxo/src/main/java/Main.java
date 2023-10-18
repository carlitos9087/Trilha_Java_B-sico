import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        
        int parametroUm = terminal.nextInt();;
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
            try {//chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            }catch (Exception exception) {//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("Numeros validos");
            }
        
    }
    
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        
        int contagem = parametroDois - parametroUm;
        
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("Informe numeros valido");
        }
        else {
            
            //realizar o for para imprimir os números com base na variável contagem
            
            for(int i = 0 ; contagem > i; i++){
                System.out.println(parametroUm + i);
            }
        }
    }

}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

