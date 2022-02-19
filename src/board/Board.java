package board;
import java.util.*;
import java.awt.*;


public class Board{
//Creates the window frame
    DrawingPanel board = new DrawingPanel(550,550);
    Graphics g = board.getGraphics();
    static Scanner sc = new Scanner(System.in);
  
    
    
    Board (){
        
    }
    public Color getColor(int x, int y)
    {
       //returns color for hit and miss
     Color shipcolor = board.getPixel(x+10, y+10);
        return shipcolor;
    }
    Board(String id)
    {
      // sets up the game board
     board.setGridLines(true, 50);
     board.setBackground(Color.blue);
     ArrayList alphabets = new ArrayList();
    alphabets.add("A");
    alphabets.add("B");
    alphabets.add("C");
    alphabets.add("D");
    alphabets.add("E");
    alphabets.add("F");
    alphabets.add("G");
    alphabets.add("H");
    alphabets.add("I");
    alphabets.add("J");
    
    int numbers = 1;
    int counter = 0;
    
    g.drawString(id, 10, 25);
    
        
            for (int y = 1; y <= 11; y++) 
            {
                int x= 2;
                g.drawString(Integer.toString(numbers) , x*12, (y*50)+25);
                numbers ++;
            }
            for (int x = 1; x <= 10; x++) 
            {
                int y= 2;  
                g.drawString((String)alphabets.get(counter) , (x*50)+25, y*12);                
                counter++;
            } 
    }
    public int GetX(String alphabet){
        int x = 0;
        if (alphabet.equals("A") || alphabet.equals("a")) 
        {
         x=50;   
        }
        else if (alphabet.equals("B") || alphabet.equals("b")) 
        {
         x=100;   
        }
        else if (alphabet.equals("C") || alphabet.equals("c")) 
        {
         x=150;   
        }
        else if (alphabet.equals("D") || alphabet.equals("d")) 
        {
         x=200;   
        }
        else if (alphabet.equals("E") || alphabet.equals("e")) 
        {
         x=250;   
        }
        else if (alphabet.equals("F") || alphabet.equals("f")) 
        {
         x=300;   
        }
        else if (alphabet.equals("G") || alphabet.equals("g")) 
        {
         x=350;   
        }
        else if (alphabet.equals("H") || alphabet.equals("h")) 
        {
         x=400;   
        }
        else if (alphabet.equals("I") || alphabet.equals("i")) 
        {
         x=450;   
        }
        else if (alphabet.equals("J") || alphabet.equals("j")) 
        {
         x=500;   
        }
        else
        {
            System.out.println("Invalid Coordinate");
        }
        return x;
    }
    public int GetY(int num)
    {
     int y = 0;
        if (num == 1) 
        {
         y=50;   
        }
        else if (num == 2) 
        {
         y=100;   
        }
        else if (num == 3) 
        {
         y=150;   
        }
        else if (num == 4) 
        {
         y=200;   
        }
        else if (num == 5) 
        {
         y=250;   
        }
        else if (num == 6) 
        {
         y=300;   
        }
        else if (num == 7)
        {
         y=350;   
        }
        else if (num == 8)
        {
         y=400;   
        }
        else if (num == 9) 
        {
         y=450;   
        }
        else if (num == 10) 
        {
         y=500;   
        }
        else
        {
            System.out.println("Invalid Coordinate");
        }
        return y;
    }
    public void SetShips()
    {//placement of ships
    System.out.println("Place your carrier ");
    System.out.println("Enter the X coordinates ");
    int x = GetX(sc.next());
    System.out.println("Enter the Y coordinates ");
    int y = GetY(sc.nextInt());
    System.out.println("Horizontally or Vertically ");
    String ans = sc.next();
        if (ans.equals("H")||ans.equals("h")||ans.equals("Horizontally")|| ans.equals("horizontally") ) {
            int x1 = x+250;
            if (x1 > 550) 
            {
            System.out.println("Ship can't be placed horizontally here.");
            }
            else
            {   
                
                g.drawRect(x, y, 250, 50);
                g.fillRect(x, y, 250, 50);
            }
    } else if (ans.equals("V")||ans.equals("v")||ans.equals("Vertically")|| ans.equals("vertically") )
            {
             int y1 = y+250;       
             if (y1 > 550) 
            {
            System.out.println("Ship can't be placed vertically here.");
            }
            else
            {
                g.drawRect(x, y, 50, 250);
                g.fillRect(x, y, 50, 250);
            }
            }
     System.out.println("Place your Battleship ");
    System.out.println("Enter the X coordinates ");
    x = GetX(sc.next());
    System.out.println("Enter the Y coordinates ");
    y = GetY(sc.nextInt());
    System.out.println("Horizontally or Vertically ");
    ans = sc.next();
        if (ans.equals("H")||ans.equals("h")||ans.equals("Horizontally")|| ans.equals("horizontally") ) {
            int x1 = x+200;
            if (x1 > 550) 
            {
            System.out.println("Ship can't be placed horizontally here.");
            }
            else
            {
                g.drawRect(x, y, 200, 50);
                g.fillRect(x, y, 200, 50);
            }
    } else if (ans.equals("V")||ans.equals("v")||ans.equals("Vertically")|| ans.equals("vertically") )
            {
             int y1 = y+200;       
             if (y1 > 550) 
            {
            System.out.println("Ship can't be placed vertically here.");
            }
            else
            {
                g.drawRect(x, y, 50, 200);
                g.fillRect(x, y, 50, 200);
            }
            }
         System.out.println("Place your Destroyer ");
    System.out.println("Enter the X coordinates ");
    x = GetX(sc.next());
    System.out.println("Enter the Y coordinates ");
    y = GetY(sc.nextInt());
    System.out.println("Horizontally or Vertically ");
    ans = sc.next();
        if (ans.equals("H")||ans.equals("h")||ans.equals("Horizontally")|| ans.equals("horizontally") ) {
            int x1 = x+150;
            if (x1 > 550) 
            {
            System.out.println("Ship can't be placed horizontally here.");
            }
            else
            {  
                g.drawRect(x, y, 150, 50);
                g.fillRect(x, y, 150, 50);
            }
    } else if (ans.equals("V")||ans.equals("v")||ans.equals("Vertically")|| ans.equals("vertically") )
            {
             int y1 = y+150;       
             if (y1 > 550) 
            {
            System.out.println("Ship can't be placed vertically here.");
            }
            else
            {
                
                g.drawRect(x, y, 50, 150);
                g.fillRect(x, y, 50, 150);
            }
            }
         System.out.println("Place your Submarine ");
    System.out.println("Enter the X coordinates ");
    x = GetX(sc.next());
    System.out.println("Enter the Y coordinates ");
    y = GetY(sc.nextInt());
    System.out.println("Horizontally or Vertically ");
    ans = sc.next();
        if (ans.equals("H")||ans.equals("h")||ans.equals("Horizontally")|| ans.equals("horizontally") ) {
            int x1 = x+150;
            if (x1 > 550) 
            {
            System.out.println("Ship can't be placed horizontally here.");
            }
            else
            {
               
                g.drawRect(x, y, 150, 50);
                g.fillRect(x, y, 150, 50);
            }
    } else if (ans.equals("v")||ans.equals("V")||ans.equals("Vertically")|| ans.equals("vertically") )
            {
             int y1 = y+150;       
             if (y1 > 550) 
            {
            System.out.println("Ship can't be placed vertically here.");
            }
            else
            {   
                
                g.drawRect(x, y, 50, 150);
                g.fillRect(x, y, 50, 150);
            }
            }
         System.out.println("Place your Patrolboat ");
    System.out.println("Enter the X coordinates ");
    x = GetX(sc.next());
    System.out.println("Enter the Y coordinates ");
    y = GetY(sc.nextInt());
    System.out.println("Horizontally (H) or Vertically (V) ");
    ans = sc.next();
        if (ans.equals("H")||ans.equals("h")||ans.equals("Horizontally")|| ans.equals("horizontally") ) {
            int x1 = x+100;
            if (x1 > 550) 
            {
            System.out.println("Ship can't be placed horizontally here.");
            }
            else
            {   
               
                g.drawRect(x, y, 100, 50);
                g.fillRect(x, y, 100, 50);
            }
    } else if (ans.equals("V")||ans.equals("v")||ans.equals("Vertically")|| ans.equals("vertically") )
            {
             int y1 = y+100;       
             if (y1 > 550) 
            {
            System.out.println("Ship can't be placed vertically here.");
            }
            else
            {   
                
                g.drawRect(x, y, 50, 100);
                g.fillRect(x, y, 50, 100);
            }
            }
    }
    
    
    public static void main(String[] args) 
    {
       System.out.println("Enter Player 1 name: ");
       String name1 = sc.next();
       System.out.println("Enter Player 2 name: ");
       String name2 = sc.next();
        playgame pg = new playgame(name1, name2);
        do{
           pg.player1turn();
           pg.player2turn();
        }while(pg.totallives1 >0 && pg.totallives2 > 0);
        if(pg.totallives1 == 0){
            System.out.println("PLAYER 2 wins");
        }
        else if(pg.totallives2 == 0){
            System.out.println("PLAYER 1 wins");
        }
    }
    
}
class playgame extends Board
{//runs the game
    int totallives1 = 17;
    int totallives2 = 17;
    Board board1 = new Board("P1");
    Board board2 = new Board("P2");
    Board gridboard1 = new Board("P1Grid");
    Board gridboard2 = new Board("P2Grid");
    playgame(){}
    playgame(String name1, String name2){
        String p1 = name1;
        String p2 = name2;
        System.out.println("Player 1 turn");
        board1.SetShips();
         System.out.println("Player 2 turn");
        board2.SetShips();

    }
    public void player1turn()
    {   System.out.println("Player 1 Turn");
        System.out.println("Enter the X coordinate to attack:");
        int x = GetX(sc.next());
        System.out.println("Enter the Y coordinate to attack:");
        int y = GetY(sc.nextInt());
        Color color = board2.getColor(x, y);
        if (color.equals(Color.black)) 
        {
        System.out.println("HIT");
        gridboard1.g.setColor(Color.red);
        board2.g.setColor(Color.red);
        board2.g.drawOval(x, y, 50, 50);
        gridboard1.g.drawOval(x, y, 50, 50);
        gridboard1.g.fillOval(x, y, 50, 50);
        totallives2 --;
        }else if (color.equals(Color.blue))
        {
        System.out.println("MISS");
        gridboard1.g.setColor(Color.white);
        board2.g.setColor(Color.white);
        board2.g.drawOval(x, y, 50, 50);
        gridboard1.g.drawOval(x, y, 50, 50);
        gridboard1.g.fillOval(x, y, 50, 50);
        }
        
    }
    public void player2turn()
    {   System.out.println("Player 2 Turn");   
        System.out.println("Enter the X coordinate to attack:");
        int x = GetX(sc.next());
        System.out.println("Enter the Y coordinate to attack:");
        int y = GetY(sc.nextInt());
        Color color = board1.getColor(x, y);
        if (color.equals(Color.black)) 
        {
        System.out.println("HIT");
        gridboard2.g.setColor(Color.red);
        board1.g.setColor(Color.red);
        board1.g.drawOval(x, y, 50, 50);
        gridboard2.g.drawOval(x, y, 50, 50);
        gridboard2.g.fillOval(x, y, 50, 50);
        totallives1 --;
        }else if (color.equals(Color.blue))
        {
        System.out.println("MISS");
        gridboard2.g.setColor(Color.white);
        board1.g.setColor(Color.white);
        board1.g.drawOval(x, y, 50, 50);
        gridboard2.g.drawOval(x, y, 50, 50);
        gridboard2.g.fillOval(x, y, 50, 50);
        }
        
    }
}
