
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
object password_reset_pt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Olá """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Você ou alguém pediu uma nova palavra passe para a sua conta.<br />
	Se não foi você ou não foi sua intenção, pode ignorar esta mensagem.<br />
</p>
<p>
	Se deseja uma nova palavra passe, terá somente que <a href=""""),_display_(/*10.63*/url),format.raw/*10.66*/("""">seguir este endereço para criar uma nova palavra passe</a>.
</p>
<p>
	Obrigado,<br /> 
	<i>A equipa do PlayAuthenticate</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_pt.scala.html
                  HASH: 8145227faaba566fb590da50947ee42afc6ccdc1
                  MATRIX: 770->1|915->58|943->60|973->65|997->69|1268->313|1292->316
                  LINES: 26->1|29->1|30->2|30->2|30->2|38->10|38->10
                  -- GENERATED --
              */
          