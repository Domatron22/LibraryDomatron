import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CORS
import io.ktor.gson.gson
import io.ktor.routing.routing
import io.ktor.routing.get

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    install(CORS){
        method(io.ktor.http.HttpMethod.Options)
        method(io.ktor.http.HttpMethod.Put)
        method(io.ktor.http.HttpMethod.Delete)
        method(io.ktor.http.HttpMethod.Patch)
        header(io.ktor.http.HttpHeaders.Authorization)
        header("uid")
        header("pwd")
        allowCredentials = true
        anyHost()
    }

    install(io.ktor.features.ContentNegotiation) {
        gson {
        }
    }

    val client = io.ktor.client.HttpClient(io.ktor.client.engine.apache.Apache) {
        install(io.ktor.client.features.json.JsonFeature) {
            serializer = io.ktor.client.features.json.GsonSerializer()
        }
    }
    kotlinx.coroutines.runBlocking {

    }

    routing{
        get("/"){
            // Overall Homepage
        }
        get("/log-in"){
            // Login screen
        }
        get("/home/$uid"){
            // User Home Page (grab the users id from the get request)
        }
        get("/settings/$uid"){
            // User Configuration Settings (grab the users id from the get request)
        }
    }
}