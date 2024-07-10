class Solution {
    public int minOperations(String[] logs) {
        int c = 0;
       for(int i=0;i<logs.length;i++){
            if(logs[i].charAt(0) == '.'){
                if(logs[i].charAt(1) == '.' && c!=0){
                    c--;
                }
            }
            else{
                c+=1;
            }
       } 
       return c;
    }
}
