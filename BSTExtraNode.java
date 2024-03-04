package Forest;

/*
 * This class:
 *   - IS-A BSTNode
 *       : Each node HAS-A value
 *       : is "sorted" as a Binary Search Tree is sorted
 *   - HAS-A count of how many total children (all descendants)
 */
public class BSTExtraNode extends BSTNode {
    // TODO:
    //   - add children count instance field
  private int childrenCount;
  private int value;
  private int height;
  private int sumDescendants;

    public BSTExtraNode(int value) {
        // TODO: Call super constructor!!
      super(value);

    }

    public String toString() {
        return "The count of children: ";
  }

    public void countChildren() {
      this.childrenCount = countNodes(this);
    }

    public void countHeight() {
        this.height = super.heightOfNode(this);
    }

    public void sumTotal() {
        this.sumDescendants = super.sumNodes(this, 0);
    }
}