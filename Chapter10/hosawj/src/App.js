import './App.css';
import HelloWorld from "./components/HelloWorld";
import Counter from "./components/Counter";
import Transaction from "./components/Transaction";

function App() {
  return (
    <div className="App">
      <HelloWorld fullName="Giuseppe Bonocore"/>
      <Counter/>
      <Transaction/>
    </div>
  );
}

export default App;
