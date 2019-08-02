import React,{Component} from 'react';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom';
import UserDetails from './UserDetails';

export default class User extends Component {

    constructor(){
        super();
        this.details = this.details.bind(this);
    }
    details(){
        console.log(`${this.props.title}  ${this.props.body} `)
    }

    render(){
        return  (
            <div className="card" style={{width: 18 +'rem', margin:10+'px'}}>
                    <div className="card-body">
                    <h5 className="card-title">{ this.props.name}</h5>
                    <p className="card-text">{this.props.id}</p>
                    <p className="card-text">{this.props.email}</p>
                    <Link to ={`/users/${this.props.id}`} >Details</Link>

                    
                    </div>
                </div>
        );
    }

}