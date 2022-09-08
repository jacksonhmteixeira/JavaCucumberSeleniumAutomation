Feature: [LOGIN]

  Background: [LOGIN PAGE]
    Given I am on the Login Page

  @Login @LoginValid
  Scenario Outline: [LOGIN] [LOGGIN IN]
    Given the user fill in the login data with '<email>' and '<password>'
    When to click the enter button
    Then the system directs to the dashboard

    Examples:
      |email                        |password       |
      |plataforma@engenheiroqa.com  |plataformaEQA  |

  @Login @ErrorMessage
  Scenario Outline: [LOGIN] [ERROR MESSAGE]
    Given the user fill in the login data with '<email>' and '<password>'
    When to click the enter button
    Then the system display the message '<errorMessage>'

    Examples:
      |email              |password   | errorMessage              |
      |teste@teste.com    |teste      | Usuário/Senha incorreto!  |

  @Login @MandatoryMessage
  Scenario Outline: [MANDATORY MESSAGE]
    Given the user does not fill in the required field
    Then the system displays the message '<emailErrorMessage>' and '<passwordErrorMessage>'

    Examples:
      |  emailErrorMessage           | passwordErrorMessage  |
      |  E-mail é obrigatorio!       | Senha é obrigatório! |
