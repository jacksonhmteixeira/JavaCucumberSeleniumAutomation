Feature: [LOGIN]

  @LoginPage @LoginValid
  Scenario Outline: [LOGIN] [LOGGIN IN]
    Given I am on the Login Page
    When filling with '<email>' and '<password>'
    And click the enter button
    Then the system directs you to the home pages

    Examples:
      |email                        |password       |
      |plataforma@engenheiroqa.com  |plataformaEQA  |

  @LoginPage @ErrorMessage
  Scenario Outline: [LOGIN] [ERROR MESSAGE]
    Given I am on the Login Page
    When filling with '<email>' and '<password>'
    And click the enter button
    Then the system display the message '<errorMessage>'

    Examples:
      |email              |password   | errorMessage              |
      |teste@teste.com    |teste      | Usuário/Senha incorreto!  |

  @LoginPage @MandatoryMessage
  Scenario Outline: [MANDATORY MESSAGE]
    Given I am on the Login Page
    When not filling the required field
    Then the system displays the message '<emailErrorMessage>' and '<passwordErrorMessage>'

    Examples:
      |  emailErrorMessage           | passwordErrorMessage  |
      |  E-mail é obrigatorio!       | Senha é obrigatório! |
