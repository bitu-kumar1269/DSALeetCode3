class Solution {
    public boolean rotateString(String s, String goal) {
        String con = s + s;
        if(con.contains(goal)){
            return true;
        }
        return false;
    }
}