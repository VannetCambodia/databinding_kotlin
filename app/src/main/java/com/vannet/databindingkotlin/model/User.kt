package com.vannet.databindingkotlin.model

import java.io.Serializable

class User:Serializable{
    val name:String
    val age:Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}