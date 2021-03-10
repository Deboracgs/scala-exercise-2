package com.training.exercise2

object FormatString extends App {
  def exercise2(phrase: String, delimiter: String = ","): Number = {
    val numbers = phrase.split(delimiter)
        .map(x => {
          x.toInt match {
            case x if x > 1000 => 0
            case x if x < 0 => 0
            case x => x
          }
        }).sum
    numbers
  }
}
