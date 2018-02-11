# SwayDB.io

http://swaydb.io/


Website for [SwayDB](https://github.com/simerplaha/SwayDB) written in [Scala.js](https://www.scala-js.org/) 
with [scalajs-react](https://github.com/japgolly/scalajs-react).

*All documentation pages are written in [HTML/VDOM](https://github.com/japgolly/scalajs-react/blob/master/doc/VDOM.md) 
and prior knowledge of React is **not** required to update or add new documentation pages.*


## Creating Pages

Create a Page type in [Page.scala](https://github.com/simerplaha/SwayDB.io/blob/master/src/main/scala/swaydb/io/Page.scala).

```scala
object MyPage extends Page {

    import japgolly.scalajs.react.vdom.html_<^.{<, _}

    override val name: String = "My page"
    override val subPages: Seq[Page] = Seq()
    override val url: String = "#mypage" //unique URL
    override def render(): VdomElement =
      <.div("My page") //implement the HTML for the page here or preferably in another object type.
  }
```

- To add `MyPage` as one of the root pages, add it to the 
[`RootPages.pages`](https://github.com/simerplaha/SwayDB.io/blob/master/src/main/scala/swaydb/io/Page.scala#L39) in 
[Page.scala](https://github.com/simerplaha/SwayDB.io/blob/master/src/main/scala/swaydb/io/Page.scala).
- To add `MyPage` as one of the `subPages` of another `Page`, add it to the `subPages` field of the target `Page` in
[Page.scala](https://github.com/simerplaha/SwayDB.io/blob/master/src/main/scala/swaydb/io/Page.scala).

Done!

## Updating Pages
All `Page`s follow the above structure that are simple HTML functions. Updating
the Pages require updating the HTML of the `render` functions.

## Creating Links 

```scala
RouterController.router.link(Page.MyPage)("My Page")
```

## Adding code snippets

```scala
<.pre(
    <.code(^.className := "scala")(
      """
        |object MyCodeSnippet {
        |
        |   println("My code snippet")
        |
        |}
      """.stripMargin
    )
)
```

## Building & running

[Scala.js documentation on building](https://www.scala-js.org/doc/project/building.html).

```scala
sbt fastOptJS
```
or
```scala
sbt fullOptJS //To build and minify.
```

Add `~` to start auto build on code changes. 

```scala
sbt ~fastOptJS
```

All output JS files and other static files are added to the `docs` folder. To run the website
open `index.html` in your browser.