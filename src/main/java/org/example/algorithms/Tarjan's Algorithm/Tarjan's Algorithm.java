class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> graph = constructGraph(n,connections);
        
        return findCriticalEdges(n,graph);
    }
    
    private List<List<Integer>> findCriticalEdges(int n,List<List<Integer>> graph){
        int[] distime = new int[n];
        int[] lowtime = new int[n];
        int[] time = {0};
        
        Arrays.fill(distime,-1);
        Arrays.fill(lowtime,-1);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        tarjanAlgo(0,time,-1,graph,distime,lowtime,ans);
        return ans;
    }
    
    private void tarjanAlgo(int currvertex, int[] time, int parent, List<List<Integer>> graph, int[] distime, int[]                                   lowtime, List<List<Integer>> ans){
        
        distime[currvertex] = time[0];
        lowtime[currvertex] = time[0];
        time[0] += 1;
        
        for(int currneigh : graph.get(currvertex)){
            
            if(currneigh == parent)
                continue;
            
            if(distime[currneigh] != -1){
                lowtime[currvertex] = Math.min(lowtime[currvertex],distime[currneigh]);
                continue;
            }
            
            tarjanAlgo(currneigh, time, currvertex, graph, distime, lowtime, ans);
            lowtime[currvertex] = Math.min(lowtime[currvertex],lowtime[currneigh]);
            
            if(distime[currvertex]<lowtime[currneigh])
                ans.add(Arrays.asList(currvertex,currneigh));
        }
        
        return;
    }
    
    private List<List<Integer>> constructGraph(int n, List<List<Integer>> edges){
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(List<Integer> edge : edges){
            int a = edge.get(0);
            int b = edge.get(1);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        return graph;
    }
}
Footer
