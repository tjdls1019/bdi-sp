package com.bdi.sp;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bdi.sp.vo.Board;
import com.bdi.sp.vo.Japan;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardInfoTest {

	@Autowired
	private SqlSession ss;
	
	@Test
	public void selectTest() {
		List<Board> biList = ss.selectList("SQL.BOARDINFO.selectBoardList");
		System.out.println(biList);
	}

//	@Test
//	public void insertTest() {
//		Board b = new Board();
//		b.setBitext("테스트");
//      b.setBititle("tttt");
//		int rCnt = ss.insert("SQL.BOARDINFO.selectBoard", b);
//		assertEquals(rCnt, 1);
//	}
	
//	@Test
//	public void deleteTest() {
//		Board b = new Board();
//		j.setJpnum(1);
//		int rCnt = ss.delete("SQL.JAPAN.deleteJapan", b);
//		assertEquals(rCnt, 0);
//	}
	
//	@Test
//	public void updateTest() {
//		Japan j = new Japan();
//		b.setBinum(2);
//		b.setBitext("테스트");
//		int rCnt = ss.update("SQL.JAPAN.updateJapan", b);
//		assertEquals(rCnt, 1);
//	}
	
	
}