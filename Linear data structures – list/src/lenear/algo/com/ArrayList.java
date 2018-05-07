package lenear.algo.com;

public class ArrayList<T> {

    int capacity = 2;

    private Object[] items;
    int count;

    public ArrayList(){
        items = new Object[capacity];
    }


    public int count() {
        return this.count;
    }

    public void Add(Object item) {
       if (this.count == this.items.length){
           this.Resize();
       }
       this.items[this.count++] = item;
    }

    private void Resize() {
        Object[] copy = new Object[this.items.length*2];
        for (int i = 0; i < items.length; i++) {
            copy[i] = items[i];
        }
        this.items = copy;
    }

    public T RemoveAt(int index) throws Exception {
        if (index >= this.count){
            throw new Exception("Error messege!");
        }

        Object element = this.items[index];
        this.items[index] = null;
        this.Shift(index);
        ///this.count--;
        if (this.count <= this.items.length /4){
            this.Shrink();
        }
        return (T) element;
    }

    private void Shrink() {
        Object[] copy = new Object[this.items.length/2];
        for (int i = 0; i < this.count; i++) {
            copy[i] = this.items[i];
        }
        this.items = copy;
    }

    private void Shift(int index) {
        int len = this.count-1;
        int temp = index;
        while (temp < len){
            this.items[index] = this.items[index+1];
            this.items[index+1] = null;
            temp++;
        }
        count--;
    }


}
