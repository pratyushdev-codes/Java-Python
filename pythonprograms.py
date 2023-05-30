import java.util.*;

public class second {
    public static void main(String args[]) {
        try {
            Float El = new Float("3.0");
            int x = El.intValue();
            byte B = El.byteValue();
            System.out.println(x + " " + B);
        } catch (NumberFormatException e) {
            System.out.println("Bad number: " + e.getMessage()); 
        }
        


        }

    }

