public class interfaces {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
        
        Rook r = new Rook();
        r.moves();
       
        bishop b = new bishop();
        b.moves();
      
    }
}
interface chessPlayer{
    void moves();
    void check();
} 
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Up Down Left Right Diagonally...");
    }

}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Up Down Left Right...");
    }
}
class bishop implements chessPlayer{
    public void moves(){
        System.out.println("Diagonally...");
    }
}