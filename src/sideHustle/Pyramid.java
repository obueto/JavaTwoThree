package sideHustle;

public class Pyramid {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter the number of stones");
//        double numberOfStone = input.nextDouble();
//        System.out.println( "Enter the average weight of stone");
//        double averageWeight = input.nextDouble();
//        System.out.println( "Enter the number of years used");
//        int year = input.nextInt();
        //System.out.println();
        // double interestRate = 2;
//for (int i = 9; i > 2;i--){

        //  System.out.println("The result is"+ calculateInterest(10000.0 ,i));
//}
        //  }
        //public static double calculateInterest(double amount,double interestRate){
        //  return (amount * (interestRate/100));
//        int sum = 0;
//        int count = 0;
//    for (int i = 1; i < 1000;i++){
//        if ((i % 3 == 0) && (i % 5 == 0)){
//count++;
//sum =sum + i;
//            System.out.println("Divisible numbers are:" + i);
//        }
//if (count ==10){
//    break;
//}
//    }
//        System.out.println( "Sum :" + sum);
        int number = 4;
        int  finishNumber = 20;
        int sum = 0;
        int count = 0;
while (number <=finishNumber){
    number++;

    if (!isEven(number)){
        continue;
    }
    count++;
    if (count == 5)
        break;
    sum+=number;
    System.out.println("Even number" + number);


}
        System.out.println("The sum is " + sum);
        System.out.println("The count of even numbers is " + count);
    }


    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}