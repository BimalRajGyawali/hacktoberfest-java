package org.example.swing.CliqueSwing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CliqueGraph {
    public ArrayList<Node> maxClique;
    public ArrayList<Node> allNodes;
    public Integer countCliques;
    public Integer countIdNodes;
    public Integer countNodes;

    public CliqueGraph() {
        formatGraph();
    }

    public boolean addNode(String name) {
        if (!searchSameName(name)) {
            allNodes.add(new Node(name));
            return true;
        }
        return false;
    }

    public boolean addNode(int x, int y) {
        countNodes ++;
        countIdNodes ++;
        System.out.println("Nodos: " + countNodes);
        String name = String.valueOf(countIdNodes);
        if (!searchSameName(name)) {
            allNodes.add(new Node(name, x, y));
            return true;
        }
        return false;
    }

    public boolean removeNode(String name) {
        Node node = searchNode(name);
        if (node != null) {
            countNodes --;
            for (Node nodeAux : node.neighbors) {
                nodeAux.deleteNeighbor(node);
            }
            allNodes.remove(node);
            return true;
        }
        return false;
    }

    public boolean removeNode(JButton button) {
        for (Node node : allNodes) {
            if (node.getButton() == button) {
                countNodes --;
                if (node == allNodes.get(allNodes.size()-1)) {
                    countIdNodes--;
                }
                System.out.println("Se encontro el nodo");
                System.out.println("Nombre del nodo: " + node);
                allNodes.remove(node);
                return true;
            }
        }
        return false;
    }

    public boolean joinNodes(int first, int second) {
        if (allNodes.size() < 2 || first == second)  {
            return false;
        }
        if ((first >= 1 && first <= allNodes.size()) && (second >= 1 && second <= allNodes.size())) {
            if (allNodes.get(first-1).addNeighbor(allNodes.get(second-1))) {
                allNodes.get(second-1).addNeighbor(allNodes.get(first-1));
                return true;
            }
        }
        return false;
    }

    public boolean joinNodes(JButton button1, JButton button2) {
        Node node1 = searchNode(button1);
        Node node2 = searchNode(button2);
        if (node1 == null || node2 == null) {
            return false;
        }
        node1.addNeighbor(node2);
        node2.addNeighbor(node1);
        return true;
    }

    public RoundButton getLastGraphNodeButton() {
        if (countNodes == 0) {
            return null;
        }
        return allNodes.get(countNodes-1).getButton();
    }

    public int getCoordinateXOfNode(JButton button) {
        Node findNode = searchNode(button);
        if (findNode != null) {
            return findNode.getX();
        }
        return -1;
    }

    public int getCoordinateYOfNode(JButton button) {
        Node findNode = searchNode(button);
        if (findNode != null) {
            return findNode.getY();
        }
        return -1;
    }

    public void formatGraph() {
        maxClique = new ArrayList<Node>();
        allNodes = new ArrayList<Node>();
        countNodes = 0;
        countCliques = 0;
        countIdNodes = 0;
    }

    public Node searchNode(String name) {
        for (Node node : allNodes) {
            if (node.name.equals(name)) {
                return node;
            }
        }
        return null;
    }

    public Node searchNode(JButton button) {
        for (Node node : allNodes) {
            if (node.getButton() == button) {
                System.out.println("Se encontro el nodo");
                System.out.println("Nombre del nodo: " + node);
                return node;
            }
        }
        return null;
    }

    public RoundButton containsButtonNode(JButton button) {
        for (Node node : allNodes) {
            if (node.getButton() == button) {
                return node.getButton();
            }
        }
        return null;
    }

    public boolean searchSameName(String name) {
        for (Node node : allNodes) {
            if (node.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Node> getAllNodes() {
        return allNodes;
    }

    public void unselectClique() {
        for (Node node : maxClique) {
            //allNodes.get(allNodes.indexOf(node)-1).button.changeColor = true;
            searchNode(node.name).button.changeColor = false;
        }
    }

    public ArrayList<Node> findMaxCliques() {
        if (allNodes.size() <= 2) {
            return null;
        }
        ArrayList<Node> allNodesCopy = new ArrayList<>();
        allNodesCopy.addAll(allNodes);
        countCliques = findCliques(new ArrayList<>(), allNodesCopy, new ArrayList<>(), 0);
        allNodes.addAll(allNodesCopy);
        for (Node node : maxClique) {
            searchNode(node.name).button.changeColor = true;
        }
        return maxClique;
    }

    private int findCliques(ArrayList<Node> potentialClique, ArrayList<Node> remainingNodes, ArrayList<Node> skipNodes, int depth) {
        if (remainingNodes.size() == 0 && skipNodes.size() == 0 && potentialClique.size() > 1) {
            if (maxClique.size() < potentialClique.size()) {
                maxClique = potentialClique;
            }
            return 1;
        }
        int foundCliques = 0;
        ArrayList<Node> copyRemainingNodes = (ArrayList<Node>) remainingNodes.clone();
        for (Node node : copyRemainingNodes) {
            ArrayList<Node> newPotentialClique = (ArrayList< Node>) potentialClique.clone();
            newPotentialClique.add(node);
            ArrayList<Node> tmp = new ArrayList<>();
            for (Node n : remainingNodes) {
                if (node.neighbors.contains(n)) {
                    tmp.add(n);
                }
            }
            ArrayList<Node> newRemainingNodes = (ArrayList<Node>) tmp.clone();
            tmp = new ArrayList<>();
            for (Node n : skipNodes) {
                if (node.neighbors.contains(n)) {
                    tmp.add(n);
                }
            }
            ArrayList<Node> newSkipList = (ArrayList<Node>) tmp.clone();
            foundCliques += findCliques(newPotentialClique, newRemainingNodes, newSkipList, depth+1);
            remainingNodes.remove(node);
            skipNodes.add(node);
        }
        return foundCliques;
    }

    public String maxCliqueToString() {
        String cliqueString = "Clique maximo encontrado: \nclique: (";
        if (maxClique.size() == 0) {
            return cliqueString+")";
        }
        for (Node node : maxClique) {
            cliqueString += node.toString() + ", ";
        }
        return cliqueString + ")";
    }

    @Override
    public String toString() {
        if (allNodes.size() == 0) {
            return "Graph doesnt exists";
        }
        int count = 1;
        String string = "Nodes in the graph: \n";
        for (Node node : allNodes) {
            string += String.valueOf(count) + ".- " + node.toString() + ": ( ";
            for (Node nodeAux : node.neighbors) {
                string += nodeAux.toString() + ", ";
            }
            string += ")\n";
            count ++;
        }
        return string;
    }

    private class Node {
        private String name;
        private ArrayList<Node> neighbors;
        private int x, y;
        RoundButton button;

        public Node(String name) {
            this(name, 0,0);
        }

        public Node(String name, int x, int y) {
            this.x = x;
            this.y = y;
            this.name = name;
            neighbors = new ArrayList<>();
            button = new RoundButton();
            button.setBounds(x, y, 56, 56);
            button.setText(name);
            button.setVerticalTextPosition(JButton.CENTER);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setFont(new Font("MV Boli",  Font.PLAIN,16));
        }

        private boolean addNeighbor(Node node) {
            if (!neighbors.contains(node)) {
                neighbors.add(node);
                return true;
            }
            return false;
        }

        private void deleteNeighbor(Node node) {
            neighbors.remove(node);
        }

        private RoundButton getButton() {
            return button;
        }

        private int getX() {
            return x;
        }

        private int getY() {
            return y;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
