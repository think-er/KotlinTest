fun main() {
    var a: Int = 1234
    // 자료형의 호환
    if(a is Int) println("Int")

    var b: String =  a.toString()

    if(b !is Int) println("Not an Int")

    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
}

// Any는 모든 타입의 부모 클래스
fun doWhen (a: Any) {
    // when을 조건에 맞는 동작을 하는 조건문으로서 이용한 경우
    // when의 조건이 맞을 때 동작 대신 값을 반환하는 표현식(expressions)으로서의
    // 역할을 하게하려면
    var result = when (a) {
        // 여러개의 조건이 참이여도 먼저 부합하는 조건이 실행
        1 -> "정수 1입니다."
        "DiMo" -> "디모의 코틀린 강좌입니다."
        is Long -> "Long 타입입니다."
        !is String -> "String 타입이 아닙니다."
        // 위의 어떤 조건에도 참이 아닌 경우 실행
        else -> "어떤 조건도 만족하지 않습니다."
    }

    println(result)



//    when (a) {
//        // 여러개의 조건이 참이여도 먼저 부합하는 조건이 실행
//        1 -> println("정수 1입니다.")
//        "DiMo" -> println("디모의 코틀린 강좌입니다.")
//        is Long -> println("Long 타입입니다.")
//        !is String -> println("String 타입이 아닙니다.")
//        // 위의 어떤 조건에도 참이 아닌 경우 실행
//        else -> println("어떤 조건도 만족하지 않습니다.")
//    }
}