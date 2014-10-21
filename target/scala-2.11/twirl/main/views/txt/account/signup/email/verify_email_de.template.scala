
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
object verify_email_de extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""Hey """),_display_(/*1.76*/name),format.raw/*1.80*/(""",


Du hast dich kürzlich bei PlayAuthenticate registriert.

Folge diesem Link um dein Konto jetzt zu aktivieren:

"""),_display_(/*8.2*/verificationUrl),format.raw/*8.17*/("""

"""),format.raw/*10.1*/("""Grüße,
Das PlayAuthenticate-Team"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:14 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/email/verify_email_de.scala.txt
                  HASH: 8bda10397e889eb7aa79de85f7dcb9e0db473551
                  MATRIX: 769->1|925->70|956->75|980->79|1121->195|1156->210|1185->212
                  LINES: 26->1|29->1|29->1|29->1|36->8|36->8|38->10
                  -- GENERATED --
              */
          