package interceptfilter

interface Filter {
    fun execute(request: String)
}