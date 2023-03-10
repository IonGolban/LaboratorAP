import java.nio.file.NotDirectoryException;
import java.util.ArrayList;
import java.util.List;

public class Lab3Compulsory {
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(new Person("Ion"));
        nodes.add(new Person("Sergiu"));
        nodes.add(new Company("Yahoo"));
        nodes.add(new Company("Google"));

        nodes.forEach(node -> System.out.println(node.getName()));
    }
}
