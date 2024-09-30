//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World!");


      //  for (int i = 1; i <= 5; i++) {
      //      System.out.println("i = " + i);


        // Information About Me Task #1
            String myName = "Kirill";
            String mySurname = "Narkevich";
            String myProfession = "QA";
            int myExperience = 2;

        String infoAboutMe = String.format("My name is %s, My surname is %s, My profession is %s, " +
                "My work experience is %d years", myName, mySurname, myProfession, myExperience);
        System.out.println(infoAboutMe);


        // Declaring Variables Task #2
        byte itsAbyte = 127;
        short itsAshort = 32767;
        int itsAnint = 2147483647;
        long itsAlong = 1234567890;
        float itsAfloat = 2.2F;
        double itsAdouble = 1234567890.4;
        boolean itsAboolean = true;
        char itsAchar = 'H';

        String declaringVariables = String.format("Its a byte: %d, Its a short: %d, Its an aint: %d, Its a long: %d, " +
                        "Its a float: %f, Its a double: %f, Its a boolean: %s, Its a char: %s",
                itsAbyte, itsAshort, itsAnint, itsAlong, itsAfloat, itsAdouble, itsAboolean, itsAchar);
        System.out.println(declaringVariables);


        // Enter a string Task #3

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        int stringLength = userInput.length();
        System.out.println(stringLength); // Output the length of the string

        boolean stringIsEmpty = userInput.isEmpty();
        System.out.println(stringIsEmpty); // String is empty?

        char charNum3 = userInput.charAt(3);
        System.out.println(charNum3); // Output the third symbol of the string

        String secondString = "Its a second string";
        boolean stringAreEqual = userInput.equals(secondString);
        System.out.println(stringAreEqual); // Comparing two strings

        boolean stringsAreEqualCaseInsensitive = userInput.equalsIgnoreCase(secondString);
        System.out.println(stringsAreEqualCaseInsensitive); // Are strings equal case insensitive?

        boolean startsWithIts = userInput.startsWith("Its");
        System.out.println(startsWithIts); // Are this string starts with 'Its'?

        boolean endsWithIts = userInput.endsWith("Its");
        System.out.println(endsWithIts); // Are this string ends with 'Its'?

        boolean containsMany = userInput.contains("many");
        System.out.println(containsMany); // Are this string contains a word 'many'?

        String updatedString = userInput.replace('a','A');
        System.out.println(updatedString); // Replaced symbol 'a' to 'A'

        String lowerCaseString = userInput.toLowerCase();
        System.out.println(lowerCaseString); // Lower case string

        StringBuffer buffer = new StringBuffer("Hello!");
        buffer.append("\nMy name is Kirill");
        System.out.println(buffer); // Using buffer method
        }
    }