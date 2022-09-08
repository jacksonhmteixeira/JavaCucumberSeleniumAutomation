Feature: [DASHBOARD]

  Background: [LOGGIN IN]
    Given that the user fill in the login data with "plataforma@engenheiroqa.com" and "plataformaEQA"
    When to click the enter button
    Then the system directs to the dashboard

  @Dashboard @ViewProductButtonOnDashBoard
  Scenario: [VIEW PRODUCT BUTTON ON DASHBOARD]
    Given that the user is on the dashboard
    When click the button Visualizar Produto
    Then the system directs to the product pages