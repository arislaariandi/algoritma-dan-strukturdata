
package arraylinierlist;

public class Main {
       public static void main(String [] args){
        LinierArray  tampil = new LinierArray_b();
        tampil.add(0,"Z");tampil.add(1,"V");tampil.add(2,"X");tampil.add(3,"B");tampil.add(4,"C");
       
        for (int j = 0; j < tampil.size(); j++) {
        System.out.println(tampil.element[j]);
        }
        System.out.println("panjang array = "+tampil.size());
        System.out.println("panjang array yang belum ditrim = "+tampil.capacity);
        tampil.trimToSize();
        System.out.println("panjang array setelah di trim"+tampil.capacity);
        tampil.setSize(8);
        System.out.println("elemen diset menjadi" +tampil.element2.length);
        tampil.remove(1);
        System.out.println("setelah index 1 di hapus =");
        for (int i = 0; i < tampil.size(); i++) {
            System.out.print(tampil.element[i]);
            System.out.println("");
        }
    } 
}
