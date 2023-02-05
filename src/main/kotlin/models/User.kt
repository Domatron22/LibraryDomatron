package main.kotlin.models

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object User : Table() {
    var userName: Column<String> = varchar("userName", 100)
    var pass: Column<String> = varchar("password", 100)
    var gid: Column<Int> = integer("gid").primaryKey()
    var configId: Column<Int> = integer("config").primaryKey()
}