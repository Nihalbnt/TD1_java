public class Age {
    public static void main (String args[]) {
        age (17);
    }
    public static void age (int number){
        if (number >= 18) {
            System.out.println("Vous etes majeur");
        }else{
            System.out.println("Vous n'etes pas majeur");
        }
    }
}