public class Main {
 public static void main(String[] args){
     String_Calculator c=new String_Calculator();
     System.out.println("\n---------ADDITION----------\n");
//     c.add("");
//     c.add("1");
//     c.add("1,1");
//     c.add("1,2,3,4");
//     c.add("1\n2,3" );
     try {

         String_Calculator sC = new String_Calculator();

            System.out.println(sC.add(""));
            System.out.println(sC.add("1,8,9"));
            System.out.println(sC.add("1\n1,4"));
            System.out.println(sC.add("//;\n1;2"));
            System.out.println(sC.add("//4\n142"));
         System.out.println(sC.add("//\n12"));
         System.out.println(sC.add("-1,-2,3,4"));
         System.out.println(sC.add("//;\n1;4"));
         ;
     }
     catch (NumberFormatException e){
         e.getMessage();
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

     //c.delimeter("//;\n1;2"); }

