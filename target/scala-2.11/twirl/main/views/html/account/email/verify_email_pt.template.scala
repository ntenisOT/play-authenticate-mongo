
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
object verify_email_pt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Olá """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Para verificar o seu endereço de email, <a href=""""),_display_(/*6.52*/verificationUrl),format.raw/*6.67*/("""">siga esta ligação</a>.
</p>
<br />
<p>
	Obrigado,<br /> 
	<i>A equipa do PlayAuthenticate</i>
</p>"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/verify_email_pt.scala.html
                  HASH: 5abfbc1a013074370cbf9214dc54c2fe62687672
                  MATRIX: 768->1|925->70|953->72|983->77|1007->81|1108->156|1143->171
                  LINES: 26->1|29->1|30->2|30->2|30->2|34->6|34->6
                  -- GENERATED --
              */
          