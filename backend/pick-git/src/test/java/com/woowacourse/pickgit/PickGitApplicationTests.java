package com.woowacourse.pickgit;

import com.woowacourse.pickgit.post.PostTestConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@Import(PostTestConfiguration.class)
@SpringBootTest
@ActiveProfiles("test")
class PickGitApplicationTests {

	@Test
	void contextLoads() {
	}
}
