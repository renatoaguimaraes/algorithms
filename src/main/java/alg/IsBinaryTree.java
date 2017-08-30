package alg;

public class IsBinaryTree
{

    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.insert(5);
        root.insert(8);
        root.insert(15);
        System.out.println(root.checkBST());
        root.printPreorder();
        System.out.println();
        root.printInorder();
        System.out.println();
        root.printPostorder();
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
    }

    public void printInorder()
    {
        if (left != null)
        {
            left.printInorder();
        }
        System.out.print(data + " ");
        if (right != null)
        {
            right.printInorder();
        }
    }

    public void printPreorder()
    {
        System.out.print(data + " ");
        if (left != null)
        {
            left.printPreorder();
        }
        if (right != null)
        {
            right.printPreorder();
        }
    }

    public void printPostorder()
    {
        if (left != null)
        {
            left.printPostorder();
        }
        if (right != null)
        {
            right.printPostorder();
        }
        System.out.print(data + " ");
    }

    public boolean contains(int value)
    {
        if (value == data)
        {
            return true;
        }
        if (value <= data)
        {
            if (left == null)
            {
                return false;
            }
            else
            {
                return left.contains(value);
            }
        }
        else
        {
            if (right == null)
            {
                return false;
            }
            else
            {
                return right.contains(value);
            }
        }
    }

    public void insert(int value)
    {
        if (value <= data)
        {
            if (left == null)
            {
                left = new Node(value);
            }
            else
            {
                left.insert(value);
            }
        }
        else
        {
            if (right == null)
            {
                right = new Node(value);
            }
            else
            {
                right.insert(value);
            }
        }
    }

    boolean checkBST()
    {
        return isBSTUtil(this, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max)
    {
        if (node == null)
        {
            return true;
        }
        if (node.data < min || node.data > max)
        {
            return false;
        }
        return isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max);
    }
}
