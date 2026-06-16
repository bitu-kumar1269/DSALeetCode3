class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '#'){
                str.append(str.toString());
            }
            else if(s.charAt(i) == '*'){
                if (str.length() > 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            }
            else if(s.charAt(i) == '%'){
                str.reverse();
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}