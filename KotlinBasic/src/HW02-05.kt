fun main() {
    var x : Int = 1
    var sum : Int = 0

    while (x <= 100){
        if (x % 2 == 1) sum += x
        x++
    }
    println(sum)

    sum = 0
    x = 0

    for(x in 1..100 step 2){
        sum += x
    }
    println(sum)

}