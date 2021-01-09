fun main() {
    val array1 = arrayOf(100,110,120)
    val array2 = arrayOf(130,140,150)
    val array3 = arrayOf(160,170,180)
    val arr2d = arrayOf(array1, array2, array3)

//    다른 방법
    var two = Array<IntArray>(3, {IntArray(3)})
    var value : Int = 100
    for (i in 0..2){
        for (j in 0..2){
            two[i][j] = value
            value += 10
            println("${two[i][j]}")
        }
    }
}