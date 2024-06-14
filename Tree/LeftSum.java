public class LeftSum
{
    
	public static void main(String[] args) {
	    Treenode root=new Treenode(1);
	    root.left=new Treenode(2);
	    root.right=new Treenode(3);
	    root.left.left=new Treenode(4);
	    root.left.right=new Treenode(5);
	    root.right.left=new Treenode(6);
	    root.right.left.right=new Treenode(6);
      root.left.left.left=new Treenode(71);
	    System.out.println("LeftSum: "+ leftSumBT(root));

	}

  static int leftSumBT(Treenode root){
        if(root==null) return 0;
        int lc=0,rc=0;
        if(root.left!=null){
          lc=root.left.val+leftSumBT(root.left);
        }
        if(root.right!=null){
          rc=leftSumBT(root.right);
        }
        return rc+lc;
    }
}
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode(int x){
        val=x;
        left=null;
        right=null;
    }
}