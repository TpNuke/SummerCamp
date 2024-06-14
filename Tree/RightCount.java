public class RightCount
{
    
	public static void main(String[] args) {
	    Treenode root=new Treenode(1);
	    root.left=new Treenode(2);
	    root.right=new Treenode(3);
	    root.left.left=new Treenode(4);
	    root.left.right=new Treenode(5);
	    root.right.left=new Treenode(6);
	    root.right.left.left=new Treenode(6);
	    System.out.println("RightCount: "+ rightCount(root));

	}

    static int rightCount(Treenode root){
        if(root==null) return 0;
        int lc=0,rc=0;
        if(root.left!=null){
          lc=rightCount(root.left);
        }
        if(root.right!=null){
          rc=1+rightCount(root.right);
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