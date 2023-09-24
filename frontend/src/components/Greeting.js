import React, { useState, useEffect } from 'react';
import '../App.css'; // Import the styling

function Greeting() {
    const [message, setMessage] = useState("");
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch('/hello')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.text();
            })
            .then(data => {
                setMessage(data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
    }, []);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>Error: {error.message}</div>;

    return (
        <div>
            <div className="typewriter-container">
                <span className="typewriter-text">{message}</span>
                <span className="blinking-cursor">|</span>
            </div>
            <br />
            <a href="#" className="scanline-effect">Go to my blog</a>
        </div>
    );
}

export default Greeting;
