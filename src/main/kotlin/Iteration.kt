fun main() {
    // 조건형 반복문

    var a = 0

    while(a < 5) {
        println(a++)
    }
    // 전위 연산자
    // 연산자가 포함된 수에서 이미 증감된 수를 반영하여 연산이 진행되는 반면

    // 후위 연산자
    // 증가나 감소된 수를 해당 구문에서 사용하지 않고 다음 구문부터 사용한다.

    println()
    a = 0

    // 조건과 관계없이 반드시 한번은 실행되어야 한다면 do...while문을 사용하는 것이 좋다.
    do {
        println(a++)
    } while (a < 5)


    // 범위형 반복문
    for(i in 0..9 step 3) {
        println(i)
    }
    for(i in 9 downTo 0) {
        println(i)
    }

    for(i in 'a'..'e') {
        println(i)
    }
}