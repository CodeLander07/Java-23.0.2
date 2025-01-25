public class TowerOfHanoi {
    static int total = 3;
    public static void TowerofHnaoi(char src , char dest ,char aux,int n){
        if(n==0){
            return;
        }

        TowerofHnaoi(src, aux, dest, n-1);// 1st faith (choti disk--> Extra tower )

        System.out.print((total-n +1) + " Move disk " + n + " from " + src + " to " + dest + "\n");
    }

    public static void main (String[] args){
        TowerofHnaoi('A','C','B',3);
    }
}
