class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int l = 0;
        int r = nums1.length;
        int total = nums1.length + nums2.length;
        int half = (total + 1) / 2;
        double res = 0;
        while (true) {
            int mid = l + (r - l) / 2;
            int midB = half - mid;
            int element_leftA = (mid > 0) ? nums1[mid - 1] : Integer.MIN_VALUE;
            int element_rightA = (mid < nums1.length) ? nums1[mid] : Integer.MAX_VALUE;
            int element_leftB = (midB > 0) ? nums2[midB - 1] : Integer.MIN_VALUE;
            int element_rightB = (midB < nums2.length) ? nums2[midB] : Integer.MAX_VALUE;
            if (element_leftA <= element_rightB && element_leftB <= element_rightA) {
                if (total % 2 == 0) {
                    res = (double) (Math.max(element_leftA, element_leftB) + Math.min(element_rightA, element_rightB)) / 2;
                } else {
                    res = (double) Math.max(element_leftA, element_leftB);
                }
                break;
            } else if (element_leftA > element_rightB) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
