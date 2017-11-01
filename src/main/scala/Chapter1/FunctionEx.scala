package Chapter1

object FunctionEx {
    def main(args: Array[String]): Unit = {
        val result = max(3, 5)
        println(result)
        greet()
    }

    /* 스칼라 함수의 기본 형태 */
    def max(a: Int, b: Int): Int = { // 파라미터에는 타입을 반드시 지정해주어야한다
        if(a > b) a
        else b
    }

    /* Unit은 java의  void와 비슷하다 */
    def greet(): Unit = {
        println("Hello World!")
    }
}
