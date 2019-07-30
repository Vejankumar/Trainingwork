let vegDishes = ['dosa', 'idli', 'pulav'];
let nonVeg = ['chicken-biryani' , 'chicken-65', 'zamzam-burger']

const dishes = ['panner-kulcha', 'Pizzeria-Pizza', ...vegDishes, ...nonVeg]
console.log(dishes);
//dishes.forEach(dish=>console.log(dish));