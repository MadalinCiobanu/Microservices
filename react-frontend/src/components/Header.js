import React from "react";
import logo from "../movie logo.jpg";
import { Link } from "react-router-dom"

export default function Header() {

  return (
    <div style={barStyle}>
      <div style={upperStyle}>
        <div style={logoStyle}>
          <Link exact to="/">
            <img src={logo} width="250px" height="150px" alt="logo"></img>
          </Link>
        </div>
        <div style={linksStyle}>
          <Link exact to="/" style={linkStyle}>
            Home
          </Link>
        </div>
      </div>
    </div>
  );
}

const barStyle = {
  display: "flex",
  flexDirection: "column",
  width: "100%",
  top: "0",
};

const upperStyle = {
  display: "flex",
  flexDirection: "row",
  backgroundColor: "black",
};

const linksStyle = {
  marginLeft: "auto",
  marginRight: "5%",
  display: "flex",
  alignItems: "center",
};

const linkStyle = {
  fontFamily: "'Montserrat', sans-serif",
  fontSize: "20px",
  fontWeight: "normal",
  color: "#F4F4F4",
  padding: "20px",
};

const logoStyle = {
  marginLeft: "5%",
};

// const pStyle = {
//   fontFamily: "'Montserrat', sans-serif",
//   fontSize: "20px",
//   fontWeight: "normal",
//   color: "#DDEF3F",
//   padding: "20px 0px 20px 40px",
//   marginTop: "5px",
// };
