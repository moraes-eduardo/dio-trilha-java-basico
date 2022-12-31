public class App {
    public static void main(String[] args) throws Exception {
        
        // Relacionais
        System.out.println("1 é igual a 2 ? " + (1 == 2));
        System.out.println("4 é diferente de 5 ? " + (4 != 5));
        System.out.println("2 é maior que 5 ? " + (2 > 5));
        System.out.println(6 >= 6);
        System.out.println(5 < 2);
        System.out.println(2 <= 2);

        // Lógicos
        System.out.println("---------------");
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b2 || b3);
        System.out.println(b2 || b4);
        System.out.println(b1 ^ b3);
        System.out.println(b4 ^ b1);
        System.out.println(!b1);
        System.out.println(!b2);        

        // Controle de fluxo
        //

    }
}
