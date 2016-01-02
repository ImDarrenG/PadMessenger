package com.padhopr.PadMessenger.Model

import com.github.nscala_time.time.Imports._

case class User	(
	id: Int,
	email: String,
	name: String,
	password: String,
	passwordCreated: DateTime)