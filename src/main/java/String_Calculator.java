public class String_Calculator {



//        if (num.isEmpty()) {
//            num = "0";
//        }
//        String delimeter = "[,\n]";
//
//        String[] array = num.split(delimeter);
//        int sum = 0;
//        for (String number : array) {
//            sum = sum + Integer.parseInt(number);
//        }
//        System.out.println(sum);
//        return true;
//    }
        public static int add(String input) {
            if (input ==""){
                input = input.replace("", "0");
            }
            int sum = 0;
            String DLimit = "[,;\\\n]";
            if (input.contains("//")){

                String[] arrSum = input.split("[\\\n]",2);


                DLimit =arrSum[0].substring(2);
                input =arrSum[1];
            }
            if(input.startsWith("-")) {
                try {
                    String[] inputValue = input.split("[,]");
                    DLimit = inputValue[0].substring(2);
                    System.out.println(" 'ERROR: negatives not allowed " + input + "'");
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
//            String[] indexValue1 = input.split("[\\d,]",2);
//
//            if (Integer.parseInt(indexValue1[1]) >= 1000 ) {
//                DLimit= indexValue1[0].substring(4);
//                input = indexValue1[1];
//                System.out.println(DLimit+input);
//            } else{
//                String[] arrSum2= input.split("[\\\n]",2);
//
//                DLimit= arrSum2[0].substring(2);
//
//                input =DLimit;
//
//                System.out.println(input);
//
//            }

            String[] inputValue2 =input.split(DLimit);
            for ( String i :inputValue2){
                sum = sum + Integer.parseInt(i);
            }
            return sum;
        }



}