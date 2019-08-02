import React from 'react';
import User from './user';
import axios from 'axios';

export default class Main extends React.Component{

    constructor(){
        super();
       /* this.state={
            phones:[
                {
                    name : 'IPhone',
                    desc : 'Latest Iphone model from Apple'
                },
                {
                    name : 'One Plus 6',
                    desc : 'Flagship phone from OnePlus'
                },
                {
                    name : 'Samsung S10',
                    desc : 'High performance...'
                }
            ]
        
        }
        this.fixed = this.state.phones.map(phone=> phone);*/
        this.state={
            users:[

            ]
        }
        console.log(`Came inside constructor`)
        this.selectedProduct = this.selectedProduct.bind(this);
    }


    selectedProduct({name,id}){
        
      /*  this.setState({
            phones:[
                {
                    name : title,
                    desc : body
                }
            ]
        })

        const filtered = this.fixed.filter(phone=> phone.name !== title )
        console.log(filtered);
        this.setState({
            phones : filtered
        });*/

        console.log(`${id}  ${name}`);
    }



    componentDidMount(){
        console.log(`Came inside componentDidMount`)
       /* const filtered = axios.get('http://jsonplaceholder.typicode.com/users')
        .then(res=> res.map(function (task, index, array) {
 
            return [task.name , task.id , task.email]; 
         
        }));
        this.setState({
            users : filtered
        });*/
        axios.get('http://jsonplaceholder.typicode.com/users')
        .then(res=> this.setState({
            users:res.data
        }) );
    }

    componentDidUpdate(){
        console.log(`Came inside componentDidUpdate`)
    }

    render(){
        console.log(`Came inside Render`)

     /*   return (
            
            

            <div className="container">
                 
                <div className="row">
                {
                    this.state.phones.map((phone,index) => <User key={index} 
                                                      name={phone.name} 
                                                      body={phone.desc} 
                                                      selected={this.selectedProduct}/>)
                }
                </div>
               </div>
        );*/
        return(
            <div className="container">
                 
                <div className="row">
                {
                    this.state.users.map((user,index) => <User key={index} 
                                                      name={user.name} 
                                                      email={user.email} 
                                                      id ={user.id}
                                                      selected={this.selectedProduct}/>)
                }
                </div>
               </div>
        );

    }
    
}

//export default Main;