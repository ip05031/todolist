import React from 'react'
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import LoginForm from './LoginForm';
import Dashboard from './Dashboard';

const Inicio = () => {
    const login = false;
    const usuario = "";

  return (

    
    <Container >
      <Row className="justify-content-md-center">
        <Col xs lg="2">
          
        </Col>
        <Col md="auto"><LoginForm /></Col>
        <Col xs lg="2">
         
        </Col>
      </Row>
      <Row className="justify-content-md-center">
        <Col xs lg="2">
         <h3>Welcome , { usuario }</h3>
        </Col>
      </Row>

    <Row>
      <Col>
        <Dashboard/>
      </Col>
    </Row>

  </Container>
  )
}

export default Inicio
