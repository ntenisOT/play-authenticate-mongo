
package views.html

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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("playauthenticate.signup.title"),"signup")/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
    
  """),format.raw/*8.3*/("""<div class="row">
    <div class="span6">
      <h1>"""),_display_(/*10.12*/Messages("playauthenticate.signup.title")),format.raw/*10.53*/("""</h1>
    </div>
  </div>

  <div id="signup" class="row">

    <div class="span3">
        """),format.raw/*17.45*/("""
    	"""),_display_(/*18.7*/helper/*18.13*/.form(routes.Application.doSignup)/*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""
    	
            """),_display_(/*20.14*/if(signupForm.hasGlobalErrors)/*20.44*/ {_display_(Seq[Any](format.raw/*20.46*/(""" 
                """),format.raw/*21.17*/("""<p class="error">
		            <span class="label label-important">"""),_display_(/*22.52*/signupForm/*22.62*/.globalError.message),format.raw/*22.82*/("""</span>
		        </p>
            """)))}),format.raw/*24.14*/("""
            
             """),_display_(/*26.15*/inputText(
                signupForm("name"),
                '_label -> Messages("playauthenticate.signup.name")
             )),format.raw/*29.15*/("""
             
             """),_display_(/*31.15*/_emailPartial(signupForm)),format.raw/*31.40*/("""
             
             """),_display_(/*33.15*/_passwordPartial(signupForm)),format.raw/*33.43*/("""

            """),format.raw/*35.13*/("""<input type="submit" value=""""),_display_(/*35.42*/Messages("playauthenticate.signup.now")),format.raw/*35.81*/("""" class="btn btn-primary">
    	""")))}),format.raw/*36.7*/("""
    """),format.raw/*37.5*/("""</div>

    <div class="span3">
        """),_display_(/*40.10*/Messages("playauthenticate.signup.oauth")),format.raw/*40.51*/("""
        """),format.raw/*41.50*/("""
        """),_display_(/*42.10*/_providerPartial(skipCurrent=false)),format.raw/*42.45*/("""
    """),format.raw/*43.5*/("""</div>

  </div>

""")))}))}
  }

  def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/signup.scala.html
                  HASH: 53c4c385b247c8a19d338df143adc150d3752580
                  MATRIX: 796->1|953->22|981->75|1008->77|1072->133|1111->135|1145->143|1225->196|1287->237|1407->365|1440->372|1455->378|1498->412|1538->414|1585->434|1624->464|1664->466|1710->484|1806->553|1825->563|1866->583|1933->619|1988->647|2138->776|2194->805|2240->830|2296->859|2345->887|2387->901|2443->930|2503->969|2566->1002|2598->1007|2666->1048|2728->1089|2765->1139|2802->1149|2858->1184|2890->1189
                  LINES: 28->1|32->1|34->5|35->6|35->6|35->6|37->8|39->10|39->10|46->17|47->18|47->18|47->18|47->18|49->20|49->20|49->20|50->21|51->22|51->22|51->22|53->24|55->26|58->29|60->31|60->31|62->33|62->33|64->35|64->35|64->35|65->36|66->37|69->40|69->40|70->41|71->42|71->42|72->43
                  -- GENERATED --
              */
          