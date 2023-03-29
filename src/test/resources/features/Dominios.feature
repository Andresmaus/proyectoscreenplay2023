#Autor: Andres Sanchez

@Regresion
Feature: Yo como usuario quiero probar todos los escenarios de pruebas correspondientes a la app saucedemo

  @iniciar_sesion
  Scenario Outline: Login Exitoso
    Given el actor ingresa a saucedemo
      | url   |
      | <url> |
    When el se autentica
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Then el valida el ingreso correctamente
      | mensaje_home   |
      | <mensaje_home> |


    Examples:
      | url                        | usuario       | contrasena   | mensaje_home |
      | https://www.saucedemo.com/ | standard_user | secret_sauce | Products     |
