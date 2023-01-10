class Triangle(val a:Int, val b:Int, val c:Int){
    fun TestTriangle(){
        if (a > 0 && b > 0 && c > 0 )
    	{
           if(a+b>c && b+c>a && c+a>b)
            println("Triangle")
           else
            println("Invalid Triangle")
        }
        else
            println("No Triangle")
    }

    fun TestType(){
        if (a.equals(b) && a.equals(c)){
            println("This is a equilateral triangle!!!")
        }
        else if (a.equals(b) || b.equals(c) || c.equals(a)){
            println("This is a isosceles triangle!!!")
        }
        else {
            println("This is a scalene triangle !!!")
        }
    }
}

fun main() {
   val FirstTriangle = Triangle(3,1,3)
   FirstTriangle.TestTriangle()
   FirstTriangle.TestType()

   val SecondTriangle = Triangle(9,9,9)
   SecondTriangle.TestTriangle()
   SecondTriangle.TestType()

   val ThirdTriangle = Triangle(5,9,6)
   ThirdTriangle.TestTriangle()
   ThirdTriangle.TestType()
}