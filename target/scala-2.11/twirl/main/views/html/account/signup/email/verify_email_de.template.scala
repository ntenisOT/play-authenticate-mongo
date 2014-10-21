
package views.html.account.signup.email

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
object verify_email_de extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Hey """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Du hast dich kürzlich bei PlayAuthenticate registriert.<br />
	<br />
	Folge diesem Link um dein Konto <a href=""""),_display_(/*8.44*/verificationUrl),format.raw/*8.59*/("""">jetzt zu aktivieren</a>.
</p>
<br />
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/email/verify_email_de.scala.html
                  HASH: 94af137e9500bf2ab75642c56601a1110749449e
                  MATRIX: 775->1|932->70|959->71|989->76|1013->80|1173->214|1208->229
                  LINES: 26->1|29->1|30->2|30->2|30->2|36->8|36->8
                  -- GENERATED --
              */
          