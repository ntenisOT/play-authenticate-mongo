
package views.html.account.signup

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
object password_reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.Signup.PasswordReset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("playauthenticate.password.reset.title"))/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""

	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/Messages("playauthenticate.password.reset.title")),format.raw/*8.56*/("""</h1>
	<p>
	"""),_display_(/*10.3*/form(routes.Signup.doResetPassword)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	   
       """),_display_(/*12.9*/if(resetForm.hasGlobalErrors)/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/(""" 
        """),format.raw/*13.9*/("""<p class="error">
          <span class="label label-important">"""),_display_(/*14.48*/resetForm/*14.57*/.globalError.message),format.raw/*14.77*/("""</span>
     	</p>
       """)))}),format.raw/*16.9*/("""
       
        """),_display_(/*18.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false
   		
   		)/*23.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*23.36*/("""
		    """),format.raw/*24.7*/("""<input type="hidden" value=""""),_display_(/*24.36*/value),format.raw/*24.41*/("""" name=""""),_display_(/*24.50*/name),format.raw/*24.54*/("""" id=""""),_display_(/*24.61*/id),format.raw/*24.63*/("""" """),_display_(/*24.66*/toHtmlArgs(args)),format.raw/*24.82*/(""">
		""")))}),format.raw/*25.4*/("""
	   
	   """),_display_(/*27.6*/_passwordPartial(resetForm)),format.raw/*27.33*/("""
           
		"""),format.raw/*29.3*/("""<input type="submit" value=""""),_display_(/*29.32*/Messages("playauthenticate.password.reset.cta")),format.raw/*29.79*/("""" class="btn btn-primary"> 
	""")))}),format.raw/*30.3*/("""
	"""),format.raw/*31.2*/("""</p>
""")))}))}
  }

  def render(resetForm:Form[controllers.Signup.PasswordReset]): play.twirl.api.HtmlFormat.Appendable = apply(resetForm)

  def f:((Form[controllers.Signup.PasswordReset]) => play.twirl.api.HtmlFormat.Appendable) = (resetForm) => apply(resetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/account/signup/password_reset.scala.html
                  HASH: 2d33793043924d4a955e9dce0df876c1a6113283
                  MATRIX: 779->1|966->52|994->105|1021->107|1084->162|1123->164|1152->167|1182->172|1251->221|1290->234|1334->269|1374->271|1414->285|1452->314|1492->316|1529->326|1621->391|1639->400|1680->420|1737->447|1782->465|1889->564|1956->593|1990->600|2046->629|2072->634|2108->643|2133->647|2167->654|2190->656|2220->659|2257->675|2292->680|2329->691|2377->718|2419->733|2475->762|2543->809|2603->839|2632->841
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|39->12|39->12|40->13|41->14|41->14|41->14|43->16|45->18|50->23|50->23|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|52->25|54->27|54->27|56->29|56->29|56->29|57->30|58->31
                  -- GENERATED --
              */
          