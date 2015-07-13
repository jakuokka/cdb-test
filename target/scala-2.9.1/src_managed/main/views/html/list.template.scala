
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[scala.Tuple2[Cat, Option[Race]]],Int,String,play.api.mvc.Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[(Cat, Option[Race])], currentOrderBy: Int, currentFilter: String)(implicit flash: play.api.mvc.Flash):play.api.templates.Html = {
        _display_ {
def /*16.2*/header/*16.8*/(orderBy: Int, title: String):play.api.templates.Html = {_display_(

Seq(format.raw/*16.41*/("""
    <th class="col"""),_display_(Seq(/*17.20*/orderBy)),format.raw/*17.27*/(""" header """),_display_(Seq(/*17.36*/if(scala.math.abs(currentOrderBy) == orderBy){/*17.83*/{if(currentOrderBy < 0) "headerSortDown" else "headerSortUp"}})),format.raw/*17.144*/("""">
        <a href=""""),_display_(Seq(/*18.19*/link(0, Some(orderBy)))),format.raw/*18.41*/("""">"""),_display_(Seq(/*18.44*/title)),format.raw/*18.49*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.Application.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
    
}};
Seq(format.raw/*1.122*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*15.37*/("""
"""),format.raw/*20.2*/("""

"""),_display_(Seq(/*22.2*/main/*22.6*/ {_display_(Seq(format.raw/*22.8*/("""
    
    <h1>"""),_display_(Seq(/*24.10*/Messages("cats.list.title", currentPage.total))),format.raw/*24.56*/("""</h1>

    """),_display_(Seq(/*26.6*/flash/*26.11*/.get("success").map/*26.30*/ { message =>_display_(Seq(format.raw/*26.43*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*28.37*/message)),format.raw/*28.44*/("""
        </div>
    """)))})),format.raw/*30.6*/("""

    <div id="actions">
        
        """),_display_(Seq(/*34.10*/helper/*34.16*/.form(action=routes.Application.list())/*34.55*/ {_display_(Seq(format.raw/*34.57*/("""
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*35.66*/currentFilter)),format.raw/*35.79*/("""" placeholder="Filter by cat's name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">

        """)))})),format.raw/*38.10*/("""
        
        <a class="btn success" id="add" href=""""),_display_(Seq(/*40.48*/routes/*40.54*/.Application.create())),format.raw/*40.75*/("""">Add a new cat</a>
        
    </div>
    
    """),_display_(Seq(/*44.6*/Option(currentPage.items)/*44.31*/.filterNot(_.isEmpty).map/*44.56*/ { cats =>_display_(Seq(format.raw/*44.66*/("""
        
        <table class="cats zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*49.22*/header(2, "Cat's name"))),format.raw/*49.45*/("""
                    """),_display_(Seq(/*50.22*/header(3, "Gender"))),format.raw/*50.41*/("""
		    """),_display_(Seq(/*51.8*/header(4, "Color"))),format.raw/*51.26*/("""
                    """),_display_(Seq(/*52.22*/header(5, "Birthdate"))),format.raw/*52.44*/("""
                    """),_display_(Seq(/*53.22*/header(6, "Breed"))),format.raw/*53.40*/("""
		    """),_display_(Seq(/*54.8*/header(7, "Picture"))),format.raw/*54.28*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*59.18*/cats/*59.22*/.map/*59.26*/ {/*60.21*/case (cat, race) =>/*60.40*/ {_display_(Seq(format.raw/*60.42*/("""
                        <tr>
                          <td><a href=""""),_display_(Seq(/*62.41*/routes/*62.47*/.Application.edit(cat.id.get))),format.raw/*62.76*/("""">"""),_display_(Seq(/*62.79*/cat/*62.82*/.name)),format.raw/*62.87*/("""</a></td>
                            <td>
			        <a href=""""),_display_(Seq(/*64.22*/routes/*64.28*/.Application.edit(cat.id.get))),format.raw/*64.57*/("""">"""),_display_(Seq(/*64.60*/cat/*64.63*/.gender)),format.raw/*64.70*/("""</a>
                            </td>
			     <td>
			        <a href=""""),_display_(Seq(/*67.22*/routes/*67.28*/.Application.edit(cat.id.get))),format.raw/*67.57*/("""">"""),_display_(Seq(/*67.60*/cat/*67.63*/.color)),format.raw/*67.69*/("""</a>
                            </td>
                            <td>
                                """),_display_(Seq(/*70.34*/cat/*70.37*/.birth.map(_.format("dd MMM yyyy")).getOrElse/*70.82*/ {_display_(Seq(format.raw/*70.84*/(""" <em>-</em> """)))})),format.raw/*70.97*/("""
                            </td>
                            <td>
                              """),_display_(Seq(/*73.32*/race/*73.36*/.map(_.name).getOrElse/*73.58*/ {_display_(Seq(format.raw/*73.60*/(""" <em>-</em> """)))})),format.raw/*73.73*/("""
                            </td>
			    <td>
			      <img src=""""),_display_(Seq(/*76.21*/routes/*76.27*/.Assets.at("public/images/genericcat.jpg"))),format.raw/*76.69*/("""" width="28" height="22" />
			</td>
                        </tr>
                    """)))}})),format.raw/*80.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*87.18*/currentPage/*87.29*/.prev.map/*87.38*/ { page =>_display_(Seq(format.raw/*87.48*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*89.35*/link(page))),format.raw/*89.45*/("""">&larr; Previous</a>
                    </li> 
                """)))}/*91.18*/.getOrElse/*91.28*/ {_display_(Seq(format.raw/*91.30*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*95.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*97.36*/(currentPage.offset + 1))),format.raw/*97.60*/(""" to """),_display_(Seq(/*97.65*/(currentPage.offset + cats.size))),format.raw/*97.97*/(""" of """),_display_(Seq(/*97.102*/currentPage/*97.113*/.total)),format.raw/*97.119*/("""</a>
                </li>
                """),_display_(Seq(/*99.18*/currentPage/*99.29*/.next.map/*99.38*/ { page =>_display_(Seq(format.raw/*99.48*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*101.35*/link(page))),format.raw/*101.45*/("""">Next &rarr;</a>
                    </li> 
                """)))}/*103.18*/.getOrElse/*103.28*/ {_display_(Seq(format.raw/*103.30*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*107.18*/("""
            </ul>
        </div>
        
    """)))}/*111.6*/.getOrElse/*111.16*/ {_display_(Seq(format.raw/*111.18*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))})),format.raw/*117.6*/("""

        
""")))})),format.raw/*120.2*/("""

            
"""))}
    }
    
    def render(currentPage:Page[scala.Tuple2[Cat, Option[Race]]],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash) = apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def f:((Page[scala.Tuple2[Cat, Option[Race]]],Int,String) => (play.api.mvc.Flash) => play.api.templates.Html) = (currentPage,currentOrderBy,currentFilter) => (flash) => apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 13 16:10:42 EEST 2015
                    SOURCE: /home/jakuokka/java/play-2.0/test/app/views/list.scala.html
                    HASH: e72ce500de0d173e4f953c47b5203d1d1551b8e8
                    MATRIX: 565->1|746->620|760->626|852->659|903->679|932->686|972->695|1027->742|1112->803|1164->824|1208->846|1242->849|1269->854|1307->250|1318->254|1598->121|1627->248|1655->508|1685->618|1713->870|1746->873|1758->877|1792->879|1838->894|1906->940|1948->952|1962->957|1990->976|2036->989|2148->1070|2177->1077|2229->1098|2303->1141|2318->1147|2366->1186|2401->1188|2498->1254|2533->1267|2711->1413|2799->1470|2814->1476|2857->1497|2937->1547|2971->1572|3005->1597|3048->1607|3194->1722|3239->1745|3292->1767|3333->1786|3371->1794|3411->1812|3464->1834|3508->1856|3561->1878|3601->1896|3639->1904|3681->1924|3794->2006|3807->2010|3820->2014|3831->2038|3859->2057|3894->2059|3995->2129|4010->2135|4061->2164|4095->2167|4107->2170|4134->2175|4229->2239|4244->2245|4295->2274|4329->2277|4341->2280|4370->2287|4474->2360|4489->2366|4540->2395|4574->2398|4586->2401|4614->2407|4750->2512|4762->2515|4816->2560|4851->2562|4896->2575|5026->2674|5039->2678|5070->2700|5105->2702|5150->2715|5248->2782|5263->2788|5327->2830|5448->2936|5603->3060|5623->3071|5641->3080|5684->3090|5788->3163|5820->3173|5905->3239|5924->3249|5959->3251|6129->3389|6233->3462|6279->3486|6315->3491|6369->3523|6406->3528|6427->3539|6456->3545|6531->3589|6551->3600|6569->3609|6612->3619|6717->3692|6750->3702|6832->3764|6852->3774|6888->3776|7055->3910|7122->3958|7142->3968|7178->3970|7316->4076|7360->4088
                    LINES: 19->1|21->16|21->16|23->16|24->17|24->17|24->17|24->17|24->17|25->18|25->18|25->18|25->18|27->6|27->6|33->1|35->5|36->11|38->15|39->20|41->22|41->22|41->22|43->24|43->24|45->26|45->26|45->26|45->26|47->28|47->28|49->30|53->34|53->34|53->34|53->34|54->35|54->35|57->38|59->40|59->40|59->40|63->44|63->44|63->44|63->44|68->49|68->49|69->50|69->50|70->51|70->51|71->52|71->52|72->53|72->53|73->54|73->54|78->59|78->59|78->59|78->60|78->60|78->60|80->62|80->62|80->62|80->62|80->62|80->62|82->64|82->64|82->64|82->64|82->64|82->64|85->67|85->67|85->67|85->67|85->67|85->67|88->70|88->70|88->70|88->70|88->70|91->73|91->73|91->73|91->73|91->73|94->76|94->76|94->76|97->80|104->87|104->87|104->87|104->87|106->89|106->89|108->91|108->91|108->91|112->95|114->97|114->97|114->97|114->97|114->97|114->97|114->97|116->99|116->99|116->99|116->99|118->101|118->101|120->103|120->103|120->103|124->107|128->111|128->111|128->111|134->117|137->120
                    -- GENERATED --
                */
            