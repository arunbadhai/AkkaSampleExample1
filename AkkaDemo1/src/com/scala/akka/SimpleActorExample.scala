package com.scala.akka

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object SimpleActor extends App {
  
  
   class SimpleActor extends Actor{
     
     
     def receive ={
       case s:String => println("String :" +s)
       case i:Int=>println("Number:"+i)
     }
     
     
     def foo = println("Normal Method")
     
   }
  
  val system = ActorSystem("SimpleSystem")
  val actor=system.actorOf(Props[SimpleActor],"SimpleActor")

  
  
  
}