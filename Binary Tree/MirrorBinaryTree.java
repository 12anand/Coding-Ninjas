
public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static void mirror(BinaryTreeNode<Integer> root){
		if(root==null){
            return;
        }
        BinaryTreeNode<Integer> tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        mirror(root.left);
        mirror(root.right);
        
	}
	
}
