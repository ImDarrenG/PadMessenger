package com.padhopr.PadMessenger.Stores

import com.padhopr.PadMessenger.Model._
import com.github.nscala_time.time.Imports._
import scala.collection.mutable.Map

trait UserStore {
  def getUser(email: String) : User
}

class MemoryUserStore extends UserStore {
  val Users = Map("test@test.com" -> new User(1, "Darren George", "test@test.com", "test", DateTime.now))
  def getUser(email: String) : User = {
    Users(email)
  }
}