class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        // Sort potions
        Arrays.sort(potions);
        int[] res = new int[spells.length];  // result should match spells.length

        // Loop over each spell
        for (int i = 0; i < spells.length; i++) {
            int start = 0;
            int end = potions.length - 1;
            int index = potions.length;  // Default to all potions invalid

            // Binary search
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long product = (long) spells[i] * potions[mid];

                if (product >= success) {
                    index = mid;       // potential answer
                    end = mid - 1;     // keep searching left
                } else {
                    start = mid + 1;
                }
            }

            res[i] = potions.length - index;
        }

        return res;
    }
}
