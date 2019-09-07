package mvc

data class Student(private var name: String, private var age: Int) {
    fun setName(name: String) {
        this.name = name
    }
    fun getName() = name

    fun setAge(age: Int) {
        this.age = age
    }
    fun getAge() = age
}