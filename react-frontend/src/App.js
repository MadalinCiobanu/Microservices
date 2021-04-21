import { BrowserRouter as Router, Route } from 'react-router-dom';
import './App.css';
import Footer from './components/Footer';
import Header from './components/Header';
import Home from './components/Home';

export default function App() {
  return (
    <Router>
      <div className="App">

        <Header />
        <Route exact path="/" component={Home} />
        <Footer />

      </div>
    </Router>

  );
}
