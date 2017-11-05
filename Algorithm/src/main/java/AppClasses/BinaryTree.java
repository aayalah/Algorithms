class Solution {
    public List<List<String>> printTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        int h = getHeight(root);
        String [][] res = new String[h][(int)Math.pow((double)2, (double)(h-1))*2 - 1];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = "";
            }
        }

        fillTreeArray(root, 0, res[0].length-1, res, 0);
        return createResult(res);
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    private void fillTreeArray(TreeNode node, int min, int max, String[][]res, int r) {
        if (min > max || node == null) return;
        int middle = (min + max) / 2;
        res[r][middle] = "" + node.val;
        fillTreeArray(node.left, min, middle-1, res, r+1);
        fillTreeArray(node.right, middle+1, max,res, r+1);
    }

    private List<List<String>> createResult(String[][] arr) {
        List<List<String>> res = new ArrayList<List<String>>();
        for (int i = 0; i < arr.length; i++) {
            List<String> row = new ArrayList<String>();
            for (int j = 0; j < arr[i].length; j++) {
                row.add("" + arr[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}