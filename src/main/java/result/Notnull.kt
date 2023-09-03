package result

import kotlin.properties.Delegates


var nonNullString: String by Delegates.notNull<String>()


fun main() {


    println("Non null value is: ${nonNullString}")
}
