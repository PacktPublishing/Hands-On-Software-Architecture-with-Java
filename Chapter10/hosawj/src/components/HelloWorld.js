import React from "react";



class HelloWorld extends React.Component {
  render(props) {
    /*return React.createElement('h1', {className: 'welcomeBanner'}, `Welcome to our payment system, ${props.fullName} ! `);*/
    return (
      <h1 className="welcomeBanner">
          Welcome to our payment system, {this.props.fullName} !
        </h1>
    );
  }
}
export default HelloWorld;
