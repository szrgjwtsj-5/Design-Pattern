package interceptfilter

class AuthenticationFilter : Filter {
    override fun execute(request: String) {
        println("authentication request: $request")
    }
}