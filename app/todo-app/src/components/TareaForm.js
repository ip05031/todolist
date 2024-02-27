import React from 'react'
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

const TareaForm = () => {
  return (
       <Form>
      <Form.Group className="mb-3" controlId="nombre">
        <Form.Label>Nombre:</Form.Label>
        <Form.Control type="text" placeholder="Ingrese Tarea" required />
      </Form.Group>
      <Button variant="primary" type="submit">
        Guardar
      </Button>
    </Form>

  )
}

export default TareaForm
