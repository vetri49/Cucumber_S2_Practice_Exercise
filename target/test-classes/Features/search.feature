Feature: Search Product Functionality

  Scenario: User searches for a product
    Given User is logged in
    When User searches for a product "<name>"
    Then Search results should be displayed "<title>"

  Examples: 
    | name          | title          |
    | Computer      | Computer Title |
    | Health Book   | Book Title     |
    | Blue Jeans    | Jeans Title    |
