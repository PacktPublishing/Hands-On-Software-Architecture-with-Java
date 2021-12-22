import React from "react";

class Counter extends React.Component {
  constructor(props) {
      super(props);
      this.state = {counter: 0};
    }
  render(props) {

    return (
      <div>
        <h2>You have clicked {this.state.counter} times !</h2>
        <button onClick={() => this.setState({ counter: this.state.counter + 1 })}>
            Click Me!
        </button>
      </div>  
    );
  }
}
export default Counter;
