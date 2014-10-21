
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
object unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.verify.account.title"))/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

	"""),format.raw/*4.2*/("""<h1>"""),_display_(/*4.7*/Messages("playauthenticate.verify.account.title")),format.raw/*4.56*/("""</h1>
	<p>
	"""),_display_(/*6.3*/Messages("playauthenticate.verify.account.before")),format.raw/*6.53*/(""" """),format.raw/*6.54*/("""<a href=""""),_display_(/*6.64*/routes/*6.70*/.Account.verifyEmail),format.raw/*6.90*/("""">"""),_display_(/*6.93*/Messages("playauthenticate.verify.account.first")),format.raw/*6.142*/("""</a>.<br/>
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
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/unverified.scala.html
                  HASH: 9cbef451e711e38858b59096a29c41861a7f3166
                  MATRIX: 811->2|874->57|913->59|942->62|972->67|1041->116|1079->129|1149->179|1177->180|1213->190|1227->196|1267->216|1296->219|1366->268
                  LINES: 29->2|29->2|29->2|31->4|31->4|31->4|33->6|33->6|33->6|33->6|33->6|33->6|33->6|33->6
                  -- GENERATED --
              */
          