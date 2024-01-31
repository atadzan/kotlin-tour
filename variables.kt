fun main() {
    // print hello world
    println("Hello world ")

    // variables
    // read only
    val popcorn = 5
    val people = 7
    // mutable
    var customers = 10
    customers = 8
    println(customers)

    // string template
    val activeUsers = 15
    println("We have $activeUsers active users")

    println("Next week we will have ${activeUsers+15} active users")
}
