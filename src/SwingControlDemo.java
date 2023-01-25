import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class SwingControlDemo implements ActionListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta;
    private int WIDTH=800;
    private int HEIGHT=700;

    private JFrame frame1;
    private JFrame frame2;
    private JFrame frame3;
    private JFrame frame4;
    private JFrame frame5;

    public SwingControlDemo() {
        prepareGUI();
        prepareGUI1();
        prepareGUI2();
        prepareGUI3();
        prepareGUI4();
        prepareGUI5();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 1));

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        mainFrame.add(mb);
        mainFrame.add(ta);
        mainFrame.setJMenuBar(mb);

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

       // mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void prepareGUI1(){
        frame1 = new JFrame("frame1");
        frame1.setSize(WIDTH, HEIGHT);
        frame1.setLayout(new GridLayout(2, 3));
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");

        frame1.add(button1);
        frame1.add(button2);
        frame1.add(button3);
        frame1.add(button4);
        frame1.add(button5);

        frame1.setVisible(true);
    }

    private void prepareGUI2(){
        frame2 = new JFrame("frame2");
        frame2.setSize(WIDTH,HEIGHT);
        frame2.setLayout(new BorderLayout());
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");

        frame2.add(button1,BorderLayout.NORTH);
        frame2.add(button2,BorderLayout.WEST);
        frame2.add(button3,BorderLayout.CENTER);
        frame2.add(button4,BorderLayout.EAST);
        frame2.add(button5,BorderLayout.SOUTH);

        frame2.setVisible(true);
    }

    private void prepareGUI3(){
        frame3 = new JFrame("frame3");
        frame3.setSize(WIDTH,HEIGHT);
        frame3.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3));

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");

        JLabel label1 = new JLabel("1");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label2 = new JLabel("2");
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label3 = new JLabel("3");
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(button3);
        panel.add(label1);
        panel.add(button4);
        panel.add(label2);
        panel.add(button5);

        frame3.add(button1,BorderLayout.NORTH);
        frame3.add(button2,BorderLayout.SOUTH);
        frame3.add(panel,BorderLayout.CENTER);

        frame3.setVisible(true);
    }

    private void prepareGUI4(){
        frame4 = new JFrame("frame4");
        frame4.setSize(WIDTH,HEIGHT);
        frame4.setLayout(new GridLayout(3,3));

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("10");

        JLabel label1 = new JLabel("1");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label1,BorderLayout.CENTER);
        panel.add(button5,BorderLayout.EAST);
        panel.add(button6,BorderLayout.SOUTH);

        frame4.add(button1);
        frame4.add(button2);
        frame4.add(button3);
        frame4.add(button4);
        frame4.add(panel);
        frame4.add(button7);
        frame4.add(button8);
        frame4.add(button9);
        frame4.add(button10);

        frame4.setVisible(true);

    }

    private void prepareGUI5(){
        frame5 = new JFrame("frame5");
        frame5.setSize(WIDTH,HEIGHT);
        frame5.setLayout(new BorderLayout());

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("10");

        JTextArea textArea = new JTextArea();

        JLabel label1 = new JLabel("1");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label2 = new JLabel("2");
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label3 = new JLabel("3");
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label4 = new JLabel("4");
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label5 = new JLabel("5");
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label6 = new JLabel("6");
        label6.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label7 = new JLabel("7");
        label7.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label8 = new JLabel("8");
        label8.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label9 = new JLabel("9");
        label9.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label10 = new JLabel("10");
        label10.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label11 = new JLabel("11");
        label11.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel(new GridLayout(2,1));

        JPanel panelUp = new JPanel(new GridLayout(1,2));
        JPanel panelDown = new JPanel(new GridLayout(1,1));

        JPanel panel1 = new JPanel(new GridLayout(3,3));
        panel1.add(label1);
        panel1.add(button1);
        panel1.add(label2);
        panel1.add(button2);
        panel1.add(label3);
        panel1.add(button3);
        panel1.add(label4);
        panel1.add(button4);
        panel1.add(label5);

        JPanel panel2 = new JPanel(new GridLayout(2,1));
        panel2.add(label6);
        panel2.add(button5);

        panelUp.add(panel1);
        panelUp.add(panel2);
        panelDown.add(textArea);

        panel.add(panelUp);
        panel.add(panelDown);

        frame5.add(panel,BorderLayout.CENTER);

        JPanel panel3 = new JPanel(new GridLayout(1,9));
        panel3.add(label7);
        panel3.add(button6);
        panel3.add(label8);
        panel3.add(button7);
        panel3.add(label9);
        panel3.add(button8);
        panel3.add(label10);
        panel3.add(button9);
        panel3.add(label11);

        frame5.add(panel3,BorderLayout.SOUTH);

        frame5.setVisible(true);

    }

    private void showEventDemo() {
        headerLabel.setText("Control in action: Button");

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}