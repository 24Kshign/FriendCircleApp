package cn.share.jack.friendcircleapp.model.main;

/**
 * Created by jack on 2017/6/12
 */

public class MainInfo {

    /**
     * id : 1
     * name : Tony老师聊shell——环境变量配置文件
     * picSmall : http://img.mukewang.com/55237dcc0001128c06000338-300-170.jpg
     * picBig : http://img.mukewang.com/55237dcc0001128c06000338.jpg
     * description : 为你带来shell中的环境变量配置文件
     * learner : 12312
     */

    private int id;
    private String name;
    private String picSmall;
    private String picBig;
    private String description;
    private int learner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicSmall() {
        return picSmall;
    }

    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    public String getPicBig() {
        return picBig;
    }

    public void setPicBig(String picBig) {
        this.picBig = picBig;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLearner() {
        return learner;
    }

    public void setLearner(int learner) {
        this.learner = learner;
    }
}