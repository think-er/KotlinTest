fun main() {
    // var 언제든지 읽기 쓰기 가능
    // val 선언 시 초기화 가능, 중간에 값을 변경 X (런타임시 변경 X)

    // class 내에 선언된 변수 : property
    // 이외의 Scope 내에 선언된 변수 : Local Variable (로컬 변수)

    var str: String? = null
    // null이면 그냥 넘어가고, 아니면 실행.
    println(str?.length) // null 출력
    println(str?.length ?: "길이를 알 수 없음") // "길이를 알 수 없음" 출력
    // 개발자가 코틀린의 null 안전성을 무시하고,
    // "난 이 값이 null이 아니라고 확신해!"라고 우기는 것과 같음.
    // println(str!!.length)

    str = "1"
    // null이 아닐 때만 실행
    str?.let {
        println("문자열의 길이: ${it.length}")
    }

    var a: Int = 123
    var b: Int? = null
    var intValue: Int = 1234
    var longValue: Long = 1234L
    var intValueByHex: Int = 0x1af
    var intValueByBin: Int = 0b10110110
    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10
    // 32 -> 16 비트 float형 (123.5f)
    var floatValue: Float = 123.5f
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'
    var boolValue: Boolean = false
    var stringValue = "안녕하세요"
    var multiLineStringValue = """string
    test입니다."""
    println(stringValue)
    println(multiLineStringValue)
    println(boolValue)
    println(charValue)
    println(koreanCharValue)
    println(doubleValue)
    println(doubleValueWithExp)
    println(intValueByHex)
    println(intValueByBin)
    println(a)
    println("\ta \nb \'c\' \"d\" \\e \$ \u1234")
}