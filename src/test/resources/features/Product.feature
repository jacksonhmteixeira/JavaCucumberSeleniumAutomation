Feature: [PRODUCT]

  Background: [LOGGIN IN]
    Given that the user fill in the login data with "plataforma@engenheiroqa.com" and "plataformaEQA"
    When to click the enter button
    Then the system directs to the dashboard

  @Product @AccessingTheProductPage
  Scenario: [ACCESSING THE PRODUCT PAGE]
    Given that the user is on the dashboard
    When click on the Product Option
    Then the system directs to the product page

  @Product @RegisteringNewProduct
  Scenario Outline: [REGISTERING NEW PRODUCT]
    Given that the user is on the product search page
    When to click on the new product button
    And fill form with '<productName>', '<theAmount>', '<purchasePrice>', '<salePrice>', '<productType>'

    Examples:
      | productName | theAmount | purchasePrice | salePrice | productType |
      | iphone 5s   | 5         | 400,00        | 540,00    | Celular     |
      | iphone XR   | 2         | 1.400,00      | 1.900,00  | Celular     |
      | iphone 14   | 3         | 5.900,90      | 6.550,00  | Celular     |
      | iphone 13   | 4         | 4.900,90      | 5.550,00  | Celular     |
      | iphone 12   | 5         | 3.900,90      | 4.550,00  | Celular     |