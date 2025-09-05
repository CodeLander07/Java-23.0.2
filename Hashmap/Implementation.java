import java.util.*;
import java.util.LinkedList;
public class Implementation {
    static class HashMap <K,V>{
        private class Node{
            K key;
            V value;
           public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
    private int size ;
    private LinkedList<Node> buckets [];

    @SuppressWarnings("unchecked")

    public HashMap(){
        this.size = 4;
        this.buckets = new LinkedList[4];
        for(int i=0; i<4; i++){
            this.buckets[i] = new LinkedList<>();
        }
    }
    private int hashFunction(K key){
        int hc = key.hashCode();
        
        return Math.abs(hc) % buckets.length;
    }
    private int SearchInLL(K key , int bi){
        LinkedList <Node> ll = buckets[bi];
        int di = 0;
        for(int i =0; i<ll.size();i++){
            Node node = ll.get(i);
            if(node.key.equals(key)){
                return i;
            }
            di++;
        }
        return -1;
    }
    public void put(K key, V value){
      int bi = hashFunction(key);
      int di = SearchInLL(key, bi);
      
      

    }
    public static void main(String [] args){

        // HashMap <String , String> map = new HashMap<>();
    }
}
