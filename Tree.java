package Forest;
import java.lang.Math.*;
import java.util.*;

// Implements a basic Tree 
public class Tree {

    // Activity #1: Code along
    // Add the following:
    //   - root Node
    //   - 2 constructors: no argument, root argument
    //   - setRoot(node)
    //   - getRoot()
    //   - add(): adds a node to some random location
    //   - createSomeTree()
  private Node root;
  public Tree() {
    this(new Node());
  }

    public Tree(Node root) {
      setRoot(root);

    }

    public void setRoot(Node root) {
      this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    /**
    * add one Node randomly to the Tree
    */
    public void add() {
        Node child = new Node();
        // if root has any children, 75% of time, add to child
        // otherwise add to root
        Node parent = root;
        while (parent.hasChildren() && Math.random() > 0.15) {
          parent = parent.getRandomChild();
        }
        parent.addChild(child);
    }

    public static Tree createSomeTree() {
        Tree tree = new Tree();
        // randomly add some number of nodes to this tree
        int number = (int) (Math.random() * 100);
        for (int i = 0; i < number; i++) {
          tree.add();
        }
        return tree;
    }
}
