package chapterFour;

import java.util.Scanner;
public class ChristmasLyrics {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int day =1;

            do{
                System.out.println("Enter verses number");
                day = sc.nextInt();

                switch (day) {
                    case 1 -> System.out.println("Day One");
                    case 2 -> System.out.println("Day Two");
                    case 3 -> System.out.println("Day Three");
                    case 4 -> System.out.println("Day Four");
                    case 5 -> System.out.println("Day Five");
                    case 6 -> System.out.println("Day Six");
                    case 7 -> System.out.println("Day Seven");
                    case 8 -> System.out.println("Day Eight");
                    case 9 -> System.out.println("Day Nine");
                    case 10 -> System.out.println("Day Ten");
                    case 11 -> System.out.println("Day Eleven");
                    case 12 -> System.out.println("Day Twelve");
                }

                switch (day) {
                    case 1 -> System.out.println("""
                        On the first day of Christmas my true love gave to me 
                        A partridge in a pear tree""");
                    case 2 -> System.out.println("""
                        On the second day of Christmas my true love gave to me
                        Two turtle doves and a partridge in a pear tree""");
                    case 3 -> System.out.println("""
                        On the third day of Christmas my true love gave to me
                        Three French hens, two turtle doves and a partridge in a pear tree""");
                    case 4 -> System.out.println("""
                        On the fourth day of Christmas my true love gave to me
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");

                    case 5 -> System.out.println("""
                        On the fifth day of Christmas my true love gave to me
                        Five gold rings, four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");

                    case 6 -> System.out.println("""
                        On the sixth day of Christmas my true love gave to me
                        Six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");

                    case 7 -> System.out.println("""
                        On the seventh day of Christmas my true love gave to me
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");

                    case 8 -> System.out.println("""
                        On the eighth day of Christmas my true love gave to me
                        Eight maids a milking, seven swans a swimming
                        Six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");

                    case 9 -> System.out.println("""
                        On the ninth day of Christmas
                        Nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");
                    case 10 -> System.out.println("""
                        On the tenth day of Christmas my true love gave to me
                        Ten lords a leaping, nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");
                    case 11 -> System.out.println("""
                        On the eleventh day of Christmas my true love gave to me
                        Eleven pipers piping, ten lords a leaping
                        Nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");
                    case 12 -> System.out.println("""
                        On the twelfth day of Christmas my true love gave to me
                        Twelve drummers drumming, eleven pipers piping
                        Ten lords a leaping, nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree""");
                    default ->
                        System.out.println("You can only enter verse number from day 1- 12 !!!");


                }
                day++;   }    while (day<=12);
        }

    }





