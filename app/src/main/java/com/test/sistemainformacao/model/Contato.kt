package com.test.sistemainformacao.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.intellij.lang.annotations.PrintFormat

@Entity(tableName = "tbl_contato")
data class Contato(

    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val nome: String = "",
    val telefone: String = "",
    @ColumnInfo(name = "is_amigo") val amigo: Boolean = false
)

//@Entity(tableName = "tbl_contato")
//data class Contato(
//    val number: Number,
//)

//@Entity(tableName = "tbl_contato")
//data class Contato(
//
//    @PrimaryKey(autoGenerate = true) val id: Long = 0,
//    val nome: String = "",
//    val telefone: String = "",
//    @ColumnInfo(name = "is_amigo") val amigo: Boolean = false
//)

//package com.test.sistemainformacao.model
//
//data class Contao(
//    val id: Long = 0,
//    val nome: String = "",
//    val telefone: String = "",
//    val amigo: Boolean = false
//)