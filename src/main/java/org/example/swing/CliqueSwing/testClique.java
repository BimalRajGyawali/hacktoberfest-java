package org.example.swing.CliqueSwing;

public class testClique {
    public static void main(String[] args) {
        new CliqueProgram();

        /*
        CliqueMouseGUI cliqueMouseGUI = new CliqueMouseGUI();
        JFrame frame = new JFrame("Clique");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.add(cliqueMouseGUI);
        frame.setVisible(true);

         */

        /*
        do {
            System.out.print("\t.-Menu.-\n" +
                               "1.- Agregar nodo al grafo.\n" +
                               "2.- Eliminar nodo. \n" +
                               "3.- Conectar nodos.\n" +
                               "4.- Imprmir nodos.\n" +
                               "5.- Maximo clique: \n" +
                               "6.- Salir.\n" +
                               "Respuesta: " );
            ans = scanner.nextInt();
            scanner.nextLine();
            switch (ans) {
                case 1:
                    System.out.print("Node name: ");
                    clique.addNode(scanner.nextLine());
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Que nodo borrara: ");
                    System.out.println(clique);
                    System.out.print("Respuesta: ");
                    if (clique.removeNode(scanner.nextLine())) {
                        System.out.println("Nodo no existe!\n");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Que nodo juntara: \n" + clique + "\n");
                    System.out.print("Indice uno: ");
                    int node1 = scanner.nextInt();
                    System.out.print("Indice dos: ");
                    int node2 = scanner.nextInt();
                    System.out.println("indices: " + node1 + " - " + node2);
                    if (!clique.joinNodes(node1, node2)) {
                        System.out.println("Error al enlazar!\n");
                    }
                    break;
                case 4:
                    System.out.println("\n" + clique + "\n");
                    break;
                case 5:
                    System.out.println("Clique maximo: " + clique.findMaxCliques());
                    break;
                case 6:
                    System.out.println("adios:)");
                    break;
                default:
                    System.out.println("Opcion no valida!\n");
                    break;
            }
        } while (ans != 6);

         */
    }
}
