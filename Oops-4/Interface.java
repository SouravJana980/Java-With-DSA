public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

//chessplayer is a interface
interface ChessPlayer{
    //abstrat function
    void move();
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("Queen move left,right,up,down,diagonal");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right");
    }
}