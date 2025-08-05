class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i = 0; i < fruits.length; i++){
            int fl = 0;
            for(int j = 0; j < fruits.length; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0;
                    fl = 1;
                    break;

                }
            }
            if(fl == 0) count++;
        }
        return count;
    }
}