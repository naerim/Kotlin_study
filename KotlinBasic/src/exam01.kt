fun main() {
//    변수와 데이터 형식
//    데이터형의 첫 글자는 대문자로
    var var1 : Int = 10
    var var2 : Float = 10.1f
    var var3 : Double = 10.2
    var var4 : Char = '안'
    var var5 : String = "안드로이드"
    println("Hello World!")

//    암시적 선언: 변수에 초기화하면 사용 가능
    var var6 = true

//    val : 고정값 변수, 선언과 동시에 변경할 수 없음
    val myVal = 100

//    데이터 형식 변환
    var a = "100".toInt()
    var b = "100.123".toDouble()

//    코틀린은 기본적으로 변수에 null을 넣지 못함 -> 뒤에 ?를 붙여야 가능
    var okNull : Int? = null

//    변수가 null 값이 아니라고 표시해야 하는 경우 -> !!fh skxksoa
    var ary = ArrayList<Int>(1) // 1개짜리 배열 리스트
    ary!!.add(100) // 값 100을 추가
}