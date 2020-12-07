Feature: Hello world
  Scenario: Greeting to everyone
    When greeting is not addressed anyone specific
    Then the greeting is "Hello World!"

  Scenario: Greeting to a specific target
    When greeting is addressed to "Foo"
    Then the greeting is "Hello Foo!"