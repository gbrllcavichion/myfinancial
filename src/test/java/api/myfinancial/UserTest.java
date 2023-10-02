package api.myfinancial;

import api.myfinancial.dto.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.*;

@SpringBootTest
class UserTest {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void testSaveUserToMongoDB() {
		User user = new User();
		user.setName("Gabi");
		user.setEmail("gabi@example.com");
		user.setContact("123456789");

		User savedUser = mongoTemplate.save(user);

		assert savedUser.getId() != null;
		assert savedUser.getName().equals("Gabi");
		assert savedUser.getEmail().equals("gabi@example.com");
		assert savedUser.getContact().equals("123456789");
	}
}

