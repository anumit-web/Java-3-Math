/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode3.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode3
*/

// import

public class JavaCode3 {

    public static void main(String[] args) {
        System.out.println("Java Code 3");
        System.out.println("Java Math");
        System.out.println("");

        // find the highest value of x and y
        System.out.println(Math.max(5, 10));

        //  find the lowest value of x and y:
        System.out.println(Math.min(5, 10));

        // returns the square root of x
        System.out.println(Math.sqrt(64));

        // absolute (positive) value of x
        System.out.println(Math.abs(-4.7));

        // random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.random());
        System.out.println((int) (Math.random()*100));



    }
    
}