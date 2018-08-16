
public class Tree{
	
	
		int data;
		Tree left;
		Tree right;
		Tree(int data){
			this.data=data;
					
		}
		public boolean findN(Tree tree,int n) {
		if (tree==null) return false;
		if(tree.data==n) return true;
		boolean left=findN(tree.left,n);
		boolean right= findN(tree.right,n);
		return (left||right);
		
		}

		
		


}
class TestDriver{
	public static void main(String[] args) {
		Tree tree = new Tree(2);
		tree.left=new Tree(7);
		tree.right=new Tree(5);
		tree.left.left=new Tree(2);
		tree.left.right=new Tree(6);
		tree.right.right=new Tree(9);
		tree.right.right.left=new Tree(4);
		tree.left.right.left=new Tree(5);
		tree.left.right.right=new Tree(11);
		//prints the boolean result
		System.out.println(tree.findN(tree,7));
		
		
				
	}
}
