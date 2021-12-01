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
import java.util.HashMap;
import java.util.Map;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class createAppointment extends JFrame {

    private JPanel structure = new JPanel();
    // two seperate Panel, left the text on the right the textfields 
    private JPanel left = new JPanel();
    private JPanel right = new JPanel();
    private JCheckBox flexible = new JCheckBox("flexible?");
    private JButton createbtn = new JButton("create");

    // to save the textfields
    private Map textfields = new HashMap<Integer,JTextField>();

    public createAppointment(){
        // structure of the frame
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
        // initialise textfields and add to frame 
        for (int i = 0; i < 6; i++){
            JTextField text = new JTextField(5);
            this.right.add(text);
            this.textfields.put(i,text);
        }
        // this.createbtn.addActionListener(new ActionListener(
        //     this.insertEvent()
        // ));
        this.right.add(createbtn);
        this.structure.add(this.right);
        this.add(structure, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new createAppointment();

    }

    public Object insertEvent(){
        return new Object(
            // startTime
        );
    }
    
}
