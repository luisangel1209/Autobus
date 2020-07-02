# Autobus
Esta es la linea de Autobuces ADOL
Descargar el consumidor del [Servicio](https://github.com/luisangel1209/Autobus) para probarlo o mejor aun visitanos [Autobuces ADOL](https://github.com/luisangel1209/Autobus) para probarlo
# Para iniciar
Para hacer uso de este servicio es importante que cuente con conexion a Internet
## API v3.0
### Consultar Viaje
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| Salida | **String** Ciudad de origen  |
| Destino | **String** Ciudad de destino |
| Fecha | **String** Fecha del viaje (Formato DD-MM-YY)|

```
Ejemplo de peticion:
<ConsultarViajeRequest xmlns="http://www.TIS.com/autobus">
            <Salida>Veracruz</Salida>
            <Destino>Ciudad de Mexico</Destino>
            <Fecha>23-04-20</Fecha>
</ConsultarViajeRequest>
```
Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| IDViaje | **Int** Número de viaje que esta disponible  |
| IDAutobus | **Int** Número de autobus de ese viaje  |
| Hora | **String** Hora del viaje  |
| Precio | **String** Precio del viaje  |
| Mensaje | **String** Mensaje de información  |

```
Ejemplo de respuesta:
<ns2:ConsultarViajeResponse xmlns:ns2="http://www.TIS.com/autobus">
            <ns2:IDViaje>1</ns2:IDViaje>
            <ns2:IDAutobus>1</ns2:IDAutobus>
            <ns2:Hora>13:00</ns2:Hora>
            <ns2:Precio>$645</ns2:Precio>
            <ns2:Mensaje>Viaje Encontrado</ns2:Mensaje>
</ns2:ConsultarViajeResponse>
```

### Seleccion Autobus
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| IDSeleccion | **Int** ID del Autobus que se halla seleccionado  |

```
Ejemplo de peticion:
<SeleccionAutobusRequest xmlns="http://www.TIS.com/autobus">
            <IDSeleccion>1</IDSeleccion>
</SeleccionAutobusRequest>
```

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| IDAsiento | **String** ID de los asientos  |
| IDAsientoEstatus | **String** ID del asiento y su estatus |
```
Ejemplo de respuesta:
<ns2:SeleccionAutobusResponse xmlns:ns2="http://www.TIS.com/autobus">
            <ns2:IdAsiento>[A1, A2, A3, A4, A5]</ns2:IdAsiento>
            <ns2:Estatus>[A1 | Ocupado, A2 | Ocupado, A3 | Ocupado, A4 | Ocupado, A5 | Ocupado]</ns2:Estatus>
</ns2:SeleccionAutobusResponse>
```

### Seleccion Asiento
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| IDViaje | **Int** ID del Viaje que se halla seleccionado  |
| IDAutobus | **Int** ID del Viaje que se halla seleccionado  |
| IDAsientoSeleccionado | **String** ID del Asiento que se halla seleccionado  |
| NombrePasajero | **String** Nombre del pasajero que viajará  |
| CorreodelPasajeto | **String** Correo del pasajaero |
```
Ejemplo de peticion:
<SeleccionAsientoRequest xmlns="http://www.TIS.com/autobus">
            <IDViaje>1</IDViaje>
            <IDAutobus>1</IDAutobus>
            <IDAsientoSeleccionado>A1</IDAsientoSeleccionado>
            <NombrePasajero>Jose</NombrePasajero>
            <Correo>Jose@gmail.com</Correo>
</SeleccionAsientoRequest>
```

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** ID del boleto que fue seleccionado anteriormente |
| Salida | **String** Salida ingresada anteriormente |
| Destino | **String** Destino ingresado anteriormente |
| Fecha | **String** Fecha ingresada anteriormente |
| Hora | **String** Hora del viaje |
| IDAutobus | **Int** ID del Autobus seleccionado anteriormente |
| Asiento | **String** Asiento seleccionado anteriormente |
| NombrePasajero | **String** Nombre del pasajero ingresado anteriormente |
| Correo | **String** Correo del pasajero ingresado anteriormente |
| MensajeConfirmacion | **String** Mensaje de apoyo para el usuario |
```
Ejemplo de respuesta (En este caso están todos los asientos ocupados):
<ns2:SeleccionAsientoResponse xmlns:ns2="http://www.TIS.com/autobus">
            <ns2:IDBoleto>0</ns2:IDBoleto>
            <ns2:Salida/>
            <ns2:Destino/>
            <ns2:Fecha/>
            <ns2:Hora/>
            <ns2:IDAutobus>0</ns2:IDAutobus>
            <ns2:Asiento/>
            <ns2:NombrePasajero/>
            <ns2:Correo/>
            <ns2:MensajeConfirmacion>Asiento Ocupado: No se pudo realizar la Compra</ns2:MensajeConfirmacion>
</ns2:SeleccionAsientoResponse>
```

### Modificar Boleto
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** Ingrese el ID del Boleto que se le halla otorgado al momento de realizar su compra |
| NuevoNombrePasajero | **String** Ingrese el nuevo nombre del pasajero |
```
Ejemplo de peticion (En este caso solo se podra modificar el nombre del pasajero:
<ModificarBoletoRequest xmlns="http://www.TIS.com/autobus">
            <IDBoleto>1</IDBoleto>
            <NuevoNombrePasajero>Marcos</NuevoNombrePasajero>
</ModificarBoletoRequest>
```

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| MensajeConfirmacion | **String** Mensaje que confirme la modificación de la compra o en su defecto error en la modificacion |
```
Ejemplo de respuesta:
<ns2:ModificarBoletoResponse xmlns:ns2="http://www.TIS.com/autobus">
            <ns2:MensajeConfirmacion>Boleto Modificado</ns2:MensajeConfirmacion>
</ns2:ModificarBoletoResponse>
```

### Cancelar Boleto
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** Ingrese el ID del Boleto que se le halla otorgado  |
```
Ejemplo de peticion:
<CancelarBoletoRequest xmlns="http://www.TIS.com/autobus">
            <IDBoleto>14</IDBoleto>
</CancelarBoletoRequest>
```

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** ID del boleto que fue seleccionado anteriormente |
| IDViaje | **Int** ID del viaje que fue seleccionado anteriormente |
| IDAsiento | **String** ID del asiento que fue seleccionado anteriormente |
| MensajeConfirmacion | **String** Mensaje que confirme el viaje cancelado o en su defecto error en la cancelacion |
```
Ejemplo de respuesta:
<ns2:CancelarBoletoResponse xmlns:ns2="http://www.TIS.com/autobus">
            <ns2:IDBoleto>14</ns2:IDBoleto>
            <ns2:IDViaje>1</ns2:IDViaje>
            <ns2:IDAsiento>A1</ns2:IDAsiento>
            <ns2:MensajeConfirmacion>Boleto Cancelado</ns2:MensajeConfirmacion>
</ns2:CancelarBoletoResponse>
```
