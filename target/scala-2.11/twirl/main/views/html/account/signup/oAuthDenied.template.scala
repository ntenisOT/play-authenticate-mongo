
package views.html.account.signup

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
object oAuthDenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/main(Messages("playauthenticate.oauth.access.denied.title"))/*3.62*/ {_display_(Seq[Any](format.raw/*3.64*/("""

	"""),format.raw/*5.2*/("""<h1>"""),_display_(/*5.7*/Messages("playauthenticate.oauth.access.denied.title")),format.raw/*5.61*/("""</h1>
	<p>
		"""),_display_(/*7.4*/Messages("playauthenticate.oauth.access.denied.explanation")),format.raw/*7.64*/("""<br/>
	</p>
	<p>
		"""),_display_(/*10.4*/Messages("playauthenticate.oauth.access.denied.alternative")),format.raw/*10.64*/(""" """),format.raw/*10.65*/("""<a href=""""),_display_(/*10.75*/routes/*10.81*/.Application.signup),format.raw/*10.100*/("""">"""),_display_(/*10.103*/Messages("playauthenticate.oauth.access.denied.alternative.cta")),format.raw/*10.167*/("""</a>.
	</p>
""")))}))}
  }

  def render(providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(providerKey)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/oAuthDenied.scala.html
                  HASH: 8ffa4e0841a07fc3a2f7fa34a782ea3c60463808
                  MATRIX: 744->1|853->22|881->25|949->85|988->87|1017->90|1047->95|1121->149|1160->163|1240->223|1286->243|1367->303|1396->304|1433->314|1448->320|1489->339|1520->342|1606->406
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|35->7|38->10|38->10|38->10|38->10|38->10|38->10|38->10|38->10
                  -- GENERATED --
              */
          