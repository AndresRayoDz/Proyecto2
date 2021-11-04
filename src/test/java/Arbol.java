import java.util.Optional;


/**
 *
 * @author Valerine
 */
public class Arbol {
    public static void Arbol(String[] args) {
        Nodo root = new Nodo(10);
        root.add(5);
        root.add(15);
        root.add(8);

        Optional<Nodo> result = root.find(11);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }

        result = root.find(8);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }
        System.out.println("Print in order");
        root.printInOrder();
        System.out.println("Print pos order");
        root.printPosOrder();
        System.out.println("Print pre order");
        root.printPreOrder();
    }
}

