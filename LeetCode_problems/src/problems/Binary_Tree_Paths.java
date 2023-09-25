package problems;
import java.util.ArrayList;
import java.util.List;


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val)
	{
		this.val=val;
	}
}

public class Binary_Tree_Paths {
	
		public List<String> binaryTreePaths(TreeNode root)
		{
			List<String> paths=new ArrayList<>();
			
			if(root==null)
			{
				return paths;

			}
			dfs(root,"",paths);
			return paths;
		}

		public void dfs(TreeNode root, String path, List<String> paths) {

			if(root.left==null && root.right==null)
			{
				paths.add(path+root.val);
				return;
				
			}
			if(root.left!=null)
			{
				dfs(root.left,path+root.val+"->",paths);
			}
			if(root.right!=null)
			{
				dfs(root.right,path+root.val+"->",paths);
			}
			                                                                                                  
		}
}
