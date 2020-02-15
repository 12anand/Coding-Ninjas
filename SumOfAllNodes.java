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
	
	public static int sum(BinaryTreeNode<Integer> root){
		if(root.right==null && root.left==null){
            return root.data;
        }
        else{
            if(root.left==null &&  root.right!=null){
                return(root.data+sum(root.right));
            }
            else if(root.right==null && root.left!=null){
                return(root.data+sum(root.left));
            }
            else{
                int s1=0;int s2=0;
                s1=sum(root.left);s2=sum(root.right);
                return(root.data+s1+s2);
            }
        }
		// Write your code here

	}
	
}

