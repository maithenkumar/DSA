// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
class Solution {
  getMinMax(arr, n) {
    let min = arr[0];
    let max = arr[0];

    for (let i = 1; i < n; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
      if (min > a[i] && max > a[i]) {
        min = arr[i];
      }
    }
    var ans = [];
    ans.push(max);
    ans.push(min);
  }
}
var prob = new Solution();
prob.getMinMax();
