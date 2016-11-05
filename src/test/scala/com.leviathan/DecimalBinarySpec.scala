package com.leviathan

import org.scalatest.FlatSpec

/**
  * Created by umard on 05.11.2016..
  */
class DecimalBinarySpec extends FlatSpec {
  "base conversion utility" should "convert a number 99 into a" +
    "binary number 1100011" in {
    val binary: Binary = BaseConversion.decimalToBinary(Decimal("99"))
    assert(binary.number=="1100011")
  }
}
