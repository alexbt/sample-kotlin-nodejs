external fun require(module:String):dynamic

fun main(args: Array<String>) {
    println("Launching Kotlin's NodeJS")

    val express = require("express")
    val app = express()

    app.get("/", { req, res ->
        res.type("text/plain")
        res.send("Thhttps://github.com/alexbt/sample-kotlin-nodejs.gitis is the server's response")
    })

    app.listen(8085, {
        println("Listening on port 8085")
        println("Open a browser at http://localhost:8085")
    })
}
