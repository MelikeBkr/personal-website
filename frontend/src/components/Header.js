import React from 'react';
import {Link} from "react-router-dom";

function Header() {
    return (
        <header>
            <h1>Melike's Personal Website</h1>
            <nav>
                <ul>
                    <li><Link to="/">Home</Link></li>
                    <li><Link to="/api/about-me">About Me</Link></li>
                    <li><Link to="/api/projects">Projects</Link></li>
                    <li><Link to="/api/blog-posts">Blog</Link></li>
                    <li><Link to="/api/contact">Contact</Link></li>
                    <li><Link to="/api/login">Login</Link></li>
                </ul>
            </nav>
        </header>
    );
}

export default Header;
