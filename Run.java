import javax.swing.*;
import java.awt.*;

public class Run{
    
    public static String title = "BlueStuff";
    public static Dimension size = new Dimension(900,900);
    public static JFrame driver;
    
    public void Run(){
	driver = new JFrame("Driver Frame");
	driver.setTitle(title);
	driver.setSize(size);
	driver.setResizable(false);
	driver.setLocationRelativeTo(null);
	driver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	driver.setLayout(new GridLayout(1,1,0,0));
	driver.setVisible(true);
	init();
    }

    public void init(){
	GamePlay screen = new GamePlay();
	driver.add(screen);
	

	
    }

    public static void main(String[]args){
	Run game = new Run();
    }


}
