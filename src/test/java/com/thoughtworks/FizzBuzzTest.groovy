package com.thoughtworks

class FizzBuzzTest extends spock.lang.Specification {

  def fizzBuzz = new FizzBuzz()

  def 'say fizz when times 3 or contains 3'() {
    expect:
      fizzBuzz.say(number) == result

    where:
      number || result
      3      || "Fizz"
      13     || "Fizz"
      1      || "1"
  }
}
