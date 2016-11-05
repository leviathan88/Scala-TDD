package com.leviathan

import scala.annotation.tailrec

/**
  * Created by umard on 05.11.2016..
  */
object BaseConversion {
  def decimalToBinary(decimal: Decimal): Binary = {
    Binary(toBinary(BigInt(decimal.number), "").toString)
  }
  @tailrec private def toBinary(num: BigInt, acc: String): String = {
    if (num < 2) num.toString + acc
    else toBinary(num / 2, (num mod 2).toString ++ acc)
  }

  def binaryToDecimal(binary: Binary): Decimal = {
    val seq = binary.number.reverse.zipWithIndex.map {
      case (a, i) => a.toString.toInt * math.pow(2, i)
    }
    Decimal(seq.sum.toInt.toString)
  }

}
