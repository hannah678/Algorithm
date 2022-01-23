import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
	public static void main(String[] args) throws IOException { 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine(); 
	
	//배열 생성
	char[] arr = new char[s.length()];
	
	//배열 값 할당
	for(int i=0; i<s.length(); i++) {
		arr[i] = s.charAt(i);
	}
	
	//소문자를 대문자로
	for(int j=0; j<32; j++) {
		for(int i=0; i<arr.length; i++) {
			if((int)arr[i] == 97+j) {
				arr[i] = (char)(65+j); 
			}
		}
	}
	
	//알파벳 개수 세기
	int[] count= new int[26];
	
	for(int j=0; j<26; j++) {
		for(int i=0; i<arr.length; i++) {
			if((int)arr[i] == 65+j) {
				count[j]++;
			}
		}
	}
	
	//가장 많은 알파벳 구하기
	int large=count[0];
	int mostchar=65;
	
	for(int i=1; i<26; i++) {
		if(large < count[i]) {
			large = count[i];
			mostchar=65+i;
		}else if(large == count[i]){
			mostchar=63;
		}
	}

		System.out.println((char)(mostchar));
	}
}