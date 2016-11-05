package com.leviathan

import org.scalatest.FlatSpec

/**
  * Created by umard on 05.11.2016..
  */
class BeanSpec extends FlatSpec{
 "Decimal" should "throw error when initialized " +
   "with a non numeric string" in {
   try {
     Decimal("merhaba")
   } catch {
     case e:IllegalArgumentException =>
       assert(e.getMessage == "requirement failed: Unable to convert string to number")
     case _ =>fail
   }
 }

  "Binary" should "throw error when initalized with a " +
    "non numeric string" in {
      intercept[IllegalArgumentException] {
      Binary("XYZ")
      }
    }
}
