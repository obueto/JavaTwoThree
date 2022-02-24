package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        String n="N";
        String n2 ="N2";
        String n3 ="N3";
        String n4 = "N4";
        System.out.printf("%s\t\t%s\t\t%s\t\t\t%s\n",n,n2,n3,n4);
        for (int count = 1;count < 6;count++){
            //System.out.println(count + "\t" + count*count + "\t\t" + count*count*count + "\t\t\t" + count*count*count*count);
            System.out.println((int)Math.pow(count, 1.0) + "\t\t" + (int)Math.pow(count, 2.0) + "\t\t" +(int)Math.pow(count,3.0) + "\t\t\t" + (int)Math.pow(count,4.0));
        }
    }
}
