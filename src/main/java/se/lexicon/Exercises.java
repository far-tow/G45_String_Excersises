package se.lexicon;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {

        exc11();
    }

    public static void exc1() {
        String name = "Java";
        System.out.println(name.length());
        String longSentence = "Long example sentence";
        System.out.println(longSentence.charAt(6));
    }

    public static void exc2() {
        String name = "Even longer example sentence";
        System.out.println(name.indexOf("o"));

    }

    public static void exc3() {
        String notSoLong = "Ok this is not as long!";
        String result = notSoLong.substring(11, 22);
        System.out.println(result);
    }

    public static void exc4() {
        String upperCase = "CAPS EQUALS SCREAMING";
        String toLowerCase = upperCase.toLowerCase();
        System.out.println(toLowerCase);
        String toUpperCase = toLowerCase.toLowerCase();
        System.out.println(toLowerCase);
    }

    public static void exc5() {
        String correction = "Java is the worst programming language!";
        System.out.println("This is wrong: " + correction);
        System.out.println("___________________");
        String newOne = correction.replace("worst", "best");
        System.out.println("this is right: " + newOne);
    }

    public static void exc6() {
        String outPut = "\tJ\ta\tv\ta\t";
        System.out.println("the output is: \n" + outPut);
    }

    public static void exc7() {
        String integer = "2020";
        System.out.println(integer.trim());
    }

    public static void exc8() {
        String twoWord = "Oil and Water";
        String[] firsWord = twoWord.split("and");
        for (String a : firsWord)
            System.out.println(a);
    }


    public static void exc9() {
        String names = ("Carl,Susie,Fredrick,Bob,Erik");
        String[] sepNames = null;
        sepNames = names.split(",");
        for (int i = 0; i < sepNames.length; i++) {
            System.out.println(sepNames[i]);
        }

    }

    public static void exc10() {
    String words = "ThisShouldBeConverted";
    char [] arrayWords = new char[words.length()];
    for (int i = 0; i < words.length(); i++){
        arrayWords[i]= words.charAt(i);
    }
        for (char c : arrayWords) {
            System.out.println(c);
        }
    }

    public static void exc11(){
        char [] jv = {'J','a','v','a'};
        String jvString = new String(jv);
        System.out.println(jvString);


    }




}