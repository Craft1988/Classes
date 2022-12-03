class Herbivore(name:String, private var eatMeat:String) : mainAnimals(name) {

//    fun oathHerb():String{
//        return "Oh no!!We will never eat meat!!!"
//    }

    override fun toString(): String {
        return "Animal name:$name, Are you are predator?:$eatMeat"
    }
}