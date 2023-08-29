import java.util.Arrays;

public class VectorArray<T> implements IArray <T>{

    public T[] item;
    int vector;

    public VectorArray(int vector) {
        this.vector = vector;
        this.item = (T[])new Object[this.vector];
    }

    @Override
    public void add(T item, int index){
        while(index > this.size() || index == this.size()){
            resize();
        }
        if(this.item[index] == null){
            this.item[index] = item;
        }
    }

    private void resize(){
        T[] newItem = (T[]) new Object[size()+this.vector];
        for (int i = 0, len = size(); i < len; i++) {
            newItem[i] = this.item[i];
        }
        this.item = newItem;
    }

    public T get(int i){
        return this.item[i];
    }

    public void get(){
        System.out.println(Arrays.toString(this.item));
    }
    @Override
    public int size() {
        return this.item.length;
    }
    @Override
    public T remove(int index){
        T temp = this.item[index];
        if(this.item[index] != null){
            this.item[index] = null;
            return temp;
        }
        return null;
    }
}
