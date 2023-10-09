package solutions.solution_34;

class Solution {
    int[] nums;
    int target;
    public int[] searchRange(int[] nums, int target) {
        this.nums = nums;
        this.target = target;

        int pivot = this.binarySearch();
        if (pivot == -1) return new int[]{-1, -1};

        return new int []{this.findLeft(pivot), this.findRight(pivot)};
    }

    int binarySearch() {
        int left = 0;
        int right = this.nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (this.nums[mid] == this.target) {
                return mid;
            } else if (this.nums[mid] > this.target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    int findLeft(int right) {
        int left = 0;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (this.nums[mid] >= this.target) {
                if (this.nums[mid] == this.target)
                    result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    int findRight(int left) {
        int result = -1;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (this.nums[mid] <= this.target) {
                if (this.nums[mid] == this.target)
                    result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
