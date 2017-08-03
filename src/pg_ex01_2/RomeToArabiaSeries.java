package pg_ex01_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RomeToArabiaSeries extends Main {
	public void StartFunction(){
		int inputNum = InputNumber();
		ChangeArabiaToRome(inputNum);
	}

	public int InputNumber() {
		int input = 0;
		String inputString = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(INPUT_MSG_1);
			inputString = br.readLine();
		} catch (IOException e) {
			System.out.println("Exception :" + e);
		}
		try {
			input = Integer.parseInt(inputString);
		} catch (NumberFormatException e) {
			System.out.println("Exception :" + e);
		}
		if(input < START_NUM || END_NUM < input) {
			System.out.println(ERR_MSG_1);
			System.exit(1);
		}
		return input;

	}

	public void ChangeArabiaToRome(int ArabiaNum) {
		if(ArabiaNum == 0) System.exit(1);
		if( (ROME_NUM1 <= ArabiaNum) && (ArabiaNum < ROME_NUM5)) {
			if((ArabiaNum + ROME_NUM1) == ROME_NUM5) {
				System.out.print(ROME1);
				ArabiaNum += ROME_NUM1;
			} else {
				System.out.print(ROME1);
				ArabiaNum -= ROME_NUM1;
			}
		} else if((ROME_NUM5 <= ArabiaNum) && (ArabiaNum < ROME_NUM10)) {
			if((ArabiaNum + ROME_NUM1) == ROME_NUM10) {
				System.out.print(ROME1);
				ArabiaNum += ROME_NUM1;
			} else {
				System.out.print(ROME5);
				ArabiaNum -= ROME_NUM5;
			}
		} else if((ROME_NUM10<=ArabiaNum) && (ArabiaNum <= END_NUM)) {
			System.out.print(ROME10);
			ArabiaNum -= ROME_NUM10;
		}
		ChangeArabiaToRome(ArabiaNum);
	}
}
