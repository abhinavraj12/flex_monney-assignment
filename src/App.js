import Registration from './registration form/Registration';
import {Toaster} from 'react-hot-toast';
//import {BrowserRouter,Switch,Route} from 'react-router-dom';

function App() {
  return (
    <>
    <div className="App">
      <Registration/>
    </div>
      <div>
        <Toaster position="top-right"
                 toastOptions={
                  {
                    success: {
                      theme: {
                        primary: "#4aed88",
                      }
                    },
                  }
                 }
        ></Toaster>
      </div>

      <div className="heading">
        <h1>Yoga Class</h1>
      </div>
      <Registration/>
    </>
  );
}

export default App;
