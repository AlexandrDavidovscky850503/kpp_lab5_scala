import org.scalatest.FunSuite

class kpp_scalaTest extends FunSuite {

  test("testLineInversionTailRecursiveIteration") {
    val string :String ="abcd"
    assert(kpp_scala.lineInversionTailRecursiveIteration(string,string.length-2,string.substring(string.length-1, string.length))==="dcba")
  }

  test("testLineInversion") {
    val string :String ="abcd"
    assert(kpp_scala.lineInversion(string)==="dcba")
  }

  test("testArithmeticalMean") {
    val array =List(12,2)
      assert(kpp_scala.arithmeticalMean(array)===7.0)
  }

  test("testArithmeticalMeanTailRecursive") {
    val array =List(3,9)
    assert(kpp_scala.arithmeticalMean(array)===6.0)
  }

  test("testLineInversionTailRecursive") {
    val string :String ="a"
    assert(kpp_scala.lineInversionTailRecursive(string,string.length-1)==="a")
  }

}
