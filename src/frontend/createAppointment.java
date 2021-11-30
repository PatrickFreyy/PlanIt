package frontend;

import javax.swing.JButton;

// import java.util.ArrayList;

// import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class createAppointment extends JFrame {

    private JPanel structure = new JPanel();
    private JPanel left = new JPanel();
    private JPanel right = new JPanel();
    private JCheckBox flexible = new JCheckBox("flexible?");
    private JButton createbtn = new JButton("create");

    // private ArrayList textfields = new ArrayList(JTextField);

    public createAppointment(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Create Event");
        this.setSize(300, 300);
        this.setLayout(new BorderLayout());
        this.structure.setLayout(new GridLayout(1,2,5,5));
        this.left.setLayout(new GridLayout(7,1,5,5));
        this.right.setLayout(new GridLayout(7,1,5,5));

        this.left.add(new JLabel("name of the event"));
        this.left.add(new JLabel("Start Date"));
        this.left.add(new JLabel("Start time"));
        this.left.add(new JLabel("End date"));
        this.left.add(new JLabel("End time"));
        this.left.add(new JLabel("category"));
        this.left.add(this.flexible);
        this.structure.add(this.left);
        // this.add(new  JLabel("Test"));
        for (int i = 0; i < 6; i++){
            JTextField text = new JTextField(10);
            this.right.add(text);
            // this.textfields.put(text);
        }
        this.right.add(createbtn);
        this.structure.add(this.right);
        this.add(structure, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Test");
        new createAppointment();

    }

    
    
}
