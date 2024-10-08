class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            String str = words[i];
            HashMap<Character, Character> map = new HashMap<>();
            boolean flag = true;
            
            for(int j = 0; j < str.length(); j++) {
                if(map.containsKey(pattern.charAt(j))) {
                    if(map.get(pattern.charAt(j)) != str.charAt(j)) {
                        flag = false;
                        break;
                    }
                } else {
                    if(map.containsValue(str.charAt(j))) {
                        flag = false;
                        break;
                    }
                    map.put(pattern.charAt(j), str.charAt(j));
                }
            }
            
            if(flag) {
                list.add(str);
            }
        }
        return list;
    }
}
