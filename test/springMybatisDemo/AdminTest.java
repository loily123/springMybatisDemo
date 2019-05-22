package springMybatisDemo;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Admin;
import com.service.AdminService;

public class AdminTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	AdminService adminService = (AdminService) context.getBean("adminServiceImpl");

	@Test
	public void queryAll() {
		List<Admin> admins = adminService.queryAll();
		for (Admin admin : admins) {
			System.out.println(admin);
		}
	}
}
