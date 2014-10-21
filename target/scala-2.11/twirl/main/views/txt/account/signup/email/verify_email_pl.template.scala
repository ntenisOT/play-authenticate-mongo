
package views.txt.account.signup.email

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
object verify_email_pl extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""Cześć """),_display_(/*1.78*/name),format.raw/*1.82*/(""",


Twoje konto w PlayAuthenticate zostało utworzone.

Aby je aktywować, użyj ten link
"""),_display_(/*7.2*/verificationUrl),format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""Pozdrawiamy,
Ekipa PlayAuthenticate"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:14 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/email/verify_email_pl.scala.txt
                  HASH: 5070f597f2c4c05ab027419d9d85e031a186b326
                  MATRIX: 769->1|925->70|958->77|982->81|1095->169|1130->184|1158->186
                  LINES: 26->1|29->1|29->1|29->1|35->7|35->7|37->9
                  -- GENERATED --
              */
          