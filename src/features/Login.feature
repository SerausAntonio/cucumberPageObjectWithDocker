Feature: Login

  Scenario: Succesfull Login with valid Credentials
    Given User launch the Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.con/login
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And Close browser