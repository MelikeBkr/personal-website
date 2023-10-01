import React, { useState, useEffect } from 'react';

function Projects() {
    const [projects, setProjects] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch('/api/projects')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                setProjects(data);
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
            {projects.map((project, index) => (
                <div key={index}>
                    <h3>{project.title}</h3>
                    <p>{project.description}</p>
                    <img src={project.imageUrl} />
                    <a href={project.projectUrl}>View {project.title}</a>
                </div>
            ))}
        </div>
    );
}

export default Projects;
