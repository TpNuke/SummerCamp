public class HeightandDia
{
    
	public static void main(String[] args) {
	    Treenode root=new Treenode(1);
	    root.left=new Treenode(2);
	    root.right=new Treenode(3);
	    root.left.left=new Treenode(4);
	    root.left.right=new Treenode(5);
	    root.right.left=new Treenode(6);
	    System.out.println("Height: "+ height(root));
	    System.out.println("DIameter: "+ dia(root));

	}

    static int height(Treenode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        diameter=Math.max(diameter,lh+rh);
        return Math.max(lh,rh)+1;
    }

    static int diameter;
    static int dia(Treenode root){
        diameter=0;
        height(root);
        return diameter;
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