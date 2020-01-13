package com.thoughtworks;


public class FizzBuzz {

  public String say(Integer number) {
    String result = "";
    if ((number % 3 == 0 || isContainThree(number)) && !isContainFive(number)) {
      result += "Fizz";
    }
    if (isContainFive(number) && !isContainSeven(number)) {
      result += "Buzz";
    }
    if (number % 5 == 0 && !isContainThree(number) && !isContainFive(number)) {
      result += "Buzz";
    }
    if (number % 7 == 0) {
      if (isContainThree(number)) {
        if (isContainFive(number)) {
          result += "Whizz";
        }
      } else {
        result += "Whizz";
      }
    }
    return result.isEmpty() ? String.valueOf(number) : result;
  }

  private boolean isContainSeven(Integer number) {
    return String.valueOf(number).contains("7");
  }

  private boolean isContainThree(Integer number) {
    return String.valueOf(number).contains("3");
  }

  private boolean isContainFive(Integer number) {
    return String.valueOf(number).contains("5");
  }

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int i = 1; i < 300; i++) {
      System.out.println(i + "says:" + fizzBuzz.say(i));
    }
  }
}
