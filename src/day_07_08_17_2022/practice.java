package day_07_08_17_2022;



public class practice {

     /*
					String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

					Write a method that returns : Welcome To Core Java


     */

    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

        String result = "";

        for(int i = 0; i< str.length(); i ++){
                char c = str.charAt(i);

           if (Character.isAlphabetic(c)) {
               result += c;
           }

               if ((c+" ").isBlank()){
                   result += c;
               }
           }

        System.out.println(result);
    }
}

