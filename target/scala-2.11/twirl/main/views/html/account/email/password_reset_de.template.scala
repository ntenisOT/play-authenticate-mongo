
package views.html.account.email

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
object password_reset_de extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Hey """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.<br />
	Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.<br />
</p>
<p>
	Falls du dein Passwort zurücksetzen möchtest, <a href=""""),_display_(/*10.58*/url),format.raw/*10.61*/("""">musst du nur diesem Link folgen</a>.
</p>
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_de.scala.html
                  HASH: 62e5f75f7d2eb19a525ee5b3ddc66c1f2cd10504
                  MATRIX: 770->1|915->58|942->59|972->64|996->68|1304->349|1328->352
                  LINES: 26->1|29->1|30->2|30->2|30->2|38->10|38->10
                  -- GENERATED --
              */
          