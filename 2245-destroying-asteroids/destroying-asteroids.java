class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        Arrays.sort(asteroids);
        for(int i=0; i<n; i++){
            if(mass < asteroids[i]){
                return false;
            }else if(mass >= 100000){
                return true;
                
            }
            mass += asteroids[i];
        }
        return true;
    }
}