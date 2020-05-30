/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import com.lab.ocp.day09.stock.dao.StockDao;
import com.lab.ocp.day09.stock.po.Stock;
import com.lab.ocp.day09.stock.service.StockService;
import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class Test {
    @org.junit.Test
    public void test_StockDao(){  
        StockDao dao=StockDao.getInstance();
        Stock[] stocks=dao.getStocks();
        Arrays.stream(stocks).forEach(s->System.out.println(s.get證券名稱()));
    }
    @org.junit.Test
    public void test_StockService() {
        StockService service = new StockService();
        service.findBestBuy(7, 10);
    }
}
