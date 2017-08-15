package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestArabia {

	final String ERR_MSG_1 = "変換できません";
	final String expected[] = {ERR_MSG_1,"Ⅰ","ⅠⅠ","ⅠⅠⅠ","ⅠⅤ","Ⅴ","ⅤⅠ","ⅤⅠⅠ","ⅤⅠⅠⅠ","ⅠⅩ",
			             "Ⅹ","ⅩⅠ","ⅩⅠⅠ","ⅩⅠⅠⅠ","ⅩⅠⅤ","ⅩⅤ","ⅩⅤⅠ","ⅩⅤⅠⅠ","ⅩⅤⅠⅠⅠ","ⅩⅠⅩ",
			             "ⅩⅩ"
						};


	@Test
	public void testArabiaToRome() {
		Arabia arabia = new Arabia();
		for (int i=0;i<=21;i++) {
			if(1<=i && i<=20) {
				assertEquals(expected[i],arabia.changeArabiaToRome(i));
			} else {
				assertEquals(expected[0],arabia.changeArabiaToRome(i));
			}
		}
	}

}
