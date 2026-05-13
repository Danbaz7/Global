package csci251projfive;

/**
 * Class BinarySearchTree. Implements BST logic compatible with CSCI251ProjFive.
 * * @author Daniel Obazee
 * @version April 13, 2026
 * @param <E> The type of elements held in this tree
 */
public class BinarySearchTree<E extends Comparable<E>> {
    private TreeNode<E> root;
    private int size;

    /**
     * Constructor for an empty tree
     */
    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    /**
     * @param data The integer data to add to the tree
     */
    public void insert(E data) {
        if (root == null) {
            root = new TreeNode<>(data);
            size++;
            return;
        }
        insertNode(root, data);
    }

    /**
     * Internal helper for recursive insertion
     * @param current The node being compared
     * @param data The data to insert
     */
    private void insertNode(TreeNode<E> current, E data) {
        int cmp = data.compareTo(current.getData());
        if (cmp < 0) {
            if (current.getLeft() == null) {
                TreeNode<E> newNode = new TreeNode<>(data);
                newNode.setParent(current);
                current.setLeft(newNode);
                size++;
            } else {
                insertNode(current.getLeft(), data);
            }
        } else if (cmp > 0) {
            if (current.getRight() == null) {
                TreeNode<E> newNode = new TreeNode<>(data);
                newNode.setParent(current);
                current.setRight(newNode);
                size++;
            } else {
                insertNode(current.getRight(), data);
            }
        }
    }

    /**
     * @param data The data to remove
     * @return true if successfully removed, false otherwise
     */
    public boolean remove(E data) {
        TreeNode<E> node = search(data);
        if (node == null) return false;

        if (node.getLeft() != null && node.getRight() != null) {
            TreeNode<E> successor = getSuccessor(node);
            node.setData(successor.getData());
            node = successor;
        }

        TreeNode<E> replacement = (node.getLeft() != null) ? node.getLeft() : node.getRight();

        if (replacement != null) {
            replacement.setParent(node.getParent());
            if (node.isRoot()) root = replacement;
            else if (node.isLeftChild()) node.getParent().setLeft(replacement);
            else node.getParent().setRight(replacement);
        } else if (node.isRoot()) {
            root = null;
        } else {
            if (node.isLeftChild()) node.getParent().setLeft(null);
            else node.getParent().setRight(null);
        }

        size--;
        return true;
    }

    /**
     * @param data The data to search for
     * @return The TreeNode if found, null otherwise
     */
    public TreeNode<E> search(E data) {
        TreeNode<E> current = root;
        while (current != null) {
            int cmp = data.compareTo(current.getData());
            if (cmp == 0) return current;
            current = (cmp < 0) ? current.getLeft() : current.getRight();
        }
        return null;
    }

    /**
     * @return number of nodes in tree
     */
    public int size() {
        return size;
    }

    /**
     * @return true if tree has no nodes
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * @return the maximum depth of the tree
     */
    public int height() {
        return getHeight(root);
    }

    /**
     * @param node the node to calculate height from
     * @return the height of the subtree
     */
    private int getHeight(TreeNode<E> node) {
        if (node == null) return -1;
        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }

    /**
     * @param node the node to find successor for
     * @return the in-order successor node
     */
    private TreeNode<E> getSuccessor(TreeNode<E> node) {
        TreeNode<E> current = node.getRight();
        while (current.getLeft() != null) current = current.getLeft();
        return current;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        nodeTraversal(root, sb);
        if (sb.length() > 1) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }

    /**
     * @param node current node in traversal
     * @param sb StringBuilder for result
     */
    private void nodeTraversal(TreeNode<E> node, StringBuilder sb) {
        if (node == null) return;
        nodeTraversal(node.getLeft(), sb);
        sb.append(node.getData()).append(", ");
        nodeTraversal(node.getRight(), sb);
    }
}