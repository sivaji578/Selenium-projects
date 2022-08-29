Feature: Manage services

  Scenario: Verify Add New Services & delete service
#    Sign in and navigate to Find Rooms

    Given I navigate to the open space homepage

    Then I type "saul@example.com" in the "Email" field on the sign in page
    Then I type "testing" in the "Password" field on the sign in page
    And I select "Sign in" on the sign in page
#    Given I select "Privacy Policy" on the homepage
#    And I select "Terms & Conditions" on the homepage
#    And I select "User Acceptance Confirm" on the homepage
    And I select "Accounts" on My Account on the homepage
    And I select "Add New" on the services widget
    Then The "New Service Header" element has "Request new service" text on the services widget
    When I select "Clinical" from the "Service Type" dropdown on the services widget
    And I select a "Addiction services" from the "Service" dropdown on the services widget
    And I type "1234567890" in the "Service Identifier" field on the services widget
    And I select a "Commissioned Service Checkbox" on the services widget
    And I select b "West" from the "Commissioning Body" dropdown on the services widget
    And I select to "Licensed Checkbox" on the services widget
    And I type b "TEST BODY" in the "Licensing Body" field on the services widget
    And I type a "123456" in the "Registration Number" field on the services widget
    When I select c "Add Another Service" on the services widget
   When I select s "Non-Clinical" from the "Service Type" dropdown on the services widget
    And I select n "Administrative" from the "Service" dropdown on the services widget
    And I type s "0987654321" in the "Service Identifier" field on the services widget
    When I select w "Submit For Approval" on the services widget
    Then The s "Pending Approval 1" element has "Pending approval" text on the services widget
    Then The n "Pending Approval 2" element has "Pending approval" text on the services widget
  # TODO - Add confirming pending service when possible
#    Delete added services
    Given I select a1 "Delete Button" on the services widget
    When I select a2 "Confirm Delete Button" on the services widget
    Then There are 6 services left on the services widget
    And I select second a3 "Delete Button" on the services widget
    And I select a4 "Confirm Delete Button" on the services widget
    Then There are 5 services left on the services widget
    When I select a5 "Log Out" on the services widget