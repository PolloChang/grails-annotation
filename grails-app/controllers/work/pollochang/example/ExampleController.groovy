package work.pollochang.example

/**
 * 範例
 */
class ExampleController {

    def exampleService

    def index() {

        exampleService.doSomething()

        render view: "/example/index"
    }
}
