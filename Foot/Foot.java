import java.util.Scanner;

public class Foot extends FootShape{
       public void draw() {
        Foot d = new Foot();
        Scanner inp = new Scanner(System.in);
        System.out.println("What to draw 1. Ellipse, 2. Rectangle ");
        System.out.println("Enter number : ");
        int type = inp.nextInt();
        switch(type) {
            case 1 -> d.drawEllipse();
            case 2 -> d.drawRectangle();  
        }
        System.out.println(d.shape);
    } 
 public static void main(String[] args) {
       Foot f = new Foot();
       f.draw();        
    }
}