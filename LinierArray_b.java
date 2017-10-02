
package arraylinierlist;
public class LinierArray_b extends LinierArray{
@Override
    public void add(int indx, Object theElement){        
    for(int i = ukuran - 1; i >= indx; i--)
        elem[i + 1] = elem[i];
        elem[indx] = theElement;
        ukuran++;
    }
    @Override
    public void trimToSize() {
    if (ukuran < kapasitas) {
        Object[] element2 = new Object[ukuran];
        System.arraycopy(elem, 0, element2, 0, ukuran);
        elem = element2;
        kapasitas = ukuran;
        }
    }
    @Override
    public Object setSize(int size_baru){
        if(ukuran > size_baru){
            int index = ukuran - size_baru;
            Object mneghapus_elem = elem[index];
            for(int j=0; j<index; j++){
            for(int i = index + 1; i < ukuran; i++)
                elem[i-1] = elem[i];
                elem[--ukuran] = null;
            }
            return mneghapus_elem;
        }
        else{
            elem_2 = new Object[size_baru];
            System.arraycopy(elem, 0, elem_2,0, ukuran);
            elem = elem_2;
        }
        return ukuran;
    }
    @Override
    public Object remove(int indx){
        checkIndex(indx);
        Object removeElement = elem[indx];
        for(int i = indx + 1; i < ukuran; i++)
           elem[i-1] = elem[i];
           elem[--ukuran] = null;
           return removeElement;
    }
}
