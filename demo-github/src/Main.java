/*
TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
 click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
*/

import gifts.BearToy;
import gifts.Perfume;
import gifts.cake.Cake;
import gifts.cake.Packing;
import gifts.cake.Topping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello World!");


        //  for (int i = 1; i <= 5; i++) {
        //      System.out.println("i = " + i);


//        // Information About Me Task #1
//        String myName = "Kirill";
//        String mySurname = "Narkevich";
//        String myProfession = "QA";
//        int myExperience = 2;
//
//        String infoAboutMe = String.format("My name is %s, My surname is %s, My profession is %s, " +
//                "My work experience is %d years", myName, mySurname, myProfession, myExperience);
//        System.out.println(infoAboutMe);
//
//
//        // Declaring Variables Task #2
//        byte itsAbyte = 127;
//        short itsAshort = 32767;
//        int itsAnint = 2147483647;
//        long itsAlong = 1234567890;
//        float itsAfloat = 2.2F;
//        double itsAdouble = 1234567890.4;
//        boolean itsAboolean = true;
//        char itsAchar = 'H';
//
//        String declaringVariables = String.format("Its a byte: %d, Its a short: %d, Its an aint: %d, Its a long: %d, " +
//                        "Its a float: %f, Its a double: %f, Its a boolean: %s, Its a char: %s",
//                itsAbyte, itsAshort, itsAnint, itsAlong, itsAfloat, itsAdouble, itsAboolean, itsAchar);
//        System.out.println(declaringVariables);


//        // Enter a string Task #3
//
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);
//
//        int stringLength = userInput.length();
//        System.out.println(stringLength); // Output the length of the string
//
//        boolean stringIsEmpty = userInput.isEmpty();
//        System.out.println(stringIsEmpty); // String is empty?
//
//        char charNum3 = userInput.charAt(3);
//        System.out.println(charNum3); // Output the third symbol of the string
//
//        String secondString = "Its a second string";
//        boolean stringAreEqual = userInput.equals(secondString);
//        System.out.println(stringAreEqual); // Comparing two strings
//
//        boolean stringsAreEqualCaseInsensitive = userInput.equalsIgnoreCase(secondString);
//        System.out.println(stringsAreEqualCaseInsensitive); // Are strings equal case insensitive?
//
//        boolean startsWithIts = userInput.startsWith("Its");
//        System.out.println(startsWithIts); // Are this string starts with 'Its'?
//
//        boolean endsWithIts = userInput.endsWith("Its");
//        System.out.println(endsWithIts); // Are this string ends with 'Its'?
//
//        boolean containsMany = userInput.contains("many");
//        System.out.println(containsMany); // Are this string contains a word 'many'?
//
//        String updatedString = userInput.replace('a', 'A');
//        System.out.println(updatedString); // Replaced symbol 'a' to 'A'
//
//        String lowerCaseString = userInput.toLowerCase();
//        System.out.println(lowerCaseString); // Lower case string
//
//        StringBuffer buffer = new StringBuffer("Hello!");
//        buffer.append("\nMy name is Kirill");
//        System.out.println(buffer); // Using buffer method

//       //  Lesson 4. Arrays
//
//        String[] books = new String[10]; // First way to create an array
//        books[0] = "Harry Potter";
//        books[1] = "Crime and Punishment";
//        books[2] = "Lolita";
//        books[3] = "Duna";
//
//        for (int i = 0; i < books.length; i++) {
//            System.out.printf("Book %d: %s\n", i + 1, books[i]);
//
//        System.out.println(books[3]);
//
//        books[3] = "Java for Dummies";
//
//        System.out.println(books[3]);
//
//        String[] movies = new String[] {"1+1", "Avatar", "Titanic", "Full Metal Jacket"}; // Second way to create an array
//
//        String[][] students = new String[][] {
//                {"Kirill", "Narkevich"},
//                {"Vasiliy", "Pupkin"},
//                {"Olga", "Telyuk"}
//        };
//
//        System.out.printf("Name: %s, Surname: %s", students[0][0], students[0][1]);
//
//        // Операторы if, else
//
//            System.out.println("Please enter your score: ");
//            int userScore = new Scanner(System.in).nextInt();
//
//            if (userScore >= 70) {
//                System.out.println("Congratz! You've passed the test"); // if this statement = true
//            } else if (userScore >= 50) {
//                System.out.println("You get a B");
//            } else if (userScore >= 30) {
//                System.out.println("You get a C");
//            } else {
//                System.out.println("You get a D");
//            }
//
//            // Тернарный оператор
//        String result = userScore >= 70 ? "Congratz!" : "Looser!";
//            System.out.println(result);
//
//            // Switch Case
//
//            System.out.println("Choose your language:\n1 - English\n2 - Russian\3 - Italiano");
//            int selectedLanguage = new Scanner(System.in).nextInt();
//
//            switch (selectedLanguage) {
//                case 1 :
//                    System.out.println("Hello!");
//                    break;
//                case 2 :
//                    System.out.println("Привет!");
//                    break;
//                case 3 :
//                    System.out.println("Ciao!");
//                    break;
//            }
//
//            // Цикл while
//
//        String newUserInput = "";
//            Scanner newScanner = new Scanner(System.in);
//            while(newUserInput.isEmpty()) {
//                System.out.println("Please enter something");
//                newUserInput = newScanner.nextLine();
//            }
//
//        System.out.println("Thanks! Bye Bye!");
//
//            //  Цикл for (со счетчиком)
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("counter value is: " + i);
//        }
//
//            //  Цикл foreach
//
//            for(String book : books) {
//                System.out.println(book);
//            }
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter a number");
//            int userInput = scanner.nextInt();
//            int sum = 0;
//            for(int i = 0; i <= userInput; i++) {
//                sum += i;
//            }
//            System.out.println("Sum of numbers from 0 tof");
//        }
//
//
//        // Lesson 5. ООП (Часть 1)
//
//        RubberDuck yellowDuck = new RubberDuck();
//        yellowDuck.color = "Yellow";
//        yellowDuck.size = "S";
//        yellowDuck.price = 8.99;
//
//        yellowDuck.printInfo();
//
//        yellowDuck.addToCart(6);
//        sayHello("Kirill");
//
//        System.out.printf(yellowDuck.getColor());
//    }
//
//    public static void sayHello(String name) {
//        System.out.printf("Hello, " + name);
//    }


//         Домашнее задание от 01.10.2024
//         Задание 1. Доработка if else

//        System.out.println("Please enter your score: ");
//        Scanner scanner = new Scanner(System.in);
//        int userScore = new Scanner(System.in).nextInt();
//
//        while (userScore < 0 || userScore > 100) {
//            System.out.print("An incorrect value was entered" );
//            userScore = scanner.nextInt();
//        }
//        if (userScore >= 70 && userScore <= 100) {
//            System.out.println("Congratz! You've passed the test"); // if this statement = true
//        } else if (userScore >= 50 && userScore < 70) {
//            System.out.println("You get a B");
//        } else if (userScore >= 30 && userScore < 50) {
//            System.out.println("You get a C");
//        } else if (userScore >= 0 && userScore < 30) {
//            System.out.println("You get a D");
//        }
//
//
////         Задание 2. Доработка цикла while
//
//
//    String userInput = "";
//    Scanner scanner = new Scanner(System.in);
//        while (true) {
//        if (userInput.equalsIgnoreCase("Exit") ) {
//            break;
//        }
//        System.out.println("Please enter something");
//        userInput = scanner.nextLine();
//    }
//        System.out.println("Thanks, Bye!");
//
//
////         Задание 3. Доработка цикла for
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Пожалуйста, введите число: ");
//
//            int userInput = scanner.nextInt();
//            int sum = 0;
//
//        if (userInput >= 0) {
//            for (int i = 0; i <= userInput; i++) {
//                sum += i;
//            }
//            System.out.printf("Сумма чисел от 0 до %d равна %d", userInput, sum);
//        } else {
//            for (int i = userInput; i <= 0; i++) {
//                sum += i;
//            }
//            System.out.printf("Сумма чисел от 0 до %d равна %d", userInput, sum);
//        }
//
//
//        // Задание 4. Пульт дистанционного управления
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Пожалуйста, введите номер канала от 1 до 7 (или 0 для выхода): ");
//
//        String[] channels = new String[7];
//        channels[0] = "ТНТ";
//        channels[1] = "Bridge TV";
//        channels[2] = "Рен-ТВ";
//        channels[3] = "Nickelodeon";
//        channels[4] = "MTV";
//        channels[5] = "Муз-ТВ";
//        channels[6] = "ТВ-3";
//
//        while (true) {
//            int channelNumber = scanner.nextInt();
//            if (channelNumber == 0) {
//                System.out.println("Выход из программы.");
//                break;
//            }
//            if (channelNumber > 0 && channelNumber <= channels.length) {
//                System.out.println("Вы выбрали: " + channels[channelNumber - 1]);
//            } else {
//                System.out.println("Неверный номер канала. Пожалуйста, введите номер от 1 до " + channels.length + ".");
//            }
//        }

//         Домашнее задание от 02.10.2024
//         Задание 1. Описание объекта из реального мира в виде класса/набора классов с добавлением полей и конструктора
//
//        items.Candle blackCandle = new items.Candle("black", "S", "sandalwood", 14.99);
//        blackCandle.showInfoAboutCandle();
//
//
//        items.Candle orangeCandle = new items.Candle("orange", "M", "persimmon", 19.99);
//        orangeCandle.showInfoAboutCandle();
//        orangeCandle.addToCart(10);
//        orangeCandle.setFlavor("Green Tea");
//        System.out.println(orangeCandle.getFlavor());
//
//
//        // Задание 2. Создание экземпляра класса в методе main
//
//        items.Candle redCandle = new items.Candle("Red", "L", "Vanilla", 25.99);  // Создание экземпляра класса items.Candle
//
//        redCandle.showInfoAboutCandle();  // Вывод информации о свече
//        redCandle.addToCart(3); // Добавление свечи в корзину
//
//        // Изменение аромата и вывод обновленной информации
//        redCandle.setFlavor("Lavender");
//        System.out.println("Updated red flavor:");
//        redCandle.showInfoAboutCandle();
//
//        // Задание 3. Переработанная программа с выводом информации об объекте свеча
//
//        // Вывод информации о свече
//        String infoAboutCandle = String.format("items.Candle color: %s, items.Candle size: %s, items.Candle flavor: %s, items.Candle price: %.2f",
//                redCandle.color, redCandle.size, redCandle.getFlavor(), redCandle.price);
//        System.out.println(infoAboutCandle);


//         Домашнее задание от 07.10.2024

//        Topping creamCheeseTopping = new Topping("Cream Cheese", 3);
//        Packing newYearPacking = new Packing("Carton", "Green",  false);
//        Cake snickers = new Cake(10.99, "14 february", newYearPacking, creamCheeseTopping);
//        BearToy gammyBear = new BearToy("XL", true, 49.99, "8 march");
//        gammyBear.bearSize();
//        gammyBear.forGirls();
//        Perfume badHoneyPerfume = new Perfume("50ml", "musk", 999, "Father's Day");
//        badHoneyPerfume.getInfo();
//        badHoneyPerfume.setPerfumeFlavor("Vanilla");
//        System.out.printf(badHoneyPerfume.getPerfumeFlavor());


        //         Домашнее задание от 09.10.2024
            // Чтение созданного файла
        try {
            File file = new File("newFile2.txt");
            Scanner scanner2 = new Scanner(file);
            ArrayList<String> fileContext = new ArrayList<>();
            while (scanner2.hasNext()){
                fileContext.add(scanner2.nextLine());
            }
            fileContext.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("\nSorry, file not found");
        }

        // Пользовательский ввод
        System.out.println("\nВведите цену торта: ");
        double inputPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nВведите тему подарка: ");
        String giftTopic = scanner.nextLine();


        System.out.println("\nВведите упаковочный материал: ");
        String packingMaterial = scanner.nextLine();

        System.out.println("\nВведите цвет упакочного материала: ");
        String packingColor = scanner.nextLine();

        System.out.println("\nИмеет упаковка премиум дизайн (true or false): ");
        boolean premiumDesign = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("\nВведите название топпинга:");
        String toppingName = scanner.nextLine();

        System.out.println("\nВведите количество слоев топпинга:");
        int numberOfLayers = scanner.nextInt();

        Topping userTopping = new Topping(toppingName, numberOfLayers);
        Packing userPacking = new Packing(packingMaterial, packingColor, premiumDesign);
        Cake userCake = new Cake(inputPrice, giftTopic, userPacking, userTopping);

        // Сохранение торта в файл
        try {
            FileWriter anotherFile = new FileWriter("newFile2.txt",
                    false);
            anotherFile.write("Цена: " + inputPrice);
            anotherFile.write("Тема подарка: " + giftTopic);
            anotherFile.write("Упаковочный материал: " + packingMaterial);
            anotherFile.write("Цвет упаковочного материала: " + packingColor);
            anotherFile.write("Премиум дизайн: " + premiumDesign);
            anotherFile.write("Название топпинга: " + toppingName);
            anotherFile.write("Кол-во слоев топпинга: " + numberOfLayers);
            anotherFile.write("\n=====================");
            System.out.println("\nВаш торт сохранен в файл newFile.txt!");
            anotherFile.close();
        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. File error massage: " + e.getMessage());
        }


    }
}