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

    /**
     * 将switch case 提取到函数中,更改变量名字
     * 利用IDEA工具提取快速不出问题
     *
     * @return
     */
    double amountFor() {
        double result = 0;
        switch (get_movie().get_priceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (get_daysRented() > 2)
                    result += (get_daysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += get_daysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (get_daysRented() > 3)
                    result += (get_daysRented() - 3) * 1.5;
                break;

        }
        return result;
    }

    public int getFrequentRenterPoints() {


        if ((get_movie().get_priceCode() == Movie.NEW_RELEASE) && get_daysRented() > 1)
            return 2;
        else
            return 1;
    }
}
