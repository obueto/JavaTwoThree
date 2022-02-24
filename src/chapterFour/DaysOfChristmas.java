package chapterFour;

public class DaysOfChristmas {
    public static void main(String[] args) {
        for (int i = 1; i <=12; i++) {
            switch (i) {
                case 1 -> System.out.println("On the first day ");
                case 2 -> System.out.println("On the second day");
                case 3 -> System.out.println("On the third day");
                case 4 -> System.out.println("On the fourth day");
                case 5 -> System.out.println("On the fifth day");
                case 6 -> System.out.println("On the sixth day");
                case 7 -> System.out.println("On the seventh day");
                case 8 -> System.out.println("On the eighth day");
                case 9 -> System.out.println("On the ninth day");
                case 10 -> System.out.println("On the tenth day");
                case 11 -> System.out.println("On the eleventh day");
                case 12 -> System.out.println("On the twelfth day");
            }
            //System.out.println(i);
            System.out.println("of christmas my true love sent to me");

            for (int j = i; j > 0; j-- ){
                switch (j) {
                    case 1 -> System.out.println("a partridge in a pear tree");
                    case 2 -> System.out.println("two turtle doves");
                    case 3 -> System.out.println("three french hens");
                    case 4 -> System.out.println("four colly birds");
                    case 5 -> System.out.println("five calling birds");
                    case 6 -> System.out.println("six geese are laying");
                    case 7 -> System.out.println("seven swans are swimming");
                    case 8 -> System.out.println("eight maids are milking");
                    case 9 -> System.out.println("nine drummers drumming");
                    case 10 -> System.out.println("ten pipers pipping");
                    case 11 -> System.out.println("eleven ladies dancing");
                    case 12 -> System.out.println("twelve lords are leaping");
                }
            }
            System.out.println("----".repeat(10));
            System.out.println();
        }

    }
}
