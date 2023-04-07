package quiz.application;

import java.awt.Color;
import javax.swing.JFrame;

public class Login extends JFrame {
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1200, 500);
        setLocation(200, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Login();
    }        
    
}
