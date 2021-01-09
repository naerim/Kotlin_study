fun main() {
//    일차원 배열 선언 형식: Array(), arrayOf(), arrayOfNulls()
//    일차원 배열을 선언하고 값을 대입하는 방법
    var one = Array<Int>(4, { 0 })
    one[0] =  10

    var numbers = arrayOf(4,5,7,3)
    var animals = arrayOf("Cat", "Dog", "Lion")

//    arrayOfNulls()는 빈배열로 선언

//    이차원 배열 선언
    var two = Array<IntArray>(3, {IntArray(4)})

    val array1 = arrayOf(1,2,3)
    val array2 = arrayOf(4,5,6)
    val array3 = arrayOf(7,8,9)
    val arr2d = arrayOf(array1, array2, array3)
    val arr2d1 = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))

//    배열을 선언하면서 값을 바로 대입하는 것도 가능함
    var three : IntArray = intArrayOf(1,2,3)

//    ArrayList - 사이즈 조정 가능
    var four = ArrayList<Int>(4)
    four.add(10)
    four.add(20)
    var hap = four.get(0) + four.get(1)

//    배열의 모든 값을 출력
    var five : IntArray = intArrayOf(10,20,30,40)
    for(i in five.indices) {
        println(five[i])
    }

//    예제
    var a1 : IntArray = intArrayOf(10, 20, 30)
    for (i in a1.indices){
        println(a1[i])
    }
    for (value in a1){
        println(value)
    }

    var a2 : Array<String> = arrayOf("하나", "둘", "셋")
    for (i in 0..2 step 1){
        println(a2[i])
    }
    var k : Int = 0
    while (k<a2.size){
        println(a2[k])
        k++
    }
}
