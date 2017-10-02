
package arraylinierlist;
public class LinierArray {
    int idnx;
    protected int ukuran;
    protected int kapasitas;
    protected Object [] elem,elem_2;
    
    public LinierArray(int kapasitas) {
        this.kapasitas = kapasitas;
        elem = new Object[kapasitas];
        idnx = 0;
    }
    public LinierArray(){
        this(10);
    }
    public boolean isEmpty(){
        return ukuran == 0;
    } 
    public int size(){
        return ukuran;
    }
    void checkIndex(int index){
        if(index < 0 || index >= ukuran)
            throw new IndexOutOfBoundsException("index = " + index + "size = " + ukuran);
    }
     public void increaseSize() {
        kapasitas++;
        Object[] newArray = new Object[kapasitas];
        System.arraycopy(elem, 0, newArray, 0, elem.length);
        elem = newArray;
    }
    public void add(int index, Object theElement){        
        
    }
     public Object remove(int i) {
        return null;
    }
    public Object setSize(int newArray) {
        return null;
    } 
    public void trimToSize() {
        
    }
    
}
