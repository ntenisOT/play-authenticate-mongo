
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
object _providerIcon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<img alt=""""),_display_(/*2.12*/providerKey),format.raw/*2.23*/(""" """),format.raw/*2.24*/("""icon" title=""""),_display_(/*2.38*/providerKey),format.raw/*2.49*/("""" src=""""),_display_(/*2.57*/routes/*2.63*/.Assets.at("icons/"+providerKey+"-24x24.png")),format.raw/*2.108*/("""">"""))}
  }

  def render(providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(providerKey)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/_providerIcon.scala.html
                  HASH: 3e323c45e0d3e9c254d82b83d46207134eecdc8c
                  MATRIX: 731->1|840->22|867->23|904->34|935->45|963->46|1003->60|1034->71|1068->79|1082->85|1148->130
                  LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2
                  -- GENERATED --
              */
          