Feature: Login functionality writting for NH5 Project
Scenario: Checking the normal login flow
Given Enter the url data
When Enter the creadientials data on application
Then Application should be open the home page
And Validate the Home page title here
# @Regression 
# Feature:  Basket regression tests
#   Background:
#     Given I navigate to the open space homepage
#     Then I select "Sign in" on the homepage
#     Then I type "saul@example.com" in the "Email" field on the sign in page
# 	  Then I type "testing" in the "Password" field on the sign in page
#     And I select "Sign in" on the sign in page


#Scenario: Add multiple bookings to basket for different services; the invoices and the payments are split correctly and charged to the correct cards in WP
     Given I select "Find a Room" on the homepage
     When I select add to booking on the element in index 1
     When I select "Accident and emergency services" from the "Service" dropdown on the quickbook widget
    # And I select "Quickbook DatePicker" on the find rooms quick book widget
     When I select day "8" of "next month" from the datepicker on the quickbook widget
     When I select to "09:00" from the "Start Time" dropdown on the quickbook widget
     And I add to select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
     Then The add to basket button is enabled on the quickbook widget
     And I select "Add to Basket" on the find rooms quick book widget
     Then I verify that "Successfully added to basket" is visible on the quickbook widget
     And I select b "Continue Booking" on the find rooms quick book widget
     When I select add to booking on the element in index 2
     When I add select "Abdominal aortic aneurysm screening" from the "Service" dropdown on the quickbook widget
     And I select "Quickbook DatePicker" on the find rooms quick book widget
     When I select a day "10" of "next month" from the datepicker on the quickbook widget
     And I choose the first available slot
     And I select the "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
     Then add to basket button is enabled on the quickbook widget
     And I select to "Add to Basket" on the find rooms quick book widget
     Then I got that "Successfully added to basket" is visible on the quickbook widget
     And I select a "Checkout" on the find rooms quick book widget
     And There are 2 "Bookings" on the basket page
#     # Need to have cards registered to the services to continue
     Then I verify that "No active payment method message" is not visible on the basket page
     And I select "Pay Booking in Full radio" on the basket page
     And I select a "Terms and Conditions Checkbox" on the basket page
     And I select b "Pay Now" on the basket page
     Then The element "Booking Confirmation" contains the text "Booking Confirmation" on the basket page
# #     #check invoices and payments split correctly (not sure how, waiting for Jay)

# Scenario: 2 bookings for different services each with different registered cards by different users; pay as you go; invoices and payments are split correctly
#     When I select add to booking on the element in index 1
#     When I select "Accident and emergency services" from the "Service" dropdown on the quickbook widget
#     And I select "Quickbook DatePicker" on the find rooms quick book widget
#     When I select day "8" of "next month" from the datepicker on the quickbook widget
#     When I select "09:00" from the "Start Time" dropdown on the quickbook widget
#     And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#     Then The add to basket button is enabled on the quickbook widget
#     And I select "Add to Basket" on the find rooms quick book widget
#     Then I verify that "Successfully added to basket" is visible on the quickbook widget
#     And I select "Continue Booking" on the find rooms quick book widget
#     When I select add to booking on the element in index 2
#     When I select "Abdominal aortic aneurysm screening" from the "Service" dropdown on the quickbook widget
#     And I select "Quickbook DatePicker" on the find rooms quick book widget
#     When I select day "10" of "next month" from the datepicker on the quickbook widget
#     And I choose the first available slot
#     And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#     Then The add to basket button is enabled on the quickbook widget
#     And I select "Add to Basket" on the find rooms quick book widget
#     Then I verify that "Successfully added to basket" is visible on the quickbook widget
#     And I select "Checkout" on the find rooms quick book widget
#     And There are 2 "Bookings" on the basket page
#     # Need to have cards registered to the services to continue
# #     Then I verify that "No active payment method message" is not visible on the basket page
# #     And I select "Pay Booking as You Go radio" on the basket page
# #     And I select "Terms and Conditions Checkbox" on the basket page
# #     And I select "Pay Now" on the basket page
# #     Then The element "Booking Confirmation" contains the text "Booking Confirmation" on the basket page
# #     #check invoices and payments split correctly (not sure how, waiting for Jay)

#   Scenario: 2 bookings, one has an active mandate/card and one has no registered mandate/card; pay now/upfront; taken to WP to enter card details for the amount of booking with no payment method set up only
#     When I select add to booking on the element in index 1
#     When I select "Accident and emergency services" from the "Service" dropdown on the quickbook widget
#     And I select "Quickbook DatePicker" on the find rooms quick book widget
#     When I select day "20" of "next month" from the datepicker on the quickbook widget
#     When I select "09:00" from the "Start Time" dropdown on the quickbook widget
#     And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#     Then The add to basket button is enabled on the quickbook widget
#     And I select "Add to Basket" on the find rooms quick book widget
#     Then I verify that "Successfully added to basket" is visible on the quickbook widget
#     And I select "Continue Booking" on the find rooms quick book widget
#     When I select add to booking on the element in index 2
#     When I select "Abdominal aortic aneurysm screening" from the "Service" dropdown on the quickbook widget
#     And I select "Quickbook DatePicker" on the find rooms quick book widget
#     When I select day "18" of "next month" from the datepicker on the quickbook widget
#     And I choose the first available slot
#     And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#     Then The add to basket button is enabled on the quickbook widget
#     And I select "Add to Basket" on the find rooms quick book widget
#     Then I verify that "Successfully added to basket" is visible on the quickbook widget
#     And I select "Checkout" on the find rooms quick book widget
#     # Need to have registered card to continue
#     # And There are 2 "Bookings" on the basket page
#     # Then I verify that "No active payment method message" is visible on the basket page
#     # And There are 1 "Service with no active payment method" on the basket page
#     # And The element "Service with no active payment method" contains the text "Dermatology" on the basket page
#     # And I select "Pay Booking in Full radio" on the basket page
#     # And I select "Terms and Conditions Checkbox" on the basket page
#     # And I select "Pay Now" on the basket page
#     # Then I confirm that the "World Pay" is visible on the payment page
#     # And The element "Payment Amount" contains the text "£12.00" on the WP page
#     # Then I type "4444333322221111" into the "card number" field
#     # Then I type "Tues Day" into the "cardholder name" field
#     # Then I type "02" into the "expiry month" field
#     # Then I type "22" into the "expiry year" field
#     # Then I type "123" into the "security code" field
#     # Then I type "1 Main Street" into the "address" field
#     # Then I type "London" into the "city" field
#     # Then I type "W1 1AA" into the "post code" field
#     # And I select "United Kingdom" from the country dropdown payment card details screen
#     # Then I click the "confirm new card" button
#     #And I click the "Buy now" button on the payment card details screen
#     #TODO: Not possible to continue with payment due to Error message: Expired Your session has expired or cookies are not enabled in your browser. Same issue found on Manage Payment
#     #Next steps were to check if payed one of bookings with registered card, but found out if I do not complete the WP payment for the unregistered card, the other booking is not charged either, so to test if the page will show th einvoices, I need to finish the payment on WP
#     # And I select "Accounts" on My Account on the homepage
#     # Then The "first" invoice "Property Name" contains the text "Blaydon" on the accounts page
#     # Then The "first" invoice "Total Outstanding" contains the text "£0.00" on the accounts page
#     # Then The "first" invoice "Service" contains the text "Service registered with card" on the accounts page
#     # Then The "first" invoice "Satus Indicator" contains the text "Fully paid" on the accounts page

#   Scenario: Multiple bookings with different services without payment methods and from different venues; click to pay now/upfront; taken to WP to enter card details
#     When I select add to booking on the element in index 2
#     When I select "Accident and emergency services" from the "Service" dropdown on the quickbook widget
#     And I select "Quickbook DatePicker" on the find rooms quick book widget
#     When I select day "16" of "next month" from the datepicker on the quickbook widget
#     And I choose the first available slot
#     And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#     Then The add to basket button is enabled on the quickbook widget
#     And I select "Add to Basket" on the find rooms quick book widget
#     Then I verify that "Successfully added to basket" is visible on the quickbook widget
#     And I select "Continue Booking" on the find rooms quick book widget
#     When I select add to booking on the element in index 11
#     When I select "Activity" from the "Service" dropdown on the quickbook widget
#     And I select "Quickbook DatePicker" on the find rooms quick book widget
#     When I select day "16" of "next month" from the datepicker on the quickbook widget
#     When I select "14:00" from the "Start Time" dropdown on the quickbook widget
#     And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#     Then The add to basket button is enabled on the quickbook widget
#     And I select "Add to Basket" on the find rooms quick book widget
#     Then I verify that "Successfully added to basket" is visible on the quickbook widget
#     And I select "Checkout" on the find rooms quick book widget
#     Then I check the Basket Page H2 header is "Your basket"
#     And There are 2 "Bookings" on the basket page
#     And I select "Pay Booking in Full radio" on the basket page
#     Then I verify that "No active payment method message" is visible on the basket page
#     And I select "Terms and Conditions Checkbox" on the basket page
#     And I select "Pay Now" on the basket page
#     #From here it throws a 500 error and does not go to WP; manually it opens a popup to register a card but not WP
#     # Then I confirm that the "World Pay" is visible on the payment page
#     # Then I type "4444333322221111" into the "card number" field
#     # Then I type "Tues Day" into the "cardholder name" field
#     # Then I type "02" into the "expiry month" field
#     # Then I type "22" into the "expiry year" field
#     # Then I type "123" into the "security code" field
#     # Then I type "1 Main Street" into the "address" field
#     # Then I type "London" into the "city" field
#     # Then I type "W1 1AA" into the "post code" field
#     # And I select "United Kingdom" from the country dropdown payment card details screen
#     # Then I click the "confirm new card" button
#     #And I click the "Buy now" button on the payment card details screen
#     #TODO: Not possible to continue with payment due to Error message: Expired Your session has expired or cookies are not enabled in your browser. Same issue found on Manage Payment
  
#     Scenario: Multiple future-dated bookings from different services with different payment methods and venues; select pay as you go and verify bookings status and Invoices should not be generated
#       When I select add to booking on the element in index 1
#       When I select "Activity" from the "Service" dropdown on the quickbook widget
#       And I select "Quickbook DatePicker" on the find rooms quick book widget
#       When I select day "8" of "next month" from the datepicker on the quickbook widget
#       When I select "09:00" from the "Start Time" dropdown on the quickbook widget
#       And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#       Then The add to basket button is enabled on the quickbook widget
#       And I select "Add to Basket" on the find rooms quick book widget
#       Then I verify that "Successfully added to basket" is visible on the quickbook widget
#       And I select "Continue Booking" on the find rooms quick book widget
#       When I select add to booking on the element in index 9
#       When I select "Accident and emergency services" from the "Service" dropdown on the quickbook widget
#       And I select "Quickbook DatePicker" on the find rooms quick book widget
#       When I select day "10" of "next month" from the datepicker on the quickbook widget
#       And I choose the first available slot
#       And I select "Booking Host 0 (bookinghost0@example.com)" from the "Select Host" dropdown on the quickbook widget
#       Then The add to basket button is enabled on the quickbook widget
#       And I select "Add to Basket" on the find rooms quick book widget
#       Then I verify that "Successfully added to basket" is visible on the quickbook widget
#       And I select "Checkout" on the find rooms quick book widget
#       And There are 2 "Bookings" on the basket page
#       Then I verify that "No active payment method message" is not visible on the basket page
#       And I select "Pay Booking as You Go radio" on the basket page
#       And I select "Terms and Conditions Checkbox" on the basket page
#       # And I select "Pay Now" on the basket page
#       #From here it throws a 500 error and does not go to WP; manually it opens a popup to register a card but not WP
#       # Then The element "Booking Confirmation" contains the text "Booking Confirmation" on the basket page
#       # And I select "Bookings" on My Account on the homepage
#       # Then The "first" booking "Property Name" contains the text "Blaydon" on the bookings page
#       # Then The "first" booking "Room" contains the text "Counselling Room" on the bookings page
#       # Then The "first" booking "Service" contains the text "Activity" on the bookings page
#       # Then The "first" booking "Total" contains the text "£48.00" on the bookings page
#       # Then The "second" booking "Property Name" contains the text "Chorley Health Centre" on the bookings page
#       # Then The "second" booking "Room" contains the text "Examination Room 2" on the bookings page
#       # Then The "second" booking "Service" contains the text "Accident and emergency services" on the bookings page
#       # Then The "second" booking "Total" contains the text "£576.00" on the bookings page
#       # And I verify that a Booking Confirmation email for "Blaydon" has been received
#       # And I verify that a Booking Confirmation email for "Chorley Health Centre" has been received
#       # And I select "accounts" on the bookings page
#       # Then The "first" invoice "Property Name" does not contain the text "Blaydon primary care centre" on the accounts page
#       # Then The "first" invoice "Total" does not contain the text "£12.00" on the accounts page
#       # Then The "second" invoice "Property Name" does not contain the text "Audley Health Centre" on the accounts page
#       # Then The "second" invoice "Total" does not contain the text "£12.00" on the accounts page 