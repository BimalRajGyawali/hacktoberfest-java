package org.example.swing.CliqueSwing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LineGraph extends JPanel {
    public ArrayList<Line> lines;
    private JButton unionNode1, unionNode2;
    int count = 0;

    public LineGraph() {
        lines = new ArrayList<>();
    }

    public void createLine(int x1, int y1, int x2, int y2, RoundButton button1, RoundButton button2) {
        lines.add(new Line(x1, y1, x2, y2, count, button1, button2));
        count ++;
    }

    public void removeLine(RoundButton button) {
        ArrayList<Line> linesRemove = (ArrayList<Line>) lines.clone();
        for (Line line : linesRemove) {
            if (line.button1 == button || line.button2 == button) {
                lines.remove(line);
            }
        }
    }

    public void removeLine(RoundButton button1, RoundButton button2) {
        ArrayList<Line> linesRemove = (ArrayList<Line>) lines.clone();
        for (Line line : linesRemove) {
            if (line.button1 == button1 && line.button2 == button2) {
                lines.remove(line);
            } else if (line.button1 == button2 && line.button2 == button1) {
                lines.remove(line);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Line line : lines) {
            line.draw(g);
        }
    }

    public void repaintLines() {
        repaint();
    }

    public class Line {
        private final RoundButton button1;
        private final RoundButton button2;
        private int x1, x2;
        private int y1, y2;

        public Line(int x1, int y1, int x2, int y2, int id, RoundButton unionButton1, RoundButton unionButton2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            button1 = unionButton1;
            button2 = unionButton2;
        }

        public void draw(Graphics graphics) {
            Graphics2D graphics2D = (Graphics2D) graphics;
            graphics2D.setColor(Color.blue);
            BasicStroke basicStroke = new BasicStroke(3);
            graphics2D.setStroke(basicStroke);
            graphics2D.drawLine(x1, y1, x2, y2);
        }
    }

}
