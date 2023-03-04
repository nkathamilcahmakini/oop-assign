fun main(){
var name = Human("Sally", 17, 58)
    name.eat(10)
    name.birthay()
    name.speak("Makena is 5 years old")

    var person = data("Faith", "Kinya", "fkinya@gmail.com", "0712345678", "faith.009")
    println(person.firstName)
    println(person.lastName)
    println(person.email)
    println(person.phoneNumber)
    println(person.password)

}
//Create a class called Human with these attributes: name, age, weight. It has
////the following functions:
//eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten

class Human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
        var realweight =weight+ foodWeight
        println("I am eating $realweight kgs of food")
    }
//    speak(speech: String) :Prints the string passed to it

    fun speak(speech:String){
        println(speech)
    }

//    birthday( ) :Increments the human’s age by 1

    fun birthay(){
        var year = age + 1
        println(year)
    }
}

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes

class data(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){

}
