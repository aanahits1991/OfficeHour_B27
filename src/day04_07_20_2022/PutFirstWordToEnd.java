package day04_07_20_2022;

public class PutFirstWordToEnd {
    public static void main(String[] args) {
        /*
         Task 1 :     Move first word

					    Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:

						    Input: Java is a fun language

						    Output: is a fun language Java

						    Hint: Use indexOf and substring
*/
         String sentence = "Java is a fun language";


      //I need to get first word
        //I need to find my " " indexOf()
        int indexOffirstSpace = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, indexOffirstSpace);
        System.out.println("firstWord = " + firstWord);
        String secondPart = sentence.substring(indexOffirstSpace + 1);
        System.out.println(secondPart+ " "+ firstWord);

    }
}
