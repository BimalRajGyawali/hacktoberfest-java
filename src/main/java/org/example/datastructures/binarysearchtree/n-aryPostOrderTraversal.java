
	static class Node {
		public int val;
		public List<Node> children = new ArrayList<Node>();
	
		public Node() {}
	
		public Node(int _val)
		{
			val = _val;
		}
	
		public Node(int _val, List<Node> _children)
		{
			val = _val;
			children = _children;
		}
	};
	
	static class Pair {
		public Node node;
		public int childrenIndex;
		public Pair(Node _node, int _childrenIndex)
		{
			node = _node;
			childrenIndex = _childrenIndex;
		}
	}

	int currentRootIndex = 0;
	Stack<Pair> stack = new Stack<Pair>();
	ArrayList<Integer> postorderTraversal =
						new ArrayList<Integer>();
	
	
	public ArrayList<Integer> postorder(Node root)
	{
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				
				
				stack.push(new Pair(root, currentRootIndex));
				currentRootIndex = 0;
	
				if (root.children.size() >= 1) {
					root = root.children.get(0);
				}
				else {
					root = null;
				}
				continue;
			}

			Pair temp = stack.pop();
			postorderTraversal.add(temp.node.val);
	
		
			while (!stack.isEmpty() && temp.childrenIndex ==
					stack.peek().node.children.size() - 1) {
				temp = stack.pop();
				
				postorderTraversal.add(temp.node.val);
			}
	
			if (!stack.isEmpty()) {
				root = stack.peek().node.children.get(
										temp.childrenIndex + 1);
				currentRootIndex = temp.childrenIndex + 1;
			}
		}
	
		return postorderTraversal;
	}
	
	
}
