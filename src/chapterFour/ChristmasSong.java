package chapterFour;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;

        while (day <= 12) {


            String lyrics = """
                    Press 1  for day one
                    Press 2 for day two
                    Press 3 for day three
                    Press 4 for day four
                    Press 5 for day five
                    Press 6 for day six
                    Press 7 for day seven
                    Press 8 for day eight
                    Press 9 for day nine 
                    Press 10 for day ten
                    press 11 for day eleven
                    Press 12 for day twelve
                                  
                    """;
            System.out.println("Enter your number");
            day = sc.nextInt();


            switch (day) {
                case 1:
                    System.out.println(" On the first day of Christmas my true love gave to me\n" +
                            "A partridge in a pear tree");
                break;
                case 2:
                    System.out.println("On the second day of Christmas my true love gave to me\n" +
                            "Two turtle doves and a partridge in a pear tree");
                break;
                case 3:
                    System.out.println("On the third day of Christmas my true love gave to me\n" +
                            "Three French hens, two turtle doves and a partridge in a pear tree");
                    break;

                case 4:
                    System.out.println("On the fourth day of Christmas my true love gave to me\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                case 5:
                    System.out.println("On the fifth day of Christmas my true love gave to me\n" +
                            "Five gold rings, four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas my true love gave to me\n" +
                            "Six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                case 7:
                    System.out.println("On the seventh day of Christmas my true love gave to me \n" +
                            "Seven swans a swimming, six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                case 8:
                    System.out.println("On the eighth day of Christmas my true love gave to me\n" +
                            "Eight maids a milking, seven swans a swimming\n" +
                            "Six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                case 9:
                    System.out.println("On the ninth day of Christmas \n" +
                            "Nine ladies dancing, eight maids a milking\n" +
                            "Seven swans a swimming, six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                case 10:
                    System.out.println("On the tenth day of Christmas my true love gave to me\n" +
                            "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
                            "Seven swans a swimming, six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                case 11:
                    System.out.println("On the eleventh day of Christmas my true love gave to me\n" +
                            "Eleven pipers piping, ten lords a leaping\n" +
                            "Nine ladies dancing, eight maids a milking\n" +
                            "Seven swans a swimming, six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                case 12:
                    System.out.println("On the twelfth day of Christmas my true love gave to me\n" +
                            "Twelve drummers drumming, eleven pipers piping\n" +
                            "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
                            "Seven swans a swimming, six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens\n" +
                            "Two turtle doves and a partridge in a pear tree");
                    break;

                default:
                    System.out.println("Enter number from 1-12");
                    break;
            }

        }
        System.out.println(day++ + " ");
        day++;

        //System.out.println(day + " ");
    }
}
