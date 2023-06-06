/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let max = Math.max.apply(null, candies);
    let maxTrue = [];
    
    for(var i = 0; i < candies.length; i++){
        if(candies[i] + extraCandies >= max){
            maxTrue[i] = true;
        }
        else{
            maxTrue[i] = false;
        }
        console.log('i : ${i}, maxTrue[i]: ${maxTrue[i]}');
    }
    
    return maxTrue;
    
};