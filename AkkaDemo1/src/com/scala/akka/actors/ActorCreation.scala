package com.scala.akka.actors

import akka.actor.Actor

object ActorCreation extends App {
  
    object Creation extends App{
    
    
   
      
      
      
      
    
   }
    
     //Music Player message
    object MusicController{
      sealed trait ControllerMsg
      case object Play extends ControllerMsg
      case object Stop extends ControllerMsg
    }
    
    //Music Player
    class MusicController extends Actor{
      
     // def receiver =???  
      
    }
    //Music Player message
    object MusicPlayer{
      
    }
    
    //Music Player
    class MusicPlayer extends Actor{
      
      //def receiver =???  
      
    }
  
}

