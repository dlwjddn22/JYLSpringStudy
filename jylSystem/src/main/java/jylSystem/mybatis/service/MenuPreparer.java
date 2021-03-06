package jylSystem.mybatis.service;

import java.awt.MenuItem;
import java.util.List;

import org.apache.tiles.Attribute;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;

public class MenuPreparer implements ViewPreparer {
	
	MenuService menuService;

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}


	@Override
    public void execute(Request tilesContext, AttributeContext attrContext) {
        
		List<MenuItem> menus = menuService.getMenus();
		
        //출처 : http://wonminst.blog.me/90103037887
        //putAttribute 메서드의 첫 번째 파라미터는 전달할 데이터의 이름이고 두 번째 파라미터는 설정할 데이터
        //의 값을 가진 Attribute 객체가 된다. 세 번째 파라미터의 값은 AttributeContext에 추가한 데이터를 전파할지
        //의 여부를 설정하는데 이 값이 true로 지정함으로써 JSP에서 설정한 데이터를 사용할 수 있게 된다.
        attrContext.putAttribute("menus", new Attribute(menus), true);
    }
}




