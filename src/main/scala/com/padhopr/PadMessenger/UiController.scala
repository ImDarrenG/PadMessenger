package com.padhopr.PadMessenger

import com.twitter.finatra._
import com.twitter.finatra.ContentType._

class UiController extends Controller {

    get("/") { request =>
      render.static("index.html").toFuture
    }

}