public class EqualTreePreOrder
{
    
	public static void main(String[] args) {
	    Treenode root1=new Treenode(1);
	    root1.left=new Treenode(2);
	    root1.right=new Treenode(3);
	    root1.left.left=new Treenode(4);
	    root1.left.right=new Treenode(5);
	    root1.right.left=new Treenode(6);
	    
      Treenode root2=new Treenode(1);
	    root2.left=new Treenode(2);
	    root2.right=new Treenode(3);
	    root2.left.left=new Treenode(4);
	    root2.left.right=new Treenode(5);
	    root2.right.left=new Treenode(6);
      String pre1=preorder(root1);
      String pre2=preorder(root2);

	    System.out.println(pre1+"   "+pre2);
	    System.out.println("Equal?? "+ pre1.equals(pre2));

	}

    static String preorder(Treenode root){
        if(root==null) return "";
        String ls=preorder(root.left);
        String rs=preorder(root.right);
        return (root.val)+ls+rs;
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