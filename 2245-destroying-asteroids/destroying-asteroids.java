class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        Arrays.sort(asteroids);
        long Mass = mass;
        for(int i=0; i<n; i++){
            if(Mass < asteroids[i]){
                return false;
            }else if(Mass >= 100000){
                return true;
            }
            Mass += asteroids[i];
        }
        return true;
    }
}