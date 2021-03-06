package com.sksamuel.kotlintest.specs.feature

import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.specs.FeatureSpec


class FeatureSpecExample : FeatureSpec() {
  init {
    feature("some feature") {
      scenario("some scenario") {

      }
    }
    feature("another feature") {
      scenario("test with config").config(invocations = 4, threads = 2) {
        1.shouldBeLessThan(4)
      }
    }
    feature("this feature") {
      and("has nested feature contexts") {
        scenario("test with config").config(invocations = 4, threads = 2) {
          1.shouldBeLessThan(4)
        }
      }
    }
  }
}