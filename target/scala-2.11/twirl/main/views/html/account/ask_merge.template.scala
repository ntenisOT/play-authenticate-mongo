
package views.html.account

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
object ask_merge extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(acceptForm: Form[Account.Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._
def /*6.2*/label/*6.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(/*7.3*/Messages("playauthenticate.merge.accounts.question",aUser,bUser)),format.raw/*7.67*/("""
""")))};
Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main(Messages("playauthenticate.merge.accounts.title"))/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""

	"""),format.raw/*12.2*/("""<h1>"""),_display_(/*12.7*/Messages("playauthenticate.merge.accounts.title")),format.raw/*12.56*/("""</h1>
	<p>
	"""),_display_(/*14.3*/form(routes.Account.doMerge)/*14.31*/ {_display_(Seq[Any](format.raw/*14.33*/("""

            """),_display_(/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/(""" 
                """),format.raw/*17.17*/("""<p class="error">
		            <span class="label label-important">"""),_display_(/*18.52*/acceptForm/*18.62*/.globalError.message),format.raw/*18.82*/("""</span>
		        </p>
            """)))}),format.raw/*20.14*/("""
	   
	   """),_display_(/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.merge.accounts.true"),
            	"false"->Messages("playauthenticate.merge.accounts.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        )),format.raw/*30.10*/("""
           
		"""),format.raw/*32.3*/("""<input type="submit" value=""""),_display_(/*32.32*/Messages("playauthenticate.merge.accounts.ok")),format.raw/*32.78*/("""" class="btn btn-primary">
	""")))}),format.raw/*33.3*/("""
	"""),format.raw/*34.2*/("""</p>
""")))}))}
  }

  def render(acceptForm:Form[Account.Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(acceptForm,aUser,bUser)

  def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (acceptForm,aUser,bUser) => apply(acceptForm,aUser,bUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/ask_merge.scala.html
                  HASH: 24b5611afda9aec63471ffda7908b8e29554fdab
                  MATRIX: 825->1|1070->182|1082->187|1162->191|1190->194|1274->258|1316->127|1344->180|1371->260|1400->263|1464->318|1504->320|1534->323|1565->328|1635->377|1674->390|1711->418|1751->420|1793->435|1832->465|1872->467|1918->485|2014->554|2033->564|2074->584|2141->620|2178->631|2514->946|2556->961|2612->990|2679->1036|2738->1065|2767->1067
                  LINES: 26->1|29->6|29->6|31->6|32->7|32->7|34->1|36->5|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|45->16|46->17|47->18|47->18|47->18|49->20|51->22|59->30|61->32|61->32|61->32|62->33|63->34
                  -- GENERATED --
              */
          