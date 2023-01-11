object WordCount {
    fun phrase(phrase: String): 
    Map<String, Int> = phrase.lowercase().split(Regex("[^a-z0-9']+")).filter(String::isNotEmpty).groupBy{ it.trim('\'')}
            .mapValues{ it.value.size }
}

fun main(){
    val sentence = WordCount
    println(sentence.phrase("""That's the password: 'PASSWORD 123'!", cried the Special Agent.\nSo I fled."""))
}