package com.training.exercise2

import FormatString.exercise2

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FormatStringSpec extends AnyFunSuite with Matchers {

  test("Sum only positive"){
    exercise2("3,1,6,-40")
  }

  test("Sum only smaller than 1001"){
    exercise2("15,500,6,3000,5800")
  }

  test("Sum with a different delimiter"){
    exercise2("15#500#6#10#25", "#")
  }
}
