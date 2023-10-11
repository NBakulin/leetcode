# [2251. Number of Flowers in Full Bloom](https://leetcode.com/problems/number-of-flowers-in-full-bloom/description)

## Problem Description

You are given a **0-indexed** 2D integer array `flowers`, where `flowers[i] = [starti, endi]` means the i<sup>th</sup> flower will be in full bloom from `start`<sub>i</sub> to `end`<sub>i</sub> (**inclusive**). You are also given a **0-indexed** integer array `people` of size `n`, where `people[i]` is the time that the `i`<sup>th</sup> person will arrive to see the flowers.

Return an integer array `answer` of size `n`, where `answer[i]` is the number of flowers that are in full bloom when the `i`<sup>th</sup> person arrives.


### Example 1:
<img alt="" src="https://assets.leetcode.com/uploads/2022/03/02/ex1new.jpg" style="width: 550px; height: 216px;">

```
Input: flowers = [[1,6],[3,7],[9,12],[4,13]], poeple = [2,3,7,11]
Output: [1,2,2,2]
Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
For each person, we return the number of flowers in full bloom during their arrival.
```

### Example 2:
<img alt="" src="https://assets.leetcode.com/uploads/2022/03/02/ex2new.jpg" style="width: 450px; height: 195px;">

```
Input: flowers = [[1,10],[3,3]], poeple = [3,3,2]
Output: [2,2,1]
Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
For each person, we return the number of flowers in full bloom during their arrival.
```

Constraints:

* `1 <= flowers.length <= 5 * 10^4`
* `flowers[i].length == 2`
* `1 <= starti <= endi <= 10^9`
* `1 <= people.length <= 5 * 10^4`
* `1 <= people[i] <= 10^9`

## Solution Properties

* `SC = O(n)`
* `TC = O((n+m)⋅log(n))`
* Runtime ~ 37 ms (`beats ~95%`)
* Memory ~ 72,4 mb (`beats ~55,6%`)