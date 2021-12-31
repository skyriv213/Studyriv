import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import firebase from "./firebase";
console.log(firebase);


ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// 성능 측정을 위한 reportwebVitals  함수 제거
