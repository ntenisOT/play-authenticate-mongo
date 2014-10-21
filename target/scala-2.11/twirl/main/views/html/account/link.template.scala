
package views.html.account

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
object link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.link.account.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""
    
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/Messages("playauthenticate.link.account.title")),format.raw/*4.57*/("""</h1>
    
    <p>
	"""),_display_(/*7.3*/_providerPartial()),format.raw/*7.21*/("""
    """),format.raw/*8.5*/("""<br/>
    </p>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/link.scala.html
                  HASH: c85307a053a417915abd43647c1753b84b432c60
                  MATRIX: 805->2|866->55|905->57|941->67|972->72|1039->119|1085->140|1123->158|1154->163
                  LINES: 29->2|29->2|29->2|31->4|31->4|31->4|34->7|34->7|35->8
                  -- GENERATED --
              */
          