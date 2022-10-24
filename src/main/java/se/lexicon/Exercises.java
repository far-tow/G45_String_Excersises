package se.lexicon;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {

        exc7();
    }
    // 1. What is the length of the String: "Java" ? Answer: 4
    // 1.1 What char is at index position 6 in the following String: Answer: X
    public static void exc1() {
        String name = "Java";
        System.out.println(name.length());
        String longSentence = "Long example sentence";
        System.out.println(longSentence.charAt(6));
    }

    // 2. What is the index position of 'o' in the following String:
    //"Even longer example sentence" ?: Answer: Index [6]
    public static void exc2() {
        String name = "Even longer example sentence";
        System.out.println(name.indexOf("o"));

    }

    // 3. Given the following String: "Ok this is not as long!"
    //create a substring of only "not as long" (excluding the
    //exclamation point) and print it out.
    public static void exc3() {
        String notSoLong = "Ok this is not as long!";
        String result = notSoLong.substring(11, 22);
        System.out.println(result);
    }

    // 4. Convert the following String: "CAPS EQUALS SCREAMING" to
    //lowercase and print it out. Then convert it back to
    //uppercase and print it out again.
    public static void exc4() {
        String upperCase = "CAPS EQUALS SCREAMING";
        String toLowerCase = upperCase.toLowerCase();
        System.out.println(toLowerCase);
        String toUpperCase = toLowerCase.toLowerCase();
        System.out.println(toLowerCase);
    }

    // 5. Correct the following String: "Java is the worst
    //programming language!" by replacing the (obviously
    //incorrect) word "worst" with the word "best". Then print
    //out the sentence.
    public static void exc5() {
        String correction = "Java is the worst programming language!";
        System.out.println("This is wrong: " + correction);
        System.out.println("___________________");
        String newOne = correction.replace("worst", "best");
        System.out.println("this is right: " + newOne);
    }

    // 6. What is the output of the following String:
    //"\tJ\ta\tv\ta\t" after you trim it? Answer: J A V A
    public static void exc6() {
        String outPut = "\tJ\ta\tv\ta\t";
        System.out.println("the output is: \n" + outPut);
    }

    // 7. Parse the following int: 20 to a String and add a 20 to the
    //end of the String. Printing it out should return: "2020".
    public static void exc7() {
        int i=20;
        System.out.println("Parsing string example"+ " "+ String.valueOf(i)+20);
    }

    // 8. Oil and water don't go well together. Given the String:
    //"Oil and Water", split them up into the words "Oil","Water"
    //and store them in a String array.
    public static void exc8() {
        String twoWord = "Oil and Water";
        String[] firsWord = twoWord.split("and");
        for (String a : firsWord)
            System.out.println(a);
    }


    // 9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
    //into an array. Print out all names separately.
    public static void exc9() {
        String names = ("Carl,Susie,Fredrick,Bob,Erik");
        String[] sepNames = null;
        sepNames = names.split(",");
        for (int i = 0; i < sepNames.length; i++) {
            System.out.println(sepNames[i]);
        }

    }

    // 10. Convert the following String: "ThisShouldBeConverted" to
    //a char array. Iterate through the char array and print out
    //each element.
    public static void exc10() {
        String words = "ThisShouldBeConverted";
        char[] arrayWords = new char[words.length()];
        for (int i = 0; i < words.length(); i++) {
            arrayWords[i] = words.charAt(i);
        }
        for (char c : arrayWords) {
            System.out.println(c);
        }
    }

    // 11. Convert the following char[]: {'J','a','v','a'} to a
    //String and print it out.
    public static void exc11() {
        char[] jv = {'J', 'a', 'v', 'a'};
        String jvString = new String(jv);
        System.out.println(jvString);


    }


}