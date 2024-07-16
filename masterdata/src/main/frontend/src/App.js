import React from "react";
import logo from './logo.svg';

export default function App() {
  const [post, setPost] = React.useState(null);

  React.useEffect(() => {
    fetch('/fetchUser?id=2')
    .then(response => response.json())
    .then(post => {
      setPost(post)
    });
  }, []);

  if (!post) return null;

  return (
      <div className="App">
          <header className="App-header">
          <img src={logo} className="App-logo" alt="logo"/>
          <h1 className="App-title">{post.name}</h1>
          <p className="App-title">{post.email}</p>
          </header>
      </div>
  );
}
