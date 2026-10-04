import java.util.*;

class Node
{
    int data;
    Node left, right;
    
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node root;
    
    BinarySearchTree()
    {
        root = null;
    }
    
    void insert(int value)
    {
        root = insertRec(root, value);
    }
    
    Node insertRec(Node root, int value)
    {
        if(root == null)
        {
            root = new Node(value);
            return root;
        }
        
        if(value < root.data)
        {
            root.left = insertRec(root.left, value);
        }
        else if(value > root.data)
        {
            root.right = insertRec(root.right, value);
        }
        
        return root;
    }
    
    void delete(int value)
    {
        root = deleteRec(root, value);
    }
    
    Node deleteRec(Node root, int value)
    {
        if(root == null)
        {
            return root;
        }
        
        if(value < root.data)
        {
            root.left = deleteRec(root.left, value);
        }
        else if(value > root.data)
        {
            root.right = deleteRec(root.right, value);
        }
        else
        {
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            
            root.data = minValue(root.right);
            
            root.right = deleteRec(root.right, root.data);
        }
        
        return root;
    }
    
    int minValue(Node root)
    {
        int minv = root.data;
        
        while(root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        
        return minv;
    }
    
    void inorder()
    {
        inorderRec(root);
    }
    
    void inorderRec(Node root)
    {
        if(root != null)
        {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

class BST
{
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        System.out.println("Inorder traversal of the given tree:");
        tree.inorder();
        
        System.out.println("\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
        
        System.out.println("\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
        
        System.out.println("\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
    }
}

