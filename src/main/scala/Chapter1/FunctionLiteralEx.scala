package Chapter1

object FunctionLiteralEx {
    def main(args: Array[String]): Unit = {
        val result = max(3, 5)
        println(result)
    }

    /* max라는 변수에 함수 자체를 집어넣음(말 그대로 함수 리터럴) */
    val max = (x: Int, y: Int) => {
        if(x > y) x
        else y
    }
}
