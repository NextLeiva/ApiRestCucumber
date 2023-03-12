Feature: Funcionalidad gestion de persona

  Scenario Outline: Realizar la crecion de una persona
    When yo envio los datos de la persona <nombre>, <email> y <phone>
    Then yo verifico el estado 201
    And yo verifico los datos <nombre>, <email> y <phone>
    Examples:
      | nombre       | email            | phone    |
      | Erick Montes | montes@gmail.com | 98765432 |


  Scenario Outline: Actualizar la persona registrada
    When yo actualizo los datos <nombre>, <email> y <phone> de la persona
    Then yo verifico el estado 200
    And yo verifico los datos <nombre>, <email> y <phone>
    Examples:
      | nombre      | email          | phone    |
      | Juan Montes | juan@gmail.com | 98111432 |


  #Scenario Outline: Actualizar la persona registrada
  #  When yo actualizo los datos de la persona
  #    | nombre   | email   | phone   |
  #    | <nombre> | <email> | <phone> |
  #  Then yo verifico el estado 200
  #  And yo verifico los datos <nombre>, <email> y <phone>
  #  Examples:
  #    | nombre      | email          | phone    |
  #    | Juan Montes | juan@gmail.com | 98111432 |