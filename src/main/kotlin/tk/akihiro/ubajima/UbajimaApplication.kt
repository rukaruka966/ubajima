package tk.akihiro.ubajima

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UbajimaApplication

fun main(args: Array<String>) {
    runApplication<UbajimaApplication>(*args)
}
