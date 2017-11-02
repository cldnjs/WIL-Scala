package Chapter1

object TupleEx {
    def main(args: Array[String]): Unit = {
        val tuple = (99, "hello") // 콤마로 구분해서 넣기만 하면 끝

        println(tuple._1) // 인덱스가 0이 아니고 1부터 시작한다
        println(tuple._2)
    }
}
