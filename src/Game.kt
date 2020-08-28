fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints :Int = 89;
    val isBlessed = true;
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    /////////using when /////////////
    when(healthPoints){
        100 ->println("$name\n $healthPoints is in excellent condition!")
        in 90..99 ->println("$name\n +$healthPoints has a few scratches.")
        in 75..89-> if (isBlessed) {
            println("$name\n $healthPoints  has some minor wounds but is healing quite quickly!")        }
        else {            println("$name\n $healthPoints   has some minor wounds.")        }
        in 15..74-> println("$name\n $healthPoints  looks pretty hurt.")
        else->{ println("$name\n $healthPoints  is in awful condition!")    }
    }
when(karma){
    in 0..5 ->println("red")
    in 6..10 ->println("orange")
    in 11..15 ->println("purple")
    in 16..20 ->println("green")
}


}