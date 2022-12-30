public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        // variáveis
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting

        int numero = 1;
        numero = 2;  // pode mudar a variável
        System.out.println(numero);


        // Constantes (nome em caixa alta)
        final double VALOR_DE_PI = 3.14; // final impede mudanças no valor
        System.out.println(VALOR_DE_PI);

        


    }
}
