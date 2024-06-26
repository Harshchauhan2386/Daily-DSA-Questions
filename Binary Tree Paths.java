import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        helper(root, currentPath, result);
        return result;
    }

    public static void helper(TreeNode root, List<Integer> currentPath, List<String> result) {
        if (root == null) {
            return;
        }

        currentPath.add(root.val);

        if (root.left == null && root.right == null) {
            // Convert the current path to a string and add it to the result
            result.add(pathToString(currentPath));
        } else {
            helper(root.left, currentPath, result);
            helper(root.right, currentPath, result);
        }

        // Remove the last element (backtrack) before returning from the current node
        currentPath.remove(currentPath.size() - 1);
    }

    private static String pathToString(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            sb.append(path.get(i));
            if (i < path.size() - 1) {
                sb.append("->");
            }
        }
        return sb.toString();
    }
}
