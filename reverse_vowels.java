class Solution {
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                list.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        int len = list.size() - 1;
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                sb.append(list.get(len));
                len--;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
