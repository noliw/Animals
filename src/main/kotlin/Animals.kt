open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat () {
        println("The Animal is eating")
    }

    open fun roam () {
        println("The animal is roaming")
    }

    fun sleep () {
        println("The Animal is sleeping")
    }
}

// below is how to inherit from a superclass
// its like saying "class hippo is a subtype of the animal class"
// The "Animal ()" after the colon calls the animals constructor.
// If a superClass has a primary constructor, then we must call it in the subclass header of it won't compile
// Even if we didn't manually add a constructor to the animal class, the compiler will automatically create an empty
// constructor when the code gets compiled
// prefix property with final if you want to stop it from being overridden further down the class hierarchy
class Hippo : Animal () {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}