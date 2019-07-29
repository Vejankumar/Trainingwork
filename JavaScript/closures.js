let outerFunction = function(fName,lName){
    var firstName = fName;
    var lastName = lName;
    console.log('set the value of firstname and lastname');

    var innerFunction = function(message,firstname = firstName, lastname = lastName){
        console.log(message + ' ' + firstname + ' ' + lastname);
    }
    return innerFunction;
}

var result = outerFunction('Naveen' , 'Kumar');
result('Hello !!');
result('Hello !!','Kiran','Kumar');