class listAdd {

    private var animList = mutableListOf<mainAnimals>()

   init {

       val anim1 = Predator("Tiger", "Yes!!")
       animList.add(anim1)
       val anim2 = Predator("Crocodile", "Yes!!")
       animList.add(anim2)
       val anim3 = Herbivore("Giraffe", "No!!")
       animList.add(anim3)
       val anim4 = Herbivore("Zebra", "No!!")
       animList.add(anim4)

       println(animList)


   }





}