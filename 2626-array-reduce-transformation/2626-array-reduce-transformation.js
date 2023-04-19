/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    if (nums.length === 0) {
      return init; // 배열이 비었을 경우 init 반환
    }
    let val = init;
    // Array.reduce 함수
    for (let i = 0; i < nums.length; i++) {
      val = fn(val, nums[i]); // 배열 요소를 하나씩 처리하여 val 갱신
    }
    return val;
};