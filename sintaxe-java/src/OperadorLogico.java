public class OperadorLogico {
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas são verdadeiras");
        } else {
            System.out.println("as duas são falsas");
        }

        if(condicao1 || condicao2){
            System.out.println("as duas são verdadeiras");
        } else {
            System.out.println("as duas são falsas");
        }
    }
}
