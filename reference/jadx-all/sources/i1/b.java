package i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.ExtractedText;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import b3.v0;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.ride.accepter.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import m0.m3;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u1.s1;
import u1.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f7729a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f7730b = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};

    public static float A(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e3.c.c(edgeEffect, f10, f11);
        }
        e3.b.a(edgeEffect, f10, f11);
        return f10;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x039e  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:120:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x03be  */
    /* JADX WARN: Code duplicated, block: B:127:0x0402  */
    /* JADX WARN: Code duplicated, block: B:128:0x0407  */
    /* JADX WARN: Code duplicated, block: B:131:0x0422  */
    /* JADX WARN: Code duplicated, block: B:132:0x0425  */
    /* JADX WARN: Code duplicated, block: B:46:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x028f  */
    public static final h1.c B(int i10, m0.m mVar) throws XmlPullParserException, IOException {
        h1.c aVar;
        boolean z10;
        boolean z11;
        long jB;
        int i11;
        XmlResourceParser xmlResourceParser;
        int i12;
        x1.c cVar;
        x1.b bVar;
        e eVar;
        j1.a aVar2;
        char c10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(473971343);
        m3 m3Var = y0.f15377b;
        Context context = (Context) qVar.m(m3Var);
        qVar.m(y0.f15376a);
        Resources resources = ((Context) qVar.m(m3Var)).getResources();
        qVar.Z(-492369756);
        Object objP = qVar.P();
        k0.y0 y0Var = m0.l.f11578a;
        if (objP == y0Var) {
            objP = new TypedValue();
            qVar.l0(objP);
        }
        qVar.t(false);
        TypedValue typedValue = (TypedValue) objP;
        int i20 = 1;
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !l9.i.I0(charSequence, ".xml")) {
            qVar.Z(-738265172);
            Integer numValueOf = Integer.valueOf(i10);
            Resources.Theme theme = context.getTheme();
            qVar.Z(1618982084);
            boolean zG = qVar.g(theme) | qVar.g(numValueOf) | qVar.g(charSequence);
            Object objP2 = qVar.P();
            if (zG || objP2 == y0Var) {
                try {
                    Drawable drawable = resources.getDrawable(i10, null);
                    d7.a.k(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objP2 = new e1.f(((BitmapDrawable) drawable).getBitmap());
                    qVar.l0(objP2);
                } catch (Exception e4) {
                    throw new androidx.fragment.app.a0("Error attempting to load resource: " + ((Object) charSequence), e4);
                }
            }
            qVar.t(false);
            e1.y yVar = (e1.y) objP2;
            e1.f fVar = (e1.f) yVar;
            aVar = new h1.a(yVar, m2.i.f11807b, o1.s.e(fVar.f5003a.getWidth(), fVar.f5003a.getHeight()));
            z10 = false;
            qVar.t(false);
        } else {
            qVar.Z(-738265327);
            Resources.Theme theme2 = context.getTheme();
            int i21 = typedValue.changingConfigurations;
            qVar.Z(21855625);
            x1.c cVar2 = (x1.c) qVar.m(y0.f15378c);
            x1.b bVar2 = new x1.b(i10, theme2);
            WeakReference weakReference = (WeakReference) cVar2.f16290a.get(bVar2);
            x1.a aVar3 = weakReference != null ? (x1.a) weakReference.get() : null;
            if (aVar3 == null) {
                XmlResourceParser xml = resources.getXml(i10);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!d7.a.d(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                j1.a aVar4 = new j1.a(xml);
                TypedArray typedArrayZ = o1.s.Z(resources, theme2, attributeSetAsAttributeSet, j1.b.f8330a);
                aVar4.b(typedArrayZ.getChangingConfigurations());
                boolean z12 = !o1.s.S(xml, "autoMirrored") ? false : typedArrayZ.getBoolean(5, false);
                aVar4.b(typedArrayZ.getChangingConfigurations());
                float fA = aVar4.a(typedArrayZ, "viewportWidth", 7, 0.0f);
                float fA2 = aVar4.a(typedArrayZ, "viewportHeight", 8, 0.0f);
                if (fA <= 0.0f) {
                    throw new XmlPullParserException(typedArrayZ.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                }
                if (fA2 <= 0.0f) {
                    throw new XmlPullParserException(typedArrayZ.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                }
                float dimension = typedArrayZ.getDimension(3, 0.0f);
                aVar4.b(typedArrayZ.getChangingConfigurations());
                float dimension2 = typedArrayZ.getDimension(2, 0.0f);
                aVar4.b(typedArrayZ.getChangingConfigurations());
                if (typedArrayZ.hasValue(1)) {
                    TypedValue typedValue2 = new TypedValue();
                    typedArrayZ.getValue(1, typedValue2);
                    if (typedValue2.type == 2) {
                        jB = e1.r.f5065g;
                    } else {
                        ColorStateList colorStateListH = o1.s.H(typedArrayZ, xml, theme2);
                        aVar4.b(typedArrayZ.getChangingConfigurations());
                        jB = colorStateListH != null ? androidx.compose.ui.graphics.a.b(colorStateListH.getDefaultColor()) : e1.r.f5065g;
                    }
                } else {
                    jB = e1.r.f5065g;
                }
                int i22 = typedArrayZ.getInt(6, -1);
                aVar4.b(typedArrayZ.getChangingConfigurations());
                if (i22 == -1) {
                    i11 = 5;
                } else if (i22 == 3) {
                    i11 = 3;
                } else if (i22 == 5) {
                    i11 = 5;
                } else if (i22 != 9) {
                    switch (i22) {
                        case Code.UNAVAILABLE /* 14 */:
                            i11 = 13;
                            break;
                        case 15:
                            i11 = 14;
                            break;
                        case Code.UNAUTHENTICATED /* 16 */:
                            i11 = 12;
                            break;
                        default:
                            i11 = 5;
                            break;
                    }
                } else {
                    i11 = 9;
                }
                float f10 = dimension / resources.getDisplayMetrics().density;
                float f11 = dimension2 / resources.getDisplayMetrics().density;
                typedArrayZ.recycle();
                e eVar2 = new e(null, f10, f11, fA, fA2, jB, i11, z12, 1);
                int i23 = 0;
                for (int i24 = 3; xml.getEventType() != i20 && (xml.getDepth() >= i20 || xml.getEventType() != i24); i24 = 3) {
                    XmlPullParser xmlPullParser = aVar4.f8328a;
                    int eventType = xmlPullParser.getEventType();
                    ArrayList arrayList = eVar2.f7772i;
                    m0.q qVar2 = qVar;
                    if (eventType == 2) {
                        xmlResourceParser = xml;
                        i12 = i21;
                        cVar = cVar2;
                        bVar = bVar2;
                        j1.a aVar5 = aVar4;
                        eVar = eVar2;
                        String name = xmlPullParser.getName();
                        if (name == null) {
                            aVar2 = aVar5;
                        } else {
                            int iHashCode = name.hashCode();
                            if (iHashCode == -1649314686) {
                                aVar2 = aVar5;
                                c10 = '\t';
                                if (name.equals("clip-path")) {
                                    TypedArray typedArrayZ2 = o1.s.Z(resources, theme2, attributeSetAsAttributeSet, j1.b.f8333d);
                                    aVar2.b(typedArrayZ2.getChangingConfigurations());
                                    String string = typedArrayZ2.getString(0);
                                    aVar2.b(typedArrayZ2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    i13 = 1;
                                    String string2 = typedArrayZ2.getString(1);
                                    aVar2.b(typedArrayZ2.getChangingConfigurations());
                                    List listA = h0.a(string2);
                                    typedArrayZ2.recycle();
                                    eVar.c();
                                    arrayList.add(new d(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, listA, 512));
                                    i23++;
                                }
                            } else if (iHashCode == 3433509) {
                                aVar2 = aVar5;
                                if (name.equals("path")) {
                                    TypedArray typedArrayZ3 = o1.s.Z(resources, theme2, attributeSetAsAttributeSet, j1.b.f8332c);
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    if (!o1.s.S(xmlPullParser, "pathData")) {
                                        throw new IllegalArgumentException("No path data available");
                                    }
                                    String string3 = typedArrayZ3.getString(0);
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    String str2 = string3 == null ? "" : string3;
                                    String string4 = typedArrayZ3.getString(2);
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    List listA2 = h0.a(string4);
                                    h0.i iVarI = o1.s.I(typedArrayZ3, xmlPullParser, theme2, "fillColor", 1);
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    float fA3 = aVar2.a(typedArrayZ3, "fillAlpha", 12, 1.0f);
                                    int i25 = !o1.s.S(xmlPullParser, "strokeLineCap") ? -1 : typedArrayZ3.getInt(8, -1);
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    if (i25 != 0) {
                                        if (i25 != 1) {
                                            i14 = 2;
                                            if (i25 == 2) {
                                                i15 = 2;
                                            }
                                        } else {
                                            i14 = 2;
                                            i15 = 1;
                                        }
                                        if (o1.s.S(xmlPullParser, "strokeLineJoin")) {
                                            c10 = '\t';
                                            i16 = typedArrayZ3.getInt(9, -1);
                                        } else {
                                            i16 = -1;
                                            c10 = '\t';
                                        }
                                        aVar2.b(typedArrayZ3.getChangingConfigurations());
                                        if (i16 != 0) {
                                            i17 = 0;
                                        } else if (i16 != 1) {
                                            i17 = i14;
                                        } else {
                                            i17 = 1;
                                        }
                                        float fA4 = aVar2.a(typedArrayZ3, "strokeMiterLimit", 10, 1.0f);
                                        h0.i iVarI2 = o1.s.I(typedArrayZ3, xmlPullParser, theme2, "strokeColor", 3);
                                        aVar2.b(typedArrayZ3.getChangingConfigurations());
                                        float fA5 = aVar2.a(typedArrayZ3, "strokeAlpha", 11, 1.0f);
                                        float fA6 = aVar2.a(typedArrayZ3, "strokeWidth", 4, 1.0f);
                                        float fA7 = aVar2.a(typedArrayZ3, "trimPathEnd", 6, 1.0f);
                                        float fA8 = aVar2.a(typedArrayZ3, "trimPathOffset", 7, 0.0f);
                                        float fA9 = aVar2.a(typedArrayZ3, "trimPathStart", 5, 0.0f);
                                        if (o1.s.S(xmlPullParser, "fillType")) {
                                            i18 = typedArrayZ3.getInt(13, 0);
                                        } else {
                                            i18 = 0;
                                        }
                                        aVar2.b(typedArrayZ3.getChangingConfigurations());
                                        typedArrayZ3.recycle();
                                        e1.n nVarA = j1.b.a(iVarI);
                                        e1.n nVarA2 = j1.b.a(iVarI2);
                                        if (i18 == 0) {
                                            i19 = 0;
                                        } else {
                                            i19 = 1;
                                        }
                                        eVar.c();
                                        ((d) arrayList.get(arrayList.size() - 1)).f7761j.add(new k0(str2, listA2, i19, nVarA, fA3, nVarA2, fA5, fA6, i15, i17, fA4, fA9, fA7, fA8));
                                    } else {
                                        i14 = 2;
                                    }
                                    i15 = 0;
                                    if (o1.s.S(xmlPullParser, "strokeLineJoin")) {
                                        i16 = -1;
                                        c10 = '\t';
                                    } else {
                                        c10 = '\t';
                                        i16 = typedArrayZ3.getInt(9, -1);
                                    }
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    if (i16 != 0) {
                                        i17 = 0;
                                    } else if (i16 != 1) {
                                        i17 = i14;
                                    } else {
                                        i17 = 1;
                                    }
                                    float fA10 = aVar2.a(typedArrayZ3, "strokeMiterLimit", 10, 1.0f);
                                    h0.i iVarI3 = o1.s.I(typedArrayZ3, xmlPullParser, theme2, "strokeColor", 3);
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    float fA11 = aVar2.a(typedArrayZ3, "strokeAlpha", 11, 1.0f);
                                    float fA12 = aVar2.a(typedArrayZ3, "strokeWidth", 4, 1.0f);
                                    float fA13 = aVar2.a(typedArrayZ3, "trimPathEnd", 6, 1.0f);
                                    float fA14 = aVar2.a(typedArrayZ3, "trimPathOffset", 7, 0.0f);
                                    float fA15 = aVar2.a(typedArrayZ3, "trimPathStart", 5, 0.0f);
                                    if (o1.s.S(xmlPullParser, "fillType")) {
                                        i18 = 0;
                                    } else {
                                        i18 = typedArrayZ3.getInt(13, 0);
                                    }
                                    aVar2.b(typedArrayZ3.getChangingConfigurations());
                                    typedArrayZ3.recycle();
                                    e1.n nVarA3 = j1.b.a(iVarI);
                                    e1.n nVarA4 = j1.b.a(iVarI3);
                                    if (i18 == 0) {
                                        i19 = 0;
                                    } else {
                                        i19 = 1;
                                    }
                                    eVar.c();
                                    ((d) arrayList.get(arrayList.size() - 1)).f7761j.add(new k0(str2, listA2, i19, nVarA3, fA3, nVarA4, fA11, fA12, i15, i17, fA10, fA15, fA13, fA14));
                                }
                            } else if (iHashCode == 98629247 && name.equals("group")) {
                                TypedArray typedArrayZ4 = o1.s.Z(resources, theme2, attributeSetAsAttributeSet, j1.b.f8331b);
                                aVar2 = aVar5;
                                aVar2.b(typedArrayZ4.getChangingConfigurations());
                                float fA16 = aVar2.a(typedArrayZ4, "rotation", 5, 0.0f);
                                float f12 = typedArrayZ4.getFloat(1, 0.0f);
                                aVar2.b(typedArrayZ4.getChangingConfigurations());
                                float f13 = typedArrayZ4.getFloat(2, 0.0f);
                                aVar2.b(typedArrayZ4.getChangingConfigurations());
                                float fA17 = aVar2.a(typedArrayZ4, "scaleX", 3, 1.0f);
                                float fA18 = aVar2.a(typedArrayZ4, "scaleY", 4, 1.0f);
                                float fA19 = aVar2.a(typedArrayZ4, "translateX", 6, 0.0f);
                                float fA20 = aVar2.a(typedArrayZ4, "translateY", 7, 0.0f);
                                String string5 = typedArrayZ4.getString(0);
                                aVar2.b(typedArrayZ4.getChangingConfigurations());
                                String str3 = string5 == null ? "" : string5;
                                typedArrayZ4.recycle();
                                int i26 = h0.f7832a;
                                r8.r rVar = r8.r.f13661a;
                                eVar.c();
                                arrayList.add(new d(str3, fA16, f12, f13, fA17, fA18, fA19, fA20, rVar, 512));
                            } else {
                                aVar2 = aVar5;
                            }
                            i13 = 1;
                        }
                        xmlResourceParser.next();
                        aVar4 = aVar2;
                        i20 = i13;
                        qVar = qVar2;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        i21 = i12;
                        xml = xmlResourceParser;
                        eVar2 = eVar;
                    } else if (eventType != i24) {
                        xmlResourceParser = xml;
                        i12 = i21;
                        cVar = cVar2;
                        bVar = bVar2;
                        aVar2 = aVar4;
                        eVar = eVar2;
                    } else {
                        if (d7.a.d("group", xmlPullParser.getName())) {
                            int i27 = i23 + 1;
                            int i28 = 0;
                            while (i28 < i27) {
                                eVar2.c();
                                d dVar = (d) arrayList.remove(arrayList.size() - 1);
                                ((d) a7.a.k(arrayList, 1)).f7761j.add(new g0(dVar.f7752a, dVar.f7753b, dVar.f7754c, dVar.f7755d, dVar.f7756e, dVar.f7757f, dVar.f7758g, dVar.f7759h, dVar.f7760i, dVar.f7761j));
                                i28++;
                                i27 = i27;
                                bVar2 = bVar2;
                                cVar2 = cVar2;
                                i21 = i21;
                                xml = xml;
                                arrayList = arrayList;
                                eVar2 = eVar2;
                                aVar4 = aVar4;
                            }
                            xmlResourceParser = xml;
                            i12 = i21;
                            cVar = cVar2;
                            bVar = bVar2;
                            eVar = eVar2;
                            aVar2 = aVar4;
                            i13 = 1;
                            i23 = 0;
                        } else {
                            xmlResourceParser = xml;
                            i12 = i21;
                            cVar = cVar2;
                            bVar = bVar2;
                            eVar = eVar2;
                            aVar2 = aVar4;
                        }
                        c10 = '\t';
                        xmlResourceParser.next();
                        aVar4 = aVar2;
                        i20 = i13;
                        qVar = qVar2;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        i21 = i12;
                        xml = xmlResourceParser;
                        eVar2 = eVar;
                    }
                    i13 = 1;
                    c10 = '\t';
                    xmlResourceParser.next();
                    aVar4 = aVar2;
                    i20 = i13;
                    qVar = qVar2;
                    bVar2 = bVar;
                    cVar2 = cVar;
                    i21 = i12;
                    xml = xmlResourceParser;
                    eVar2 = eVar;
                }
                m0.q qVar3 = qVar;
                x1.c cVar3 = cVar2;
                x1.b bVar3 = bVar2;
                aVar3 = new x1.a(eVar2.b(), i21);
                cVar3.f16290a.put(bVar3, new WeakReference(aVar3));
                qVar = qVar3;
                z11 = false;
            } else {
                z11 = false;
            }
            qVar.t(z11);
            aVar = E(aVar3.f16286a, qVar);
            qVar.t(z11);
            z10 = false;
        }
        qVar.t(z10);
        return aVar;
    }

    public static t2.e C(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p2.a.f12759b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, ServiceStarter.ERROR_UNKNOWN);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    J(xmlResourceParser);
                }
                return new t2.h(new l.p(string, string2, string3, D(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p2.a.f12760c);
                        int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i11 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                        int i13 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i13);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            J(xmlResourceParser);
                        }
                        arrayList.add(new t2.g(i10, i12, resourceId2, string6, string5, z10));
                    } else {
                        J(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new t2.f((t2.g[]) arrayList.toArray(new t2.g[0]));
            }
        } else {
            J(xmlResourceParser);
        }
        return null;
    }

    public static List D(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (t2.d.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final j0 E(f fVar, m0.m mVar) {
        e1.l lVar;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1413834416);
        m2.b bVar = (m2.b) qVar.m(s1.f15275e);
        Integer numValueOf = Integer.valueOf(fVar.f7798j);
        qVar.Z(511388516);
        boolean zG = qVar.g(numValueOf) | qVar.g(bVar);
        Object objP = qVar.P();
        if (zG || objP == m0.l.f11578a) {
            c cVar = new c();
            m(cVar, fVar.f7794f);
            long j10 = d7.t.j(bVar.v(fVar.f7790b), bVar.v(fVar.f7791c));
            float fD = fVar.f7792d;
            if (Float.isNaN(fD)) {
                fD = d1.f.d(j10);
            }
            float fB = fVar.f7793e;
            if (Float.isNaN(fB)) {
                fB = d1.f.b(j10);
            }
            long j11 = d7.t.j(fD, fB);
            j0 j0Var = new j0(cVar);
            long j12 = e1.r.f5065g;
            long j13 = fVar.f7795g;
            if (j13 != j12) {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = fVar.f7796h;
                lVar = new e1.l(j13, i11, i10 >= 29 ? e1.m.f5045a.a(j13, i11) : new PorterDuffColorFilter(androidx.compose.ui.graphics.a.s(j13), androidx.compose.ui.graphics.a.u(i11)));
            } else {
                lVar = null;
            }
            j0Var.f7841f.setValue(new d1.f(j10));
            j0Var.f7842n.setValue(Boolean.valueOf(fVar.f7797i));
            e0 e0Var = j0Var.f7843o;
            e0Var.f7780g.setValue(lVar);
            e0Var.f7782i.setValue(new d1.f(j11));
            e0Var.f7776c = fVar.f7789a;
            qVar.l0(j0Var);
            objP = j0Var;
        }
        qVar.t(false);
        j0 j0Var2 = (j0) objP;
        qVar.t(false);
        return j0Var2;
    }

    public static final void F(View view, g1 g1Var) {
        d7.a.m(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, g1Var);
    }

    public static void G(TextView textView, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            e3.q.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = e3.m.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void H(TextView textView, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = e3.m.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static final String I(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        d7.a.l(str, "format(format, *args)");
        sb.append(str);
        return sb.toString();
    }

    public static void J(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [r8.r] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public static final SpannableString K(a2.e eVar, m2.b bVar, i2.l lVar) {
        ?? arrayList;
        String str = eVar.f918a;
        SpannableString spannableString = new SpannableString(str);
        List list = eVar.f919b;
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                a2.d dVar = (a2.d) list.get(i10);
                a2.x xVar = (a2.x) dVar.f914a;
                int i11 = dVar.f915b;
                int i12 = dVar.f916c;
                long jD = xVar.f1031a.d();
                long j10 = xVar.f1032b;
                l2.o cVar = xVar.f1031a;
                List list2 = list;
                if (!e1.r.c(jD, cVar.d())) {
                    cVar = jD != e1.r.f5065g ? new l2.c(jD) : l2.m.f11216a;
                }
                o1.s.j0(spannableString, cVar.d(), i11, i12);
                o1.s.l0(spannableString, j10, bVar, i11, i12);
                f2.l lVar2 = xVar.f1033c;
                f2.j jVar = xVar.f1034d;
                if (lVar2 != null || jVar != null) {
                    if (lVar2 == null) {
                        lVar2 = f2.l.f6115c;
                    }
                    spannableString.setSpan(new StyleSpan(o1.s.B(lVar2, jVar != null ? jVar.f6112a : 0)), i11, i12, 33);
                }
                l2.j jVar2 = xVar.f1043m;
                if (jVar2 != null) {
                    int i13 = jVar2.f11214a;
                    if ((i13 | 1) == i13) {
                        spannableString.setSpan(new UnderlineSpan(), i11, i12, 33);
                    }
                    if ((i13 | 2) == i13) {
                        spannableString.setSpan(new StrikethroughSpan(), i11, i12, 33);
                    }
                }
                l2.p pVar = xVar.f1040j;
                if (pVar != null) {
                    spannableString.setSpan(new ScaleXSpan(pVar.f11220a), i11, i12, 33);
                }
                h2.d dVar2 = xVar.f1041k;
                if (dVar2 != null) {
                    spannableString.setSpan(j2.a.f8334a.a(dVar2), i11, i12, 33);
                }
                long j11 = e1.r.f5065g;
                long j12 = xVar.f1042l;
                if (j12 != j11) {
                    spannableString.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a.s(j12)), i11, i12, 33);
                }
                i10++;
                list = list2;
            }
        }
        int length = str.length();
        ?? arrayList2 = r8.r.f13661a;
        List list3 = eVar.f921d;
        if (list3 != null) {
            arrayList = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj = list3.get(i14);
                a2.d dVar3 = (a2.d) obj;
                if ((dVar3.f914a instanceof a2.d0) && a2.f.c(0, length, dVar3.f915b, dVar3.f916c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = arrayList2;
        }
        int size3 = arrayList.size();
        for (int i15 = 0; i15 < size3; i15++) {
            a2.d dVar4 = (a2.d) arrayList.get(i15);
            a2.d0 d0Var = (a2.d0) dVar4.f914a;
            if (!(d0Var instanceof a2.f0)) {
                throw new androidx.fragment.app.a0();
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(((a2.f0) d0Var).f924a).build(), dVar4.f915b, dVar4.f916c, 33);
        }
        int length2 = str.length();
        if (list3 != null) {
            arrayList2 = new ArrayList(list3.size());
            int size4 = list3.size();
            for (int i16 = 0; i16 < size4; i16++) {
                Object obj2 = list3.get(i16);
                a2.d dVar5 = (a2.d) obj2;
                if ((dVar5.f914a instanceof a2.e0) && a2.f.c(0, length2, dVar5.f915b, dVar5.f916c)) {
                    arrayList2.add(obj2);
                }
            }
        }
        int size5 = arrayList2.size();
        for (int i17 = 0; i17 < size5; i17++) {
            a2.d dVar6 = (a2.d) arrayList2.get(i17);
            a2.e0 e0Var = (a2.e0) dVar6.f914a;
            WeakHashMap weakHashMap = lVar.f7939a;
            Object uRLSpan = weakHashMap.get(e0Var);
            if (uRLSpan == null) {
                uRLSpan = new URLSpan(e0Var.f922a);
                weakHashMap.put(e0Var, uRLSpan);
            }
            spannableString.setSpan((URLSpan) uRLSpan, dVar6.f915b, dVar6.f916c, 33);
        }
        return spannableString;
    }

    public static final ExtractedText L(g2.a0 a0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = a0Var.f6509a.f918a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = a0Var.f6510b;
        extractedText.selectionStart = a2.b0.e(j10);
        extractedText.selectionEnd = a2.b0.d(j10);
        extractedText.flags = !l9.i.G0(a0Var.f6509a.f918a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void M(List list, e1.d0 d0Var) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        List list2 = list;
        e1.i iVar = (e1.i) d0Var;
        int i10 = iVar.f5014a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        Path path = iVar.f5014a;
        path.rewind();
        iVar.c(i10);
        b0 b0Var = list.isEmpty() ? j.f7840c : (b0) list2.get(0);
        int size = list.size();
        int i11 = 0;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        while (i11 < size) {
            b0 b0Var2 = (b0) list2.get(i11);
            boolean z11 = b0Var2 instanceof j;
            Path path2 = iVar.f5014a;
            if (z11) {
                path2.close();
                path.moveTo(f26, f25);
                f22 = f25;
                f24 = f22;
                f21 = f26;
                f23 = f21;
            } else if (b0Var2 instanceof v) {
                v vVar = (v) b0Var2;
                float f27 = vVar.f7899c;
                f21 += f27;
                float f28 = vVar.f7900d;
                f22 += f28;
                path2.rMoveTo(f27, f28);
                f26 = f21;
                f25 = f22;
            } else if (b0Var2 instanceof n) {
                n nVar = (n) b0Var2;
                f21 = nVar.f7871c;
                float f29 = nVar.f7872d;
                path2.moveTo(f21, f29);
                f22 = f29;
                f25 = f22;
                f26 = f21;
            } else if (b0Var2 instanceof u) {
                u uVar = (u) b0Var2;
                float f30 = uVar.f7897c;
                float f31 = uVar.f7898d;
                path2.rLineTo(f30, f31);
                f21 += uVar.f7897c;
                f22 += f31;
            } else {
                if (b0Var2 instanceof m) {
                    m mVar = (m) b0Var2;
                    float f32 = mVar.f7869c;
                    f22 = mVar.f7870d;
                    path2.lineTo(f32, f22);
                    f20 = mVar.f7869c;
                } else {
                    if (b0Var2 instanceof t) {
                        t tVar = (t) b0Var2;
                        path2.rLineTo(tVar.f7896c, 0.0f);
                        f21 += tVar.f7896c;
                    } else if (b0Var2 instanceof l) {
                        l lVar = (l) b0Var2;
                        path2.lineTo(lVar.f7868c, f22);
                        f20 = lVar.f7868c;
                    } else {
                        if (b0Var2 instanceof z) {
                            z zVar = (z) b0Var2;
                            z10 = false;
                            path2.rLineTo(0.0f, zVar.f7911c);
                            f22 += zVar.f7911c;
                        } else {
                            z10 = false;
                            if (b0Var2 instanceof a0) {
                                a0 a0Var = (a0) b0Var2;
                                path2.lineTo(f21, a0Var.f7728c);
                                f22 = a0Var.f7728c;
                            } else {
                                if (b0Var2 instanceof s) {
                                    s sVar = (s) b0Var2;
                                    f25 = f25;
                                    path2.rCubicTo(sVar.f7890c, sVar.f7891d, sVar.f7892e, sVar.f7893f, sVar.f7894g, sVar.f7895h);
                                    f12 = sVar.f7892e + f21;
                                    f13 = sVar.f7893f + f22;
                                    f21 += sVar.f7894g;
                                    f22 += sVar.f7895h;
                                } else {
                                    f25 = f25;
                                    if (b0Var2 instanceof k) {
                                        k kVar = (k) b0Var2;
                                        path2.cubicTo(kVar.f7848c, kVar.f7849d, kVar.f7850e, kVar.f7851f, kVar.f7852g, kVar.f7853h);
                                        f14 = kVar.f7850e;
                                        f15 = kVar.f7851f;
                                        f16 = kVar.f7852g;
                                        f17 = kVar.f7853h;
                                    } else if (b0Var2 instanceof x) {
                                        if (b0Var.f7731a) {
                                            f18 = f21 - f23;
                                            f19 = f22 - f24;
                                        } else {
                                            f18 = 0.0f;
                                            f19 = 0.0f;
                                        }
                                        x xVar = (x) b0Var2;
                                        path2.rCubicTo(f18, f19, xVar.f7905c, xVar.f7906d, xVar.f7907e, xVar.f7908f);
                                        float f33 = xVar.f7905c + f21;
                                        float f34 = xVar.f7906d + f22;
                                        f21 += xVar.f7907e;
                                        f22 += xVar.f7908f;
                                        f24 = f34;
                                        b0Var2 = b0Var2;
                                        i11 = i11;
                                        size = size;
                                        iVar = iVar;
                                        path = path;
                                        f25 = f25;
                                        f23 = f33;
                                    } else if (b0Var2 instanceof p) {
                                        if (b0Var.f7731a) {
                                            float f35 = 2;
                                            f21 = (f21 * f35) - f23;
                                            f22 = (f35 * f22) - f24;
                                        }
                                        p pVar = (p) b0Var2;
                                        path2.cubicTo(f21, f22, pVar.f7877c, pVar.f7878d, pVar.f7879e, pVar.f7880f);
                                        f14 = pVar.f7877c;
                                        f15 = pVar.f7878d;
                                        f16 = pVar.f7879e;
                                        f17 = pVar.f7880f;
                                    } else if (b0Var2 instanceof w) {
                                        w wVar = (w) b0Var2;
                                        float f36 = wVar.f7901c;
                                        float f37 = wVar.f7902d;
                                        float f38 = wVar.f7903e;
                                        float f39 = wVar.f7904f;
                                        path2.rQuadTo(f36, f37, f38, f39);
                                        f12 = wVar.f7901c + f21;
                                        f13 = f37 + f22;
                                        f21 += f38;
                                        f22 += f39;
                                    } else if (b0Var2 instanceof o) {
                                        o oVar = (o) b0Var2;
                                        float f40 = oVar.f7873c;
                                        float f41 = oVar.f7874d;
                                        float f42 = oVar.f7875e;
                                        float f43 = oVar.f7876f;
                                        path2.quadTo(f40, f41, f42, f43);
                                        f12 = oVar.f7873c;
                                        f24 = f41;
                                        f21 = f42;
                                        f22 = f43;
                                        b0Var2 = b0Var2;
                                        i11 = i11;
                                        size = size;
                                        iVar = iVar;
                                        path = path;
                                        f25 = f25;
                                        f23 = f12;
                                    } else if (b0Var2 instanceof y) {
                                        if (b0Var.f7732b) {
                                            f11 = f21 - f23;
                                            f10 = f22 - f24;
                                        } else {
                                            f10 = 0.0f;
                                            f11 = 0.0f;
                                        }
                                        y yVar = (y) b0Var2;
                                        float f44 = yVar.f7909c;
                                        float f45 = yVar.f7910d;
                                        path2.rQuadTo(f11, f10, f44, f45);
                                        float f46 = f11 + f21;
                                        float f47 = f10 + f22;
                                        f21 += yVar.f7909c;
                                        f22 += f45;
                                        f24 = f47;
                                        b0Var2 = b0Var2;
                                        i11 = i11;
                                        f23 = f46;
                                        f25 = f25;
                                    } else if (b0Var2 instanceof q) {
                                        if (b0Var.f7732b) {
                                            float f48 = 2;
                                            f21 = (f21 * f48) - f23;
                                            f22 = (f48 * f22) - f24;
                                        }
                                        q qVar = (q) b0Var2;
                                        float f49 = qVar.f7881c;
                                        float f50 = qVar.f7882d;
                                        path2.quadTo(f21, f22, f49, f50);
                                        f24 = f22;
                                        f22 = f50;
                                        b0Var2 = b0Var2;
                                        i11 = i11;
                                        size = size;
                                        iVar = iVar;
                                        path = path;
                                        f25 = f25;
                                        f23 = f21;
                                        f21 = qVar.f7881c;
                                    } else {
                                        if (b0Var2 instanceof r) {
                                            r rVar = (r) b0Var2;
                                            float f51 = rVar.f7888h + f21;
                                            float f52 = rVar.f7889i + f22;
                                            size = size;
                                            b0Var2 = b0Var2;
                                            i11 = i11;
                                            iVar = iVar;
                                            path = path;
                                            n(iVar, f21, f22, f51, f52, rVar.f7883c, rVar.f7884d, rVar.f7885e, rVar.f7886f, rVar.f7887g);
                                            f21 = f51;
                                            f23 = f21;
                                            f26 = f26;
                                            f22 = f52;
                                        } else {
                                            i11 = i11;
                                            float f53 = f26;
                                            size = size;
                                            iVar = iVar;
                                            path = path;
                                            if (b0Var2 instanceof i) {
                                                i iVar2 = (i) b0Var2;
                                                double d10 = iVar2.f7838h;
                                                float f54 = iVar2.f7839i;
                                                b0Var2 = b0Var2;
                                                n(iVar, f21, f22, d10, f54, iVar2.f7833c, iVar2.f7834d, iVar2.f7835e, iVar2.f7836f, iVar2.f7837g);
                                                f21 = iVar2.f7838h;
                                                f23 = f21;
                                                f26 = f53;
                                                f22 = f54;
                                            } else {
                                                b0Var2 = b0Var2;
                                                f25 = f25;
                                                f26 = f53;
                                            }
                                        }
                                        f24 = f22;
                                    }
                                    f23 = f14;
                                    f24 = f15;
                                    f21 = f16;
                                    b0Var2 = b0Var2;
                                    i11 = i11;
                                    size = size;
                                    iVar = iVar;
                                    path = path;
                                    f25 = f25;
                                    f22 = f17;
                                }
                                f24 = f13;
                                b0Var2 = b0Var2;
                                i11 = i11;
                                size = size;
                                iVar = iVar;
                                path = path;
                                f25 = f25;
                                f23 = f12;
                            }
                        }
                        b0Var2 = b0Var2;
                        i11 = i11;
                        size = size;
                        iVar = iVar;
                        path = path;
                    }
                    i11++;
                    list2 = list;
                    size = size;
                    iVar = iVar;
                    path = path;
                    b0Var = b0Var2;
                }
                f21 = f20;
            }
            i11++;
            list2 = list;
            size = size;
            iVar = iVar;
            path = path;
            b0Var = b0Var2;
        }
    }

    public static ActionMode.Callback N(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof e3.r) || callback == null) ? callback : new e3.r(callback, textView);
    }

    public static final long a(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = m2.f.f11800c;
        return jFloatToRawIntBits;
    }

    public static final long b(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = m2.g.f11804d;
        return jFloatToRawIntBits;
    }

    public static final long c(int i10, int i11) {
        long j10 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        int i12 = m2.i.f11808c;
        return j10;
    }

    public static a2.a d(String str, a2.c0 c0Var, long j10, m2.b bVar, f2.d dVar, r8.r rVar, int i10, int i11) {
        int i12 = i11 & 32;
        r8.r rVar2 = r8.r.f13661a;
        r8.r rVar3 = i12 != 0 ? rVar2 : rVar;
        if ((i11 & 64) == 0) {
            rVar2 = null;
        }
        return new a2.a(new i2.d(c0Var, dVar, bVar, str, rVar3, rVar2), (i11 & 128) != 0 ? Integer.MAX_VALUE : i10, false, j10);
    }

    public static final long e(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = m2.p.f11824c;
        return jFloatToRawIntBits;
    }

    public static String f(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb.toString();
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final boolean h(d1.d dVar, float f10, float f11) {
        return f10 <= dVar.f4334c && dVar.f4332a <= f10 && f11 <= dVar.f4335d && dVar.f4333b <= f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static boolean j(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zK = k(file, inputStreamOpenRawResource);
                g(inputStreamOpenRawResource);
                return zK;
            } catch (Throwable th) {
                th = th;
                g(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean k(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            g(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    g(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    g(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final f2.f l(Context context) {
        a4.q qVar = new a4.q();
        context.getApplicationContext();
        return new f2.f(qVar, new f2.a(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0));
    }

    public static final void m(c cVar, g0 g0Var) {
        int size = g0Var.f7812q.size();
        for (int i10 = 0; i10 < size; i10++) {
            i0 i0Var = (i0) g0Var.f7812q.get(i10);
            if (i0Var instanceof k0) {
                h hVar = new h();
                k0 k0Var = (k0) i0Var;
                hVar.f7815d = k0Var.f7855b;
                hVar.f7825n = true;
                hVar.c();
                hVar.f7830s.c(k0Var.f7856c);
                hVar.c();
                hVar.c();
                hVar.f7813b = k0Var.f7857d;
                hVar.c();
                hVar.f7814c = k0Var.f7858e;
                hVar.c();
                hVar.f7818g = k0Var.f7859f;
                hVar.c();
                hVar.f7816e = k0Var.f7860n;
                hVar.c();
                hVar.f7817f = k0Var.f7861o;
                hVar.f7826o = true;
                hVar.c();
                hVar.f7819h = k0Var.f7862p;
                hVar.f7826o = true;
                hVar.c();
                hVar.f7820i = k0Var.f7863q;
                hVar.f7826o = true;
                hVar.c();
                hVar.f7821j = k0Var.f7864r;
                hVar.f7826o = true;
                hVar.c();
                hVar.f7822k = k0Var.f7865s;
                hVar.f7827p = true;
                hVar.c();
                hVar.f7823l = k0Var.f7866t;
                hVar.f7827p = true;
                hVar.c();
                hVar.f7824m = k0Var.f7867u;
                hVar.f7827p = true;
                hVar.c();
                cVar.e(i10, hVar);
            } else if (i0Var instanceof g0) {
                c cVar2 = new c();
                g0 g0Var2 = (g0) i0Var;
                cVar2.f7742k = g0Var2.f7803a;
                cVar2.c();
                cVar2.f7743l = g0Var2.f7804b;
                cVar2.f7750s = true;
                cVar2.c();
                cVar2.f7746o = g0Var2.f7807e;
                cVar2.f7750s = true;
                cVar2.c();
                cVar2.f7747p = g0Var2.f7808f;
                cVar2.f7750s = true;
                cVar2.c();
                cVar2.f7748q = g0Var2.f7809n;
                cVar2.f7750s = true;
                cVar2.c();
                cVar2.f7749r = g0Var2.f7810o;
                cVar2.f7750s = true;
                cVar2.c();
                cVar2.f7744m = g0Var2.f7805c;
                cVar2.f7750s = true;
                cVar2.c();
                cVar2.f7745n = g0Var2.f7806d;
                cVar2.f7750s = true;
                cVar2.c();
                cVar2.f7737f = g0Var2.f7811p;
                cVar2.f7738g = true;
                cVar2.c();
                m(cVar2, g0Var2);
                cVar.e(i10, cVar2);
            }
        }
    }

    public static final void n(e1.d0 d0Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = d14;
        double d20 = (d16 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d20);
        double dSin = Math.sin(d20);
        double d21 = ((d11 * dSin) + (d10 * dCos)) / d19;
        double d22 = ((d11 * dCos) + ((-d10) * dSin)) / d15;
        double d23 = ((d13 * dSin) + (d12 * dCos)) / d19;
        double d24 = ((d13 * dCos) + ((-d12) * dSin)) / d15;
        double d25 = d21 - d23;
        double d26 = d22 - d24;
        double d27 = 2;
        double d28 = (d21 + d23) / d27;
        double d29 = (d22 + d24) / d27;
        double d30 = (d26 * d26) + (d25 * d25);
        if (d30 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        double d31 = (1.0d / d30) - 0.25d;
        if (d31 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double dSqrt = (float) (Math.sqrt(d30) / 1.99999d);
            n(d0Var, d10, d11, d12, d13, d19 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d31);
        double d32 = d25 * dSqrt2;
        double d33 = dSqrt2 * d26;
        if (z10 == z11) {
            d17 = d28 - d33;
            d18 = d29 + d32;
        } else {
            d17 = d28 + d33;
            d18 = d29 - d32;
        }
        double dAtan2 = Math.atan2(d22 - d18, d21 - d17);
        double dAtan3 = Math.atan2(d24 - d18, d23 - d17) - dAtan2;
        if (z11 != (dAtan3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            dAtan3 = dAtan3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d34 = d17 * d19;
        double d35 = d18 * d15;
        double d36 = (d34 * dCos) - (d35 * dSin);
        double d37 = (d35 * dCos) + (d34 * dSin);
        double d38 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d38) / 3.141592653589793d));
        double dCos2 = Math.cos(d20);
        double dSin2 = Math.sin(d20);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d39 = -d19;
        double d40 = d39 * dCos2;
        double d41 = d15 * dSin2;
        double d42 = (d40 * dSin3) - (d41 * dCos3);
        double d43 = d39 * dSin2;
        double d44 = d15 * dCos2;
        double d45 = (dCos3 * d44) + (dSin3 * d43);
        double d46 = dAtan3 / ((double) iCeil);
        double d47 = d10;
        double d48 = dAtan2;
        double d49 = d42;
        int i10 = 0;
        double d50 = d45;
        double d51 = d11;
        while (i10 < iCeil) {
            double d52 = d48 + d46;
            double dSin4 = Math.sin(d52);
            double dCos4 = Math.cos(d52);
            double d53 = d46;
            double d54 = (((d19 * dCos2) * dCos4) + d36) - (d41 * dSin4);
            int i11 = iCeil;
            double d55 = (d44 * dSin4) + (d19 * dSin2 * dCos4) + d37;
            double d56 = (d40 * dSin4) - (d41 * dCos4);
            double d57 = (dCos4 * d44) + (dSin4 * d43);
            double d58 = d52 - d48;
            double dTan = Math.tan(d58 / d27);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d38) - ((double) 1)) * Math.sin(d58)) / ((double) 3);
            ((e1.i) d0Var).f5014a.cubicTo((float) ((d49 * dSqrt3) + d47), (float) ((d50 * dSqrt3) + d51), (float) (d54 - (dSqrt3 * d56)), (float) (d55 - (dSqrt3 * d57)), (float) d54, (float) d55);
            i10++;
            dSin2 = dSin2;
            d43 = d43;
            d47 = d54;
            d51 = d55;
            d48 = d52;
            d50 = d57;
            d49 = d56;
            iCeil = i11;
            d46 = d53;
            d19 = d14;
        }
    }

    public static String o(List list, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) str);
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final g1 p(View view) {
        d7.a.m(view, "<this>");
        return (g1) k9.k.G0(k9.k.H0(k9.l.F0(h1.f2142d, view), h1.f2143e));
    }

    public static final Rect q(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        int i12 = i10;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i12 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i12 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i12, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i12, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        b2.i.a(textPaint2, charSequence, i12, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i12, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i12 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            b2.i.a(textPaint, charSequence, i12, i11, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i12, i11, rect3);
        }
        return rect3;
    }

    public static float r(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e3.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static File s(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static z2.b t(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new z2.b(e3.q.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = e3.o.a(textView);
        int iD = e3.o.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i10 < 28 || (textView.getInputType() & 15) != 3) {
            boolean z10 = e3.n.b(textView) == 1;
            switch (e3.n.c(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z10 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(e3.q.b(e3.p.a(e3.n.d(textView)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new z2.b(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static final boolean u(float f10, float f11, float f12, float f13, long j10) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fB = d1.a.b(j10);
        float fC = d1.a.c(j10);
        return ((f15 * f15) / (fC * fC)) + ((f14 * f14) / (fB * fB)) <= 1.0f;
    }

    public static MappedByteBuffer v(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorA = u2.k.a(context.getContentResolver(), uri, "r", null);
            if (parcelFileDescriptorA == null) {
                if (parcelFileDescriptorA != null) {
                    parcelFileDescriptorA.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorA.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorA.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean w(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        try {
            return v0.a(viewParent, view, f10, f11, z10);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    public static boolean x(ViewParent viewParent, View view, float f10, float f11) {
        try {
            return v0.b(viewParent, view, f10, f11);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    public static void y(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof b3.q) {
            ((b3.q) viewParent).c(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            try {
                v0.c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e4);
            }
        }
    }

    public static void z(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof b3.r) {
            ((b3.r) viewParent).d(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof b3.q) {
            ((b3.q) viewParent).e(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                v0.d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e4);
            }
        }
    }
}
