let players=['Virat' , 'Rahul' , 'Dhoni' , 'Williamson' , 'Butler'];

//const [vCaptain , , captain] = players;

//console.log(`Captain : ${captain}, ViceCaptain : ${vCaptain}`);

let batsman = 'sachin';
let runner = 'ganguly';

//swapping two values
[batsman , runner] = [runner, batsman]

//console.log(`After run batsman is ${batsman} and runner is ${runner}`);

const player = {
    name : 'Virat Kohli',
    centuries : 66,
    age : 30,
    matches : 359
}

player.centuries = 67;

const {name, centuries, matches} = player;

//console.log(`${name} has played ${matches} number of matches and scored ${centuries} centuries in 1st class cricket`);

item = {
    name : 'Iphone',
    price : 65000,
    details:{
        os:'IOS'
    }
}

let currencyCalculator = function({price:amount}){
    return{
        'INR' : amount,
        'USD' : amount*68,
        'EURO' : amount*80
    }
}


let vegDishes = ['dosa', 'idli', 'pulav'];
let nonVeg = ['chicken-biryani' , 'chicken-65', 'zamzam-burger']

const dishes = ['panner-kulcha', 'Pizzeria-Pizza', ...vegDishes, ...nonVeg]

const {USD:ammountInDollars} = currencyCalculator(item);
//console.log(`Amount in dollars is ${ammountInDollars}`);

const prop={...item}

//Rest Operator

const [captain, ViceCaptain, ...team] = players;
console.log(team);
