fun main() {
    val likes: Int = 800
    val variableOne = "людям"
    val variableTwo = "человеку"
    val result =
        if (likes % 2 === 0) variableOne else if (!(likes % 2 === 0) && likes % 3 === 0) variableOne else variableTwo
    println("Понравилось $likes $result")
}
