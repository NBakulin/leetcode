package solutions.solution_1095;

class Solution {

    MountainArray mountainArray;
    int arrLength;

    public int findInMountainArray(int target, MountainArray mountainArr) {
        this.mountainArray = mountainArr;
        this.arrLength = mountainArr.length();

        int topIndex = this.findPeakIndex();
        int increasingIndex = this.binarySearch(0, topIndex, target, false);
        if (increasingIndex >= 0) {
            return increasingIndex;
        }

        int decreasingIndex = this.binarySearch(topIndex + 1, this.arrLength - 1, target, true);
        if (decreasingIndex >= 0) {
            return decreasingIndex;
        }

        return -1;
    }

    public int findPeakIndex() {
        int left = 1;
        int right = this.arrLength - 2;

        while (left != right) {
            int mid = (left + right) / 2;
            if (this.mountainArray.get(mid) < this.mountainArray.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int binarySearch(int left, int right, int target, boolean reversed) {
        int mid;

        if (reversed) {
            while (left != right) {
                mid = (left + right) / 2;
                if (this.mountainArray.get(mid) > target) left = mid + 1;
                else right = mid;
            }
        } else {
            while (left != right) {
                mid = (left + right) / 2;
                if (this.mountainArray.get(mid) < target) left = mid + 1;
                else right = mid;
            }
        }

        // left is the insert or target index
        if (this.mountainArray.get(left) != target) return -1;
        return left;
    }
}
