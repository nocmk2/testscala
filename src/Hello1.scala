import java.math.BigInteger

object Hello1{
  def factorial(x: BigInt): BigInt =
    if(x == 0) 1 else x * factorial(x - 1)

  def factorial_java(x:BigInteger) : BigInteger =
    if(x==BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial_java(x.subtract(BigInteger.ONE)))
  def main(args: Array[String]): Unit = {
    println(factorial(30))
    println(factorial_java(BigInteger.valueOf(30)))

  }
}

