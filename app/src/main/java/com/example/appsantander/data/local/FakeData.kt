package com.example.appsantander.data.local

import com.example.appsantander.data.Cliente
import com.example.appsantander.data.Conta
import  com.example.appsantander.data.Cartao

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Neto")
        val cartao = Cartao("4111111111")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2.450,80",
            "R$ 4.120,00",
            cliente,
            cartao
        );
    }
}