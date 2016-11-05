package com.leviathan

import org.scalatest.FlatSpec

/**
  * Created by umard on 05.11.2016..
  */
class BinaryToDecimal extends FlatSpec{
  "base conversion utility" should "convert binary number 100100111101" +
    " to decimal equivalent 2365" in {
    val decimal:Decimal =
    BaseConversion.binaryToDecimal(Binary("100100111101"))
    assert(decimal.number == "2365")
  }

  it should "convert binary number 11110001111110111 to decimal equivalent " +
    "123895" in {
    val decimal:Decimal = BaseConversion.binaryToDecimal(Binary("11110001111110111"))
    assert(decimal.number == "123895")
  }

  it should "convert binary number 100000000000001110000001 " +
    "to decimal equivalent 8389505" in {
    val decimal:Decimal = BaseConversion.binaryToDecimal(Binary("100000000000001110000001"))
    assert(decimal.number == "8389505")
  }
}
