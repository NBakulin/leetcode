package solutions.solution_4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int pointer1 = 0;
        int pointer2 = 0;

        if (n == 0) {
            if (m % 2 == 0) {
                return ((double)nums2[m / 2 - 1] + nums2[m / 2]) / 2;
            } else {
                return nums2[m / 2];
            }
        }

        if (m == 0) {
            if (n % 2 == 0) {
                return ((double)nums1[n / 2 - 1] + nums1[n / 2]) / 2;
            } else {
                return nums1[n / 2];
            }
        }

        int firstMedian = 0;
        int secondMedian = 0;

        for (int i = 0; i < (n + m) / 2 + 1; i++) {
            secondMedian = firstMedian;
            if (pointer1 == n) {
                firstMedian = nums2[pointer2++];
                continue;
            }

            if (pointer2 == m) {
                firstMedian = nums1[pointer1++];
                continue;
            }

            if (nums1[pointer1] > nums2[pointer2]) {
                firstMedian = nums2[pointer2++];
                continue;
            }

            firstMedian = nums1[pointer1++];
        }

        if ((n + m) % 2 == 1) {
            return firstMedian;
        } else {
            return ((double)firstMedian + secondMedian) / 2;
        }
    }
}
