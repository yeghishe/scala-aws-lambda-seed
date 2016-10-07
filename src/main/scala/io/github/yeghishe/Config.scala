package io.github.yeghishe

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus
import net.ceedubs.ficus.readers.ArbitraryTypeReader

trait Config {
  import Ficus._
  import ArbitraryTypeReader._

  private val config = ConfigFactory.load()
}
