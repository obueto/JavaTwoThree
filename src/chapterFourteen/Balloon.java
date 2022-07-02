package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class Balloon {
    public static void main(String[] args) {
        List<Integer> listOfIndices = new ArrayList<>() ;

            //  String balloon = "BALLOON";
            //  for (int i = balloon.length()-1;i >=0;i--){
            //     System.out.println(balloon.charAt(i));
        String mississippi = "MiSsisSippi";
        for(int i = 0;i<mississippi.length();i++){
                if (String.valueOf(mississippi.charAt(i)).equalsIgnoreCase("s")) {
                    listOfIndices.add(i);
                }

            }
        System.out.println(listOfIndices);

        String trim = " chair   man  ";
        System.out.println(trim.trim().replaceAll(" ",""));

        }


    }


