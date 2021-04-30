import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Jfame;
public class Circle extends JFrame
{
public Circle()
{
setTitle("Circle");
setSize(200,200);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void paint(Graphics g)
{
g.setColor(Color.BLUE);
g.drawOval(200,200,200,200);
}
public static void main(String[] args)
{
Circle t = new Circle();
t.paint(null);
}
}

