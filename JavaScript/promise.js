let p = fetch('http://jsonplaceholder.typicode.com/users');
p.then((response)=>{console.log(response)})

let anotherPromise = p.then((response)=>response.json());

anotherpromise.then(data=>console.log(data))