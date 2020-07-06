// import React from 'react';
// import ReactDOM from 'react-dom';
// import './index.css';
// import App from './App';
// import registerServiceWorker from './registerServiceWorker';

// ReactDOM.render(<App />, document.getElementById('root'));
// registerServiceWorker();


// // import React, { Component } from 'react';    
// // // import './App.css';    
// // import './index.css';
// // import App from './App';   
    
// // export default class index extends Component {    
// //   render() {    
// //     return (    
// //       <div className="content">    
// //         <App />    
// //       </div >    
// //     );    
// //   }    
// // }

import React, { Component } from 'react';    
import './index.css';    
import App from './App';   
import registerServiceWorker from './registerServiceWorker';
import ReactDOM from 'react-dom';

    
export default class index extends Component {    
  render() {    
    return (    
      <div className="content">    
        <App />    
      </div >    
    );    
  }    
}


ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker(); 