public class NullPointerDemo {

    public static void generateNullPointer() {
        String text = null;
        System.out.println(text.length()); // will throw exception
    }

    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generateNullPointer(); // will crash
        handleNullPointer(); // safe
    }
}
