/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var changedArr = [];
    for (i = 0; i < arr.length; i++) {
        changedArr[i] = fn(arr[i], i);
    }
  return changedArr;
};