package Day13Assignmnet;

public class Generics {
        //compareTo method for Checking Maximum from 3 Integer Object
        public static Integer compareTo(Integer a,Integer b,Integer c) {
            if(a > b){
                if(a > c) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if(b > c) {
                    return b;
                } else {
                    return c;
                }
            }
        }

        public static void main(String[] args) {

            System.out.println("Welcome to Java Core - Generics Test Maximum.");

            System.out.println("Maximum from 3 Integer Object : "+compareTo(90,120,20));
        }
    }