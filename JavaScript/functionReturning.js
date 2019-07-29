var returnFunction = function(firstName, lastName){
    var greetFun = function(message){
        console.log(message + firstName + ' ' + lastName);
    }
    return greetFun;
}

var result = returnFunction('Vejan','Kumar');
result('Welcome !!')

returnFunction('Vejan','Kumar')('Good Morning !!');