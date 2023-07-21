public class FootShape{
    
        public String shape;
        
        public void drawEllipse(){
            Ellipse ellipse = new Ellipse();
            shape =  ellipse.draw();
        }
        
        public void drawRectangle(){
            Rectangle rectangle = new Rectangle();
            shape = rectangle.draw();
        }
}