package com.thoughtworks

class FizzBuzzTest extends spock.lang.Specification {

  def fizzBuzz = new FizzBuzz()

  def 'say Fizz when times 3 or contains 3,but dont contains 5'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result | description
      3      | "Fizz" | "times 3"
      13     | "Fizz" | "contain 3"
      1      | "1"    | "other"
      53     | "Buzz" | "contain 5"
      30     | "Fizz" | "contain 3"
  }

  def 'say Buzz when times 5 or contains 5,but dont contains 7'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result | description
      10     | "Buzz" | "times 5"
      59     | "Buzz" | "contain 5"
  }

  def 'say Whizz when times 7 or contains 7,but not contains 3'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result  | description
      7      | "Whizz" | "times 7"
      63     | "Fizz"  | "contain 3"
  }

  def 'say FizzBuzz'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result  | description
      60      | "FizzBuzz" | "60 = 3*5*4"
  }

  def 'say FizzWhizz'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result  | description
      21      | "FizzWhizz" | "21 = 3*7"
  }

  def 'say BuzzWhizz'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result  | description
      140      | "BuzzWhizz" | "140 = 5*7*4"
      35      | "BuzzWhizz" | "35=5*7,and contain 5"
  }


  def 'say FizzBuzzWhizz'() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result  | description
      210      | "FizzBuzzWhizz" | "210 = 3*5*7*2"
  }

  def 'some special thing '() {
    expect:
      fizzBuzz.say(number) == result
    where:
      number | result  | description
      275      | "275" | "275,contain 5 but contain 7"

  }
}
