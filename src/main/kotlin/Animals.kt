// if you mark a property or a member function as abstract, we must make the class abstract too
abstract class Animal: Roamable {
    // marking a property as abstract is telling the compiler that there's no useful code you can write in the body
    // because this property is always overriden by concrete instances
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    val hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
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
// We must implement all the abstract properties and functions every concrete
class Hippo : Animal() {
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
abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun eat() {
        println("The Wolf is eating $food")
    }

    override fun makeNoise() {
        println("Hoooooooowwwwwwwwwwwwwwwwwl!")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

// an interface lets you define common behavior outside a superclass hierarchy
// both interfaces and abstract classes can't be instantiated
// a class can have multiple interfaces, but can only inherit from a single direct superclass
// interfaces are more flexible than abstract classes

interface Roamable {
    fun roam()
}

class Vehicle: Roamable {
    override fun roam(){
        println("The vehicle is roamning")
    }
}
