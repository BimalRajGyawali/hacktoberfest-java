class Solution {
    public List<Integer> preorder(Node root) {
    
        ArrayList<Integer> ans = new ArrayList<>();
        preorderTraversal(root,ans);
        return ans;
        
    }
    
    private void preorderTraversal(Node root,List<Integer> ans){
        
        if(root==null)
            return ;
        
        ans.add(root.val);        
        List<Node> childrens =root.children;
        
        for(Node currchild: childrens){
            preorderTraversal(currchild,ans);
              
        }
        
        return;
    }
}
