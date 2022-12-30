public class MyClass {
    
    public static void main (String [] args ) {
        String firstName = "Eduardo";
        String secondName = "Silva";

        String fullName = fullName (firstName, secondName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String secondName){
        return "Method Result: " + firstName.concat(" ").concat(secondName);
    }
    

}
