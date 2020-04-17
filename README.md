# Autobus
Esta es la linea de Autobuces ADOL
# Para iniciar
Para hacer uso de este servicio es importante que cuente con conexion a Internet
## API v2.0
### Consultar Viaje
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| Salida | **String** Ciudad de origen  |
| Destino | **String** Ciudad de destino |
| Fecha | **String** Fecha del viaje |

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| IDHora | **String** número de autobus y las horas disponibles  |

### Seleccion Autobus
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| IDSleccion | **Int** ID del Autobus que se halla seleccionado  |

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| AsientoDisponible | **String** Asientos disponibles del Autobus  |

### Seleccion Asiento
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| AsientoSeleccionado | **Int** ID del Asiento que se halla seleccionado  |
| NombrePasajero | **String** Nombre del pasajero que viajará  |

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** ID del boleto que fue seleccionado anteriormente |
| Salida | **String** Salida ingresada anteriormente |
| Destino | **String** Destino ingresado anteriormente |
| Fecha | **String** Fecha ingresada anteriormente |
| Hora | **String** Hora del viaje |
| IDAutobus | **Int** ID del Autobus seleccionado anteriormente |
| Asiento | **Int** Asiento seleccionado anteriormente |
| NombrePasajero | **String** Nombre del pasajero ingresado anteriormente |

### Confirmar Viaje
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| AceptarNO | **String** Ingresar Aceptar/No para Confirmar/Denegar el viaje  |

### Modificar Boleto
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** Ingrese el ID del Boleto que se le halla otorgado  |

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| Hora | **String** Hora que se halla seleccionado la cual se podra modificar siempre y cuando se cumpla algunos criterios |
| NombrePasajero | **String** Nombre del pasajero que se halla ingresado el cual se podra modificar siempre y cuando se cumpla algunos criterios |

### Confirmacion Modificar
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| Confirmar | **String** Ingresar Aceptar/No para Confirmar/Denegar la modificacion de los datos  |

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| Confirmar | **String** "Datos Mofificados" |

### Cancelar Boleto
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** Ingrese el ID del Boleto que se le halla otorgado  |

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| IDBoleto | **Int** ID del boleto que fue seleccionado anteriormente |
| Salida | **String** Salida ingresada anteriormente |
| Destino | **String** Destino ingresado anteriormente |
| Fecha | **String** Fecha ingresada anteriormente |
| Hora | **String** Hora del viaje |
| IDAutobus | **Int** ID del Autobus seleccionado anteriormente |
| Asiento | **Int** Asiento seleccionado anteriormente |
| NombrePasajero | **String** Nombre del pasajero ingresado anteriormente |


### Confirmacion Cancelar Viaje
Datos que recibe:
| Parametros | Descripcion |
| ----- | ---- |
| Confirmar | **String** Ingresar Aceptar/No para Confirmar/Denegar la cancelacion del viaje  |

Datos que regresa:
| Parametros | Descripcion |
| ----- | ---- |
| Confirmar | **String** "Boleto Cancelado" |
