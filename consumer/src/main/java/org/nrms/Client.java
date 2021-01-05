package org.nrms;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.provider.pojo.Invoker;

public class Client {
    public static void main(String[] args) throws Exception {
        BeanUtils.init();

        // redis
//        RedisClientUtils.init(VertxUtils.getOrCreateVertxByName("transport", null));
//        List<String> argList = Arrays.asList(args);

//        PerfConsumer consumer = BeanUtils.getContext().getBean(PerfConsumer.class);

          HelloWorld hai = BeanUtils.getContext().getBean(HelloWorld.class);
          hai.show();
//          hai.runAsyncConsumer();;
//        consumer.runConsumer();

    }
}
