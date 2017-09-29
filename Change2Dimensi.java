package arraylinierlist;
 import java.util.Scanner;
public class Change2Dimensi {
    public static void main(String []args){
        int a [][]= new int[2][2];
        Scanner masuk = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("masuan nilai ke["+i+"]["+j+"] = ");
                a[i][j] = masuk.nextInt();
                
            }
        }
        System.out.println("------DATA DI DALAM ARRAY------");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-----ARRAY BARU-----");
        a = new int[3][3];
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("masuan nilai ke["+i+"]["+j+"] = ");
                a[i][j] = masuk.nextInt();
                
            }
        }
         System.out.println("------DATA DI DALAM ARRAY------");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
   System.out.println("");
    }
    }
}
