Feature: Sending CV on Career page

  @a
  Scenario: Send Cv

    Given go to google home page
    When enter "Roof Stack Yazılım" into search box and hit the enter
    And click "roofstacks.com" links from result list
    And click the "CAREER" page link
    And click open position under "RoofStacks" title
    And click "RoofStacks" tab
    And click View job near "Senior Mobile Developer" title
    Then the title of page should contain "Senior Mobile Developer"
    When click "Apply" button
    And enter full name "fullName" , emailAdress "emailAdress" , and phone number "phoneNumber"
    And upload a sample CV
    And click send button
    Then "All done" message should be displayed

