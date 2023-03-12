@CrearBooking
Feature: Crear Booking para el usuario
  Yo como usuario
  Quiero crear un booking
  Para poder realizar un reserva

  Rule: Creación de booking en la aplicación

    Background: Creación de Token
      Given que ingreso las credenciales para obtener el token

        ######### GHERKIN DECLARATIVO ##############
    @scenario1
    Scenario: Creacion de booking de manera exitosa
      When yo ingreso los datos del usuario y el precio
      Then yo visualizo que los datos se crearon correctamente

      ######### GHERKIN IMPERATIVO ###############
    @scenario2
    Scenario: Creacion de booking de manera exitosa
      When yo ingreso mi nombre Erick
      And ingreso mi apellido Montes
      And ingreso el precio
      And ingreso el estado deposito
      And ingreso el chekin
      And ingreso el checkout
      And tambien alguna necesidad adicional Breakfast
      Then yo visualizo que los datos se crearon correctamente

    @scenario3
    Scenario Outline: Creacion de booking de manera exitosa
      When yo ingreso los datos del usuario <nombre>, <apellido>, <precio>, <checkin>, <checkout>
      Then yo visualizo que los datos se crearon correctamente
      Examples:
        | nombre   | apellido | precio | checkin    | checkout   |
        | Erick    | Montes   | 300.00 | 2023-01-01 | 2023-01-20 |
        | Jose     | Montes   | 320.00 | 2023-01-01 | 2023-01-20 |
        | Fernando | Montes   | 350.00 | 2023-01-01 | 2023-01-20 |
        | Juan     | Montes   | 380.00 | 2023-01-01 | 2023-01-20 |




