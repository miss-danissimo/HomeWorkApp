public class Lesson_01 {


    public static void main(String[] args) {
        printTreeWord();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printTreeWord() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign () {
        int a = 7;
        int b = 4;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor () {
        int value = 48;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value < 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 40;
        if (a >= b) {
            System.out.println("a >= b");
        }else if (a < b){
            System.out.println("a < b");
        }
    }
}
