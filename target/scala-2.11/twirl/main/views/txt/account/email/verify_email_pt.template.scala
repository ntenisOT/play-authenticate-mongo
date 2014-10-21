
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
object verify_email_pt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""Olá """),_display_(/*1.76*/name),format.raw/*1.80*/(""", 


Para verificar o seu endereço de email, siga esta ligação agora:
"""),_display_(/*5.2*/verificationUrl),format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""Obrigado,
A equipa do PlayAuthenticate"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/verify_email_pt.scala.txt
                  HASH: 890dc03f0135815ae3378216fbe49333e29d2881
                  MATRIX: 762->1|918->70|949->75|973->79|1073->154|1108->169|1138->173
                  LINES: 26->1|29->1|29->1|29->1|33->5|33->5|35->7
                  -- GENERATED --
              */
          