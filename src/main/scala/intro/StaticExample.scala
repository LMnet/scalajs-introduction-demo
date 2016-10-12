package intro

import scala.scalajs.js

class StaticExample {

  def main(): Unit = {
    // https://bl.ocks.org/mbostock/7322386

    import fr.iscpif.scaladget.mapping.d3

    val data = js.Array(4, 8, 15, 16, 23, 42)

    val x = d3.scale.linear()
      .domain(js.Array(0, d3.max(data)))
      .range(js.Array(0, 420))

    val styleFunc: (js.Any, Double) => js.Any = {
      (d: js.Any, _: Double) => {
        x(d) + "px"
      }
    }

    d3.select(".chart")
      .selectAll("div")
      .data(data)
      .enter().append("div")
      .style("width", styleFunc)
      .text((d: js.Any) => d)
    //.ololo()
  }

}
