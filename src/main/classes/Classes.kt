fun main() {
    val employee = Employee("Mary", 20)
    println(employee)
    employee.salary += 10
    println(employee)

    val employeeGenerator = RandomEmployeeGenerator(10, 30)
    println(employeeGenerator.generateEmployee())
    employeeGenerator.minimumSalary = 15
    println(employeeGenerator.generateEmployee())
}