Narrative:
Para poder ver los datos personales
Como usuario registrado de Mi Cuenta
Quiero poder ingresar a la aplicacion y navegar las opciones

Scenario: Ingreso a la autogestion de Personal
Meta: @Personal id1
Given Abro el sitio web www.personal.com.ar
When Hago click en el boton Ingresar
And Escribo como codigo 11
And Escribo como numero 62721183
And Escribo como IDToken2 9510
And Hago click en el boton Ingresar
Then Se muestra Nahuel Nucera como usuario logueado

Scenario: Salir de la autogestion de Personal
Meta: @Personal id2
Given Tengo como usuario logueado a Nahuel Nucera
When Hago click en el boton Nahuel Nucera
And Hago click en el boton Cerrar Sesión
Then Se muestra la pantalla de Personal

Scenario: Quiero consultar mi plan Personal
Meta: @Personal id3
GivenStories: Personal.story#{Personal:id1;}
Given Tengo como usuario logueado a Nahuel Nucera
When Hago click en el boton Nahuel Nucera
And Hago click en el boton Ir a mi cuenta
Then Se muestra el estado Activa

Scenario: Compra de un equipo
Meta: @Personal id4
Given Abro el sitio web www.personal.com.ar
When Hago click en el boton Tienda
And Hago click en Equipos
And Hago click en el boton Samsung
And Hago click en el boton Samsung Galaxy J7 2016 - Dorado
And Hago click en el boton Lo quiero con línea nueva
Then Se muestra la pantalla de Seleccioná el plan para tu línea nueva
