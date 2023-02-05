package main.kotlin.models

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Config : Table() {
    var gid: Column<Int> = integer("gid").primaryKey()
    var files: Column<String> = varchar("files", 1000)
}