import cn.cout.dao.IHouseIDDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class InsertHouseIDTest {
	@Autowired
	private IHouseIDDao houseIDDao;

	@Test
	public void cdShouldNotBeNull() {
		org.junit.Assert.assertNotNull(houseIDDao);
	}

}
