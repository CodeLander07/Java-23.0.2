package Heap;
import java.util.*;

public class heap{

static class Heap{
    ArrayList<Integer> arr = new ArrayList<>();


    //add in the heap
    public void add(int data){
        arr.add(data);

        int x = arr.size()-1;
        int par = (x-1)/2;

        while(arr.get(x) < arr.get(par)){
            int temp = arr.get(x);

            arr.set(x,arr.get(par));
            arr.set(par,temp);
        }
    }

    //Top of the heap
    public int peek(int data){
        return arr.get(0);
    }

    private void heapify(int i){
        int left = 2*i+1;
        int right = 2 *i+2;
        int minIdx = i;

        if(left <arr.size() && arr.get(minIdx) > arr.get(left) ){
            minIdx = left;
        }
        if(right <arr.size() && arr.get(minIdx) > arr.get(right)){
            minIdx = right;
        }

        if(minIdx != i){
            int temp = arr.get(i);
            arr.set(i , arr.get(minIdx));
            arr.set(minIdx , temp);

            heapify(minIdx);
        }
    }

    //Delete in the heap
    public int remove(){
        int data = arr.get(0);
        
        int temp = arr.get(0);
        arr.set(0,arr.size()-1);
        arr.set(arr.size()-1,temp);

        arr.remove(arr.size());
        heapify(0);
        return data;
    }
    public boolean isEmpty() {
        return arr.size() == 0;
    }

}

public static void main(String data){

}

}