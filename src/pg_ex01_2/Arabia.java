package pg_ex01_2;

public class Arabia implements Interface {


		public String changeArabiaToRome(int ArabiaNum) {
				String inputCheck = checkInputNumber(ArabiaNum);
				String result = "";
				if(inputCheck.equals(ERR_MSG_1)) {
					return ERR_MSG_1;
				}
				while(ArabiaNum != 0) { 
				if( (ROME_NUM1 <= ArabiaNum) && (ArabiaNum < ROME_NUM5)) {
					if((ArabiaNum + ROME_NUM1) == ROME_NUM5) {
						result = result + ROME1;
						ArabiaNum += ROME_NUM1;
					} else {
						result = result + ROME1;
						ArabiaNum -= ROME_NUM1;
					}
				} else if((ROME_NUM5 <= ArabiaNum) && (ArabiaNum < ROME_NUM10)) {
					if((ArabiaNum + ROME_NUM1) == ROME_NUM10) {
						result = result + ROME1;
						ArabiaNum += ROME_NUM1;
					} else {
						result = result + ROME5;
						ArabiaNum -= ROME_NUM5;
					}
				} else if((ROME_NUM10<=ArabiaNum) && (ArabiaNum <= END_NUM)) {
					result = result + ROME10;
					ArabiaNum -= ROME_NUM10;
					}
				}
				return result;
			}
		
		public String checkInputNumber(int input) {
		
			if(input < START_NUM || END_NUM < input) {
				return ERR_MSG_1;
			}
			return SUCCESS_MSG_1;

			}
		}
