package com

import io.circe.Json

package object example {

  case class Avp(`var`: String, att: String, lng: List[String])

  case class Inf(codes: Map[String, Json], techdimm: Map[String, Json], master: Map[String, Json])
}
