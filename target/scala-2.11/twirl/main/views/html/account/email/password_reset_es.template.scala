
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
object password_reset_es extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Hola """),_display_(/*2.7*/name),format.raw/*2.11*/(""",
<br />
<br />
<p>
Alguien ha solicitado restablecer la contraseña de su cuenta.<br />
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.<br />
</p>
<p>
Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir este <a href=""""),_display_(/*10.97*/url),format.raw/*10.100*/("""">enlace para restablecer su contraseña</a>.
</p>

<p>
Atentamente,<br /> 
<i>El equipo de PlayAuthenticate</i>
</p>
"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_es.scala.html
                  HASH: d9c684f2d636149a8252a580b9555648676c1df2
                  MATRIX: 770->1|915->58|942->59|973->65|997->69|1308->353|1333->356
                  LINES: 26->1|29->1|30->2|30->2|30->2|38->10|38->10
                  -- GENERATED --
              */
          