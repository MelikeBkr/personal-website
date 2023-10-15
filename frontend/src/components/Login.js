import React, { useState } from 'react';

function Login() {
    const [credentials, setCredentials] = useState({
        username: '',
        password: ''
    });

    const handleChange = (e) => {
        setCredentials({ ...credentials, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        // TODO: Handle the login, e.g., send credentials to the backend.
    };

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Username:
                <input type="text" name="username" value={credentials.username} onChange={handleChange} required />
            </label>
            <label>
                Password:
                <input type="password" name="password" value={credentials.password} onChange={handleChange} required />
            </label>
            <button type="submit">Login</button>
        </form>
    );
}

export default Login;