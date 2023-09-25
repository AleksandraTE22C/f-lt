public class fält_uppgift1{
    public static void main(String[] args){
        int[] fält1 = {8,4,6,3,9};
        double medelvärde = (double)(fält1[0]*fält1[1]*fält1[2]*fält1[3]*fält1[4])/5;
        System.out.println("Längden på fält1 är: "+ fält1.length);
        System.out.println("Medelvärdet av fält1 är: "+medelvärde);

        int[] fält2 = {18,14,16,13,19};
        double medelvärde2 = (double)(fält2[0]*fält2[1]*fält2[2]*fält2[3]*fält2[4])/5;
        System.out.println("Medelvärdet av fält2 är: "+medelvärde2);

        int[] summa_fält = {fält1[0]+fält2[0], fält1[1]+fält2[1], fält1[2]+fält2[2], fält1[3]+fält2[3], fält1[4]+fält2[4]};
        System.out.println("Summan av båda fälten är:");
        System.out.println(summa_fält[0]);
        System.out.println(summa_fält[1]);
        System.out.println(summa_fält[2]);
        System.out.println(summa_fält[3]);
        System.out.println(summa_fält[4]);

        double medelvärde3 = (double)(summa_fält[0]*summa_fält[1]*summa_fält[2]*summa_fält[3]*summa_fält[4])/5;
        System.out.println("Medelvärdet av summan är: "+medelvärde3);

        
    }
}