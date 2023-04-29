/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    var x = 0;
    var y = 1;
    // 무한루프
    while (true) {
        yield x;
        // [x, y] = [y, x + y]
        var temp = y;
        y = x + y;
        x = temp;
  }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */