
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
object ask_link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(acceptForm: Form[Account.Accept], newAccount: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._
def /*6.2*/label/*6.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(/*7.3*/_providerIcon(newAccount.getProvider())),format.raw/*7.42*/(""" """),_display_(/*7.44*/Messages("playauthenticate.link.account.question",newAccount)),format.raw/*7.105*/("""
""")))};
Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main(Messages("playauthenticate.link.account.title"))/*10.55*/ {_display_(Seq[Any](format.raw/*10.57*/("""

	"""),format.raw/*12.2*/("""<h1>"""),_display_(/*12.7*/Messages("playauthenticate.link.account.title")),format.raw/*12.54*/("""</h1>
	<p>
	"""),_display_(/*14.3*/form(routes.Account.doLink)/*14.30*/ {_display_(Seq[Any](format.raw/*14.32*/("""
	   
            """),_display_(/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/(""" 
                """),format.raw/*17.17*/("""<p class="error">
		            <span class="label label-important">"""),_display_(/*18.52*/acceptForm/*18.62*/.globalError.message),format.raw/*18.82*/("""</span>
		        </p>
            """)))}),format.raw/*20.14*/("""
	   
	   """),_display_(/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.link.account.true"),
            	"false"->Messages("playauthenticate.link.account.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        )),format.raw/*30.10*/("""
           
		"""),format.raw/*32.3*/("""<input type="submit" value=""""),_display_(/*32.32*/Messages("playauthenticate.link.account.ok")),format.raw/*32.76*/("""" class="btn btn-primary"> 
	""")))}),format.raw/*33.3*/("""
	"""),format.raw/*34.2*/("""</p>
""")))}))}
  }

  def render(acceptForm:Form[Account.Accept],newAccount:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(acceptForm,newAccount)

  def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (acceptForm,newAccount) => apply(acceptForm,newAccount)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/ask_link.scala.html
                  HASH: 62280db1557b1a4aad81c61f70418060ce3fccec
                  MATRIX: 786->1|990->141|1002->146|1082->150|1110->153|1169->192|1197->194|1279->255|1320->86|1348->139|1375->257|1404->260|1466->313|1506->315|1536->318|1567->323|1635->370|1674->383|1710->410|1750->412|1796->431|1835->461|1875->463|1921->481|2017->550|2036->560|2077->580|2144->616|2181->627|2513->938|2555->953|2611->982|2676->1026|2736->1056|2765->1058
                  LINES: 26->1|29->6|29->6|31->6|32->7|32->7|32->7|32->7|34->1|36->5|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|45->16|46->17|47->18|47->18|47->18|49->20|51->22|59->30|61->32|61->32|61->32|62->33|63->34
                  -- GENERATED --
              */
          