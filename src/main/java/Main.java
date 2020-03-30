public class Main {
    public static void main(String[] args) {
        String_Calculator c = new String_Calculator();
        System.out.println("\n---------ADDITION----------\n");
        c.add("");
        c.add("1");
        c.add("1,1");
        c.add("1,2,3,4");
        c.add("1\n2,3");
        c.add("//;\n1;2");
       // c.add("//4\n142");
       // c.add("//;\n1000,1;2");
        try {
            c.add("-1,-2,3,4");

        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }
}


