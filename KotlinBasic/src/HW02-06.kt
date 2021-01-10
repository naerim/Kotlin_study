fun main() {
    var number1:Int
    var number2:Int
    print("number1 = ")
    number1 = readLine()!!.toInt()
    print("number2 = ")
    number2 = readLine()!!.toInt()
    println("number1+number2 = ${add(number1, number2)}")
    println("number1-number2 = ${sub(number1, number2)}")
    println("number1*number2 = ${mul(number1, number2)}")
}

fun add(a:Int, b:Int):Int =  a+b
fun sub(a:Int, b:Int):Int =  a-b
fun mul(a:Int, b:Int):Int =  a*b