fun main(args: Array<String>){
    val ingredientes: List<String>  = listOf("Agua","Leche", "Carne", "verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    var recetas: ArrayList<ArrayList<String>> = ArrayList()
    salir@while(true){
        println("""
        Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
    """.trimIndent())

        var ingreso= readLine()?.toInt()?:0
    when(ingreso) {
        1 -> {
            var receta: ArrayList<String> = ArrayList()
            println("Ingrese en nombre de la receta")
            receta.add(readLine()?:"")
            ingredientes.withIndex().forEach{println("${it.index + 1} : ${it.value}")}
            println("100. Menú principal")
            salir2@while(true){
                println("Selecione un ingrediente de la lista para agregar a la receta")
                ingreso = readLine()?.toInt()?:0
                when(ingreso){
                    in 1..ingredientes.size ->{
                            receta.add(ingredientes.get(ingreso - 1))
                    }
                    100 ->{
                        recetas.add(receta)
                        break@salir2
                    }
                    null -> println("Seleccione un ingrediente de la lista")
                    else -> println("Seleccione un ingrediente de la lista")
                }
            }

        }
        2 -> {
            recetas.forEach{println("${it}")}
        }
        3 -> break@salir
        null -> println("Seleccione una opción de la lista")
        else -> println("Seleccione una opción de la lista")

    }

    }



}