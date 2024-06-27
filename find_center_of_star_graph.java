class Solution {
    public int findCenter(int[][] edges) {
        int v = 0;
        if(edges[0][0] == edges[1][0] ){
            v = edges[0][0];
        }
        if(edges[0][0] == edges[1][1] ){
            v = edges[0][0];
        }
        if(edges[0][1] == edges[1][0] ){
            v = edges[0][1];
        }
        if(edges[0][1] == edges[1][1] ){
            v = edges[0][1];
        }
        return v;
    }
    
}
