import React from 'react';
import Header from './components/Header';
import Footer from './components/Footer';
import Greeting from './components/Greeting' ;
import './App.css';

function App() {
    return (
        <div className="App">
            <Header />
            <main>
                <Greeting />
                <span className="blinking-cursor">|</span>
                <a href="#" className="scanline-effect">Go to my blog</a>
            </main>
            <Footer />
        </div>
    );
}

export default App;
