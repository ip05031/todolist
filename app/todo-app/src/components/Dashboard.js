import React from "react";
import Button from "react-bootstrap/Button";
import Form from "react-bootstrap/Form";
import {Container,Row ,Col} from "react-bootstrap";
import TareaForm from "./TareaForm";

function Dashboard() {
  return (

      <Row className="justify-content-md-center mt-5">
        <Col xs lg="2"> 
         <p> Agregar nueva tarea : </p>
        <TareaForm/>

        </Col>
        <Col xs lg="10 justify-content-center">
            <h5> Listado de Tareas </h5> 
        </Col>
      </Row>

  );
}

export default Dashboard;
