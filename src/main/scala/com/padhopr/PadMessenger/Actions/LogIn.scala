package com.padhopr.PadMessenger.Actions

import com.padhopr.PadMessenger.Stores._
import com.padhopr.PadMessenger.Model._

object LogIn {

  def apply(email: String, password: String) = {
    val userStore = new MemoryUserStore()
    val user = userStore.getUser(email)

    val authenticated = authenticate(user, password)

    val sessionStore = new MemorySessionStore()
    val jwt = sessionStore.getToken(user)

    Map("user" -> user, "jwt" -> jwt, "success" -> authenticated)
  }

  def authenticate(user: User, password: String): Boolean = {
    user.password == password
  }

  def validate(email: String, password: String): Boolean = {
    email.length > 0 && password.length > 0
  }

}