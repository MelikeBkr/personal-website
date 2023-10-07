import React from 'react';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Header from './components/Header';
import Footer from './components/Footer';
import AboutMe from './components/AboutMe' ;
import Projects from './components/Projects' ;
import './styles/App.css';

function App() {
    return (
        <Router>
            <div className="App">
                <Header />
                <main>
                    <Routes>
                        <Route path="/api/about-me" element={<AboutMe />} About Me />
                        <Route path="/api/projects" element={<Projects />} />
                    </Routes>
                    <a href="#" className="scanline-effect">Go to my blog</a>
                    {/*
                    TODO: The above tag will be replaced with the link component as below. Dont forget to update it.
                    import { Link } from 'react-router-dom';
                    <Link to="/blogs">Go to blog</Link>
                    */}
                </main>
                <Footer />
            </div>
        </Router>
    );
}

export default App;






