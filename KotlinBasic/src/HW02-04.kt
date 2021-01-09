fun main() {
    var mul : Int = 0
    for (x in 5..8){
        println("$x"+"단")
        for (y in 1..9){
            mul = x * y
            println("$x*$y=$mul")
        }
    }
}