package org.nrms;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;

import javax.sql.DataSource;

public class Server {
    public static DataSource ds = null;
    public static void main(String[] args) throws Exception {

        BeanUtils.init();
        // redis
//        RedisClientUtils.init(VertxUtils.getOrCreateVertxByName("transport", null));
    }
}
