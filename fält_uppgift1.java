import java.util.Scanner;

public class fält_uppgift1{
    public static void main(String[] args){
        Scanner tb = new Scanner(System.in);

        int[] fält1 = {8,4,6,3,9};
        System.out.println("Värden på fält1: " +fält1[0]+ ", " +fält1[1]+ ", " +fält1[2]+ ", " +fält1[3]+ ", " +fält1[4]);
        int medelvärde = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4])/5;
        System.out.println("Längden på fält1 är: "+ fält1.length);
        System.out.println("Medelvärdet av fält1 är: "+medelvärde);

        int[] fält2 = {18,14,16,13,19};
        System.out.println("Värden på fält2: " +fält2[0]+ ", " +fält2[1]+ ", " +fält2[2]+ ", " +fält2[3]+ ", " +fält2[4]);
        int medelvärde2 = (fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4])/5;
        System.out.println("Medelvärdet av fält2 är: "+medelvärde2);

        int[] summa_fält = {fält1[0]+fält2[0], fält1[1]+fält2[1], fält1[2]+fält2[2], fält1[3]+fält2[3], fält1[4]+fält2[4]};
        System.out.println("Summan av fält 1 och fält 2 är:");
        System.out.println(summa_fält[0]+ ", " +summa_fält[1]+ ", " +summa_fält[2]+ ", " +summa_fält[3]+ ", " +summa_fält[4]);

        int medelvärde3 = (summa_fält[0]+summa_fält[1]+summa_fält[2]+summa_fält[3]+summa_fält[4])/5;
        System.out.println("Medelvärdet av summan är: "+medelvärde3);

        int[]  fält3 = {5, 8, 2, 4};
        System.out.println("Värden av fält3: " +fält3[0]+ ", " +fält3[1]+ ", " +fält3[2]+ ", " +fält3[3]);
         
        int[] fältIn = new int[10];  
        System.out.println("Skriv fyra nummer: ");  
        for(int i=0; i<4; i++)  
        {   
        fältIn[i]=tb.nextInt();  
        }
        int[] summa_fältIn = {fältIn[0]+fält3[0], fältIn[1]+fält3[1], fältIn[2]+fält3[2], fältIn[3]+fält3[3]};
        System.out.println("Summan av fält3 och användarens input: ");
        System.out.println(summa_fältIn[0]+ ", " +summa_fältIn[1]+ ", " +summa_fältIn[2]+ ", " +summa_fältIn[3]);
    }  
}
