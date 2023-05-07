/**
 * @return {Function}
 */
var createHelloWorld = function() {
    return function(...args) {
        var i = 0;
        if (i == 0){
            return "Hello World";
        }
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */