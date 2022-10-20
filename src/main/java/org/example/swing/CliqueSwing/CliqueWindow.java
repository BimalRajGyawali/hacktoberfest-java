package org.example.swing.CliqueSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class CliqueWindow extends JLayeredPane implements MouseListener {
    private ArrayList<RoundButton> buttonsPressed;
    private LineGraph lines;
    private CliqueGraph graph;
    private JFrame frame;
    private  JPopupMenu popupMenu;
    private JTextArea textAreaNodes;
    private JTextArea textAreaMaxClique;
    public int count = 0, x = 0, y = 0, x1, y1;

    JMenuItem joinNodes;
    JMenuItem removeUnionNodes;
    JMenuItem removeNode;
    JMenuItem findClique;

    public CliqueWindow() {
        buttonsPressed = new ArrayList<>();
        lines = new LineGraph();
        textAreaNodes = new JTextArea();
        textAreaMaxClique = new JTextArea();
        add(lines);
        addMouseListener(this);
    }

    public void setPopupMenu(JPopupMenu popup) {
        popupMenu = popup;
        createMenu();
    }

    public void setGraph(CliqueGraph graph) {
        this.graph = graph;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setLines(LineGraph lines) {
        this.lines = lines;
    }

    public void setTextAreas(JTextArea textAreaNodes, JTextArea textAreaMaxClique) {
        this.textAreaNodes = textAreaNodes;
        this.textAreaMaxClique = textAreaMaxClique;
    }

    private void refreshTextNodes() {
        textAreaNodes.setText("");
        textAreaNodes.setText(graph.toString());
    }

    private void removeOneNode(RoundButton button) {
        if (buttonsPressed.size() == 1) {
            this.remove(buttonsPressed.get(0));
            graph.removeNode(buttonsPressed.get(0));
            lines.removeLine(button);
            actualizarPantalla(frame);
            unselectNodes();
        } else {
            unselectNodes();
        }
    }

    private void createMenu() {
        joinNodes = new JMenuItem("Join Nodes");
        removeUnionNodes = new JMenuItem("Remove union Nodes");
        removeNode = new JMenuItem("Remove Node");
        findClique = new JMenuItem("Find max clique");
        popupMenu.add(joinNodes);
        popupMenu.add(removeUnionNodes);
        popupMenu.add(removeNode);
        popupMenu.add(findClique);
        popupMenu.addMouseListener(this);
        joinNodes.addActionListener(new MenuActionListener());
        removeUnionNodes.addActionListener(new MenuActionListener());
        removeNode.addActionListener(new MenuActionListener());
        findClique.addActionListener(new MenuActionListener());
    }

    public void actualizarPantalla(JFrame frame) {
        SwingUtilities.updateComponentTreeUI(frame);
        repaint();
    }

    private void unselectNodes() {
        for (RoundButton jButton : buttonsPressed) {
            jButton.changeColor = false;
        }
        buttonsPressed = new ArrayList<>();
    }

    public void showMenu(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popupMenu.setLocation(e.getLocationOnScreen());
            popupMenu.setVisible(true);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        lines.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            x = e.getX()-28;
            y = e.getY()-28;
            graph.addNode(e.getX()-28, e.getY()-28);
            graph.getLastGraphNodeButton().addActionListener(new ButtonActionListener());
            graph.getLastGraphNodeButton().setVisible(true);
            this.add(graph.getLastGraphNodeButton(), JLayeredPane.PALETTE_LAYER);
            System.out.println(graph);
            refreshTextNodes();
            graph.unselectClique();
            popupMenu.setVisible(false);
            repaint();
        } else if(e.getButton() == 3) {
            System.out.println("Click izquierdo presionado");
            showMenu(e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {showMenu(e);}

    @Override
    public void mouseReleased(MouseEvent e) {showMenu(e);}

    @Override
    public void mouseEntered(MouseEvent e) {showMenu(e);}

    @Override
    public void mouseExited(MouseEvent e) {showMenu(e);}

    private class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se apreto un boton");
            RoundButton button = graph.containsButtonNode((JButton) e.getSource());
            if (button != null) {
                if (buttonsPressed.size() <= 1) {
                    System.out.println("Se pinto un nodo");
                    System.out.println("Tamaño arreglo de dos nodos: " + buttonsPressed.size() + "\n");
                    graph.unselectClique();
                    button.changeColor = true;
                    buttonsPressed.add(button);
                } else {
                    unselectNodes();
                }
            } else {
                System.out.println("Si es nuloooo");
            }
            popupMenu.setVisible(false);
            actualizarPantalla(frame);
        }
    }

    private class MenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == joinNodes) {
                System.out.println("Unir nodos!");
                if (buttonsPressed.size() == 2) {
                    graph.joinNodes(buttonsPressed.get(0), buttonsPressed.get(1));
                    lines.createLine(graph.getCoordinateXOfNode(buttonsPressed.get(0)) + 28, graph.getCoordinateYOfNode(buttonsPressed.get(0)) + 28,
                            graph.getCoordinateXOfNode(buttonsPressed.get(1)) + 28, graph.getCoordinateYOfNode(buttonsPressed.get(1)) + 28,
                            buttonsPressed.get(0), buttonsPressed.get(1));
                    unselectNodes();
                    System.out.println(graph);
                }
            } else if (e.getSource() == removeUnionNodes) {
                System.out.println("Remover union de nodos");
                if (buttonsPressed.size() == 2) {
                    lines.removeLine(buttonsPressed.get(0), buttonsPressed.get(1));
                }
            } else if (e.getSource() == removeNode) {
                System.out.println("Remover nodo!:)");
                if (buttonsPressed.size() == 1) {
                    removeOneNode(buttonsPressed.get(0));
                    System.out.println(graph);
                }
            } else if (e.getSource() == findClique) {
                System.out.println("Encontrando el clique maximo!");
                textAreaMaxClique.setText("");
                graph.findMaxCliques();
                textAreaMaxClique.setText(graph.maxCliqueToString());
            }
            //unselectNodes();
            actualizarPantalla(frame);
            refreshTextNodes();
            popupMenu.setVisible(false);
        }
    }

}
