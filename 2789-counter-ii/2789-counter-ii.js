/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let current = init;  
    const initial = init; 

    return {
        increment() {
            return ++current; 
        },
        decrement() {
            return --current;
        },
        reset() {
            current = initial;
            return current;
        }
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */