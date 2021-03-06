/*
 * Copyright 2018 Simer Plaha (@simerplaha)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package swaydb.io.docs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.html_<^.{<, _}
import swaydb.io.Main

object TestStatusDoc {

  def apply(): VdomElement = {
    <.div(
      <.div(^.className := "page-header",
        <.h2(^.id := "setup", "Test status")
      ),
      <.h3("Unit tests"),
      <.p("Implemented for functions."),

      <.h3("Integration tests"),
      <.p("Implemented for higher types."),

      <.h3("Stress tests"),
      <.p("Implemented for higher types internally in the core module."),
      <.p(
        "System stress tests are implemented in ",
        <.a(
          ^.href := "https://github.com/simerplaha/SwayDB.stress",
          ^.onClick --> Callback(Main.analytics.event("Outbound click", s"${this.getClass.getSimpleName} - SwayDB.stress")),
          ^.target := "blank")("SwayDB.stress"),
        " project."
      ),

      <.h3("Performance tests"),
      <.p("Implemented for higher types internally in the core module."),
      <.p(
        "System performance tests are implemented in ",
        <.a(
          ^.href := "https://github.com/simerplaha/SwayDB.benchmark",
          ^.onClick --> Callback(Main.analytics.event("Outbound click", s"${this.getClass.getSimpleName} - SwayDB.benchmark")),
          ^.target := "blank")("SwayDB.benchmark"),
        " project."
      ),

      <.h3("Failure tests"),
      <.p(
        "Unit tests are implemented for functions implementing failure/corruption handling behavior. ",
        "These tests are also implemented for higher types as part of integration tests."
      ),
      <.p(
        "JVM crash tests were performed manually. Automated tests will eventually be implemented with ",
        <.a(
          ^.href := "https://github.com/sbt/sbt-multi-jvm",
          ^.onClick --> Callback(Main.analytics.event("Outbound click", s"${this.getClass.getSimpleName} - sbt-multi-jvm")),
          ^.target := "blank")("sbt-multi-jvm"),
        "."
      ),

      <.h3("Code coverage"),
      <.p("TODO")
    )
  }

}
