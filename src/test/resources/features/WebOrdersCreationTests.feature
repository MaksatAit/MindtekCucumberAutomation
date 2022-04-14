@OMT-7929
Feature: Validating calculate and order creation functionalities

  Scenario Outline: Validating calculate functionality
    Given user navigates to the weborders application
    When user provides username "Tester" and password "test"
    And user navigates to the order module
    And user selects "<product>" product with <quantity>
    Then user validates total is calculated properly for <quantity>

    Examples:
      | product     | quantity |
      | MyMoney     | 1        |
      | FamilyAlbum | 100      |
      | ScreenSaver | 55       |
      | MyMoney     | 20       |

  @OMT-7931
  Scenario Outline: Validating create order functionality
    Given user navigates to the weborders application
    When user provides username "Tester" and password "test"
    And user counts number of orders in table
    And user navigates to the order module
    And user creates order with data
      | product   | quantity   | name   | street   | city   | state   | zip   | card   | expire date   |
      | <product> | <quantity> | <name> | <street> | <city> | <state> | <zip> | <card> | <expire date> |
    Then user validates success message "New order has been successfully added."
    And user validates order added to List of Orders

    Examples:
      | product | quantity | name        | street      | city        | state | zip   | card         | expire date |
      | MyMoney | 10       | John Doe    | 123 My Road | Chicago     | IL    | 12345 | 123412341234 | 12/22       |
      | MyMoney | 2        | Patel Harsh | 123 My Road | Los Angeles | CA    | 12345 | 123412341234 | 11/24       |
      | MyMoney | 1        | Kim Yan     | 123 My Road | Washington  | WA    | 12345 | 123412341234 | 3/23       |
