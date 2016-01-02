package com.padhopr.PadMessenger

import com.twitter.finatra._
import com.twitter.finatra.ContentType._

import Actions._

class SessionController extends Controller {

  /** Log in */
  put("/api/session") { request =>
    // what if auth fails
    val res = LogIn("test@test.com", "test")
    render.json(res).toFuture
  }

  /** Log out */
  delete("/api/session") { request =>
    render.json("test").toFuture
  }

}