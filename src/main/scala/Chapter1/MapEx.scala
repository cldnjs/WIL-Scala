package Chapter1

import scala.collection.mutable

object MapEx {
    def main(args: Array[String]): Unit = {
        val immutableMap = Map(1 -> "I", 2 -> "II", 3 -> "III") // 아무것도 import하지 않으면 immutable.map 사용
        // immutableMap += 4 -> "IV"은 변경불가능하므로 에러
        println(immutableMap)

        val mutableMap = mutable.Map[Int, String]() // mutable이므로 변경 가능
        mutableMap += 1 -> "I"
        mutableMap += 2 -> "II"
        mutableMap += 3 -> "III"
        mutableMap += 4 -> "IV"
        println(mutableMap)
    }
}
