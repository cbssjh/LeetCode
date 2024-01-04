/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    const size = Math.ceil(matrix.length / 2);
    
    for (let i = 0; i < size; i++) {
        const rIdx = size - 1 - i;
        const cIdx = size - 1 - i;
        const len = 2 * i + (matrix.length % 2 === 0 ? 1 : 0);
        
        for (let j = 0; j < len; j++) {
            const temp = matrix[rIdx][cIdx + j];
            matrix[rIdx][cIdx + j] = matrix[rIdx + len - j][cIdx];
            matrix[rIdx + len - j][cIdx] = matrix[rIdx + len][cIdx + len - j];
            matrix[rIdx + len][cIdx + len - j] = matrix[rIdx + j][cIdx + len];
            matrix[rIdx + j][cIdx + len] = temp;
        }
    }
    
    return matrix;
};