object kpp_scala extends App {

  def arithmeticalMean(array: List[Int]):Float ={
    array.sum /array.length
  }

  def arithmeticalMeanTailRecursive(as: List[Int]):Float={
    def helper(as: List[Int], accumulator_length:Int,accumulator_sum:Int):Float={
      as match{
        case Nil=>accumulator_sum.toFloat/accumulator_length
        case x::xs=>helper(xs,accumulator_length+1,accumulator_sum+x)
      }
    }
    helper(as,0,0)
  }

  // val array =List(12,2,0,99,12)
  // println(arithmeticalMean(array))
  // println(arithmeticalMeanTailRecursive(array))

  def lineInversionTailRecursive(string: String,stringLength :Int):String={
    if(stringLength==0)
      string.charAt(stringLength).toString
    else
      lineInversionTailRecursiveIteration(string,stringLength-1, string.substring(stringLength, stringLength+1))
  }


  @scala.annotation.tailrec
  def lineInversionTailRecursiveIteration(string: String, stringLength :Int, accumulator: String): String={
    if(stringLength==0)
      accumulator + string.charAt(0)
    else
      lineInversionTailRecursiveIteration(string, stringLength-1, accumulator + string.substring(stringLength, stringLength+1))
  }

  def lineInversion(string: String):String={
    (for(i <- string.length - 1 to 0 by -1) yield string(i)).mkString
  }


  //val string :String ="abcdef"
  //println(lineInversionTailRecursive(string,string.length-1))
  //println(lineInversion(string))
}
