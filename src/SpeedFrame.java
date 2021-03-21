import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedFrame extends JFrame implements ActionListener {
    private JButton btn;
    private JPanel pnl;
    private JLabel lbl;
    private JLabel lbl1;
    private JSlider slide;
    private int value;
    public static int speed;


    public SpeedFrame(){
        btn = new JButton("OK");
        btn.addActionListener(this);
        lbl1 = new JLabel("Speed of snake");
        lbl = new JLabel("...");
        slide = new JSlider(1, 100, 1);
        slide.setMinorTickSpacing(5);
        slide.setMajorTickSpacing(10);
        slide.setPaintTicks(true);
        slide.addChangeListener((ChangeEvent event) -> {

            value = slide.getValue();
            lbl.setText(String.valueOf(value));

        });
        pnl = new JPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,125);
        setVisible(true);
        pnl.add(slide);
        pnl.add(lbl1);
        pnl.add(btn);
        pnl.add(lbl);
        add(pnl);



    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn){
            speed = 130-value;
            window();
            this.dispose();


        }
    }
    private void window(){
        //Creating the window with all its awesome snaky features
        Window f1= new Window();

        //Setting up the window settings
        f1.setTitle("Snake");
        f1.setSize(300,300);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
