package cn.sc.czy.service;

import gaarason.database.contract.eloquent.Record;
import gaarason.database.eloquent.GeneralModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Map;

@SpringBootTest
class TravelServiceApplicationTests {

    @Resource
    GeneralModel generalModel;

    @Test
    void contextLoads() {
        Record<GeneralModel.Table, Serializable> record=generalModel.newQuery().from("student").where("id",1).firstOrFail();
        Map<String, Object> stringObjectMap = record.toMap();
        System.out.println(stringObjectMap);
    }

}
