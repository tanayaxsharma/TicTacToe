package Forest;

/*
 * This class:
 *    - is a node for a Binary Search Tree... a BSTNode.
 *    - inherits from Node so that the BST can be drawn.
 *    - IS-A Node that HAS-A integer
 * 
 * This class will:
 *   - provide an abstraction for Left and Right children.
 *   - have getters/setters for Left/Right children.
 *   - have a default constructor to hold a simple zero integer value.
 *   - have a constructor to set this node to a specific integer value.
 *   - implement Comparable<> for convenient comparisons.
 *   - override toString() to display information nicely.
 *
 */
public class BSTNode extends Node implements Comparable<BSTNode> {

    // TODO: add instance fields as needed
  private int value;

  public BSTNode() {
    this(0);
  }

  public BSTNode(int info) {
    super();
        // TODO: Add two null children nodes
    getChildren().add(null);
    getChildren().add(null);
    this.value = info;
        // TODO: add info to this node's state

  }

  public int getValue() {
    return this.value;
  }

  public void setLeft(BSTNode node) {
    // Not yet implemented
    getChildren().set(0, node);
  }

  public void setRight(BSTNode node) {
    getChildren().set(1, node);
  }

  public BSTNode getLeft() {
    // Not yet implemented
        return (BSTNode) getChildren().get(0);
  }

  public BSTNode getRight() {
    // Not yet implemented
    return (BSTNode) getChildren().get(1);
  }

  public int getInfo() {
    // Not yet implemented
        return 0;
  }

    @Override
    public void clickEvent() {
//        processInOrder(this);
        System.out.println(countNodes(this));
    }

    // TODO: override toString()
    public String toString() {
      return "" + value;
    }

    public int countNodes(BSTNode node) {
      if (node == null) {
        return 0;
      }
      int left = countNodes(node.getLeft());
      int right = countNodes(node.getRight());

      return left + right + 1;

    }

    public int heightOfNode(BSTNode node) {
      if (node == null) {
        return 0;
      }

      int left = heightOfNode(node.getLeft());
      int right = heightOfNode(node.getRight());

      return Math.max(left, right) + 1;
    }

    public int sumNodes(BSTNode node, int sum) {
      if (node == null) {
        return 0;
      }
      int left = sumNodes(node.getLeft(), sum + node.getLeft().getValue());
      int right = sumNodes(node.getRight(), sum + node.getLeft().getValue());

      return left + right + node.getValue();

    }

    private void processInOrder(BSTNode node) {
      if (node == null) {
        return;
      }
      processInOrder(node.getLeft());
      System.out.print(node.getValue() + " ");
      processInOrder(node.getRight());
    }

  @Override
  public int compareTo(BSTNode o) {
    // Not yet implemented
        return this.getValue() - o.getValue();
  }
}
