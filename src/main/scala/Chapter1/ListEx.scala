package Chapter1

object ListEx {
    def main(args: Array[String]): Unit = {
        val oneTwo = List(1, 2) // java에서와 달리 변경 불가능
        val threeFour = List(3, 4)
        val oneTwoThreeFour = oneTwo ::: threeFour // 두 리스트를 이어붙임

        println(oneTwo + "and" + threeFour + " were not mutated.")
        println("Thus, " + oneTwoThreeFour + " is a new List.")

        val twoThree = List(2, 3)
        val oneTwoThree = 1 :: twoThree // 새 원소를 기존 리스트 맨 앞에 추가

        println(twoThree + " was not mutated.")
        println("Thus, " + oneTwoThree + " is a new List.")

        val thrill = "Will" :: "fill" :: "until" :: Nil // 콘즈 연산자를 이용해서 배열 생성
        val count = thrill.count(s => s.length == 4)
        println(count)
    }
}
