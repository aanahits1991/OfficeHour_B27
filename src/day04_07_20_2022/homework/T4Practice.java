package day04_07_20_2022.homework;

public class T4Practice {
    public static void main(String[] args) {
         /*
        Assume that you searched a baby toy in Etsy.When you open related category your url is :

			    			"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    									(main category)

						 According to this result print out main category name

						 Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

						 Output:
						 			Main Category name is  toys and games

						 Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 								     (main category)

						 Output:
						 			Main Category name is  toys and entertainment

         */

        String str = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";

        String str2 = str.substring(str.indexOf("c/") + 2);
        System.out.println(str2);

        int indexOfSlashLastPart = str2.indexOf("/");

        String str3 = str2.substring(0, indexOfSlashLastPart);
        System.out.println(str3);
        String result = str3.replace('-', ' ');
        System.out.println(result);

        System.out.println("Main category name is " + result);




        System.out.println("----------------------------");


        String etsy = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";

        String firstSlash = etsy.substring(etsy.indexOf("c/") + 2);

        System.out.println(firstSlash);

        String second = firstSlash.substring(0, firstSlash.indexOf("?"));
        System.out.println(second);

        String result2 = second.replace('-', ' ');
        System.out.println();

        System.out.println("Main Category name is " + result2);

    }
}
