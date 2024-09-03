Feature: FaceBook Login

  Scenario: : Logo presence on FaceBook homepage
    Given I launch chrome browser
    When I open FaceBook home page
    Then I verify that the logo present on page
    And close browser