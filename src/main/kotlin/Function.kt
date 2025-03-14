fun main() {
    // 코틀린에서 함수는 어디에나 둘 수 있다.
    println(add(5, 6, 7))
}

//fun add(a: Int, b: Int, c: Int): Int {
//    return a + b + c
//}

// 단일 표현식 함수에서는 반환형의 타입추론이 가능하므로 반환형을 생략할 수 있다.
fun add(a: Int, b: Int, c: Int) = a + b + c