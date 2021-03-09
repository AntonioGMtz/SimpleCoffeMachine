package com.gama.coffemachine
var water = 400
var milk = 540
var cofBeans = 120
var disCups = 9
var money = 550
fun main() {
    do{
        print("Write action (buy, fill, take, remaining, exit): ")
        var answer = readLine()!!.toString()
        when(answer){
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> cofMachine()
        }
    }while(answer != "exit")
}
fun cofMachine(){
    println("The coffe machine has: ")
    println("$water of water")
    println("$milk of milk")
    println("$cofBeans of coffee beans")
    println("$disCups of disposable cups")
    println("$money of money")
}
fun buy(){
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    var opc = readLine()!!.toString()
    when(opc){
        "1" -> {
            if(water-250<0) println("Sorry, not enough water!")
            else if (cofBeans - 16 <0) println("Sorry, not enough coffee beans!")
            else if(disCups -1 <0 )println("Sorry, not enough disposable cups!")
            else{
                water -=250
                cofBeans -=16
                money+=4
                disCups-=1
                println("I have enough resources, making you a coffee!")
            }
        }
        "2" -> {
            if(water-350<0) println("Sorry, not enough water!")
            else if (cofBeans - 20 <0) println("Sorry, not enough coffee beans!")
            else if (milk - 75 <0) println("Sorry, not enough coffee beans!")
            else if(disCups -1 <0 )println("Sorry, not enough disposable cups!")
            else{
                water -= 350
                cofBeans -= 20
                milk -= 75
                money += 7
                disCups -= 1
                println("I have enough resources, making you a coffee!")
            }
        }
        "3" -> {
            if(water-200<0) println("Sorry, not enough water!")
            else if (cofBeans - 12 <0) println("Sorry, not enough coffee beans!")
            else if (milk - 100 <0) println("Sorry, not enough coffee beans!")
            else if(disCups -1 <0 )println("Sorry, not enough disposable cups!")
            else{
                water -= 200
                cofBeans -= 12
                milk -= 100
                money += 6
                disCups -= 1
                println("I have enough resources, making you a coffee!")
            }
        }
        "back" -> money += 0
    }
}
fun fill(){
    print("Write how many ml of water do you want to add: ")
    var mlWater = readLine()!!.toInt()
    print("Write how many ml of milk do you want to add: ")
    var mlMilk = readLine()!!.toInt()
    print("Write how many grams of coffee beans do you want to add: ")
    var grsBeans = readLine()!!.toInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    var coffeCups = readLine()!!.toInt()
    water += mlWater
    cofBeans += grsBeans
    milk += mlMilk
    disCups += coffeCups
}
fun take(){
    println("I gave you $money")
    money = 0
}
