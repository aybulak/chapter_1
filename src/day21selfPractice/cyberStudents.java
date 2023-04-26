package day21selfPractice;

import java.util.Arrays;

public class cyberStudents {

    public static void main(String[] args) {


    String []Batch2Group1={"Ahmet","Batur","Beyza","Ali"};
    String []Batch2Group2={"Burcu","Simona","Aynur","Hanna","Christina"};
    String []Batch2Group3={"BO","Abdulla","Salih","Max"};
    String[]batch24Group={"Alya","Roshan","Kadir","Aysel","Christina","Maria"};

    String[][]Batch2Group ={Batch2Group1,Batch2Group2,Batch2Group3};

    String[][]CyberStudents={ Batch2Group1,Batch2Group2,Batch2Group3,batch24Group};
        System.out.println(Arrays.deepToString(Batch2Group));
        System.out.println(Arrays.deepToString(CyberStudents));
        System.out.println(Arrays.deepToString(batch24Group));


        for (String[] eachBatch : CyberStudents) {
            for (String eachStudent : eachBatch) {
                System.out.print("CyberStudents:" + eachStudent);
                System.out.println();
            }

        }

}
}
