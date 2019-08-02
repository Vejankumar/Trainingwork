import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom';
import Main from './components/Main';
import About from './components/About';
import UserDetails from './components/UserDetails';

const router = (
    <Router>
        <ul>
            <li><Link to="/">Home</Link></li>
            <li><Link to="/main">Main</Link></li>
            <li><Link to="/about">About</Link></li>
       
        </ul>

        <ul>
            <li><Route exact path="/" component={App}/> </li>
            <li><Route path="/main" component={Main}/></li>
            <li><Route path="/about" component={About}/></li>
            <li><Route path="/users/:id" component={UserDetails}/></li>
        </ul>
    </Router>
)


ReactDOM.render(
    router, 
    document.getElementById('root'));
