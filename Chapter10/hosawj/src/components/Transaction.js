import React from "react";
import axios from 'axios';


class Transaction extends React.Component {
    state = {
      data: []
    }
  componentDidMount() {
     axios.get(`http://localhost:8080/rest/payments/find/1`).then(response => response.data)
        .then((data) => {
          this.setState({ data: data })
          console.log(this.state.data)
         })
   }

  render(props) {
    return (
      <h1 className="welcomeBanner">
          Welcome to our payment system, {this.state.data.recipient}  !
        </h1>
    );
  }
}
export default Transaction;
