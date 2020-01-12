package com.thoughtworks;


public class FizzBuzz {

  public String say(Integer number) {
    if (number % 3 == 0 || isContainThree(number)) {
      return "Fizz";
    }
    return String.valueOf(number);
  }

  private boolean isContainThree(Integer number) {
    return String.valueOf(number).contains("3");
  }
}
