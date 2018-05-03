package com.scala.akka

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props


//Define Actor Message
case class WhoToGreet(who:String)

//Define Greeter Actor
class Greeter extends Actor{

  def receive ={
    
    case WhoToGreet(who)=>println(s"Hello $who") 
  }

}
 
  



object HelloAkkaScala extends App {
  
  
  //Create the Hello world actor system
  val system = ActorSystem("Hello-Akka")
  //create a greeter actor properties
  val  greeter=system.actorOf(Props[Greeter],"greeter") 
    
  //send WhomToGreet message to actor
  greeter !WhoToGreet("Arun")
  greeter !WhoToGreet("He")
}