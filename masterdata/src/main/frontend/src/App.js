import React from "react";


export default function App() {
  const [post, setPost] = React.useState(null);

  React.useEffect(() => {
    fetch('/fetchUser?id=1')
    .then(response => response.json())
    .then(post => {
      setPost(post)
    });
  }, []);

  if (!post) return null;

  return (
    <div>
      <h1>{post.name}</h1>
      <p>{post.email}</p>
    </div>
  );
}
