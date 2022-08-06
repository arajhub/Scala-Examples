//Array
//Arrays are mutable, indexed collections of values. Array[T] is Scala's representation for Java's T[].
/**
val numbers = Array(1, 2, 3, 4)
val first = numbers(0) // read the first element
numbers(3) = 100 // replace the 4th array element with 100
val biggerNumbers = numbers.map(_ * 2) // multiply all numbers by two
 */

//TO Define an array
val fruits = Array("Mango","Oranges","Apples")

// This print statement just print the object not the contents of the Array
println(fruits)
// Arrays are mutable collections this means I can add/modify or delete elemets from Array
println(fruits(0))

//Appended
  val fruitsModified = fruits.appended("Guava")

  //Since fruits is defined as val this means it is immutable and can not be reassigned after creation
  //so assigned to the new variable fruitsModified

  fruitsModified.foreach(println)

  // :+ is the shorthand for appended its a shorthand for appended
  val fruitsModified2 = fruits :+ "Sugar Guava"
  fruitsModified2.foreach(println)

//Prepended
  val fruitsPrepended = fruits.prepended("Strawberries")

  //Since fruits is defined as val this means it is immutable and can not be reassigned after creation
  //so assigned to the new variable fruitsModified

  //Note that :-ending operators are right associative (see example). A mnemonic for +: vs. :+ is: the COLon goes on the COLlection side.

  val fruitsPrepended2 = "Sugar Guava" +: fruits

// Append to the end of the array
fruits ++ "not a fruit"
//Array(Mango, Oranges, Apples, n, o, t,  , a,  , f, r, u, i, t)
// this is because the scala string is an array of character and it apply as the array
// If you really want to add an element in the end use appended or wrap the string in an Array object
fruits ++ Array("not a fruit")






