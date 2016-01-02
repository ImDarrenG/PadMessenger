package com.padhopr.PadMessenger

import com.twitter.finatra._
import com.twitter.finatra.ContentType._

class UserController extends Controller {

  put("/api/user") { request =>
    render.json("test").toFuture
  }

  post("/api/user/retrieve_password") { request =>
    render.json("test").toFuture
  }

}