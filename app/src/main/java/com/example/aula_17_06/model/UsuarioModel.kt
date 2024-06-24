package com.example.aula_17_06.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Usuario")
class UsuarioModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id_usuario")
    var  id_usuario: Int = 0

    @ColumnInfo("nome")
    var nome: String = ""

    @ColumnInfo("idade")
    var idade: Int = 0
}