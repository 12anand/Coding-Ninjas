public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
		
        boolean val=false;
        if(root.data==x){
            return true;
        }
        if(root.left!=null){
            val=isNodePresent(root.left,x);
        }
        if(val==false){
            if(root.right!=null){
                val=isNodePresent(root.right,x);
            }
        }
        return val;
    
	}
	
}

