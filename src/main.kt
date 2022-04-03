fun main() {
    var name="Monalisa"
    if ( name=="monalisa")
        println("Hello Monalisa")
 else{
    println("who are you")
}
    oddOrEven(13)
    oddOrEven(30)
    oddOrEven(0)

     visitedPlaces("Rwandee")
    visitedPlaces("Ugandan")
    visitedPlaces("Tanzanian")

   println(takePass("35fhy"))
    println(takePass("password"))
    println(takePass("hlfjjfdusij7476438j,nmv#@/"))

    visitedCities("Tanzanian")
    visitedCities("Ugandan")
    visitedCities("Rwandee")

    multiples()


}
//write a function that prints out odd or
//even depending on the odd no. passed to it
fun oddOrEven(nums:Int) {
    if (nums%2==0)
        println("number is even")
    else{
        println("num is odd")
    }
    speak("Hello J.b")
    speak("Who's here?")
}
fun visitedPlaces(nationlity:String) {
var nationality="kenyan"
if (nationality.equals("kenyan"))
println("Have you ever been to Nairobi")
else if (nationality.equals("Tanzania"))
println("Have you ever been to Dodoma?")
else if (nationality.equals("Ugandan"))
println("Have you ever been to Kampala")
else{
    println("Have you ever been to East Africa")
}
}
fun speak(friend:String){
    if (friend.equals("Joana"))
        println("collect your books")
    if (friend.equals("Conslate"))
        println("have you gone for lunch")
}
fun takePass(password:String):Boolean{
    if (password.length>=8 && password.length<=16 && !password.equals("password")){
        return true
    }
    else{
        return false
    }
}
fun visitedCities(nationlity:String){
    when(nationlity){
        "kenya"-> println("Have you ever been to Nairobi")
        "Ugandan"-> println("Have you ever beeen to Kampala")
        "Tanzanian"-> println("Have you evee been to Dodoma")
        else-> println("Have you ever been to East Africa?")
    }
    when(nationlity){
    "kenya,Tanzania Uganda"-> println("Have you ever been to Nairobi")
    "Ugandan,Rwanda,Nigeria"-> println("Have you ever beeen to Kampala")
    else-> println("Have you ever been to East Africa?")

}}
fun all() {
    var languages = arrayOf("kiswahili,English,Kinyarwanda,Luganda")
    for (lang in languages) {
        println(lang)
    }
}
fun num(){
for (n in 23 ..64)
    println(n)
}
fun oddNums(){
    var nums= arrayOf(1,3,5,7,9)
    for (a in 1..10 ){
        if (a%2 !==0)
        println(a*a)
}
    }
fun multiples(){
    for (x in 1..1000)
        if (x % 6 == 0 && x % 8 == 0)
            println("Bingo")

        else if (x % 6==0 || x % 8==0){
            println(x)
        }
}
