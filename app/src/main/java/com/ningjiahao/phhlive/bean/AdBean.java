package com.ningjiahao.phhlive.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 甯宁寧 on 2016-11-24.
 */

public class AdBean {

    /**
     * code : 100
     * msg : 操作成功
     * data : [{"lrCurrent":0,"serverid":0,"myname":null,"signatures":null,"smallpic":null,"bigpic":null,"gps":null,"useridx":0,"flv":null,"hiddenVer":219,"cutTime":5,"adsmallpic":"","contents":"热门主播必备技能","title":"如何成为热门主播","imageUrl":"http://liveimg.9158.com/pic/ad/20160801/201608011448406051.jpg","link":"http://liveapi.9158.com/Active/wedhowuphot/heat.html","roomid":0,"addTime":"/Date(-62135596800000)/","state":0,"orderid":3},{"lrCurrent":0,"serverid":0,"myname":null,"signatures":null,"smallpic":null,"bigpic":null,"gps":null,"useridx":0,"flv":null,"hiddenVer":219,"cutTime":5,"adsmallpic":"http://liveimg.9158.com/pic/ad/20160726/201607261537019681.jpg","contents":"家族主播招募 一起登上直播的小船吧","title":"家族招聘","imageUrl":"http://liveimg.9158.com/pic/ad/20160608/20160608144503155.jpg","link":"http://liveapi.9158.com/Active/20160605/index.html","roomid":0,"addTime":"/Date(-62135596800000)/","state":0,"orderid":4},{"lrCurrent":0,"serverid":0,"myname":null,"signatures":null,"smallpic":null,"bigpic":null,"gps":null,"useridx":0,"flv":null,"hiddenVer":219,"cutTime":5,"adsmallpic":"","contents":"","title":"海外主播招募令","imageUrl":"http://liveimg.9158.com/pic/ad/20161122/201611221411078528.png","link":"http://livemiao.com/20161121/recruit.html","roomid":0,"addTime":"/Date(-62135596800000)/","state":0,"orderid":5}]
     */

    @SerializedName("code")
    private String code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * lrCurrent : 0
         * serverid : 0
         * myname : null
         * signatures : null
         * smallpic : null
         * bigpic : null
         * gps : null
         * useridx : 0
         * flv : null
         * hiddenVer : 219
         * cutTime : 5
         * adsmallpic :
         * contents : 热门主播必备技能
         * title : 如何成为热门主播
         * imageUrl : http://liveimg.9158.com/pic/ad/20160801/201608011448406051.jpg
         * link : http://liveapi.9158.com/Active/wedhowuphot/heat.html
         * roomid : 0
         * addTime : /Date(-62135596800000)/
         * state : 0
         * orderid : 3
         */

        @SerializedName("lrCurrent")
        private int lrCurrent;
        @SerializedName("serverid")
        private int serverid;
        @SerializedName("myname")
        private Object myname;
        @SerializedName("signatures")
        private Object signatures;
        @SerializedName("smallpic")
        private Object smallpic;
        @SerializedName("bigpic")
        private Object bigpic;
        @SerializedName("gps")
        private Object gps;
        @SerializedName("useridx")
        private int useridx;
        @SerializedName("flv")
        private Object flv;
        @SerializedName("hiddenVer")
        private int hiddenVer;
        @SerializedName("cutTime")
        private int cutTime;
        @SerializedName("adsmallpic")
        private String adsmallpic;
        @SerializedName("contents")
        private String contents;
        @SerializedName("title")
        private String title;
        @SerializedName("imageUrl")
        private String imageUrl;
        @SerializedName("link")
        private String link;
        @SerializedName("roomid")
        private int roomid;
        @SerializedName("addTime")
        private String addTime;
        @SerializedName("state")
        private int state;
        @SerializedName("orderid")
        private int orderid;

        public int getLrCurrent() {
            return lrCurrent;
        }

        public void setLrCurrent(int lrCurrent) {
            this.lrCurrent = lrCurrent;
        }

        public int getServerid() {
            return serverid;
        }

        public void setServerid(int serverid) {
            this.serverid = serverid;
        }

        public Object getMyname() {
            return myname;
        }

        public void setMyname(Object myname) {
            this.myname = myname;
        }

        public Object getSignatures() {
            return signatures;
        }

        public void setSignatures(Object signatures) {
            this.signatures = signatures;
        }

        public Object getSmallpic() {
            return smallpic;
        }

        public void setSmallpic(Object smallpic) {
            this.smallpic = smallpic;
        }

        public Object getBigpic() {
            return bigpic;
        }

        public void setBigpic(Object bigpic) {
            this.bigpic = bigpic;
        }

        public Object getGps() {
            return gps;
        }

        public void setGps(Object gps) {
            this.gps = gps;
        }

        public int getUseridx() {
            return useridx;
        }

        public void setUseridx(int useridx) {
            this.useridx = useridx;
        }

        public Object getFlv() {
            return flv;
        }

        public void setFlv(Object flv) {
            this.flv = flv;
        }

        public int getHiddenVer() {
            return hiddenVer;
        }

        public void setHiddenVer(int hiddenVer) {
            this.hiddenVer = hiddenVer;
        }

        public int getCutTime() {
            return cutTime;
        }

        public void setCutTime(int cutTime) {
            this.cutTime = cutTime;
        }

        public String getAdsmallpic() {
            return adsmallpic;
        }

        public void setAdsmallpic(String adsmallpic) {
            this.adsmallpic = adsmallpic;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public int getRoomid() {
            return roomid;
        }

        public void setRoomid(int roomid) {
            this.roomid = roomid;
        }

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getOrderid() {
            return orderid;
        }

        public void setOrderid(int orderid) {
            this.orderid = orderid;
        }
    }
}
