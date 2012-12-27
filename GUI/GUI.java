import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
 
 private JTextArea output;
 private JTextField input;
 private JTextArea logUsers;
 private JButton send;
 
 public GUI(){
  setTitle("FML IRC");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  setSize(400, 400);
  setLayout(new GridLayout(1,2));
  
  }

 
 public static void main(String[] args) {
  
  GUI gui = new GUI();
  gui.setVisible(true);
  
 }


}