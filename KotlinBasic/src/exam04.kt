var myVar : Int = 100

fun main() {
//    지역변수, 전역변수
    var myVar : Int = 0
    println("main()'s myVar : $myVar")

    var sum : Int = addFunction(10,20)
    println(sum)
}

fun addFunction(num1:Int, num2:Int) : Int {
    var hap : Int
    hap = num1 + num2 + myVar
    return hap
}