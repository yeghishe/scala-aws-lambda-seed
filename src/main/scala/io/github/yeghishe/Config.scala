package io.github.yeghishe

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus
import net.ceedubs.ficus.readers.ArbitraryTypeReader
import net.ceedubs.ficus.readers.namemappers.implicits

trait Config {
  import Ficus._
  import ArbitraryTypeReader._
  import implicits.hyphenCase

  private val config = ConfigFactory.load()
}

object Config extends Config
