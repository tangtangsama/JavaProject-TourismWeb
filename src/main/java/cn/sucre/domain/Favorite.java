package cn.sucre.domain;

/**
 * @description: 收藏实体类
 * @author: sucre
 * @date: 2020/08/02
 * @time: 15:51
 */
public class Favorite {
    private Route route;
    private String date;
    private User user;

    /**
     * 无参构造方法
     */
    public Favorite() {
    }


    public Favorite(Route route, String date, User user) {
        this.route = route;
        this.date = date;
        this.user = user;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
