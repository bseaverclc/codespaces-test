import javax.swing.*;
import java.awt.*;
public class Main
{
    public static void main(String[] args){
    //1
        JFrame frame = new JFrame();
        frame.setSize(400,400);
    //2
        Panel panel = new Panel();
        panel.setBackground(Color.BLUE);
        // This is where you can set a layout manager of the panel
        // If you don't set one, the default is FlowLayout
       

    //3 Add components
        //3a Create Components
        JLabel helloLabel = new JLabel("Hello World");
        JButton button1 = new JButton("Push Me");
        JTextField textfield1 = new JTextField(10);
        
        
        // adding an image
        // image must be in the same folder as the project or you
        // need to spedify the class path
        ImageIcon icon = new ImageIcon("pony.jpeg");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);
       
        //3b Add components to panel
        panel.add(helloLabel);
        panel.add(button1);
        panel.add(textfield1);
        panel.add(picLabel);

        frame.add(panel);

        frame.setVisible(true);

    }
}