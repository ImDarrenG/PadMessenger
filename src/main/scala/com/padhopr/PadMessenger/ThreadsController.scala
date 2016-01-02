package com.padhopr.PadMessenger

import com.twitter.finatra._
import com.twitter.finatra.ContentType._

class ThreadsController extends Controller {

  get("/api/threads") { request =>
    render.json("test").toFuture
  }
  
  post("/api/threads") { request =>
    render.json("test").toFuture
  }

}