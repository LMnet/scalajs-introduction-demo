package intro

import scala.scalajs.js

class DynamicExample {

  def main(): Unit = {
    // https://bl.ocks.org/mbostock/7322386

    val d3 = js.Dynamic.global.d3

    val data = js.Array(4, 8, 15, 16, 23, 42)

    val x = d3.scale.linear()
      .domain(js.Array(0, d3.max(data)))
      .range(js.Array(0, 420))

    val styleCb = (d: js.Dynamic) => x(d) + "px"

    val textCb = (d: js.Dynamic) => d

    d3.select(".chart")
      .selectAll("div")
      .data(data)
      .enter().append("div")
      .style("width", styleCb)
      .text(textCb)
    //.ololo()
  }
}
