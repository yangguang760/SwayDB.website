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

package swaydb.io.docs.apis.read

import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.html_<^.{<, _}
import swaydb.io.{Page, RouterController}
import swaydb.io.common.Info

object ExpirationDoc {

  val alert =
    Info(
      <.i(
        "Read ",
        RouterController.router.link(Page.IncreasingExpiration)(Page.IncreasingExpiration.name),
        " documentation to understand the trade-offs made when increasing a key's or keys' expiration."
      )
    )

  def apply(): VdomElement = {
    <.div(
      <.div(^.className := "page-header",
        <.h2(Page.Expiration.name)
      ),

      <.h3("Key-value"),
      <.p("Returns the expiration deadline set for the key. None is returned if no expiration is set."),
      <.pre(
        <.code(^.className := "scala")(
          """
            |db.expiration(key = 1)
            |
            |""".stripMargin
        )
      ),

      <.h3("Set"),
      <.p("Returns the expiration deadline for the item. None is returned if no expiration is set."),
      <.pre(
        <.code(^.className := "scala")(
          """
            |setDB.expiration(elem = 1)
            |
            |""".stripMargin
        )
      ),

      alert

    )
  }
}