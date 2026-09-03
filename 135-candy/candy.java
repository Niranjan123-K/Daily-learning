class Solution {
    public int candy(int[] ratings) {

        int[] candy = new int[ratings.length];

        // Everyone gets at least 1
        for(int i = 0; i < ratings.length; i++) {
            candy[i] = 1;
        }

        // Left → Right
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        // Right → Left
        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        int sum = 0;

        for(int n : candy) {
            sum += n;
        }

        return sum;
    }
}