class Employee{

    constructor(firstName, lastName, age, salary){
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = age;
        this._salary = salary;
    }

    set firstName(fname){
        console.log("Inside the set Function");
        this._firstName = fname;
    }

    set lastName(lname){
        console.log("Inside the set Function");
        this._LastName = lname;
    }

    set age(age){
        console.log("Inside the set Function");
        this._age = age;
    }

    set salary(salary){
        console.log("Inside the set Function");
        this._salary = salary;
    }

    get firstName(){
        
        return this._firstName;
    }

    get lastName(){
        
        return this._LastName;
    }

    get age(){
        return this._age;
    }

    get salary(){
        return this._salary;
    }

}

class RegularEmployee extends Employee{
    constructor(firstName, lastName, age, salary, vacationDays){
        super(firstName, lastName, age, salary);
        this._vacationDays = vacationDays;
    }

    set vacationDays(vacationDays){
        this._vacationDays = vacationDays;
    }

    get vacationDays(){
        return this._vacationDays;
    }
}

var vejan = new Employee('Vejan' , 'Kumar' , 21 , 65000);
var sri = new Employee('Sri' , 'Vejan' , 21 , 58000);
vejan.salary = 70000;