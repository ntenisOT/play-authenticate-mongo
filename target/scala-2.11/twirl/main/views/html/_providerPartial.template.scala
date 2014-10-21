
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
object _providerPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(skipCurrent: Boolean = true):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script type="text/javascript">
function askOpenID(url) """),format.raw/*6.25*/("""{"""),format.raw/*6.26*/("""
	"""),format.raw/*7.2*/("""var openid = prompt("Please enter your OpenID:", "yourname.myopenid.com");
	if(openid) """),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""
		"""),format.raw/*9.3*/("""window.location.href = url + "?p=" + encodeURIComponent(openid);
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""</script>
<ul class="providers">
	"""),_display_(/*14.3*/forProviders(skipCurrent)/*14.28*/ { p =>_display_(Seq[Any](format.raw/*14.35*/("""
		"""),format.raw/*15.3*/("""<li>
		"""),_display_(/*16.4*/if(p.getKey() == "openid")/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			"""),format.raw/*17.4*/("""<a href="javascript:void(0);" onclick="askOpenID('"""),_display_(/*17.55*/p/*17.56*/.getUrl()),format.raw/*17.65*/("""');">
		""")))}/*18.5*/else/*18.10*/{_display_(Seq[Any](format.raw/*18.11*/("""
			"""),format.raw/*19.4*/("""<a href=""""),_display_(/*19.14*/p/*19.15*/.getUrl()),format.raw/*19.24*/("""">
		""")))}),format.raw/*20.4*/("""
		"""),_display_(/*21.4*/_providerIcon(p.getKey())),format.raw/*21.29*/("""</a>
		</li>
	""")))}),format.raw/*23.3*/("""
"""),format.raw/*24.1*/("""</ul>"""))}
  }

  def render(skipCurrent:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(skipCurrent)

  def f:((Boolean) => play.twirl.api.HtmlFormat.Appendable) = (skipCurrent) => apply(skipCurrent)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/_providerPartial.scala.html
                  HASH: 0dac5f27b8f71705efb36dce52110b6590472f4f
                  MATRIX: 735->1|895->30|923->77|950->78|1033->134|1061->135|1089->137|1203->224|1231->225|1260->228|1353->294|1381->295|1409->296|1437->297|1465->298|1526->333|1560->358|1605->365|1635->368|1669->376|1704->402|1744->404|1775->408|1853->459|1863->460|1893->469|1920->479|1933->484|1972->485|2003->489|2040->499|2050->500|2080->509|2116->515|2146->519|2192->544|2237->559|2265->560
                  LINES: 26->1|29->1|31->4|32->5|33->6|33->6|34->7|35->8|35->8|36->9|37->10|37->10|38->11|38->11|39->12|41->14|41->14|41->14|42->15|43->16|43->16|43->16|44->17|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|46->19|47->20|48->21|48->21|50->23|51->24
                  -- GENERATED --
              */
          