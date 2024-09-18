Feature: Validación de ingreso a Bancolombia

  Como usuario de la aplicación
  Quiero validar la funcionalidad de capital inteligente,
  Para comprobar la actualidad económica.

  @IngresoSucursal
  Scenario: Validar el login exitoso
    Given Andres tiene acceso a la URL
    When ingresa a corporativos, actualidad económica
    And valido el PDF