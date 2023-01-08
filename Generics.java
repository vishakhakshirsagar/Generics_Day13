package Day13Assignmnet;

public class Generics {
        //compareTo method for Checking Maximum from 3 Integer Object
        public <T extends Comparable<T>> T compareTo(T a, T b, T c) {
            if (a.compareTo(b) > 0) {
                if (a.compareTo(c) > 0) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if (b.compareTo(c) > 0) {
                    return b;
                } else {
                    return c;
                }
            }
        }

        public static void main(String[] args) {

            System.out.println("Welcome to Java Core - Generics Test Maximum.");
            //Creating Generic Integer Object for Integer Comparison
            Generics integerComparison = new Generics();
            System.out.println("Maximum from 3 Integer Object : " + integerComparison.compareTo(90, 120, 190));
            //Creating Generic Float Object for Float Comparison
            Generics floatComparison = new Generics();
            System.out.println("Maximum from 3 Float Object : " + floatComparison.compareTo(90.0F, 120.0F, 190.0F));
            //Creating Generic String Object for String Comparison
            Generics stringComparison = new Generics();
            System.out.println("Maximum from 3 String Object : " + stringComparison.compareTo("Apple", "Peach", "Banana"));
        }
    }