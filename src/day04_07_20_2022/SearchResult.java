package day04_07_20_2022;

public class SearchResult {
    public static void main(String[] args) {

        /*
        Task 3 : Assume that you searched a word in Google  Search Engine.After that you took a result message like 		 this


						 "About 640,000,000 results (0.78 seconds)"

						 According to this result print out search Time and number of Result

						 Input :  "About 640,000,000 results (0.78 seconds)"

						 Output:
						 			Result number is 640,000,000
						 			Response time is 0.78 seconds
         */
        String str = "About 640,000,000 results (0.78 seconds)";
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" r");
        String resultNumber = str.substring(firstSpace + 1, secondSpace);
        int firstPar = str.indexOf("(");
        int secondPar = str.indexOf(")");
        String responseTime = str.substring(firstPar + 1, secondPar);

        System.out.println("Result number is " + resultNumber);
        System.out.println("Response time is " + responseTime);


    }
}
