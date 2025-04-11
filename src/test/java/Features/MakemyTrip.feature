Feature: Bus ticket booking using MakeMyTrip platform

  Scenario: User books a sleeper AC bus at the lowest fare
    Given User opens the MakeMyTrip HomePage
    When Popup occur..Close the popup..
    When User clicks on the "Buses" section
    And User selects "Chennai" as the source city
    And User selects "Bangalore" as the destination city
    And User chooses "10-Apr-2025" as the departure date
    And User clicks the "Search" button
    Then User should see a list of available buses
    When User filters the results by "AC"
    And User filters the results by "Sleeper"
    And User filters the results by "Single"
    And User selects preferred pickup Point as "Guindy"
    And User filters the results by departure time between "6 PM" and "11 PM"
    And User selects preferred drop Point as "Majestic"
    Then User sorts the results by lowest fare
    And User selects the bus with the lowest fare
    And User selects a sleeper seat
    And User selects pickup location as "Guindy"
    And User selects drop location as "Majestic"
    And User clicks on the "Continue" button
    Then User fills in traveller details with name "Sathiq", age "29", gender "Male",Email "ahmed@gmail.com",Pincode "620002"
    Then Booking summary should be displayed
