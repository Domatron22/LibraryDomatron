import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import java.sql.Blob

object File : Table() {
    var fileName: Column<String> = varchar("fileName", 500).primaryKey()
    var path: Column<String> = varchar("filePath", 500)
    var image: Column<Blob> = blob("image")
}