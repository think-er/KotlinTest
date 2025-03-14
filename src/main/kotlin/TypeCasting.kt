// 논리형은 형변환될 수 없음
fun main() {
    var a: Int = 54321

    // 코틀린은 형변환시 발생할 수 있는 오류를 막기 위해
    // 다른 언어들이 지원하는 암시적 형변환은 지원하지 않는다.
//    var b: Long = a // Type mismatch
    var b: Long = a.toLong() // explicit type casting
}