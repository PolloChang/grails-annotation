package work.pollochang.example

class ExampleController {

    def exampleService

    def index() {

        exampleService.serviceMethod()

        render view: "/example/index"
    }
}
