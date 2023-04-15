/**
 * @param {number} millis
 */
async function sleep(millis) {
    // Promise 객체를 만들고 이를 해결하는 setTimeout 함수를 호출하는 방식으로 동작.
    return new Promise(resolve => setTimeout(resolve, millis));
}

/*ㅁ* 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */