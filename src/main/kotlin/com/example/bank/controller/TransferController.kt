package com.example.bank.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transfer")
class TransferController {

    @PostMapping("/new")
    fun newTransfer(){
        System.out.println("Saved")
    }

    @GetMapping("/all")
    fun getAllTransactions(): String{

        return "Hello";
    }
}