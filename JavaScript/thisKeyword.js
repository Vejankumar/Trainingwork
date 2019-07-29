var dish = {
    id:23,
    name:'PannerKulcha',
    price : 110,

    getPrice:function(){
        return this.price;
    },
    getName:function(){
        return this.name;
    }
}

var fun = function(array=[]){
    console.log(array);
    console.log(this.firstname +" works for " + array[0] + " in " + array[1]);
}

//console.log(dish.getPrice());
//fun();
var obj={
    firstname : 'Lohit',
    lastname: 'kumar'
}

var arr = [];
arr[0] = 'TCS';
arr[1] = 'Chennai';
fun.call(obj,arr);
//fun.call({firstname:'Vejan', lastname:'kumar'},"Publicis Sapient")
// var rebindFun = fun.bind(obj,arr);
// rebindFun();