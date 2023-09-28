function factorial(params) {
    let result=1
    for (let i = 2; i <= params; i++) {
        result=result *i      
    }
    return result
    
}
console.log(factorial(5));
console.log(factorial(3));
console.log(factorial(10));

