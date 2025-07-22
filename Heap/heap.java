package Heap;

import java.util.ArrayList;

public class heap {

     static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int val){
            arr.add(val);

            //child index = x
            int x = arr.size() - 1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) minIdx = left;

            if(left < arr.size() && arr.get(minIdx) > arr.get(right)) minIdx = right;
            
            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0,arr.size()-1);
            arr.set(arr.size() -1 , temp);

            arr.remove(arr.size()-1);

            heapify(0);
            return data;

        }
    }
    public static  void main (String[] args){
       Heap H = new Heap();

       H.add(4);
       H.add(9);
       H.add(6);
       H.add(8);
       H.add(5);
       
    while(H.arr.size() > 0){
        System.out.println(H.peek());
        H.remove();
    }

    }
    
}
