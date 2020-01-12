package com.thoughtworks;


public class FizzBuzz {

  public String say(Integer number) {
    if ((number % 3 == 0 || isContainThree(number))&&!isContainFive(number)) {
      return "Fizz";
    }
    if (number % 5 == 0 || isContainFive(number)) {
      return "Buzz";
    }
    return String.valueOf(number);
  }

  private boolean isContainThree(Integer number) {
    return String.valueOf(number).contains("3");
  }

  private boolean isContainFive(Integer number) {
    return String.valueOf(number).contains("5");
  }
}
