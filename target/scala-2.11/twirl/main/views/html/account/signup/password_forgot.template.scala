
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
object password_forgot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[providers.MyUsernamePasswordAuthProvider.MyIdentity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emailForm: Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("playauthenticate.password.forgot.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/Messages("playauthenticate.password.forgot.title")),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(/*10.3*/form(routes.Signup.doForgotPassword)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
	   
            """),_display_(/*12.14*/if(emailForm.hasGlobalErrors)/*12.43*/ {_display_(Seq[Any](format.raw/*12.45*/(""" 
                """),format.raw/*13.17*/("""<p class="error">
		            <span class="label label-important">"""),_display_(/*14.52*/emailForm/*14.61*/.globalError.message),format.raw/*14.81*/("""</span>
		        </p>
            """)))}),format.raw/*16.14*/("""
	   
	   """),_display_(/*18.6*/_emailPartial(emailForm)),format.raw/*18.30*/("""
           
		"""),format.raw/*20.3*/("""<input type="submit" value=""""),_display_(/*20.32*/Messages("playauthenticate.password.forgot.cta")),format.raw/*20.80*/("""" class="btn btn-primary"> 
	""")))}),format.raw/*21.3*/("""
	"""),format.raw/*22.2*/("""</p>
""")))}))}
  }

  def render(emailForm:Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]): play.twirl.api.HtmlFormat.Appendable = apply(emailForm)

  def f:((Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) => play.twirl.api.HtmlFormat.Appendable) = (emailForm) => apply(emailForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/password_forgot.scala.html
                  HASH: 08205e3352f79d8c5d020f953738fefdb4a14aa6
                  MATRIX: 799->1|1005->71|1033->124|1060->126|1124->182|1163->184|1192->187|1222->192|1292->242|1331->255|1376->291|1416->293|1462->312|1500->341|1540->343|1586->361|1682->430|1700->439|1741->459|1808->495|1845->506|1890->530|1932->545|1988->574|2057->622|2117->652|2146->654
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|39->12|39->12|40->13|41->14|41->14|41->14|43->16|45->18|45->18|47->20|47->20|47->20|48->21|49->22
                  -- GENERATED --
              */
          