
package csci251projfive;


/**
 * Class TreeNode. Represents a node in a Binary Search Tree.
 * * @author Daniel Obazee
 * @version April 13, 2026
 * @param <E> The type of data stored in this node
 */
public class TreeNode<E extends Comparable<E>> {
    E data;
    TreeNode<E> parent;
    TreeNode<E> left;
    TreeNode<E> right;

    /**
     * Constructor constructs a tree node with every field as null
     */
    public TreeNode() {
        this.data = null;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructor constructs a tree node with all node reference null to hold given data
     * @param data The given data of type E
     */
    public TreeNode(E data) {
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    /**
     * Sets this node's data as given data
     * @param data The given data of type E
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Gets this node's data
     * @return the node's data of type E
     */
    public E getData() {
        return data;
    }

    /**
     * Sets this node's parent node as given node
     * @param parent The given node 
     */
    public void setParent(TreeNode<E> parent) {
        this.parent = parent;
    }

    /**
     * Gets this node's parent node
     * @return the node's parent node
     */
    public TreeNode<E> getParent() {
        return parent;
    }

    /**
     * Sets this node's left child node as given node
     * @param left The given node 
     */
    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    /**
     * Gets this node's left child node
     * @return the node's left child node
     */
    public TreeNode<E> getLeft() {
        return left;
    }

    /**
     * Sets this node's right child node as given node
     * @param right The given node 
     */
    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    /**
     * Gets this node's right child node
     * @return the node's right child node
     */
    public TreeNode<E> getRight() {
        return right;
    }

    /**
     * @return true if this node is the left child of its parent
     */
    public boolean isLeftChild() {
        return parent != null && parent.left == this;
    }

    /**
     * @return true if this node is the right child of its parent
     */
    public boolean isRightChild() {
        return parent != null && parent.right == this;
    }

    /**
     * @return true if this node is a leaf
     */
    public boolean isLeaf() {
        return left == null && right == null;
    }

    /**
     * @return true if this node is a root
     */
    public boolean isRoot() {
        return parent == null;
    }
}