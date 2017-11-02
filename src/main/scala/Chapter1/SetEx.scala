package Chapter1

import scala.collection.mutable


object SetEx {
    def main(args: Array[String]): Unit = {
        var immutableSet = Set("This", "is") // 기본적으로 변경 불가능한 Set이다
        immutableSet += "immutable" // 변경이 불가하므로 재할당이 가능한 var키워드를 이용해서 선언한다
        println(immutableSet)

        val mutableSet = mutable.Set("This", "is") // 변경 가능한 Set이므로 val에 할당해도 상관x
        mutableSet += "mutable"
        println(mutableSet)
    }
}
