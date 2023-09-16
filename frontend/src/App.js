import React from 'react';
import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import Greeting from './components/Greeting' ;

function App() {
    return (
        <div className="App">
            <Header />
            <main>
                <Greeting />
                {/* Add more content here */}
            </main>
            <Footer />
        </div>
    );
}

export default App;
