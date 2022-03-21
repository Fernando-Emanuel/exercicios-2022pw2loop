public class Exercicio1 {
    public static void main(String[] args) {
        //Percorre os número de 1 á 500
        int soma = 0;
        for(int num = 1;num <= 500;num++) {
            //Verificar se o número é ímpar
            if((num % 2) != 0) {
                if((num % 3) == 0) {
                soma += num;
            }
        }
      }
    }
}
System.out.println(soma);
