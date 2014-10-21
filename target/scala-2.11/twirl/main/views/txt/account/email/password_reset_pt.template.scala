
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
object password_reset_pt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""Olá """),_display_(/*1.64*/name),format.raw/*1.68*/(""",


Você ou alguém pediu uma nova palavra passe para a sua conta.
Se não foi você ou não foi sua intenção, pode ignorar esta mensagem.

Se deseja uma nova palavra passe, terá somente que seguir este endereço para criar uma nova palavra passe:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Obrigado,
A equipa do PlayAuthenticate"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_pt.scala.txt
                  HASH: 5b9d749ecc9152d8fbea6d8d0467a283d2f694ae
                  MATRIX: 764->1|908->58|939->63|963->67|1239->318|1261->321|1292->325
                  LINES: 26->1|29->1|29->1|29->1|36->8|36->8|38->10
                  -- GENERATED --
              */
          