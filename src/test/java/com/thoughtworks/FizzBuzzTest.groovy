package com.thoughtworks

class FizzBuzzTest extends spock.lang.Specification {

  def fizzBuzz = new FizzBuzz()

  def 'say Fizz when times 3 or contains 3'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result | description
      3      | "Fizz" | "times 3"
      13     | "Fizz" | "contain 3"
      1      | "1"    | "other"
      53     | "Buzz" | "contain 5"
  }

  def 'say Buzz when times 5 or contains 5'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result | description
      10     | "Buzz" | "times 5"
      59     | "Buzz" | "contain 5"
  }

}
