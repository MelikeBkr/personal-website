import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';

function BlogPostDetail() {
    const [post, setPost] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const { id } = useParams();

    useEffect(() => {
        fetch(`/api/blog-posts/${id}`)
            .then(response => {
                if (!response.ok) throw new Error('Network response was not ok');
                return response.json();
            })
            .then(data => {
                setPost(data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
    }, [id]);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>Error: {error.message}</div>;
    if (!post) return <div>Post not found</div>;

    return (
        <div>
            <h2>{post.title}</h2>
            <p>{post.date}</p>
            <p>{post.content}</p>
        </div>
    );
}

export default BlogPostDetail;
