Feature: [LOGIN]

  @login @LoginValid @selenium
  Scenario Outline: [LOGGIN IN]
    Given I am on the Login Page
    When filling with '<email>' and '<password>'
    And click the enter button
    Then the system directs you to the home pages

    Examples:
      |email                        |password       |
      |plataforma@engenheiroqa.com  |plataformaEQA  |

  @login @LoginValid @selenium
  Scenario Outline: [LOGGIN IN]
    Given I am on the Login Page
    When filling with '<email>' and '<password>'
    And click the enter button
    Then the system directs you to the home pages

    Examples:
      |email                        |password       |
      |plataforma@engenheiroqa.com  |plataformaEQA  |
