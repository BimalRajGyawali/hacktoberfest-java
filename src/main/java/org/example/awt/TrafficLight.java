package org.example.awt;

import java.awt.*;
import java.awt.event.*;


class LightDrawing extends Component {


    private static final long serialVersionUID = 1L;
    Color stop = Color.gray;
    Color caution = Color.gray;
    Color go = Color.gray;

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillRect(0, 0, 150, 250);

        g.setColor(Color.black);
        g.drawRect(0, 0, 150, 250);
        g.setColor(stop);
        g.fillOval(50, 30, 50, 50);
        g.setColor(Color.black);
        g.drawOval(50, 30, 50, 50);
        g.setColor(caution);
        g.fillOval(50, 100, 50, 50);
        g.setColor(Color.black);
        g.drawOval(50, 100, 50, 50);
        g.setColor(go);
        g.fillOval(50, 170, 50, 50);
        g.setColor(Color.black);
        g.drawOval(50, 170, 50, 50);

    }

    public void changeColour(String str) {

        stop = Color.gray;
        caution = Color.gray;
        go = Color.gray;
        if (str == "red") {
            stop = Color.red;
        } else if (str == "yellow") {
            caution = Color.orange;
        } else if (str == "green") {
            go = Color.green;
        }
        repaint();
    }

}


public class TrafficLight extends Frame {

    private static final long serialVersionUID = 1L;

    private Frame mainFrame;
    private Label headLabel;
    private Panel controlPanel1, controlPanel2;
    Checkbox red, yellow, green;
    CheckboxGroup bg;
    LightDrawing drawing;

    public TrafficLight() {
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new Frame("TRAFFIC LIGHT");
        mainFrame.setSize(300, 400);
        //mainFrame.setLayout(new GridLayout(3,1));
        headLabel = new Label("", Label.CENTER);
        headLabel.setPreferredSize(new Dimension(0, 50));

        drawing = new LightDrawing();
        drawing.setPreferredSize(new Dimension(160, 360));
        bg = new CheckboxGroup();
        red = new Checkbox("STOP", bg, false);
        yellow = new Checkbox("CAUTION", bg, false);
        green = new Checkbox("GO", bg, false);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent WindowEvent) {
                System.exit(0);
            }
        });


        controlPanel1 = new Panel();
        controlPanel2 = new Panel();
        controlPanel2.setPreferredSize(new Dimension(0, 50));
        mainFrame.add(headLabel, BorderLayout.NORTH);
        mainFrame.add(controlPanel1, BorderLayout.CENTER);
        mainFrame.add(controlPanel2, BorderLayout.SOUTH);

    }

    private void showEvent() {
        headLabel.setText("Select a Radio Button");
        controlPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        controlPanel1.add(drawing);
        controlPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        controlPanel2.add(red);
        controlPanel2.add(yellow);
        controlPanel2.add(green);
        mainFrame.setVisible(true);

        red.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                headLabel.setText("Stop.!!");
                drawing.changeColour("red");

            }
        });
        yellow.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                headLabel.setText("Caution..!");
                drawing.changeColour("yellow");
            }
        });
        green.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                headLabel.setText("Go...");
                drawing.changeColour("green");
            }
        });
    }


    public static void main(String args[]) {
        TrafficLight Demo = new TrafficLight();
        Demo.showEvent();

    }
}
