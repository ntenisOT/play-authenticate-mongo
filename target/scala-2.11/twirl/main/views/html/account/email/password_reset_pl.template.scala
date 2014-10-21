
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
object password_reset_pl extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Cześć """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Poproszono o zmianę hasła dla Twojego konta.<br />
    Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.<br />
</p>
<p>
    Jeśli jednak naprawdę chcesz zmienić hasło <a href=""""),_display_(/*10.58*/url),format.raw/*10.61*/("""">skorzystaj z tego linku aby to zrobić</a>.
</p>
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/email/password_reset_pl.scala.html
                  HASH: 9019895a2d154c55442f139cf5777aaf4254d5cc
                  MATRIX: 770->1|915->58|942->59|974->66|998->70|1232->277|1256->280
                  LINES: 26->1|29->1|30->2|30->2|30->2|38->10|38->10
                  -- GENERATED --
              */
          