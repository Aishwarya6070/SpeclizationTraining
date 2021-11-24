package TodoApp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddTodo extends JPanel {
    public AddTodo(int x, int y, String todo, JFrame frame) {
        JLabel label = new JLabel(todo);
        label.setBounds(10, 0, 490, 50);
        label.setFont(new Font("Aerial", Font.ITALIC, 22));
        label.setLayout(null);

        JButton button = new JButton("Delete");
        button.setBounds(500, 0, 100, 50);
        button.setFocusable(false);
        button.setBackground(Color.white);
        button.setForeground(Color.white);
        button.setIcon(new ImageIcon("C:/Users/user493/Downloads/delete.jfif"));
        button.addActionListener(e -> {
            frame.remove(this);
            frame.repaint();
        });
        button.setLayout(null);

        this.add(label);
        this.add(button);
        this.setBounds(x, y, 600, 50);
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        this.setLayout(null);

    }
}
