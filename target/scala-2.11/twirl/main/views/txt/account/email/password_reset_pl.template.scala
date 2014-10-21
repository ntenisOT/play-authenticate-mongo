
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
object password_reset_pl extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""Cześć """),_display_(/*1.66*/name),format.raw/*1.70*/(""",


Poproszono o zmianę hasła dla Twojego konta.
Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.

Jeśli jednak naprawdę chcesz zmienić hasło skorzystaj z tego linku aby to zrobić:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Pozdrawiamy,
Ekipa PlayAuthenticate"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_pl.scala.txt
                  HASH: 52dbbb11d44261dddb6908c14071f8701730284f
                  MATRIX: 764->1|908->58|941->65|965->69|1179->258|1201->261|1230->263
                  LINES: 26->1|29->1|29->1|29->1|36->8|36->8|38->10
                  -- GENERATED --
              */
          