
package views.html.account.signup.email

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
object verify_email_en extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Howdy """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
	You recently signed up for PlayAuthenticate.<br />
	<br />
	Follow this link to <a href=""""),_display_(/*8.32*/verificationUrl),format.raw/*8.47*/("""">activate your account</a> now.
</p>
<br />
<p>
	Cheers,<br /> 
	<i>The PlayAuthenticate Team</i>
</p>"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:14 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/email/verify_email_en.scala.html
                  HASH: 21e4e9f8479e676d2bda00802e64761104b77c21
                  MATRIX: 775->1|932->70|959->71|991->78|1015->82|1152->193|1187->208
                  LINES: 26->1|29->1|30->2|30->2|30->2|36->8|36->8
                  -- GENERATED --
              */
          