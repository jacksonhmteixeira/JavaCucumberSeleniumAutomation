Feature: [MARKET]

  Background: [LOGGIN IN]
    Given that the user fill in the login data with "plataforma@engenheiroqa.com" and "plataformaEQA"
    When to click the enter button
    Then the system directs to the dashboard

  @Market @AccessingTheMarketsPage
  Scenario: [ACCESSING THE MARKETS PAGE]
    Given that the user is on the dashboard
    When to click on the Market Option
    Then the system directs you to the market pages

  @Market @CheckProductSearch
  Scenario Outline: [CHECK PRODUCT SEARCH]
    Given that the user is on the dashboard
    When to click on the Market Option
    And the user to fill in the search field with '<product>'
    Then the system displays the searched '<product>'

    Examples:
      | product               |
      | Mouse                 |
      | Monitor 18 Polegadas  |
      | Teclado               |
      | Monitor 24" polegadas |