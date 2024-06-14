import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class UserInputTree {
    
    public static int sumOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the value for the root node: ");
        int rootValue = scanner.nextInt();
        TreeNode root = new TreeNode(rootValue);

        System.out.print("Enter the value for the left child of the root (enter -1 if no left child): ");
        int leftValue = scanner.nextInt();
        if (leftValue != -1) {
            root.left = new TreeNode(leftValue);
        }

        System.out.print("Enter the value for the right child of the root (enter -1 if no right child): ");
        int rightValue = scanner.nextInt();
        if (rightValue != -1) {
            root.right = new TreeNode(rightValue);
        }

        System.out.print("Enter the value for the left child of the left child (enter -1 if no left child): ");
        int leftLeftValue = scanner.nextInt();
        if (leftLeftValue != -1) {
            root.left.left = new TreeNode(leftLeftValue);
        }

        System.out.print("Enter the value for the right child of the left child (enter -1 if no right child): ");
        int leftRightValue = scanner.nextInt();
        if (leftRightValue != -1) {
            root.left.right = new TreeNode(leftRightValue);
        }

        System.out.print("Enter the value for the right child of the root's right child (enter -1 if no right child): ");
        int rightRightValue = scanner.nextInt();
        if (rightRightValue != -1) {
            root.right.right = new TreeNode(rightRightValue);
        }

        scanner.close();

        System.out.println("Total sum of all node values: " + sumOfNodes(root));
    }
}