/*let sum = function(a, b){
    return a + b;
}

let sub = function(a, b){
    return a - b;
}

let product = function(a, b){
    return a * b;
}

var concat = function(a,b){
    return a +' '+ b;
}

let calculate = function(a, b, fun){
    return fun(a,b);
}

var returnFunction = function(firstName, lastName){
    var greetFun = function(){
        console.log('Hii !!' + firstName + ' ' + lastName);
    }
    return greetFun;
}

console.log(calculate(10,20,product));
console.log(calculate('Hello','World',concat));
var result = returnFunction('Vejan','Kumar');
result();*/

// Lambda(Arrow) functions in javascript

let sum = (a, b) =>a + b;

let sub = (a, b) =>a - b;

let product = (a, b) =>a * b;

var concat = (a,b) =>a + b;

let calculate = (a, b, fun) => fun(a,b);


console.log(calculate('Hello','World',sum));

