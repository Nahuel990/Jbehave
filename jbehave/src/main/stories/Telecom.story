Narrative:
Para poder hacer consultas
Como usuario de la pagina de Telecom
Quiero tener informacion de planes y ayuda disponibles


Scenario: Visualizar planes de Telecom
Meta:@Telecom id1
Given Abro el sitio web hogares.telecom.com.ar
When Hago click en el boton Tienda
Then Se carga el plan Arnet 20 MB wifi + Voz

Scenario: Solicitar un plan de Telecom
Meta:@Telecom id2
GivenStories:Telecom.story#{Telecom:id1;}
When Hago click en el boton solicitalo ahora
And Hago click en Solicitalo ahora
And Escribo como firstName Juan
And Escribo como lastName Perez
And Escribo como email juan@perez.com.ar
And Escribo como phone 11
And Escribo como phoneNumber 62721183
And Clickeo en Solicitar
Then Se muestra la pantalla de ¡Felicitaciones!

Scenario: Consultar como suscribirse a Factura Electronica
Meta:@Telecom id3
Given Abro el sitio web hogares.telecom.com.ar
When Hago click en el boton Ayuda
And Hago click en Facturación y Pagos
And Hago click en el boton adhesión a factura online
Then Se muestra la pantalla de Factura Online

