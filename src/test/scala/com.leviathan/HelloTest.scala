package com.leviathan

import org.scalatest.FunSuite

class HelloTest extends FunSuite {
  test("getHello returns 'Hello World'") {
    assert(Hello.getHello == "Hello World")
  }
}
