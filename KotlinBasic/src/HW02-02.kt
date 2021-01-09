fun main() {
//    점수에 따라 학점 나누기
    var score : Int = 94
    var grades : Int = score
    when (grades){
        in 90 .. 100 -> println("A+")
        in 80 .. 89 -> println("B+")
        in 70 .. 79 -> println("C+")
        else -> println("D")
    }

}