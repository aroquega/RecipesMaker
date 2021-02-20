fun displayOptions(){
    println("""
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())
}

fun readInput(): Boolean{
    return when(readLine()?.toInt() ?: 0){
        1 -> makeRecipe()
        2 -> seeRecipes()
        3 -> tryToExit()
        else -> {
            println("No se entendió, repita porfavor.")
            true
        }
    }
}

fun makeRecipe(): Boolean{
    println("Seleccionaste hacer una receta")
    return true
}

fun seeRecipes(): Boolean{
    println("Seleccionaste ver recetas")
    return true
}

fun tryToExit() : Boolean{
    print("¿Quiere salir de la aplicación? [S/n]: ")
    val userInput = readLine()
    val isRunning = userInput == "n"
    if(!isRunning){
        println("Goodbye!")
    }
    return isRunning
}

fun run(isRunning: Boolean){
    if(isRunning){
        displayOptions()
        run(readInput())
    }
}

fun main(args: Array<String>){
    val isRunning = true
    run(isRunning)
}