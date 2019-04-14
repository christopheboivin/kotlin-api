package fr.cbo.test.kotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ApiController {

    @GetMapping("/", produces = ["application/json"])
    fun home() : String {
        return "hello world"
    }
}