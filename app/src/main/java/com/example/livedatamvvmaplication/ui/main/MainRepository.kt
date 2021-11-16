package com.example.livedatamvvmaplication.ui.main

class MainRepository {

    fun getFilmes(callback: (filmes: List<Filme>) -> Unit) {
        Thread(Runnable {
            Thread.sleep(3000)
            callback.invoke(
                listOf(
                    Filme(1,"Título 01"),
                    Filme(2,"Título 02")
                )
            )
        }) . start()

    }
}