package com.example

import java.io.File

import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import org.scalatest.{ FreeSpec, MustMatchers }

import scala.io.Source

class DocSpec extends FreeSpec with RecordExtractor {

  val resRoot: File     = new File(getClass.getResource("/").toURI)
  val esFile: File      = new File(resRoot, "oc90.1.es.source.json")
  val outString: String = Source.fromFile(esFile).mkString
  val outJson: Json     = parse(outString).right.get

  "must generate inf" in {
    val infOrig: Inf = infOptics.getOption(outJson).get
  }

  "must create Avps" in {
    val origAvps = avpOptics.getOption(outJson).get
  }
}
