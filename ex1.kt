var handShakeCalculator = arrayOf("\"wink\"", "\"double blink\"", "\"close your eyes\"", "\"jump\"")
fun Handshake(num: Int)
{
    val StringArray:MutableList<String> = mutableListOf()
    for (x in 0..3) {
    	if(num and (0x1 shl x) != 0)
        {
            StringArray.add(handShakeCalculator[x])
        }
        	
    }
    print("\nNumber ${num}: ")
    
    if(num and (0x1 shl 4) != 0)
     	print(StringArray.reversed())
    else
    	print(StringArray)
}

fun main() {
    Handshake(3)
    Handshake(19)
}