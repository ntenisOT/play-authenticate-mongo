
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      """),format.raw/*3.7*/("""<!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>"""),_display_(/*5.14*/Messages("playauthenticate.index.intro")),format.raw/*5.54*/("""</h1>
        <p>"""),_display_(/*6.13*/Messages("playauthenticate.index.intro_2")),format.raw/*6.55*/(""" """),format.raw/*6.56*/("""<br/>"""),_display_(/*6.62*/Messages("playauthenticate.index.intro_3")),format.raw/*6.104*/("""</p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>"""),_display_(/*12.16*/Messages("playauthenticate.index.heading")),format.raw/*12.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(/*14.39*/Messages("playauthenticate.index.details")),format.raw/*14.81*/(""" """),format.raw/*14.82*/("""&raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(/*19.39*/Messages("playauthenticate.index.details")),format.raw/*19.81*/(""" """),format.raw/*19.82*/("""&raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(/*24.39*/Messages("playauthenticate.index.details")),format.raw/*24.81*/(""" """),format.raw/*24.82*/("""&raquo;</a></p>
        </div>
      </div>
    """)))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/index.scala.html
                  HASH: a100f5e393881f5ff4cf1c7086a2eb5e31c824a1
                  MATRIX: 798->2|852->48|891->50|924->57|1067->174|1127->214|1171->232|1233->274|1261->275|1293->281|1356->323|1507->447|1570->489|1866->758|1929->800|1958->801|2289->1105|2352->1147|2381->1148|2718->1458|2781->1500|2810->1501
                  LINES: 29->2|29->2|29->2|30->3|32->5|32->5|33->6|33->6|33->6|33->6|33->6|39->12|39->12|41->14|41->14|41->14|46->19|46->19|46->19|51->24|51->24|51->24
                  -- GENERATED --
              */
          