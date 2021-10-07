import java.io.File;

public class GoodPattern {
	/* 変数名 */
	String userName;
	String messageCode;

	int age;

	File userListFile;
	File companyListFile;

	static final String MSGID_FILE_NOT_FOUND = "E0001";

	private boolean writable = false;
	
	/* return位置 */
	boolean isPrimeNumber(int num) {
	    if (num < 2) {
	        return false; // 2未満は素数でない
	    }
	    if (num == 2) {
	        return true;  // 2は素数
	    }
	    if (num % 2 == 0) {
	        return false; // 2以外の偶数は素数でない
	    }
	    double sqrtNum = Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i+=2) {
	        if(num % i == 0) {
	            return false;   // 割り切れたら素数でない
	        }
	    }
	    return true; // 割り切れなかったら素数
	}
	
	

}
