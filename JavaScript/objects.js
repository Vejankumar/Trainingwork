var dishes = [
{
    id : 34,
    'dish-name' : 'masala-dosa',
    price : 40
},
{
    id : 35,
    'dish-name' : 'idli-vada',
    price : 45
}
]

/*for(var index=0; index < dishes.length;index++){
    console.log(dishes[index]['dish-name'] + " " + dishes[index].price);
}*/

let printDishName = function(allDishes){
    console.log('arguments');
    console.log(arguments);
    for(var index=0; index < allDishes.length;index++){
        console.log(allDishes[index]['dish-name'] + " " + allDishes[index].price);
    }
}

printDishName(dishes);


