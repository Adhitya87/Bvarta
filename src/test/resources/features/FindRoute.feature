Feature: Looking for location

  @RouteSKU
  Scenario: Looking up locations
    When I look up location by street name
    Then the resulting location should be appears