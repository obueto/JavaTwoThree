package chapterTwo;//import java.util.Scanner;

/*public class chapterTwo.Age {

        private String name;
        private int age;


        public chapterTwo.Age(String name, int age){
            this.name = name;
            this.age = age;
        }


        public void setName(String name){
            this.name = name;
        }


        public  String getName(){
            return name;
        }

        public void setAge(int age){
            this.age = age;
        }


        public int getAge(){
            return age;
        }

    public static void main (String[] args){




        chapterTwo.Age myName1= new chapterTwo.Age("Joel",50 );
        chapterTwo.Age myName2 =new chapterTwo.Age("Joy",34);


        System.out.printf("Your name is %s your  age %d%n", myName1.getName(),myName1.getAge());
        System.out.printf("Your name is %s your age is %d%n", myName2.getName(),myName2.getAge());

        Scanner input = new Scanner(System.in);


String store;
int year;


        System.out.println("Enter your name");
        store = input.nextLine();
        myName1.setName(store);

        System.out.println("Enter your age");
        year = input.nextInt();
        myName1.setAge(year);


        System.out.printf("Your name is %s your  age %d%n", myName1.getName(),myName1.getAge());
        System.out.printf("Your name is %s your age is %d%n", myName2.getName(),myName2.getAge());
    }




    }*/
public class Age {
    public static void main(String[] args) {


        int number = 1;  // 1
           while (number <= 100) {  //2
                  if(number % 2 ==0) System.out.print(number +""); //4
                   number = number + 1; //3
        }
                //int number = 1;
                   while (number < 99) {
             number = number + 2;
              System.out.print(number + " ");
        }

    }

}
























