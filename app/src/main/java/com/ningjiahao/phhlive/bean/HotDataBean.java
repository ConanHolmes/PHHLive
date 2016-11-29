package com.ningjiahao.phhlive.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 甯宁寧 on 2016-11-22.
 */

public class HotDataBean implements Serializable{

    /**
     * code : 100
     * msg : success
     * data : {"list":[{"pos":1,"allnum":6726,"roomid":60123949,"serverid":4,"gps":"济南市","flv":"http://hdl.9158.com/live/b866845cfc345d7bfa2f77638e1df589.flv","starlevel":2,"familyName":"「Cat」家族","isSign":1,"nation":"","nationFlag":"","useridx":60204522,"userId":"WeiXin18592646","gender":0,"myname":"「Cat」丶☔️刘宝宝😯","signatures":"时间就是最好的答案💕","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/18/08/20161118081749_60204522_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/18/08/20161118081749_60204522_640.png","level":0,"grade":0,"curexp":0},{"pos":2,"allnum":3560,"roomid":60032867,"serverid":2,"gps":"来自喵星","flv":"http://hdl.9158.com/live/22b0af2f21332514c5892be1facd287e.flv","starlevel":2,"familyName":"光芒","isSign":0,"nation":"","nationFlag":"","useridx":61296552,"userId":"WeiXin19973308","gender":0,"myname":"光芒丶小仙女好累😔💔","signatures":"得之我幸","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/20/12/20161120123424_61296552_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/20/12/20161120123424_61296552_640.png","level":0,"grade":0,"curexp":0},{"pos":3,"allnum":2296,"roomid":60738328,"serverid":9,"gps":"海口市","flv":"http://hdl.9158.com/live/18d06d1a6bb8bf64fdc7fe39baa45fde.flv","starlevel":2,"familyName":"G","isSign":0,"nation":"","nationFlag":"","useridx":65079084,"userId":"WeiXin25061360","gender":0,"myname":"北冥有鱼.","signatures":"借君三十年。","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/02/23/20161102233715_65079084_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/02/23/20161102233715_65079084_640.png","level":0,"grade":0,"curexp":0},{"pos":4,"allnum":1947,"roomid":60629187,"serverid":8,"gps":"安庆市","flv":"http://hdl.9158.com/live/e3fdddc55358596a8ce8922cc4d86454.flv","starlevel":2,"familyName":"CK","isSign":1,"nation":"","nationFlag":"","useridx":61385068,"userId":"WeiXin20596182","gender":0,"myname":"CK、精灵💋","signatures":"一只受伤的精灵\u2026\u2026","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/02/19/20161102195908_61385068_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/02/19/20161102195908_61385068_640.png","level":0,"grade":0,"curexp":0},{"pos":5,"allnum":4128,"roomid":60123592,"serverid":8,"gps":"来自喵星","flv":"http://hdl.9158.com/live/692c76bc9faa4bbc8edf5786f989a46e.flv","starlevel":3,"familyName":"夜上海","isSign":1,"nation":"","nationFlag":"","useridx":61334185,"userId":"WeiXin20109467","gender":0,"myname":"翠翠白白嫩嫩可可爱爱轻轻纯纯","signatures":"只想平平淡淡","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/15/14/20161115141908_61334185_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/15/14/20161115141908_61334185_640.png","level":0,"grade":0,"curexp":0},{"pos":6,"allnum":14829,"roomid":30953,"serverid":8,"gps":"绵阳市","flv":"http://hdl.9158.com/live/45ded5f78fe55df703f8a94b866b0920.flv","starlevel":2,"familyName":"喵星人","isSign":1,"nation":"","nationFlag":"","useridx":61647231,"userId":"WeiXin20404290","gender":0,"myname":"喵星人灬小蛋","signatures":"","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/18/00/20161118004351_61647231_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/18/00/20161118004351_61647231_640.png","level":0,"grade":0,"curexp":0},{"pos":7,"allnum":13929,"roomid":19890319,"serverid":5,"gps":"合肥市","flv":"http://hdl.9158.com/live/15a944d5d19b77aa02af2a0f650a7376.flv","starlevel":2,"familyName":"Raily","isSign":1,"nation":"","nationFlag":"","useridx":63720605,"userId":"WeiXin22725956","gender":0,"myname":"大不溜w","signatures":"被爱的人都是祖宗","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/19/01/20161119015913_63720605_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/19/01/20161119015913_63720605_640.png","level":0,"grade":0,"curexp":0},{"pos":8,"allnum":2628,"roomid":62909843,"serverid":4,"gps":"来自喵星","flv":"http://hdl.9158.com/live/727ab72458e05d015cb16ccbba3ebc3f.flv","starlevel":5,"familyName":"GT","isSign":1,"nation":"","nationFlag":"","useridx":7312,"userId":"WeiXin19006429","gender":0,"myname":"GT皮卡😯啾⚠️扫黄大队","signatures":"🙆皮皮爱你们哟","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/18/22/20161118223542_7312_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/18/22/20161118223542_7312_640.png","level":0,"grade":0,"curexp":0},{"pos":9,"allnum":6617,"roomid":60675707,"serverid":5,"gps":"海口市","flv":"http://hdl.9158.com/live/d337ab7c417e41e5310125935ba72ed7.flv","starlevel":5,"familyName":"Hitler","isSign":1,"nation":"","nationFlag":"","useridx":6123,"userId":"WeiXin20991226","gender":0,"myname":"Hitler💕冰冰","signatures":"做好自己，不管风雨","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/12/19/20161112190700_62283874_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/12/19/20161112190700_62283874_640.png","level":0,"grade":0,"curexp":0},{"pos":10,"allnum":8276,"roomid":30285,"serverid":8,"gps":"鞍山市","flv":"http://hdl.9158.com/live/1e39c8a86e260f0164a2647094700a4f.flv","starlevel":2,"familyName":"喵族","isSign":1,"nation":"","nationFlag":"","useridx":5728,"userId":"WeiXin20717648","gender":0,"myname":"潘金莲之小雨","signatures":"感谢陪伴感谢支持🙂🙂🙂🙂","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/22/00/20161122005841_5728_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/22/00/20161122005841_5728_640.png","level":0,"grade":0,"curexp":0},{"pos":11,"allnum":22435,"roomid":60246042,"serverid":5,"gps":"南昌市","flv":"http://hdl.9158.com/live/a7bf21ec9d3862c000a2f90a83a9c077.flv","starlevel":2,"familyName":"MS","isSign":1,"nation":"","nationFlag":"","useridx":60878432,"userId":"WeiXin19328762","gender":0,"myname":"MS五尺😇","signatures":"好看的人太多有趣的灵魂太少","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/17/20/20161117202156_60878432_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/17/20/20161117202156_60878432_640.png","level":0,"grade":0,"curexp":0},{"pos":12,"allnum":6617,"roomid":60675707,"serverid":5,"gps":"北京市","flv":"http://hdl.9158.com/live/5bcecd65b50cc671155a2fe7c388e45d.flv","starlevel":2,"familyName":"Hitler","isSign":1,"nation":"","nationFlag":"","useridx":9258,"userId":"WeiXin22872210","gender":0,"myname":"Hitler－娜Mei!","signatures":"做好自己！","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/15/22/20161115222941_9258_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/15/22/20161115222941_9258_640.png","level":0,"grade":0,"curexp":0},{"pos":13,"allnum":39844,"roomid":60489944,"serverid":2,"gps":"广州市","flv":"http://hdl.9158.com/live/aa66ab94341148639fef4ddbdb1541ea.flv","starlevel":2,"familyName":"铁娘子军团?","isSign":1,"nation":"","nationFlag":"","useridx":60538687,"userId":"WeiXin19475440","gender":0,"myname":"铁娘子家💕超女宝宝💐","signatures":"加微信五个喵宝宝，爱你们么么哒。","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/16/23/20161116232636_60538687_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/16/23/20161116232636_60538687_640.png","level":0,"grade":0,"curexp":0},{"pos":14,"allnum":6617,"roomid":60675707,"serverid":5,"gps":"长沙市","flv":"http://hdl.9158.com/live/27488eb9ee5b5e919f830ccd6f2fc2ac.flv","starlevel":3,"familyName":"Hitler","isSign":1,"nation":"","nationFlag":"","useridx":65800129,"userId":"WeiXin24751302","gender":0,"myname":"Hitler-婉婉","signatures":"特么的骗子🌚","smallpic":"http://liveimg.9158.com/smldefault.png","bigpic":"http://liveimg.9158.com/bigdefault.png","level":0,"grade":0,"curexp":0},{"pos":15,"allnum":3867,"roomid":60378346,"serverid":11,"gps":"长春市","flv":"http://hdl.9158.com/live/d9579f9a367ad94de151cfcba297c302.flv","starlevel":2,"familyName":"情谊永恒","isSign":1,"nation":"","nationFlag":"","useridx":62465292,"userId":"WeiXin21758897","gender":0,"myname":"Grace✨小迷糊～～～","signatures":"😘😘我们一起生宝宝吧\u2026\u2026😘😘","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/21/19/20161121192802_62465292_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/21/19/20161121192802_62465292_640.png","level":0,"grade":0,"curexp":0},{"pos":16,"allnum":13929,"roomid":19890319,"serverid":5,"gps":"保定市","flv":"http://hdl.9158.com/live/3cadfcd8ac217b722b0e8e9acb809ef1.flv","starlevel":3,"familyName":"Raily","isSign":1,"nation":"","nationFlag":"","useridx":60326185,"userId":"QQ19106252","gender":0,"myname":"Raily💋水玲珑","signatures":"撒娇，卖萌，放电，你值得拥有","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/14/23/20161114232627_60326185_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/14/23/20161114232627_60326185_640.png","level":0,"grade":0,"curexp":0},{"pos":17,"allnum":12005,"roomid":60542729,"serverid":11,"gps":"来自喵星","flv":"http://hdl.9158.com/live/97bb3988baa022a51e1b997c8c8b15bc.flv","starlevel":3,"familyName":"IR","isSign":1,"nation":"","nationFlag":"","useridx":62389418,"userId":"WeiXin21708936","gender":0,"myname":"iR⚜小媳妇","signatures":"我的过儿","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/06/13/20161106130430_62389418_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/06/13/20161106130430_62389418_640.png","level":0,"grade":0,"curexp":0},{"pos":18,"allnum":4355,"roomid":60484949,"serverid":4,"gps":"恩施土家族苗族自治州","flv":"http://hdl.9158.com/live/a052385d3f2725f055f90f19e27ae529.flv","starlevel":3,"familyName":"Super","isSign":0,"nation":"","nationFlag":"","useridx":65013090,"userId":"WeiXin25221273","gender":0,"myname":"Super﹏樱桃💫","signatures":"","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/07/22/20161107224858_65013090_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/07/22/20161107224858_65013090_640.png","level":0,"grade":0,"curexp":0},{"pos":19,"allnum":22255,"roomid":60314136,"serverid":4,"gps":"来自喵星","flv":"http://hdl.9158.com/live/d4e7ead8eecb3001bbb05a46aa348ddd.flv","starlevel":3,"familyName":"秋白\u2014黛家族","isSign":0,"nation":"","nationFlag":"","useridx":63086625,"userId":"m13834527217","gender":0,"myname":"秋--🙋十三姨","signatures":"这个冬天有点冷❄️","smallpic":"http://liveimg.9158.com/pic/avator/2016-10/28/04/20161028041220_63086625_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-10/28/04/20161028041220_63086625_640.png","level":0,"grade":0,"curexp":0},{"pos":20,"allnum":14782,"roomid":77555,"serverid":2,"gps":"珠海市","flv":"http://hdl.9158.com/live/7f156fc14b959c4d2939b316a3ee9c9d.flv","starlevel":3,"familyName":"纯","isSign":0,"nation":"","nationFlag":"","useridx":66296820,"userId":"WeiXin25488405","gender":0,"myname":"👄纯\u2022GIGI係個小惡魔","signatures":"我是只慵懒的小猫，开心了，就会跳舞","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/22/12/20161122125520_66296820_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/22/12/20161122125520_66296820_640.png","level":0,"grade":0,"curexp":0}],"totalPage":6,"samecity":0,"hotswitch":{"starttime":"11:00","endtime":"23:59"},"hotswitch2":[{"starttime":"11:00","endtime":"23:59"},{"starttime":"09:00","endtime":"23:55"}],"hotConfig":1}
     */

    @SerializedName("code")
    private String code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        /**
         * list : [{"pos":1,"allnum":6726,"roomid":60123949,"serverid":4,"gps":"济南市","flv":"http://hdl.9158.com/live/b866845cfc345d7bfa2f77638e1df589.flv","starlevel":2,"familyName":"「Cat」家族","isSign":1,"nation":"","nationFlag":"","useridx":60204522,"userId":"WeiXin18592646","gender":0,"myname":"「Cat」丶☔️刘宝宝😯","signatures":"时间就是最好的答案💕","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/18/08/20161118081749_60204522_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/18/08/20161118081749_60204522_640.png","level":0,"grade":0,"curexp":0},{"pos":2,"allnum":3560,"roomid":60032867,"serverid":2,"gps":"来自喵星","flv":"http://hdl.9158.com/live/22b0af2f21332514c5892be1facd287e.flv","starlevel":2,"familyName":"光芒","isSign":0,"nation":"","nationFlag":"","useridx":61296552,"userId":"WeiXin19973308","gender":0,"myname":"光芒丶小仙女好累😔💔","signatures":"得之我幸","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/20/12/20161120123424_61296552_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/20/12/20161120123424_61296552_640.png","level":0,"grade":0,"curexp":0},{"pos":3,"allnum":2296,"roomid":60738328,"serverid":9,"gps":"海口市","flv":"http://hdl.9158.com/live/18d06d1a6bb8bf64fdc7fe39baa45fde.flv","starlevel":2,"familyName":"G","isSign":0,"nation":"","nationFlag":"","useridx":65079084,"userId":"WeiXin25061360","gender":0,"myname":"北冥有鱼.","signatures":"借君三十年。","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/02/23/20161102233715_65079084_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/02/23/20161102233715_65079084_640.png","level":0,"grade":0,"curexp":0},{"pos":4,"allnum":1947,"roomid":60629187,"serverid":8,"gps":"安庆市","flv":"http://hdl.9158.com/live/e3fdddc55358596a8ce8922cc4d86454.flv","starlevel":2,"familyName":"CK","isSign":1,"nation":"","nationFlag":"","useridx":61385068,"userId":"WeiXin20596182","gender":0,"myname":"CK、精灵💋","signatures":"一只受伤的精灵\u2026\u2026","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/02/19/20161102195908_61385068_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/02/19/20161102195908_61385068_640.png","level":0,"grade":0,"curexp":0},{"pos":5,"allnum":4128,"roomid":60123592,"serverid":8,"gps":"来自喵星","flv":"http://hdl.9158.com/live/692c76bc9faa4bbc8edf5786f989a46e.flv","starlevel":3,"familyName":"夜上海","isSign":1,"nation":"","nationFlag":"","useridx":61334185,"userId":"WeiXin20109467","gender":0,"myname":"翠翠白白嫩嫩可可爱爱轻轻纯纯","signatures":"只想平平淡淡","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/15/14/20161115141908_61334185_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/15/14/20161115141908_61334185_640.png","level":0,"grade":0,"curexp":0},{"pos":6,"allnum":14829,"roomid":30953,"serverid":8,"gps":"绵阳市","flv":"http://hdl.9158.com/live/45ded5f78fe55df703f8a94b866b0920.flv","starlevel":2,"familyName":"喵星人","isSign":1,"nation":"","nationFlag":"","useridx":61647231,"userId":"WeiXin20404290","gender":0,"myname":"喵星人灬小蛋","signatures":"","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/18/00/20161118004351_61647231_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/18/00/20161118004351_61647231_640.png","level":0,"grade":0,"curexp":0},{"pos":7,"allnum":13929,"roomid":19890319,"serverid":5,"gps":"合肥市","flv":"http://hdl.9158.com/live/15a944d5d19b77aa02af2a0f650a7376.flv","starlevel":2,"familyName":"Raily","isSign":1,"nation":"","nationFlag":"","useridx":63720605,"userId":"WeiXin22725956","gender":0,"myname":"大不溜w","signatures":"被爱的人都是祖宗","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/19/01/20161119015913_63720605_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/19/01/20161119015913_63720605_640.png","level":0,"grade":0,"curexp":0},{"pos":8,"allnum":2628,"roomid":62909843,"serverid":4,"gps":"来自喵星","flv":"http://hdl.9158.com/live/727ab72458e05d015cb16ccbba3ebc3f.flv","starlevel":5,"familyName":"GT","isSign":1,"nation":"","nationFlag":"","useridx":7312,"userId":"WeiXin19006429","gender":0,"myname":"GT皮卡😯啾⚠️扫黄大队","signatures":"🙆皮皮爱你们哟","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/18/22/20161118223542_7312_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/18/22/20161118223542_7312_640.png","level":0,"grade":0,"curexp":0},{"pos":9,"allnum":6617,"roomid":60675707,"serverid":5,"gps":"海口市","flv":"http://hdl.9158.com/live/d337ab7c417e41e5310125935ba72ed7.flv","starlevel":5,"familyName":"Hitler","isSign":1,"nation":"","nationFlag":"","useridx":6123,"userId":"WeiXin20991226","gender":0,"myname":"Hitler💕冰冰","signatures":"做好自己，不管风雨","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/12/19/20161112190700_62283874_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/12/19/20161112190700_62283874_640.png","level":0,"grade":0,"curexp":0},{"pos":10,"allnum":8276,"roomid":30285,"serverid":8,"gps":"鞍山市","flv":"http://hdl.9158.com/live/1e39c8a86e260f0164a2647094700a4f.flv","starlevel":2,"familyName":"喵族","isSign":1,"nation":"","nationFlag":"","useridx":5728,"userId":"WeiXin20717648","gender":0,"myname":"潘金莲之小雨","signatures":"感谢陪伴感谢支持🙂🙂🙂🙂","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/22/00/20161122005841_5728_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/22/00/20161122005841_5728_640.png","level":0,"grade":0,"curexp":0},{"pos":11,"allnum":22435,"roomid":60246042,"serverid":5,"gps":"南昌市","flv":"http://hdl.9158.com/live/a7bf21ec9d3862c000a2f90a83a9c077.flv","starlevel":2,"familyName":"MS","isSign":1,"nation":"","nationFlag":"","useridx":60878432,"userId":"WeiXin19328762","gender":0,"myname":"MS五尺😇","signatures":"好看的人太多有趣的灵魂太少","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/17/20/20161117202156_60878432_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/17/20/20161117202156_60878432_640.png","level":0,"grade":0,"curexp":0},{"pos":12,"allnum":6617,"roomid":60675707,"serverid":5,"gps":"北京市","flv":"http://hdl.9158.com/live/5bcecd65b50cc671155a2fe7c388e45d.flv","starlevel":2,"familyName":"Hitler","isSign":1,"nation":"","nationFlag":"","useridx":9258,"userId":"WeiXin22872210","gender":0,"myname":"Hitler－娜Mei!","signatures":"做好自己！","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/15/22/20161115222941_9258_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/15/22/20161115222941_9258_640.png","level":0,"grade":0,"curexp":0},{"pos":13,"allnum":39844,"roomid":60489944,"serverid":2,"gps":"广州市","flv":"http://hdl.9158.com/live/aa66ab94341148639fef4ddbdb1541ea.flv","starlevel":2,"familyName":"铁娘子军团?","isSign":1,"nation":"","nationFlag":"","useridx":60538687,"userId":"WeiXin19475440","gender":0,"myname":"铁娘子家💕超女宝宝💐","signatures":"加微信五个喵宝宝，爱你们么么哒。","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/16/23/20161116232636_60538687_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/16/23/20161116232636_60538687_640.png","level":0,"grade":0,"curexp":0},{"pos":14,"allnum":6617,"roomid":60675707,"serverid":5,"gps":"长沙市","flv":"http://hdl.9158.com/live/27488eb9ee5b5e919f830ccd6f2fc2ac.flv","starlevel":3,"familyName":"Hitler","isSign":1,"nation":"","nationFlag":"","useridx":65800129,"userId":"WeiXin24751302","gender":0,"myname":"Hitler-婉婉","signatures":"特么的骗子🌚","smallpic":"http://liveimg.9158.com/smldefault.png","bigpic":"http://liveimg.9158.com/bigdefault.png","level":0,"grade":0,"curexp":0},{"pos":15,"allnum":3867,"roomid":60378346,"serverid":11,"gps":"长春市","flv":"http://hdl.9158.com/live/d9579f9a367ad94de151cfcba297c302.flv","starlevel":2,"familyName":"情谊永恒","isSign":1,"nation":"","nationFlag":"","useridx":62465292,"userId":"WeiXin21758897","gender":0,"myname":"Grace✨小迷糊～～～","signatures":"😘😘我们一起生宝宝吧\u2026\u2026😘😘","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/21/19/20161121192802_62465292_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/21/19/20161121192802_62465292_640.png","level":0,"grade":0,"curexp":0},{"pos":16,"allnum":13929,"roomid":19890319,"serverid":5,"gps":"保定市","flv":"http://hdl.9158.com/live/3cadfcd8ac217b722b0e8e9acb809ef1.flv","starlevel":3,"familyName":"Raily","isSign":1,"nation":"","nationFlag":"","useridx":60326185,"userId":"QQ19106252","gender":0,"myname":"Raily💋水玲珑","signatures":"撒娇，卖萌，放电，你值得拥有","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/14/23/20161114232627_60326185_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/14/23/20161114232627_60326185_640.png","level":0,"grade":0,"curexp":0},{"pos":17,"allnum":12005,"roomid":60542729,"serverid":11,"gps":"来自喵星","flv":"http://hdl.9158.com/live/97bb3988baa022a51e1b997c8c8b15bc.flv","starlevel":3,"familyName":"IR","isSign":1,"nation":"","nationFlag":"","useridx":62389418,"userId":"WeiXin21708936","gender":0,"myname":"iR⚜小媳妇","signatures":"我的过儿","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/06/13/20161106130430_62389418_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/06/13/20161106130430_62389418_640.png","level":0,"grade":0,"curexp":0},{"pos":18,"allnum":4355,"roomid":60484949,"serverid":4,"gps":"恩施土家族苗族自治州","flv":"http://hdl.9158.com/live/a052385d3f2725f055f90f19e27ae529.flv","starlevel":3,"familyName":"Super","isSign":0,"nation":"","nationFlag":"","useridx":65013090,"userId":"WeiXin25221273","gender":0,"myname":"Super﹏樱桃💫","signatures":"","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/07/22/20161107224858_65013090_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/07/22/20161107224858_65013090_640.png","level":0,"grade":0,"curexp":0},{"pos":19,"allnum":22255,"roomid":60314136,"serverid":4,"gps":"来自喵星","flv":"http://hdl.9158.com/live/d4e7ead8eecb3001bbb05a46aa348ddd.flv","starlevel":3,"familyName":"秋白\u2014黛家族","isSign":0,"nation":"","nationFlag":"","useridx":63086625,"userId":"m13834527217","gender":0,"myname":"秋--🙋十三姨","signatures":"这个冬天有点冷❄️","smallpic":"http://liveimg.9158.com/pic/avator/2016-10/28/04/20161028041220_63086625_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-10/28/04/20161028041220_63086625_640.png","level":0,"grade":0,"curexp":0},{"pos":20,"allnum":14782,"roomid":77555,"serverid":2,"gps":"珠海市","flv":"http://hdl.9158.com/live/7f156fc14b959c4d2939b316a3ee9c9d.flv","starlevel":3,"familyName":"纯","isSign":0,"nation":"","nationFlag":"","useridx":66296820,"userId":"WeiXin25488405","gender":0,"myname":"👄纯\u2022GIGI係個小惡魔","signatures":"我是只慵懒的小猫，开心了，就会跳舞","smallpic":"http://liveimg.9158.com/pic/avator/2016-11/22/12/20161122125520_66296820_250.png","bigpic":"http://liveimg.9158.com/pic/avator/2016-11/22/12/20161122125520_66296820_640.png","level":0,"grade":0,"curexp":0}]
         * totalPage : 6
         * samecity : 0
         * hotswitch : {"starttime":"11:00","endtime":"23:59"}
         * hotswitch2 : [{"starttime":"11:00","endtime":"23:59"},{"starttime":"09:00","endtime":"23:55"}]
         * hotConfig : 1
         */

        @SerializedName("totalPage")
        private int totalPage;
        @SerializedName("samecity")
        private int samecity;
        @SerializedName("hotswitch")
        private HotswitchBean hotswitch;
        @SerializedName("hotConfig")
        private int hotConfig;
        @SerializedName("list")
        private List<ListBean> list;
        @SerializedName("hotswitch2")
        private List<Hotswitch2Bean> hotswitch2;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getSamecity() {
            return samecity;
        }

        public void setSamecity(int samecity) {
            this.samecity = samecity;
        }

        public HotswitchBean getHotswitch() {
            return hotswitch;
        }

        public void setHotswitch(HotswitchBean hotswitch) {
            this.hotswitch = hotswitch;
        }

        public int getHotConfig() {
            return hotConfig;
        }

        public void setHotConfig(int hotConfig) {
            this.hotConfig = hotConfig;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<Hotswitch2Bean> getHotswitch2() {
            return hotswitch2;
        }

        public void setHotswitch2(List<Hotswitch2Bean> hotswitch2) {
            this.hotswitch2 = hotswitch2;
        }

        public static class HotswitchBean implements Serializable{
            /**
             * starttime : 11:00
             * endtime : 23:59
             */

            @SerializedName("starttime")
            private String starttime;
            @SerializedName("endtime")
            private String endtime;

            public String getStarttime() {
                return starttime;
            }

            public void setStarttime(String starttime) {
                this.starttime = starttime;
            }

            public String getEndtime() {
                return endtime;
            }

            public void setEndtime(String endtime) {
                this.endtime = endtime;
            }
        }

        public static class ListBean implements Serializable{
            /**
             * pos : 1
             * allnum : 6726
             * roomid : 60123949
             * serverid : 4
             * gps : 济南市
             * flv : http://hdl.9158.com/live/b866845cfc345d7bfa2f77638e1df589.flv
             * starlevel : 2
             * familyName : 「Cat」家族
             * isSign : 1
             * nation :
             * nationFlag :
             * useridx : 60204522
             * userId : WeiXin18592646
             * gender : 0
             * myname : 「Cat」丶☔️刘宝宝😯
             * signatures : 时间就是最好的答案💕
             * smallpic : http://liveimg.9158.com/pic/avator/2016-11/18/08/20161118081749_60204522_250.png
             * bigpic : http://liveimg.9158.com/pic/avator/2016-11/18/08/20161118081749_60204522_640.png
             * level : 0
             * grade : 0
             * curexp : 0
             */

            @SerializedName("pos")
            private int pos;
            @SerializedName("allnum")
            private int allnum;
            @SerializedName("roomid")
            private int roomid;
            @SerializedName("serverid")
            private int serverid;
            @SerializedName("gps")
            private String gps;
            @SerializedName("flv")
            private String flv;
            @SerializedName("starlevel")
            private int starlevel;
            @SerializedName("familyName")
            private String familyName;
            @SerializedName("isSign")
            private int isSign;
            @SerializedName("nation")
            private String nation;
            @SerializedName("nationFlag")
            private String nationFlag;
            @SerializedName("useridx")
            private int useridx;
            @SerializedName("userId")
            private String userId;
            @SerializedName("gender")
            private int gender;
            @SerializedName("myname")
            private String myname;
            @SerializedName("signatures")
            private String signatures;
            @SerializedName("smallpic")
            private String smallpic;
            @SerializedName("bigpic")
            private String bigpic;
            @SerializedName("level")
            private int level;
            @SerializedName("grade")
            private int grade;
            @SerializedName("curexp")
            private int curexp;

            public int getPos() {
                return pos;
            }

            public void setPos(int pos) {
                this.pos = pos;
            }

            public int getAllnum() {
                return allnum;
            }

            public void setAllnum(int allnum) {
                this.allnum = allnum;
            }

            public int getRoomid() {
                return roomid;
            }

            public void setRoomid(int roomid) {
                this.roomid = roomid;
            }

            public int getServerid() {
                return serverid;
            }

            public void setServerid(int serverid) {
                this.serverid = serverid;
            }

            public String getGps() {
                return gps;
            }

            public void setGps(String gps) {
                this.gps = gps;
            }

            public String getFlv() {
                return flv;
            }

            public void setFlv(String flv) {
                this.flv = flv;
            }

            public int getStarlevel() {
                return starlevel;
            }

            public void setStarlevel(int starlevel) {
                this.starlevel = starlevel;
            }

            public String getFamilyName() {
                return familyName;
            }

            public void setFamilyName(String familyName) {
                this.familyName = familyName;
            }

            public int getIsSign() {
                return isSign;
            }

            public void setIsSign(int isSign) {
                this.isSign = isSign;
            }

            public String getNation() {
                return nation;
            }

            public void setNation(String nation) {
                this.nation = nation;
            }

            public String getNationFlag() {
                return nationFlag;
            }

            public void setNationFlag(String nationFlag) {
                this.nationFlag = nationFlag;
            }

            public int getUseridx() {
                return useridx;
            }

            public void setUseridx(int useridx) {
                this.useridx = useridx;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getMyname() {
                return myname;
            }

            public void setMyname(String myname) {
                this.myname = myname;
            }

            public String getSignatures() {
                return signatures;
            }

            public void setSignatures(String signatures) {
                this.signatures = signatures;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public String getBigpic() {
                return bigpic;
            }

            public void setBigpic(String bigpic) {
                this.bigpic = bigpic;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public int getCurexp() {
                return curexp;
            }

            public void setCurexp(int curexp) {
                this.curexp = curexp;
            }
        }

        public static class Hotswitch2Bean implements Serializable{
            /**
             * starttime : 11:00
             * endtime : 23:59
             */

            @SerializedName("starttime")
            private String starttime;
            @SerializedName("endtime")
            private String endtime;

            public String getStarttime() {
                return starttime;
            }

            public void setStarttime(String starttime) {
                this.starttime = starttime;
            }

            public String getEndtime() {
                return endtime;
            }

            public void setEndtime(String endtime) {
                this.endtime = endtime;
            }
        }
    }
}
