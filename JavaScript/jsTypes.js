/*var greet = function(message){
    console.log(message);
}

var index=10;
//var index = "h3llo";

for(var i=0;i<index;i++){
    console.log("The value is "+i);
}

console.log("the value of i outside the loop is "+i);*/
add(4,5);
//sub(5,4);   This will give error because sub is function expression
  
// named function
function add(a,b){
    console.log('The sum is '+(a+b));
}

//function expression
var sub=function(a,b){
    console.log('Difference is '+(a-b));
}

sub(5,4);