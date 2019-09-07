package mvc

class Controller(private var view: View, private var model: Student) {

    fun setName(newName: String) = model.setName(newName)
    fun setAge(newAge: Int) = model.setAge(newAge)

    fun getName() = model.getName()
    fun getAge() = model.getAge()

    fun updateView() {
        println("update view -----------")
        view.showView(model.getName(), model.getAge())
    }
}

fun main() {
//    val view = View()
//    val model = Student("whx", 18)
//
//    val controller = Controller(view, model)
//
//    view.showView(controller.getName(), controller.getAge())
//
//    controller.setAge(20)
//    controller.setName("hhh")
//    controller.updateView()

    demo()
}

fun demo() {
    View().apply outer@ {
        Student("whx", 18).apply inner@ {
            with(Controller(this@outer, this@inner)) {
                this@outer.showView(this.getName(), this.getAge())
                setName("jack")
                setAge(233)
                updateView()
            }
        }
    }
}