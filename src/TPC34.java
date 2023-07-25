import java.util.Locale;

public class TPC34 {
    public static void main(String[] args) {
        //String
        String str = new String("APPLE");
        String s = str.toLowerCase();
        System.out.println(s); //apple
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.indexOf("PL"));
        System.out.println(str.indexOf("PX")); //-1
        System.out.println(str.replace("P","x")); // A XXLE
    }
}
