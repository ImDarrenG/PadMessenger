package com.padhopr.PadMessenger.Stores

import com.padhopr.PadMessenger.Model._
import com.github.nscala_time.time.Imports._
import authentikat.jwt._

trait SessionStore {
  def getUser(jwt: String): User
  def getToken(user: User): String
}

class MemorySessionStore extends SessionStore {

  val JwtSecret = "hkk234djc2345fvf4tAFSDGARVETAET£345vaerv"

  def getUser(jwt: String) : User = {
    val payload: Option[Map[String, String]] = jwt match {
      case JsonWebToken(header, claimsSet, signature) =>
        claimsSet.asSimpleMap.toOption
      case x => None
    }
    val id = payload.getOrElse(Map.empty[String, String]).get("id")

    // TODO(DG): get value from user store if found
    new User(id.getOrElse("0").toInt, "Darren George", "test@test.com", "test", DateTime.now)
  }

  def getToken(user: User) : String = {
    val payload = JwtClaimsSet(Map("id" -> user.id, "created" -> user.passwordCreated))
    var header = JwtHeader("HS256")
    JsonWebToken(header, payload, JwtSecret)
  }

}