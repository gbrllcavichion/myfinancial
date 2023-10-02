package api.myfinancial;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.data.mongodb.core.*;

@SpringBootTest
class MyfinancialApplicationTest {

    @Autowired
    private MongoOperations mongoOperations;

    @Test
    public void testMongoDBConnection() {
        String pingResult = mongoOperations.executeCommand("{ ping: 1 }").toString();
        System.out.println("MongoDB ping result: " + pingResult);
    }
}