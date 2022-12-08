import kotlin.reflect.typeOf

fun getLambda(nome : String) : Function1<Int,Boolean>{
    when(nome){
        "ePar" -> return {numero -> numero % 2 == 0}
        "entre10e20" -> return {numero -> numero in 11..19 }
        "menor5Maior25" -> return {numero -> numero < 5 || numero > 25}
        else -> return {false}
    }
}
fun transformaArray(array : Array<Int>,funcao : Function1<Int,Boolean>) : Array<Boolean> {
    val resultado = Array(array.size){false}
    for (count in 0 until array.size) {
        if(funcao(array[count])){ resultado[count] = true }
    }
    return resultado
}



fun main(){
}