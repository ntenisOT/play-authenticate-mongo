
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(Messages("playauthenticate.profile.title"),"profile")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""

    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/Messages("playauthenticate.profile.title")),format.raw/*7.52*/("""</h1>
    <p>
    Your name is """),_display_(/*9.19*/localUser/*9.28*/.name),format.raw/*9.33*/(""" """),format.raw/*9.34*/("""and your email address is """),_display_(/*9.61*/if(!localUser.email)/*9.81*/ {_display_(Seq[Any](format.raw/*9.83*/("""<em>&lt;unknown&gt;</em>.""")))}/*9.110*/else/*9.115*/{_display_(Seq[Any](format.raw/*9.116*/("""
    	"""),_display_(/*10.7*/localUser/*10.16*/.email),format.raw/*10.22*/(""".
	    <i>
	    """),_display_(/*12.7*/if(!localUser.emailValidated && localUser.email)/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
	      """),format.raw/*13.8*/("""(<a href=""""),_display_(/*13.19*/routes/*13.25*/.Account.verifyEmail),format.raw/*13.45*/("""">unverified - click to verify</a>)
	    """)))}/*14.8*/else/*14.13*/{_display_(Seq[Any](format.raw/*14.14*/("""
	      """),format.raw/*15.8*/("""(verified)
	    """)))}),format.raw/*16.7*/("""</i>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<br />
        """),_display_(/*19.10*/if(localUser.firstName && localUser.lastName)/*19.55*/ {_display_(Seq[Any](format.raw/*19.57*/("""
            """),format.raw/*20.13*/("""Your first name is """),_display_(/*20.33*/localUser/*20.42*/.firstName),format.raw/*20.52*/(""" """),format.raw/*20.53*/("""and your last name is """),_display_(/*20.76*/localUser/*20.85*/.lastName),format.raw/*20.94*/("""
            """),format.raw/*21.13*/("""<br/>
        """)))}),format.raw/*22.10*/("""
    """),_display_(/*23.6*/defining(localUser.getProviders())/*23.40*/ { providers =>_display_(Seq[Any](format.raw/*23.55*/("""
        """),_display_(/*24.10*/if(providers.size() > 0)/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
        """),_display_(/*25.10*/if(providers.size() ==1)/*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
            """),_display_(/*26.14*/Messages("playauthenticate.profile.providers_one")),format.raw/*26.64*/("""
        """)))}/*27.11*/else/*27.16*/{_display_(Seq[Any](format.raw/*27.17*/("""
            """),_display_(/*28.14*/Messages("playauthenticate.profile.providers_many",providers.size().toString())),format.raw/*28.93*/("""
        """)))}),format.raw/*29.10*/("""
        """),_display_(/*30.10*/for(p <- providers) yield /*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
            """),_display_(/*31.14*/_providerIcon(p)),format.raw/*31.30*/("""
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""<br/>
        """)))}),format.raw/*34.10*/("""
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<br/>
    """),_display_(/*38.6*/currentAuth()/*38.19*/ { auth =>_display_(Seq[Any](format.raw/*38.29*/("""
        """),_display_(/*39.10*/Messages("playauthenticate.profile.logged")),format.raw/*39.53*/(""" """),_display_(/*39.55*/_providerIcon(auth.getProvider())),format.raw/*39.88*/("""<br/>
        """),_display_(/*40.10*/if(auth.expires() != -1)/*40.34*/{_display_(Seq[Any](format.raw/*40.35*/("""
            """),_display_(/*41.14*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires()))),format.raw/*41.117*/("""
        """)))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
            """),_display_(/*43.14*/Messages("playauthenticate.profile.session_endless", auth.getId())),format.raw/*43.80*/("""
        """)))}),format.raw/*44.10*/("""
    """)))}),format.raw/*45.6*/("""
    """),format.raw/*46.5*/("""<br/>
    <ul>
    	<li><a href=""""),_display_(/*48.20*/routes/*48.26*/.Account.changePassword),format.raw/*48.49*/("""">"""),_display_(/*48.52*/Messages("playauthenticate.profile.password_change")),format.raw/*48.104*/("""</a></li>
    </ul>
    </p>
""")))}),format.raw/*51.2*/("""
"""))}
  }

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/profile.scala.html
                  HASH: 84e2878270d323c3cbf9f5c09eb46d7b905ef63d
                  MATRIX: 730->1|892->32|920->79|947->81|1013->139|1052->141|1084->147|1115->152|1177->194|1235->226|1252->235|1277->240|1305->241|1358->268|1386->288|1425->290|1470->317|1483->322|1522->323|1555->330|1573->339|1600->345|1643->362|1700->410|1740->412|1775->420|1813->431|1828->437|1869->457|1929->500|1942->505|1981->506|2016->514|2063->531|2103->541|2135->546|2178->562|2232->607|2272->609|2313->622|2360->642|2378->651|2409->661|2438->662|2488->685|2506->694|2536->703|2577->716|2623->731|2655->737|2698->771|2751->786|2788->796|2821->820|2861->822|2898->832|2931->856|2971->858|3012->872|3083->922|3112->933|3125->938|3164->939|3205->953|3305->1032|3346->1042|3383->1052|3418->1071|3458->1073|3499->1087|3536->1103|3577->1113|3613->1122|3659->1137|3695->1143|3728->1149|3765->1160|3787->1173|3835->1183|3872->1193|3936->1236|3965->1238|4019->1271|4061->1286|4094->1310|4133->1311|4174->1325|4299->1428|4328->1439|4341->1444|4380->1445|4421->1459|4508->1525|4549->1535|4585->1541|4617->1546|4678->1580|4693->1586|4737->1609|4767->1612|4841->1664|4901->1694
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|37->10|37->10|37->10|39->12|39->12|39->12|40->13|40->13|40->13|40->13|41->14|41->14|41->14|42->15|43->16|44->17|45->18|46->19|46->19|46->19|47->20|47->20|47->20|47->20|47->20|47->20|47->20|47->20|48->21|49->22|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|54->27|54->27|54->27|55->28|55->28|56->29|57->30|57->30|57->30|58->31|58->31|59->32|60->33|61->34|62->35|64->37|65->38|65->38|65->38|66->39|66->39|66->39|66->39|67->40|67->40|67->40|68->41|68->41|69->42|69->42|69->42|70->43|70->43|71->44|72->45|73->46|75->48|75->48|75->48|75->48|75->48|78->51
                  -- GENERATED --
              */
          