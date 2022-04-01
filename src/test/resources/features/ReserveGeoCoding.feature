Feature: Reverse GeoCoding

  @ReverseGeoCoding
  Scenario: I want to get data Reverse GeoCoding
    When I put parameter value key long-lat
    Then resulting should be appears as per expected