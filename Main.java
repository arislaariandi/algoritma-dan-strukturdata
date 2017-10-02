
package arraylinierlist;

public class Main {
       public static void main(String [] args){
        LinierArray  tampil = new LinierArray_b();
        tampil.add(0,1);tampil.add(1,2);tampil.add(2,3);tampil.add(3,4);tampil.add(4,5);
        for (int j = 0; j < tampil.size(); j++) {
        System.out.println(tampil.elem[j]);
        }
        System.out.println("panjang array = "+tampil.size());
        System.out.println("panjang array yang belum ditrim = "+tampil.kapasitas);
        tampil.trimToSize();
        System.out.println("panjang array setelah di trim menjadi= "+tampil.kapasitas);
        tampil.setSize(8);
        System.out.println("elemen diset menjadi" +tampil.elem_2.length);
        tampil.remove(1);
        System.out.println("setelah index 1 di hapus =");
        for (int i = 0; i < tampil.size(); i++) {
            System.out.print(tampil.elem[i]+(" "));
            System.out.println("");
        }
    } 
}
