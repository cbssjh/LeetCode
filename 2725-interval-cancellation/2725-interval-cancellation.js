/**
 * @param {Function} fn
 * @param {Array} args
 * @param {number} t
 * @return {Function}
 */
var cancellable = function(fn, args, t) {
    // 스프레드 연산자를 사용하여 개별 인수로 전달, 첨에는 배열로 받게되어 오류
    fn(...args);
    
    const intervalCall = setInterval(() => {
        fn(...args);
     }, t);
    
    function cancelFn(){
        clearInterval(intervalCall);
    }
    
    const cancelT = 1000;
    
    setTimeout(cancelFn, cancelT);
    
    return cancelFn;
}

/**
 *  const result = []
 *
 *  const fn = (x) => x * 2
 *  const args = [4], t = 20, cancelT = 110
 *
 *  const start = performance.now()
 *
 *  const log = (...argsArr) => {
 *      const diff = Math.floor(performance.now() - start)
 *      result.push({"time": diff, "returned": fn(...argsArr)})
 *  }
 *       
 *  const cancel = cancellable(log, args, t);
 *
 *  setTimeout(() => {
 *     cancel()
 *  }, cancelT)
 *   
 *  setTimeout(() => {
 *    console.log(result)  // [
 *                         //      {"time":0,"returned":8},
 *                         //      {"time":20,"returned":8},
 *                         //      {"time":40,"returned":8},           
 *                         //      {"time":60,"returned":8},
 *                         //      {"time":80,"returned":8},
 *                         //      {"time":100,"returned":8}
 *                         //  ]
 *  }, cancelT + t + 15)    
 */