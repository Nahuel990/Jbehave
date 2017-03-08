Narrative:
Como Usuario de Club Personal
Quiero Ver los descuentos disponibles
Para poder consumirlos

Scenario: Consultar descuentos disponibles en Heladerias
Meta: @ClubPersonal id1
Given Cargo el sitio club.personal.com.ar
When Hago click en el boton Descuentos
And Hago click en el boton 20%
And Hago click en el boton Heladerias
And Hago click en Cremolatti
Then Se muestra la pantalla de Cremolatti