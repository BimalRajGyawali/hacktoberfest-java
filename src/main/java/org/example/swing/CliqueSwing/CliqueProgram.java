package org.example.swing.CliqueSwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CliqueProgram {
    private CliqueGraph graph;
    public JFrame frame;
    private CliqueWindow cliqueWindow;
    private LineGraph lines;
    private JTextArea textBoxNodes;
    private JTextArea textBoxMaxClique;
    public CliqueProgram() {
        LineGraph lineGraph = new LineGraph();

        Border borde = BorderFactory.createLineBorder(Color.green, 3);
        Border bordeText = BorderFactory.createLineBorder(Color.red, 3);

        graph = new CliqueGraph();
        lines = new LineGraph();
        cliqueWindow = new CliqueWindow();

        textBoxNodes = new JTextArea();
        textBoxMaxClique = new JTextArea();

        textBoxNodes.setBounds(502, 0, 282,450);
        textBoxNodes.setBorder(bordeText);
        textBoxMaxClique.setBounds(502, 452, 282,100);
        textBoxMaxClique.setBorder(bordeText);

        cliqueWindow.setLines(lines);
        cliqueWindow.setBorder(borde);
        cliqueWindow.setBounds(0,0, 500,562);
        cliqueWindow.setLayout(null);
        cliqueWindow.setBackground(null);
        cliqueWindow.setGraph(graph);
        cliqueWindow.setTextAreas(textBoxNodes, textBoxMaxClique);

        JPopupMenu popupMenu = new JPopupMenu();
        JComponent jComponent = new JLabel();
        jComponent.addMouseListener(cliqueWindow);
        cliqueWindow.setPopupMenu(popupMenu);

        frame = new JFrame("Clique");
        frame.getContentPane().add(jComponent);
        frame.add(cliqueWindow);
        frame.add(textBoxNodes);
        frame.add(textBoxMaxClique);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        cliqueWindow.setFrame(frame);

    }

    public void actualizarPantalla(JFrame frame) {
        SwingUtilities.updateComponentTreeUI(frame);
    }



}
