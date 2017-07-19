import java.util.ArrayList;

public class ��������������� {
	/**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
     ArrayList<Integer> array = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        if(root == null) return array;
        inorderTraversal(root.left);
        array.add(root.val);
        inorderTraversal(root.right);
        return array;
    }
}
