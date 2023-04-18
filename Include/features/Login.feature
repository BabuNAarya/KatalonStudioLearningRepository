Feature: Test login Functionality

  @smoke
  Scenario Outline: Check login is successful with valid cedentials
    Given user is on login page
    When user enters the <username> and <password>
    And clicks on login button
    Then user is navigated to the Home page

    @valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username  | password  |
      | sdvdfvfrv | e3244dssv |
