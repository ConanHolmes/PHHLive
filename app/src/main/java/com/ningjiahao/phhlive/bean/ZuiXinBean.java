package com.ningjiahao.phhlive.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by HP on 2016/11/23.
 */

public class ZuiXinBean implements Serializable{

    /**
     * code : 100
     * msg : success
     * data : {"totalPage":13,"list":[{"nickname":"『喵族』纯纯","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/20/20161122204038_65791834_250.png","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":30285,"useridx":65791834,"flv":"http://hdl.9158.com/live/985cc1b00d26e12cd3089261a18824cd.flv","serverid":8,"position":"葫芦岛市"},{"nickname":"阿未","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/22/20161122220444_66345875_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":63874816,"useridx":66345875,"flv":"http://hdl.9158.com/live/92bcc972242d4d0d9f59066858d793dc.flv","serverid":4,"position":"聊城市"},{"nickname":"敏敏","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/19/20161122194414_66360949_250.png","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":60738328,"useridx":66360949,"flv":"http://hdl.9158.com/live/1bef8ca8621032793edfc31b5c4e4536.flv","serverid":9,"position":"滨州市"},{"nickname":"👄纯\u2022污妹儿","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/23/20161122231249_40605078_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":77555,"useridx":40605078,"flv":"http://hdl.9158.com/live/58555451be54ef2dcabc088b606f5112.flv","serverid":2,"position":"贵阳市"},{"nickname":"小处女遇到色狼","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/21/20161122210503_66572141_250.png","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":60123592,"useridx":66572141,"flv":"http://hdl.9158.com/live/c69621c83ba36bd63ffa276867792764.flv","serverid":8,"position":"深圳市"},{"nickname":"小ૢ心ૢ玫ૢ瑰有ૢ刺ૢ","photo":"http://q.qlogo.cn/qqapp/204515/3955F61578D109A3B896363E45256FC6/40","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":61340121,"useridx":66437503,"flv":"http://hdl.9158.com/live/640add98f974a51e48f6f0be939b6b24.flv","serverid":6,"position":"南充市"},{"nickname":"枫🍁小啊莫","photo":"http://wx.qlogo.cn/mmopen/ps68icnpRvDWbaEC9oibxpQKTKPuHZpZTeaVdbGsnWCyQ3QrxRxoibdW9m0ibViccFIT5b11Bw5T6VcnSv1xoHGsYTGDpGliaWWLap/132","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":60562205,"useridx":66026143,"flv":"http://hdl.9158.com/live/bcea7f271fa83f764a593e99b631d4db.flv","serverid":9,"position":"宁德市"},{"nickname":"我是小晴","photo":"http://liveimg.9158.com/pic/avator/2016-11/21/17/20161121170454_66352102_250.png","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":65468937,"useridx":66352102,"flv":"http://hdl.9158.com/live/7004f7354b7587edf5db1b7297850c8c.flv","serverid":7,"position":"温州市"},{"nickname":" 【夜上海】大妞妞","photo":"http://liveimg.9158.com/pic/avator/2016-11/23/10/20161123101235_66245461_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":60123592,"useridx":66245461,"flv":"http://hdl.9158.com/live/3dc6db08b9094388b70f1716f5453eb8.flv","serverid":8,"position":"大连市"},{"nickname":"沫沫smile","photo":"http://liveimg.9158.com/pic/avator/2016-11/21/16/20161121163740_66442715_250.png","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":62548775,"useridx":66442715,"flv":"http://hdl.9158.com/live/db6abd569d9fe077b3b71afe581cf299.flv","serverid":9,"position":"哈尔滨市"},{"nickname":"*【颜少】*","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/07/20161122075928_65844056_250.png","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":65844056,"useridx":65844056,"flv":"http://hdl.9158.com/live/6614cc83e8987c1a716079506530743f.flv","serverid":12,"position":"营口市"},{"nickname":"怡红院💋天蝎座","photo":"http://wx.qlogo.cn/mmopen/ps68icnpRvDX3D1Ety0yd4pniaJu5ViafVqzvKp6HiaZq0VZpib9bJqpCvUNCyl1OB6aGEqIFw3NUpO2srugFeUnmOYuAt3gC972M/132","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":65256445,"useridx":65839441,"flv":"http://hdl.9158.com/live/cf5f047a1f771b8248a9e60d50742775.flv","serverid":3,"position":"哈尔滨市"},{"nickname":"A\u20e3- 💗梦露Queena、","photo":"http://liveimg.9158.com/pic/avator/2016-11/21/16/20161121162450_65687150_250.png","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":62567624,"useridx":65687150,"flv":"http://hdl.9158.com/live/494e05b49a0a149d4798558d28a17933.flv","serverid":8,"position":"哈尔滨市"},{"nickname":"DHV桃子。","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/00/20161122004032_66452087_250.png","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":65676261,"useridx":66452087,"flv":"http://hdl.9158.com/live/898974989452298955d5e752d01483e2.flv","serverid":5,"position":"本溪市"},{"nickname":"[喵之梦]Nana Soup","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/14/20161122141410_40903925_250.png","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":40553050,"useridx":40903925,"flv":"http://hdl.9158.com/live/622ffbce09eb5f8be7a61390d3ea4438.flv","serverid":4,"position":"新竹市"},{"nickname":"「喵族」媛宝","photo":"http://liveimg.9158.com/pic/avator/2016-11/20/14/20161120144411_66406012_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":30285,"useridx":66406012,"flv":"http://hdl.9158.com/live/b9ff8694e6017d76a7c085395d96f191.flv","serverid":8,"position":""},{"nickname":"情人","photo":"http://q.qlogo.cn/qqapp/204515/B8A593C5C11AD7845764A733488B964D/40","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":65023425,"useridx":65023425,"flv":"http://hdl.9158.com/live/67d1faa527248a6ad6960958be9fbb3b.flv","serverid":9,"position":"广州市"},{"nickname":"DHV🌑DiDi","photo":"http://liveimg.9158.com/pic/avator/2016-11/14/22/20161114222927_62020710_250.png","sex":0,"starlevel":1,"allnum":0,"new":0,"roomid":65676261,"useridx":62020710,"flv":"http://hdl.9158.com/live/a154dbb3df6f1a58f076b7b72293e83c.flv","serverid":5,"position":"天津市"}]}
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
         * totalPage : 13
         * list : [{"nickname":"『喵族』纯纯","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/20/20161122204038_65791834_250.png","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":30285,"useridx":65791834,"flv":"http://hdl.9158.com/live/985cc1b00d26e12cd3089261a18824cd.flv","serverid":8,"position":"葫芦岛市"},{"nickname":"阿未","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/22/20161122220444_66345875_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":63874816,"useridx":66345875,"flv":"http://hdl.9158.com/live/92bcc972242d4d0d9f59066858d793dc.flv","serverid":4,"position":"聊城市"},{"nickname":"敏敏","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/19/20161122194414_66360949_250.png","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":60738328,"useridx":66360949,"flv":"http://hdl.9158.com/live/1bef8ca8621032793edfc31b5c4e4536.flv","serverid":9,"position":"滨州市"},{"nickname":"👄纯\u2022污妹儿","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/23/20161122231249_40605078_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":77555,"useridx":40605078,"flv":"http://hdl.9158.com/live/58555451be54ef2dcabc088b606f5112.flv","serverid":2,"position":"贵阳市"},{"nickname":"小处女遇到色狼","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/21/20161122210503_66572141_250.png","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":60123592,"useridx":66572141,"flv":"http://hdl.9158.com/live/c69621c83ba36bd63ffa276867792764.flv","serverid":8,"position":"深圳市"},{"nickname":"小ૢ心ૢ玫ૢ瑰有ૢ刺ૢ","photo":"http://q.qlogo.cn/qqapp/204515/3955F61578D109A3B896363E45256FC6/40","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":61340121,"useridx":66437503,"flv":"http://hdl.9158.com/live/640add98f974a51e48f6f0be939b6b24.flv","serverid":6,"position":"南充市"},{"nickname":"枫🍁小啊莫","photo":"http://wx.qlogo.cn/mmopen/ps68icnpRvDWbaEC9oibxpQKTKPuHZpZTeaVdbGsnWCyQ3QrxRxoibdW9m0ibViccFIT5b11Bw5T6VcnSv1xoHGsYTGDpGliaWWLap/132","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":60562205,"useridx":66026143,"flv":"http://hdl.9158.com/live/bcea7f271fa83f764a593e99b631d4db.flv","serverid":9,"position":"宁德市"},{"nickname":"我是小晴","photo":"http://liveimg.9158.com/pic/avator/2016-11/21/17/20161121170454_66352102_250.png","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":65468937,"useridx":66352102,"flv":"http://hdl.9158.com/live/7004f7354b7587edf5db1b7297850c8c.flv","serverid":7,"position":"温州市"},{"nickname":" 【夜上海】大妞妞","photo":"http://liveimg.9158.com/pic/avator/2016-11/23/10/20161123101235_66245461_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":60123592,"useridx":66245461,"flv":"http://hdl.9158.com/live/3dc6db08b9094388b70f1716f5453eb8.flv","serverid":8,"position":"大连市"},{"nickname":"沫沫smile","photo":"http://liveimg.9158.com/pic/avator/2016-11/21/16/20161121163740_66442715_250.png","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":62548775,"useridx":66442715,"flv":"http://hdl.9158.com/live/db6abd569d9fe077b3b71afe581cf299.flv","serverid":9,"position":"哈尔滨市"},{"nickname":"*【颜少】*","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/07/20161122075928_65844056_250.png","sex":1,"starlevel":0,"allnum":0,"new":1,"roomid":65844056,"useridx":65844056,"flv":"http://hdl.9158.com/live/6614cc83e8987c1a716079506530743f.flv","serverid":12,"position":"营口市"},{"nickname":"怡红院💋天蝎座","photo":"http://wx.qlogo.cn/mmopen/ps68icnpRvDX3D1Ety0yd4pniaJu5ViafVqzvKp6HiaZq0VZpib9bJqpCvUNCyl1OB6aGEqIFw3NUpO2srugFeUnmOYuAt3gC972M/132","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":65256445,"useridx":65839441,"flv":"http://hdl.9158.com/live/cf5f047a1f771b8248a9e60d50742775.flv","serverid":3,"position":"哈尔滨市"},{"nickname":"A\u20e3- 💗梦露Queena、","photo":"http://liveimg.9158.com/pic/avator/2016-11/21/16/20161121162450_65687150_250.png","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":62567624,"useridx":65687150,"flv":"http://hdl.9158.com/live/494e05b49a0a149d4798558d28a17933.flv","serverid":8,"position":"哈尔滨市"},{"nickname":"DHV桃子。","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/00/20161122004032_66452087_250.png","sex":0,"starlevel":1,"allnum":0,"new":1,"roomid":65676261,"useridx":66452087,"flv":"http://hdl.9158.com/live/898974989452298955d5e752d01483e2.flv","serverid":5,"position":"本溪市"},{"nickname":"[喵之梦]Nana Soup","photo":"http://liveimg.9158.com/pic/avator/2016-11/22/14/20161122141410_40903925_250.png","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":40553050,"useridx":40903925,"flv":"http://hdl.9158.com/live/622ffbce09eb5f8be7a61390d3ea4438.flv","serverid":4,"position":"新竹市"},{"nickname":"「喵族」媛宝","photo":"http://liveimg.9158.com/pic/avator/2016-11/20/14/20161120144411_66406012_250.png","sex":0,"starlevel":2,"allnum":0,"new":1,"roomid":30285,"useridx":66406012,"flv":"http://hdl.9158.com/live/b9ff8694e6017d76a7c085395d96f191.flv","serverid":8,"position":""},{"nickname":"情人","photo":"http://q.qlogo.cn/qqapp/204515/B8A593C5C11AD7845764A733488B964D/40","sex":0,"starlevel":0,"allnum":0,"new":1,"roomid":65023425,"useridx":65023425,"flv":"http://hdl.9158.com/live/67d1faa527248a6ad6960958be9fbb3b.flv","serverid":9,"position":"广州市"},{"nickname":"DHV🌑DiDi","photo":"http://liveimg.9158.com/pic/avator/2016-11/14/22/20161114222927_62020710_250.png","sex":0,"starlevel":1,"allnum":0,"new":0,"roomid":65676261,"useridx":62020710,"flv":"http://hdl.9158.com/live/a154dbb3df6f1a58f076b7b72293e83c.flv","serverid":5,"position":"天津市"}]
         */

        @SerializedName("totalPage")
        private int totalPage;
        @SerializedName("list")
        private List<ListBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable{
            /**
             * nickname : 『喵族』纯纯
             * photo : http://liveimg.9158.com/pic/avator/2016-11/22/20/20161122204038_65791834_250.png
             * sex : 0
             * starlevel : 1
             * allnum : 0
             * new : 1
             * roomid : 30285
             * useridx : 65791834
             * flv : http://hdl.9158.com/live/985cc1b00d26e12cd3089261a18824cd.flv
             * serverid : 8
             * position : 葫芦岛市
             */

            @SerializedName("nickname")
            private String nickname;
            @SerializedName("photo")
            private String photo;
            @SerializedName("sex")
            private int sex;
            @SerializedName("starlevel")
            private int starlevel;
            @SerializedName("allnum")
            private int allnum;
            @SerializedName("new")
            private int newX;
            @SerializedName("roomid")
            private int roomid;
            @SerializedName("useridx")
            private int useridx;
            @SerializedName("flv")
            private String flv;
            @SerializedName("serverid")
            private int serverid;
            @SerializedName("position")
            private String position;

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public int getStarlevel() {
                return starlevel;
            }

            public void setStarlevel(int starlevel) {
                this.starlevel = starlevel;
            }

            public int getAllnum() {
                return allnum;
            }

            public void setAllnum(int allnum) {
                this.allnum = allnum;
            }

            public int getNewX() {
                return newX;
            }

            public void setNewX(int newX) {
                this.newX = newX;
            }

            public int getRoomid() {
                return roomid;
            }

            public void setRoomid(int roomid) {
                this.roomid = roomid;
            }

            public int getUseridx() {
                return useridx;
            }

            public void setUseridx(int useridx) {
                this.useridx = useridx;
            }

            public String getFlv() {
                return flv;
            }

            public void setFlv(String flv) {
                this.flv = flv;
            }

            public int getServerid() {
                return serverid;
            }

            public void setServerid(int serverid) {
                this.serverid = serverid;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }
        }
    }
}
