/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
 var chunk = function(arr, size) {
    let result = [];
    for (let j = 0; j < arr.length; j += size) {
        let subarray = [];
        for (let i = j; i < j + size && i < arr.length; i++) {
            subarray.push(arr[i]);
        }
        result.push(subarray);
    }
    return result;
};
