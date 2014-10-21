
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
object unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.verify.email.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""

	"""),format.raw/*4.2*/("""<h1>"""),_display_(/*4.7*/Messages("playauthenticate.verify.email.title")),format.raw/*4.54*/("""</h1>
	<p>
		"""),_display_(/*6.4*/Messages("playauthenticate.verify.email.requirement")),format.raw/*6.57*/("""</br>
		"""),_display_(/*7.4*/Messages("playauthenticate.verify.email.cta")),format.raw/*7.49*/("""
	"""),format.raw/*8.2*/("""<br/>
	
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
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/unverified.scala.html
                  HASH: 1d1da98fac20a6f7512b000c24b56d8bcde6e280
                  MATRIX: 818->2|879->55|918->57|947->60|977->65|1044->112|1083->126|1156->179|1190->188|1255->233|1283->235
                  LINES: 29->2|29->2|29->2|31->4|31->4|31->4|33->6|33->6|34->7|34->7|35->8
                  -- GENERATED --
              */
          