class Predator(name:String,var eatMeat:String) : mainAnimals(name) {

//    fun oathPred():String{
//        return "Oh no!!We will never eat grass!!!"
//    }

    override fun toString(): String {
        return "Animal name:$name, Are you are predator?:$eatMeat"
    }
}