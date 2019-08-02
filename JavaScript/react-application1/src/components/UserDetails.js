import React from 'react';
import axios from 'axios';

export default class UserDetails extends React.Component{
    constructor(){
        super();
        this.state={
            users:{}
        }
        //const {id} = this.props.match.params.id;
       
      /* const filtered = this.state.users.filter(user=> user.id == 1 )
        console.log(filtered);
        this.setState({
            users : filtered
        });*/
    }

    componentDidMount(){
        console.log(this.props)
        const {id} = this.props.match.params;
        axios.get('http://jsonplaceholder.typicode.com/users/'+id)
        .then(res=>{
            
                this.setState({
                    users : res.data
                })
           
            
        } );
    }

    render(){
        console.log(this.props);
        console.log(this.state.users);
        return(
            <div>
                    <h1>User Details</h1>
                    <div className="card" style={{width: 18 +'rem', margin:10+'px'}}>
                    <div className="card-body">
                    <h5 className="card-title">{this.state.users.name}</h5>
                    <p className="card-title">{this.state.users.id}</p>
                    <p className="card-title">{this.state.users.email}</p>
                    <p className="card-title">{this.state.users.username}</p>
                    <p className="card-title">{this.state.users.phone}</p>
                    <p className="card-title">{this.state.users.website}</p>
                    <h5>Address</h5>
                    {
                        this.state.users.address? <p className="card-title">City : {this.state.users.address.city}</p> : <p>No address</p>
                    }
                    {
                        this.state.users.address? <p className="card-title">Street : {this.state.users.address.street}</p> : <p>No address</p>
                    }
                    {
                        this.state.users.address? <p className="card-title">Suite :{this.state.users.address.suite}</p> : <p>No address</p>
                    }
                    {
                        this.state.users.address? <p className="card-title">ZipCode : {this.state.users.address.zipcode}</p> : <p>No address</p>
                    }
                    
                    </div>
                </div>

            </div>
        )
    }
}