class Solution {
    public int passThePillow(int n, int time) {
        int v = 2*n-2;
        time+=1;
        time = time%v;
        if(time==0){
            time = v;
        }
        return time <= n?time:2*n-time;
    }
}
