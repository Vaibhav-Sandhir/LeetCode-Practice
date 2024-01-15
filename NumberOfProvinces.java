class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < n; i++){
            map.put(i, new ArrayList<>());
            for(int j = 0; j < n; j++){
                if(isConnected[i][j] == 1 && i != j){
                    map.get(i).add(j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(set.contains(i)){
                continue;
            }
            queue.add(i);
            set.add(i);
            while(!queue.isEmpty()){
                int node = queue.remove();
                for(int neighbour : map.get(node)){
                    if(!set.contains(neighbour)){
                        queue.add(neighbour);
                        set.add(neighbour);
                    }
                }
            }
            count++;
        }

        return count;
    }
}
