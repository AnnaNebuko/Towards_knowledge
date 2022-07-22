public class Main {

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(3,
        new TreeNode(9, null, null),
        new TreeNode(20, new TreeNode(17), new TreeNode(7)));

    Solution solution = new Solution();
    System.out.println(solution.maxDepth(treeNode));
  }
}