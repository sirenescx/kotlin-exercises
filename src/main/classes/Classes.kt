fun employeeById(id: Int) = when (id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    val employee = Employee("Mary", 20)
    println(employee)
    employee.salary += 10
    println(employee)

    val employeeGenerator = RandomEmployeeGenerator(10, 30)
    println(employeeGenerator.generateEmployee())
    employeeGenerator.minimumSalary = 15
    println(employeeGenerator.generateEmployee())

    println(salaryById(2))
    println(salaryById(3))
    println((1..5).sumOf { id -> salaryById(id) })
}