const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    val playerName = "Estragon"
    var experiencePoints = 5
    var hasSteed = false

    // Challenge The Unicorn's Horn
    val nameOfPub = "The Unicorn's Horn"
    val nameOfPublican = "Jeff"
    var numOfGoldPieces = 50
    val drinks = arrayOf("mead", "wine", "LaCroix")

    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
    println(hasSteed)
    println(nameOfPub)
    println(nameOfPublican)
    println(numOfGoldPieces)
    println(drinks.toString())
    println(playerName.reversed())

    // Anonymous functions
    val numLetters = "Mississippi".count({letter -> letter == 's'})
    println(numLetters)
}