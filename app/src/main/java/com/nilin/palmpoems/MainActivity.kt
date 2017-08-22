package com.nilin.palmpoems

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val catalogList = ArrayList<String>()
    val content = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initCatalog()

        val layoutManager = LinearLayoutManager(this)
        rv.layoutManager = layoutManager
        val catalogadaapter = ArticleAdapter(catalogList)
//        rv.addItemDecoration(CalalogItemDecoration(this, LinearLayoutManager.HORIZONTAL))
//        rv.addItemDecoration(CalalogItemDecoration(
//                this, LinearLayoutManager.VERTICAL, R.drawable.divider_mileage))
        rv.addItemDecoration(CalalogItemDecoration(
                this, LinearLayoutManager.HORIZONTAL, 2, resources.getColor(R.color.colorAccent)))

        rv.adapter = catalogadaapter
        catalogadaapter.setOnItemClickListener(object : ArticleAdapter.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {
                val intent = Intent()
                intent.putExtra("catalog", position + 1)
                intent.setClass(content, ArticleActivity::class.java)
                startActivity(intent)
            }
        })
    }

    fun initCatalog() {
        catalogList.add("宴桃园豪杰三结义\n斩黄巾英雄首立功")
        catalogList.add("张翼德怒鞭督邮\n何国舅谋诛宦竖")
        catalogList.add("议温明董卓叱丁原\n馈金珠李肃说吕布")
        catalogList.add("废汉帝陈留践位\n谋董贼孟德献刀")
        catalogList.add("发矫诏诸镇应曹公\n破关兵三英战吕布")
        catalogList.add("焚金阙董卓行凶\n匿玉玺孙坚背约")
        catalogList.add("袁绍磐河战公孙\n孙坚跨江击刘表")
        catalogList.add("王司徒巧使连环计\n董太师大闹凤仪亭")
        catalogList.add("除暴徒吕布助司徒\n犯长安李倔听贾诩")
        catalogList.add("勤王室马腾举义\n报父仇曹操兴师")
        catalogList.add("刘皇叔北海救孔融\n吕温侯濮阳破曹操")
        catalogList.add("陶恭祖三让徐州\n曹孟德大战吕布")
        catalogList.add("李倔郭汜大交兵\n杨奉董承双救驾")
        catalogList.add("曹孟德移驾幸许都\n吕奉先乘夜袭徐郡")
        catalogList.add("太史慈酣斗小霸王\n孙伯符大战严白虎")
        catalogList.add("吕奉先射戟辕门\n曹孟德败师育水")
        catalogList.add("袁公路大起七军\n曹孟德会合三将")
        catalogList.add("贾文和料敌决胜\n夏侯敦拔矢啖睛")
        catalogList.add("下邳城曹操鏖兵\n白门楼吕布殒命")
        catalogList.add("曹阿瞒许田打围\n董国舅内阁受诏")
        catalogList.add("曹操煮酒论英雄\n关公赚城斩车胄")
        catalogList.add("袁曹各起马步三军\n关张共擒王刘二将")
        catalogList.add("祢正平裸衣骂贼\n吉太医下毒遭刑")
        catalogList.add("国贼行凶杀贵妃\n皇叔败走投袁绍")
        catalogList.add("屯土山关公约三事\n救白马曹操解重围")
        catalogList.add("袁本初败兵折将\n关云长挂印封金")
        catalogList.add("美髯公千里走单骑\n汉寿侯五关斩六将")
        catalogList.add("斩蔡阳兄弟释疑\n会古城主臣聚义")
        catalogList.add("小霸王怒斩于吉\n碧眼儿坐领江东")
        catalogList.add("战官渡本初败绩\n劫乌巢孟德烧粮")
        catalogList.add("曹操仓亭破本初\n玄德荆州依刘表")
        catalogList.add("夺冀州袁尚争锋\n决漳河许攸献计")
        catalogList.add("曹丕乘乱纳甄氏\n郭嘉遗计定辽东")
        catalogList.add("蔡夫人隔屏听密语\n刘皇叔跃马过檀溪")
        catalogList.add("玄德南漳逢隐沦\n单福新野遇英主")
        catalogList.add("玄德用计袭樊城\n元直走马荐诸葛")
        catalogList.add("司马徽再荐名士\n刘玄德三顾草庐")
        catalogList.add("定三分隆中决策\n战长江孙氏报仇")
        catalogList.add("荆州城公子三求计\n博望坡军师初用兵")
        catalogList.add("蔡夫人议献荆州\n诸葛亮火烧新野")
        catalogList.add("刘玄德携民渡江\n赵子龙单骑救主")
        catalogList.add("张翼德大闹长坂桥\n刘豫州败走汉津口")
        catalogList.add("诸葛亮舌战群儒\n鲁子敬力排众议")
        catalogList.add("孔明用智激周瑜\n孙权决计破曹操")
        catalogList.add("三江口曹操折兵\n群英会蒋干中计")
        catalogList.add("用奇计孔明借箭\n献密计黄盖受刑")
        catalogList.add("阚泽密献诈降书\n庞统巧授连环计")
        catalogList.add("宴长江曹操赋诗\n锁战船北军用武")
        catalogList.add("七星坛诸葛祭风\n三江口周瑜纵火")
        catalogList.add("诸葛亮智算华容\n关云长义释曹操")
        catalogList.add("曹仁大战东吴兵\n孔明一气周公瑾")
        catalogList.add("诸葛亮智辞鲁肃\n赵子龙计取桂阳")
        catalogList.add("关云长义释黄汉升\n孙仲谋大战张文远")
        catalogList.add("吴国太佛寺看新郎\n刘皇叔洞房续佳偶")
        catalogList.add("玄德智激孙夫人\n孔明二气周公瑾")
        catalogList.add("曹操大宴铜雀台\n孔明三气周公瑾")
        catalogList.add("柴桑口卧龙吊丧\n耒阳县凤雏理事")
        catalogList.add("马孟起兴兵雪恨\n曹阿瞒割须弃袍")
        catalogList.add("许褚裸衣斗马超\n曹操抹书间韩遂")
        catalogList.add("张永年反难杨修\n庞士元议取西蜀")
        catalogList.add("赵云截江夺阿斗\n孙权遗书退老瞒")
        catalogList.add("取培关杨高授首\n攻雒城黄魏立功")
        catalogList.add("诸葛亮痛哭庞统\n张翼德义释严颜")
        catalogList.add("孔明定计捉张任\n杨阜借兵破马超")
        catalogList.add("马超大战葭萌关\n刘备自领益州牧")
        catalogList.add("关云长单刀赴会\n伏皇后为国捐生")
        catalogList.add("曹操平定汉中地\n张辽威震逍遥津")
        catalogList.add("甘宁百骑劫魏营\n左慈掷杯戏曹操")
        catalogList.add("卜周易管辂知机\n讨汉贼五臣死节")
        catalogList.add("猛张飞智取瓦口隘\n老黄忠计夺天荡山")
        catalogList.add("占对山黄忠逸待劳\n据汉水赵云寡胜少")
        catalogList.add("诸葛亮智取汉中\n曹阿瞒兵退斜谷")
        catalogList.add("玄德进位汉中王\n云长攻拔襄阳郡")
        catalogList.add("庞令明抬榇决死战\n关云长放水淹七军")
        catalogList.add("关云长刮骨疗毒\n吕子明白衣渡江")
        catalogList.add("徐公明大战沔水\n关云长败走麦城")
        catalogList.add("玉泉山关公显圣\n洛阳城曹操感神")
        catalogList.add("治风疾神医身死\n传遗命奸雄数终")
        catalogList.add("兄逼弟曹植赋诗\n侄陷叔刘封伏法")
        catalogList.add("曹丕废帝篡炎刘\n汉王正位继大统")
        catalogList.add("急兄仇张飞遇害\n雪弟恨先主兴兵")
        catalogList.add("孙权降魏受九锡\n先主征吴赏六军")
        catalogList.add("战骁亭先主得仇人\n守江口书生拜大将")
        catalogList.add("陆逊营烧七百里\n孔明巧布八阵图")
        catalogList.add("刘先主遗诏托孤儿\n诸葛亮安居平五路")
        catalogList.add("难张温秦宓逞天辩\n破曹丕徐盛用火攻")
        catalogList.add("征南寇丞相大兴师\n抗天兵蛮王初受执")
        catalogList.add("渡泸水再缚番王\n识诈降三擒孟获")
        catalogList.add("武乡侯四番用计\n南蛮王五次遭擒")
        catalogList.add("驱巨兽六破蛮兵\n烧藤甲七擒孟获")
        catalogList.add("祭泸水汉相班师\n伐中原武侯上表")
        catalogList.add("赵子龙力斩五将\n诸葛亮智取三城")
        catalogList.add("姜伯约归降孔明\n武乡侯骂死王朗")
        catalogList.add("诸葛亮乘雪破羌兵\n司马懿克日擒孟达")
        catalogList.add("马谡拒谏失街亭\n武侯弹琴退仲达")
        catalogList.add("孔明挥泪斩马谡\n周鲂断发赚曹休")
        catalogList.add("讨魏国武侯再上表\n破曹兵姜维诈献书")
        catalogList.add("追汉军王双受诛\n袭陈仓武侯取胜")
        catalogList.add("诸葛亮大破魏兵\n司马懿入寇西蜀")
        catalogList.add("汉兵劫寨破曹真\n武侯斗阵辱仲达")
        catalogList.add("出陇上诸葛妆神\n奔剑阁张合中计")
        catalogList.add("司马懿占北原渭桥\n诸葛亮造木牛流马")
        catalogList.add("上方谷司马受困\n五丈原诸葛禳星")
        catalogList.add("陨大星汉丞相归天\n见木像魏都督丧胆")
        catalogList.add("武侯预伏锦囊计\n魏主拆取承露盘")
        catalogList.add("公孙渊兵败死襄平\n司马懿诈病赚曹爽")
        catalogList.add("魏主归政司马氏\n姜维兵败牛头山")
        catalogList.add("丁奉雪中奋短兵\n孙峻席间施密计")
        catalogList.add("困司马汉将奇谋\n废曹芳魏家果报")
        catalogList.add("文鸯单骑退雄兵\n姜维背水破大敌")
        catalogList.add("邓士载智取姜伯约\n诸葛诞义讨司马昭")
        catalogList.add("救寿春于诠死节\n取长城伯约鏖兵")
        catalogList.add("丁奉定计斩孙琳\n姜维斗阵破邓艾")
        catalogList.add("曹髦驱车死南阙\n姜维弃粮胜魏兵")
        catalogList.add("诏班师后主信谗\n托屯田姜维避祸")
        catalogList.add("钟会分兵汉中道\n武侯显圣定军山")
        catalogList.add("邓士载偷度阴平\n诸葛瞻战死绵竹")
        catalogList.add("哭祖庙一王死孝\n入西川二士争功")
        catalogList.add("假投降巧计成虚话\n再受禅依样画葫芦")
        catalogList.add("荐杜预老将献新谋\n降孙皓三分归一统")
    }
}

