package com.example

import io.circe.Json
import io.circe.optics.JsonPath.root
import monocle.Optional

trait RecordExtractor {

  val infOptics: Optional[Json, Inf] = root.inf.as[Inf]

  val avpOptics: Optional[Json, List[Avp]] = root.avp.as[List[Avp]]
}
