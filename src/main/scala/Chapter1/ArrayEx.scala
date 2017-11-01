package Chapter1

object ArrayEx {
    def main(args: Array[String]): Unit = {
        // 배열을 선언하는 방법 1
        val arr = new Array[String](3)
        // 배열을 선언하는 보통의 방법
        val arr2 = Array("Hello", "world", "!")

        // 스칼라에서 배열은 괄호를 이용
        arr(0) = "Hello" // arr.update(0, "Hello")와 같음
        arr(1) = ","
        arr(2) = " World!"

        // for문 쓰는 방법
        for(i <- arr2.indices) {
            println(arr2(i)) // println(arr.apply(i))와 같음
        }
    }
}
