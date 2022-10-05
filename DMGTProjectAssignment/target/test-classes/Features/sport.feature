Feature:  Sport menu
  Scenario: navigate to the sport menu
    When    user is on sports page "https://www.dailymail.co.uk/sport/index.html"
    And     user quit

  Scenario: navigate to the football submenu
    Given   user clicks on football submenu
    And     user quit


  Scenario: Ensure primary navigation (Sport) and secondary navigation (Football) are same
    When    user is on sports page "https://www.dailymail.co.uk/sport/index.html"
    When    user gets sports related football sub menu
    And     user quit
