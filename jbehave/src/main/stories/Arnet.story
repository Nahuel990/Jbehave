Narrative:
Para aprender cuestiones de soporte
Como usuario de Arnet
Quiero poder consultar las ayudas disponibles en la pagina

Scenario: Consultar como configurar el modem
Meta: @Arnet id1
Given Abro el sitio web www.arnet.com.ar
When Hago click en el boton Ayuda técnica
And Hago click en el boton Internet
And Hago click en el boton Conexión
Then Se muestra la pantalla de Conexión
And Se muestra la pantalla de Aprendé fácilmente a configurar tu módem Wi-Fi.

Scenario: Consultar las novedades del catalogo de Arnet Play
Meta: @Arnet id2
Given Abro el sitio web www.arnet.com.ar
When Hago click en el boton Arnet Play
Then Se muestra la pantalla de Novedades