fun main(args: Array<String>) {
    /*println({val currentYear = 2018
    "Welcome to SimVillage, Mayor! (copyright $currentYear)"}())

    //val greetingFunction = { playerName: String, numBuildings: Int ->
    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    //println(greetingFunctoion("Guyal", 2))
    //runSimulation("Guyal", greetingFunction)*/
    runSimulation()
}

// So this function accepts a String and then the shell of a function that takes a String and Int and returns a String
// Any function that fits that shell is acceptable
/*inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..30).shuffled().last() // Randomly Selects 1,2 or 3
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost*numBuildings}")
}*/
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"}

}