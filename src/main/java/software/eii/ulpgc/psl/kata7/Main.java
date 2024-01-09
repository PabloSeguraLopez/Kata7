package software.eii.ulpgc.psl.kata7;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new JFrame(){
            {
                this.setTitle("Kata 7");
                this.setLocationRelativeTo(null);
                this.setSize(300,300);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setLayout(new FlowLayout());
                this.add(new JLabel("Esta es la kata 7"));
            }
        }.setVisible(true);
    }
}
