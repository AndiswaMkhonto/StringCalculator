public class Main {
    public static void main(String[] args){

        Calculator c = new Calculator();

        System.out.println("\n---------ADDITION----------\n");
        System.out.println(c.add(""));
        System.out.println(c.add("1"));
        System.out.println(c.add("1,1"));
        System.out.println(c.add("1,2,3,4"));
        System.out.println(c.add("1\n2,3"));
        System.out.println(c.add("//;\n1;2"));
        System.out.println(c.add("//4\n142"));
        System.out.println(c.add("1,2,3,4"));
        System.out.println(c.add("1000,2"));




    }
}



