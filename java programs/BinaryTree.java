import java.util.*;
class tree
{
    int data;
    tree left,right;
}
class BinarySearchTree
{
    tree root;
    BinarySearchTree()
    {
        root=null;
    }
    tree insert(int data,tree root)
    {
        tree r=root;
        tree n=new tree();
        n.data=data;
        n.left=null;
        n.right=null;
        if (r==null)
        r=n;
        else if (r.data > data)
        {
            if (r.left==null)
                r.left=n;
            else
                insert(data,r.left);
        }
        else
        {
            if (r.right==null)
               r.right=n;
            else
                insert(data ,r.right);
        }
        return r;
        
        
    }
    void inorder(tree root)
    {
       if (root!=null){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
       }
       
    }
    void preorder(tree root)
    {  
       if (root!=null)
       {
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
       }
       
    }
    void postorder(tree root)
    {
       if (root!=null){
       postorder(root.left);
       postorder(root.right);
       System.out.print(root.data+" ");
    }
    
    }
    
}
    
    

public class BinaryTree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try {
            BinarySearchTree t = new BinarySearchTree();
            System.out.println("Enter size of array:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                t.root = t.insert(arr[i], t.root);
            }
            System.out.println(arr);
            System.out.println("\nInorder traversal:");
            t.inorder(t.root);
            System.out.println("\nPostorder traversal:");
            t.postorder(t.root);
            System.out.println("\nPreorder traversal:");
            t.preorder(t.root);
        } finally {
            sc.close();
        }
        
        
    }
}

