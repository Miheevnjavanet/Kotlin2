import java.lang.Double.max

fun main () {
    one()
    two()
    three()
}

fun one () {
    val amount = 1000
    val interest = max(35.0, 0.0075 * amount)
    println(interest)
}


fun two () {
    val likes = 1001
    var out = "человеку"
    var ost = likes %10
    if (ost == 1 ) out = "человеку" else "людям"
    println(out)

}



fun three () {
    val amount = 1000
    val interest = 0.0075
    val regular = false

    var lokal1 = amount * interest
    var interestRub = amount - lokal1
    var interestRubOne = if (regular == true)interestRub/100*1 else 0
    // var result = interestRub - interestRubOne

    if (amount <= 1000)
        println(0)
    else if  (amount > 1000 && amount <= 10000)// .toInt
        println(100)
   //  else
      // println(result)
}