import React, { useState } from 'react';

function ContactForm() {
    const [formData, setFormData] = useState({
        name: '',
        email: '',
        message: ''
    });

    const handleChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();

        fetch('/api/contact', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData),
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.text();
            })
            .then(data => {
                alert('Message sent!');
                setFormData({
                    name: '',
                    email: '',
                    message: ''
                });
            })
            .catch((error) => {
                console.error('Error:', error);
                alert('An error occurred while sending the message.');
            });
    };

    return (
        <form onSubmit={handleSubmit}>
            <label>Name:
                <input type="text" name="name" value={formData.name} onChange={handleChange} required />
            </label>
            <br />
            <label>Email:
                <input type="email" name="email" value={formData.email} onChange={handleChange} required />
            </label>
            <br />
            <label>Message:
                <textarea name="message" value={formData.message} onChange={handleChange} required />
            </label>
            <br />
            <button type="submit">Send</button>
        </form>
    );
}

export default ContactForm;
