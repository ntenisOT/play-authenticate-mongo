
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
object password_reset_de extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""Hey """),_display_(/*1.64*/name),format.raw/*1.68*/(""",


du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.
Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.

Falls du dein Passwort zurücksetzen möchtest, musst du nur diesem Link folgen:

"""),_display_(/*9.2*/url),format.raw/*9.5*/("""

"""),format.raw/*11.1*/("""Grüße,
Das PlayAuthenticate-Team"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_de.scala.txt
                  HASH: b9f447780b2702d9060c38322dbda6c337e67c96
                  MATRIX: 764->1|908->58|939->63|963->67|1255->334|1277->337|1306->339
                  LINES: 26->1|29->1|29->1|29->1|37->9|37->9|39->11
                  -- GENERATED --
              */
          