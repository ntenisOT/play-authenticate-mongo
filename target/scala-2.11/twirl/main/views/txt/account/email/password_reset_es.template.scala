
package views.txt.account.email

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
import views.txt._

/**/
object password_reset_es extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""Hola """),_display_(/*1.65*/name),format.raw/*1.69*/(""",


Alguien ha solicitado restablecer la contraseña de su cuenta.
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.

Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir el siguiente enlace:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Atentamente,
El equipo de PlayAuthenticate
"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_es.scala.txt
                  HASH: 27ccf936e823452b5064a02c99593f13538fa522
                  MATRIX: 764->1|908->58|940->64|964->68|1244->323|1266->326|1295->328
                  LINES: 26->1|29->1|29->1|29->1|36->8|36->8|38->10
                  -- GENERATED --
              */
          