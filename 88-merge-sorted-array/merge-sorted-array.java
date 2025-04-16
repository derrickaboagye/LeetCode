class Solution {

    /**Inutuon: we given a sorted array in non decreasing order. nums1 and num2. we are also given the length of each array in stored in two int n & m . atsk is we must merge nums1 and nums2. // Nums1 first and nums2 but store result sinside of nums1

Apporach: since we must add elements in the array togteher.
-we can have duplicates
-0 vaules get dont get added. 
We will use a list. since a list can conatin duplicates. Then we will store the list back into array nums1.     
     */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    List<Integer> merged = new ArrayList<>();

    // Add only the actual m elements from nums1
    for (int i = 0; i < m; i++) {
        merged.add(nums1[i]);
    }

    // Add all elements from nums2
    for (int j = 0; j < n; j++) {
        merged.add(nums2[j]);
    }

    // Sort the list
    Collections.sort(merged);

    // Copy sorted values back to nums1
    for (int i = 0; i < m + n; i++) {
        nums1[i] = merged.get(i);
    }
}
}
