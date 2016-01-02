package com.padhopr.PadMessenger

import com.twitter.finatra._
import com.twitter.finatra.ContentType._

object App extends FinatraServer {
  register(new UiController())
  register(new SessionController())
  register(new UserController())
  register(new ThreadsController())
}