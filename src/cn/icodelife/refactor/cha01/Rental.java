package cn.icodelife.refactor.cha01;

/**
 * 租赁：表示某个客户租了一个影片
 */
public class Rental {

    private Movie _movie;

    private int _daysRented;

    public Movie get_movie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }
}
